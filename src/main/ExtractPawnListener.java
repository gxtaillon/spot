package main;

import parser.*;
import util.state.IState;
import util.state.IStateful;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.lang.StringBuilder;
import java.util.*;

import lang.*;
import lang.state.SSGlobal;

public class ExtractPawnListener extends SPOTBaseListener implements IStateful {
	final String CURRENT_SYMBOL = "__CURRENT_SYMBOL";
	final String CURRENT_UNRESOLVED_CLASS = "__CURRENT_UNRESOLVED_CLASS";
	final String CURRENT_CLASS = "__CURRENT_CLASS";
	final String CURRENT_THIS = "__CURRENT_THIS";
	StringBuilder sb;
	public SPOTParser parser;
	Stack<String> tags;
	boolean isClass, isExitingClass;
	boolean isFunc, isParameter, isDeclaration, isPostfixArgs,
			isFunctionDeclarator;
	StringBuilder csb; // the current class's functions sb.
	// When enter/exit'ing a function sb and csb will switch places to prevent
	// writing functions inside the enum.
	Stack<Scope> scopes;
	
	private IState currentState;
	
	@Override
	public void setState(IState state) {
		currentState = state;		
	}

	/**
	 * Appends the current rule "as is" to the current builder along with a
	 * trailing space.
	 * 
	 * @param ctx
	 * @return the current rule.
	 */
	protected String asis(ParserRuleContext ctx) {
		TokenStream tokens = parser.getTokenStream();
		String tmp = tokens.getText(ctx);
		sb.append(' ');
		sb.append(tmp);
		sb.append(' ');
		return tmp;
	}
	
	protected String asis(TerminalNode node) {
		return asis(node, " ");
	}
	
	protected String asis(TerminalNode node, String postfix) {
		String tmp = node.getText();
		sb.append(' ');
		sb.append(tmp);
		sb.append(postfix);
		return tmp;
	}

	protected Scope getCurrentScope() {
		return scopes.peek();
	}

	protected Scope createNewScope() {
		Scope cur = getCurrentScope();
		scopes.push(cur.copyToNew());

		return getCurrentScope();
	}

	protected void restoreScope() {
		scopes.pop();
	}

	public ExtractPawnListener(SPOTParser parser) {
		this.parser = parser;
		this.sb = new StringBuilder();
		this.csb = new StringBuilder();
		this.tags = new Stack<String>();
		this.tags.push("");
		this.scopes = new Stack<Scope>();
		this.scopes.push(new Scope());
		
		this.currentState = new SSGlobal(this);
	}

	public String getOutput() {
		return sb.toString();
	}

	@Override
	public void exitExpressionStatement(
			SPOTParser.ExpressionStatementContext ctx) {
		sb.append(";\n");
	}

	@Override
	public void enterDeclaration(SPOTParser.DeclarationContext ctx) {
		isDeclaration = true;
		// createNewEnv();
	}

	@Override
	public void exitDeclaration(SPOTParser.DeclarationContext ctx) {
		if (isExitingClass) {
			isExitingClass = false;
		} else {
			sb.append(";");
		}

		sb.append("\n");
		// restoreEnv();
		isDeclaration = false;
	}

	@Override
	public void exitDeclarator(SPOTParser.DeclaratorContext ctx) {
		TokenStream tokens = parser.getTokenStream();
		if (isDeclaration && !isClass
				&& getCurrentScope().tags.containsKey(CURRENT_UNRESOLVED_CLASS)) {
			// Will create the array using the ^^^^^^^^^^^^^^^^^^^^^^^^
			// when declaring variable using a class.
			// (Ex: new CLASS:Id; -> new Id[CLASS];)
			sb.append('[');
			String className = getCurrentScope().tags
					.get(CURRENT_UNRESOLVED_CLASS).identifier;
			sb.append(className);
			sb.append(']');

			// Maps the current symbol to its type
			getCurrentScope().tags.put(tokens.getText(ctx.directDeclarator()),
					new TagClass(className));

			// Which means the class is no longer unresolved.
			getCurrentScope().tags.remove(CURRENT_UNRESOLVED_CLASS);
		}
	}

	@Override
	public void enterFunctionDeclarator(SPOTParser.FunctionDeclaratorContext ctx) {
		isFunctionDeclarator = true;
	}

	@Override
	public void exitFunctionDeclarator(SPOTParser.FunctionDeclaratorContext ctx) {
		isFunctionDeclarator = false;
	}

	@Override
	public void enterTagSpecifier(SPOTParser.TagSpecifierContext ctx) {
		getCurrentScope().tags.put(CURRENT_UNRESOLVED_CLASS,
				new Tag(TagClass.getPawnEnumId(ctx.Identifier().toString())));
	}

	@Override
	public void enterStorageClassSpecifier(
			SPOTParser.StorageClassSpecifierContext ctx) {
		asis(ctx);
	}

	@Override
	public void enterClassSpecifier(SPOTParser.ClassSpecifierContext ctx) {
		// Set the context
		isClass = true;

		// Start writing the enum declaration
		sb.append("enum ");
		String className = TagClass.getPawnEnumId(ctx.Identifier().toString());
		sb.append(className);
		sb.append(" {\n");

		// Add the current class (so that functions will be able to determine
		// correctly their prefix)
		getCurrentScope().tags.put(CURRENT_CLASS, new TagClass(className));
	}

	@Override
	public void exitClassSpecifier(SPOTParser.ClassSpecifierContext ctx) {
		// Let's close the enum
		sb.append("};\n");

		// Append our functions
		sb.append(csb);

		// Clean the class buffer
		csb.delete(0, csb.length());

		// Restore the context
		getCurrentScope().tags.remove(CURRENT_CLASS);
		isClass = false;
		isExitingClass = true;
	}

	@Override
	public void enterClassDeclaration(SPOTParser.ClassDeclarationContext ctx) {
		TokenStream tokens = parser.getTokenStream();
		// Push the current tag on top so we know what tags are the following
		// member variables
		tags.push((ctx.tagSpecifier() != null) ? tokens.getText(ctx
				.tagSpecifier()) : "");
	}

	@Override
	public void exitClassDeclaration(SPOTParser.ClassDeclarationContext ctx) {
		// Restore the tags stack as we exit our declaration list
		tags.pop();

		// Helps to read the translation
		sb.append('\n');
	}

	@Override
	public void enterIdentifierList(SPOTParser.IdentifierListContext ctx) {
		// Get the current tag and append it (to each identifer, this will
		// prevent the loss of tags when using declaration lists)
		sb.append(tags.peek());
		sb.append(ctx.Identifier());

		// There will be a trailing coma but the compiler is happy with it.
		sb.append(',');
	}

	@Override
	public void enterFunctionDefinition(SPOTParser.FunctionDefinitionContext ctx) {
		// Set the context
		isFunc = true;

		// If we are in a class, functions must not be appended on-the-fly
		// since they would end up inside the enum (which is a bad thing...),
		// so we switch the builders.
		// Nested class declaration is not supported.
		StringBuilder tmp;
		if (isClass) {
			tmp = sb;
			sb = csb;
			csb = tmp;
		}
	}

	@Override
	public void exitFunctionDefinition(SPOTParser.FunctionDefinitionContext ctx) {
		// Switch the builders (See enterFunctionDefinition)
		StringBuilder tmp;
		if (isClass) {
			tmp = sb;
			sb = csb;
			csb = tmp;
		}

		// Restore the context
		isFunc = false;
	}

	@Override
	public void enterParameterDeclaration(
			SPOTParser.ParameterDeclarationContext ctx) {
		isParameter = true;
	}

	@Override
	public void exitParameterDeclaration(
			SPOTParser.ParameterDeclarationContext ctx) {
		TokenStream tokens = parser.getTokenStream();
		if (ctx.declarationSpecifiers() != null) {
			sb.append('[');
			String className = getCurrentScope().tags
					.get(CURRENT_UNRESOLVED_CLASS).identifier;
			sb.append(className);
			sb.append(']');

			getCurrentScope().tags.put(tokens.getText(ctx.declarator()),
					new TagClass(className));
			getCurrentScope().tags.remove(CURRENT_UNRESOLVED_CLASS);
		}

		isParameter = false;
	}

	@Override
	public void enterDirectDeclarator(SPOTParser.DirectDeclaratorContext ctx) {
		if (ctx.Identifier() != null) {
			TokenStream tokens = parser.getTokenStream();
			String id = tokens.getText(ctx);

			if (isClass && isFunctionDeclarator) {
				Tag tag = getCurrentScope().tags.get(CURRENT_CLASS);
				String className = tag.identifier;
				String funcName = TagClass.getPawnFuncId(id, className);
				getCurrentScope().functions.put(TagClass.getPawnFuncId(id,
						className), new Function(funcName));

				if (!isParameter) {
					sb.append(funcName);
				} else {
					sb.append(id);
				}

			} else {
				sb.append(id);
			}
		}
	}

	@Override
	public void enterCompoundStatement(SPOTParser.CompoundStatementContext ctx) {
		createNewScope();
		sb.append("{\n");
	}

	@Override
	public void exitCompoundStatement(SPOTParser.CompoundStatementContext ctx) {
		sb.append("}\n");
		restoreScope();
	}

	// TODO Use pseudo terminals instead
	@Override
	public void enterJumpStatement(SPOTParser.JumpStatementContext ctx) {
		if (ctx.Goto() != null) {
			sb.append("goto ");
			sb.append(ctx.Identifier());
		} else if (ctx.Continue() != null) {
			sb.append("continue ");
		} else if (ctx.Break() != null) {
			sb.append("break ");
		} else if (ctx.Return() != null) {
			sb.append("return ");
		}
	}

	@Override
	public void exitJumpStatement(SPOTParser.JumpStatementContext ctx) {
		sb.append(";\n");
	}

	@Override
	public void enterPrimaryExpression(SPOTParser.PrimaryExpressionContext ctx) {
		TokenStream tokens = parser.getTokenStream();
		String id = tokens.getText(ctx);

		if (isPostfixArgs) {
			// If we are inside a postfixExpressionArgs rule, it means we are
			// playing with functions parameters
			if (getCurrentScope().tags.containsKey(id)) {
				// CURRENT_THIS will be registered as the current "object" to 
				//	be passed to a member function.
				getCurrentScope().tags.put(CURRENT_THIS, new Tag(id));
				getCurrentScope().tags.put(CURRENT_SYMBOL, new Tag(id));
			} else {
				// It is a ordinary function and we simply need to print 
				//	its name back
				sb.append(id);
			}
		} else {
			if (getCurrentScope().tags.containsKey(id)) {
				getCurrentScope().tags.put(CURRENT_SYMBOL, new Tag(id));
			}
			
			sb.append(id);
		}
	}

	@Override
	public void enterPostfixExpressionDot(
			SPOTParser.PostfixExpressionDotContext ctx) {
		String id = ctx.Identifier().toString();
		Tag tag = getCurrentScope().tags.get(id);

		// In the current scheme of things around here, when a symbol of a
		// class is found an entry is added pairing it to its (real) Tag.
		// Ex:
		// __CURRENT_SYMBOL -> myDemo ***
		// myDemo -> Class_Demo
		// TODO *** Refactor Scope or its usage here since current Symbol
		// is not a "Tag" but a variable.
		Tag currentSymbol = getCurrentScope().tags.get(CURRENT_SYMBOL);
		Tag currentClass = getCurrentScope().tags.get(currentSymbol.identifier);
		Function func = getCurrentScope().functions.get(TagClass.getPawnFuncId(
				id, currentClass.identifier));

		if (func != null) {
			sb.append(func.identifier);
		} else if (tag == null) {
			sb.append('[');
			sb.append(currentClass.identifier);
			sb.append(':');
			sb.append(id);
			sb.append(']');
		}
	}

	@Override
	public void enterPostfixExpression(SPOTParser.PostfixExpressionContext ctx) {
		if (ctx.postfixExpressionArgs() != null) {
			isPostfixArgs = true;
		}
	}

	@Override
	public void exitPostfixExpression(SPOTParser.PostfixExpressionContext ctx) {
		if (ctx.postfixExpressionArgs() != null) {
			isPostfixArgs = false;
		}
	}

	@Override
	public void enterPostfixExpressionArgs(
			SPOTParser.PostfixExpressionArgsContext ctx) {
		sb.append('(');
		isPostfixArgs = false;

		if (getCurrentScope().tags.containsKey(CURRENT_THIS)) {
			Tag thiss = getCurrentScope().tags.get(CURRENT_THIS);
			sb.append(thiss.identifier);
			 getCurrentScope().tags.remove(CURRENT_THIS);
			
			if (ctx.argumentExpressionList() != null) {
				sb.append(',');
			}
		}
	}

	// pseudo terminals
	@Override
	public void enterTypeAccessQualifier(
			SPOTParser.TypeAccessQualifierContext ctx) {
		asis(ctx);
	}

	@Override
	public void enterLpar(SPOTParser.LparContext ctx) {
		asis(ctx);
	}

	@Override
	public void enterRpar(SPOTParser.RparContext ctx) {
		asis(ctx);
	}

	@Override
	public void enterStar(SPOTParser.StarContext ctx) {
		asis(ctx);
	}

	@Override
	public void enterDiv(SPOTParser.DivContext ctx) {
		asis(ctx);
	}

	@Override
	public void enterMod(SPOTParser.ModContext ctx) {
		asis(ctx);
	}

	@Override
	public void enterPlus(SPOTParser.PlusContext ctx) {
		asis(ctx);
	}

	@Override
	public void enterMinus(SPOTParser.MinusContext ctx) {
		asis(ctx);
	}

	@Override
	public void enterShiftr(SPOTParser.ShiftrContext ctx) {
		asis(ctx);
	}

	@Override
	public void enterShiftl(SPOTParser.ShiftlContext ctx) {
		asis(ctx);
	}

	@Override
	public void enterLess(SPOTParser.LessContext ctx) {
		asis(ctx);
	}

	@Override
	public void enterMore(SPOTParser.MoreContext ctx) {
		asis(ctx);
	}

	@Override
	public void enterLeeq(SPOTParser.LeeqContext ctx) {
		asis(ctx);
	}

	@Override
	public void enterMoeq(SPOTParser.MoeqContext ctx) {
		asis(ctx);
	}

	@Override
	public void enterEqeq(SPOTParser.EqeqContext ctx) {
		asis(ctx);
	}

	@Override
	public void enterNoteq(SPOTParser.NoteqContext ctx) {
		asis(ctx);
	}

	@Override
	public void enterAnd(SPOTParser.AndContext ctx) {
		asis(ctx);
	}

	@Override
	public void enterCaret(SPOTParser.CaretContext ctx) {
		asis(ctx);
	}

	@Override
	public void enterOr(SPOTParser.OrContext ctx) {
		asis(ctx);
	}

	@Override
	public void enterAndand(SPOTParser.AndandContext ctx) {
		asis(ctx);
	}

	@Override
	public void enterOror(SPOTParser.OrorContext ctx) {
		asis(ctx);
	}

	@Override
	public void enterQuestion(SPOTParser.QuestionContext ctx) {
		asis(ctx);
	}

	@Override
	public void enterSemi(SPOTParser.SemiContext ctx) {
		asis(ctx);
	}

	@Override
	public void enterEq(SPOTParser.EqContext ctx) {
		asis(ctx);
	}

	@Override
	public void enterComa(SPOTParser.ComaContext ctx) {
		asis(ctx);
	}

	@Override
	public void enterAssignmentOperator(SPOTParser.AssignmentOperatorContext ctx) {
		asis(ctx);
	}
}
