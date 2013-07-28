// Generated from SPOT.g4 by ANTLR 4.1

    package parser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SPOTParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__15=1, T__14=2, T__13=3, T__12=4, T__11=5, T__10=6, T__9=7, T__8=8, 
		T__7=9, T__6=10, T__5=11, T__4=12, T__3=13, T__2=14, T__1=15, T__0=16, 
		Auto=17, Break=18, Case=19, Char=20, Const=21, Continue=22, Default=23, 
		Do=24, Double=25, Else=26, Enum=27, Extern=28, Float=29, For=30, Goto=31, 
		If=32, Inline=33, Int=34, Long=35, Register=36, Restrict=37, Return=38, 
		Short=39, Signed=40, Sizeof=41, Static=42, Struct=43, Switch=44, Typedef=45, 
		Union=46, Unsigned=47, Void=48, Volatile=49, While=50, Alignas=51, Alignof=52, 
		Atomic=53, Bool=54, Complex=55, Generic=56, Imaginary=57, Noreturn=58, 
		StaticAssert=59, ThreadLocal=60, LeftParen=61, RightParen=62, LeftBracket=63, 
		RightBracket=64, LeftBrace=65, RightBrace=66, Less=67, LessEqual=68, Greater=69, 
		GreaterEqual=70, LeftShift=71, RightShift=72, Plus=73, PlusPlus=74, Minus=75, 
		MinusMinus=76, Star=77, Div=78, Mod=79, And=80, Or=81, AndAnd=82, OrOr=83, 
		Caret=84, Not=85, Tilde=86, Question=87, Colon=88, Semi=89, Comma=90, 
		Assign=91, StarAssign=92, DivAssign=93, ModAssign=94, PlusAssign=95, MinusAssign=96, 
		LeftShiftAssign=97, RightShiftAssign=98, AndAssign=99, XorAssign=100, 
		OrAssign=101, Equal=102, NotEqual=103, Arrow=104, Dot=105, Ellipsis=106, 
		Identifier=107, Constant=108, StringLiteral=109, LineDirective=110, Whitespace=111, 
		Newline=112, BlockComment=113, LineComment=114;
	public static final String[] tokenNames = {
		"<INVALID>", "'decl'", "'__extension__'", "'__stdcall'", "'__builtin_offsetof'", 
		"'__attribute__'", "'__declspec'", "'__asm__'", "'new'", "'class'", "'public'", 
		"'private'", "'__asm'", "'__inline__'", "'__builtin_va_arg'", "'__volatile__'", 
		"'protected'", "'auto'", "'break'", "'case'", "'char'", "'const'", "'continue'", 
		"'default'", "'do'", "'double'", "'else'", "'enum'", "'extern'", "'float'", 
		"'for'", "'goto'", "'if'", "'inline'", "'int'", "'long'", "'register'", 
		"'restrict'", "'return'", "'short'", "'signed'", "'sizeof'", "'static'", 
		"'struct'", "'switch'", "'typedef'", "'union'", "'unsigned'", "'void'", 
		"'volatile'", "'while'", "'_Alignas'", "'_Alignof'", "'_Atomic'", "'_Bool'", 
		"'_Complex'", "'_Generic'", "'_Imaginary'", "'_Noreturn'", "'_Static_assert'", 
		"'_Thread_local'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'<'", "'<='", 
		"'>'", "'>='", "'<<'", "'>>'", "'+'", "'++'", "'-'", "'--'", "'*'", "'/'", 
		"'%'", "'&'", "'|'", "'&&'", "'||'", "'^'", "'!'", "'~'", "'?'", "':'", 
		"';'", "','", "'='", "'*='", "'/='", "'%='", "'+='", "'-='", "'<<='", 
		"'>>='", "'&='", "'^='", "'|='", "'=='", "'!='", "'->'", "'.'", "'...'", 
		"Identifier", "Constant", "StringLiteral", "LineDirective", "Whitespace", 
		"Newline", "BlockComment", "LineComment"
	};
	public static final int
		RULE_primaryExpression = 0, RULE_genericSelection = 1, RULE_genericAssocList = 2, 
		RULE_genericAssociation = 3, RULE_postfixExpressionDot = 4, RULE_postfixExpressionArgs = 5, 
		RULE_postfixExpression = 6, RULE_argumentExpressionList = 7, RULE_unaryExpression = 8, 
		RULE_unaryOperator = 9, RULE_lpar = 10, RULE_rpar = 11, RULE_castExpression = 12, 
		RULE_star = 13, RULE_div = 14, RULE_mod = 15, RULE_multiplicativeExpression = 16, 
		RULE_plus = 17, RULE_minus = 18, RULE_additiveExpression = 19, RULE_shiftl = 20, 
		RULE_shiftr = 21, RULE_shiftExpression = 22, RULE_less = 23, RULE_more = 24, 
		RULE_leeq = 25, RULE_moeq = 26, RULE_relationalExpression = 27, RULE_eqeq = 28, 
		RULE_noteq = 29, RULE_equalityExpression = 30, RULE_and = 31, RULE_andExpression = 32, 
		RULE_caret = 33, RULE_exclusiveOrExpression = 34, RULE_or = 35, RULE_inclusiveOrExpression = 36, 
		RULE_andand = 37, RULE_logicalAndExpression = 38, RULE_oror = 39, RULE_logicalOrExpression = 40, 
		RULE_question = 41, RULE_semi = 42, RULE_conditionalExpression = 43, RULE_assignmentExpression = 44, 
		RULE_assignmentOperator = 45, RULE_expression = 46, RULE_constantExpression = 47, 
		RULE_declaration = 48, RULE_declarationSpecifiers = 49, RULE_declarationSpecifiers2 = 50, 
		RULE_declarationSpecifier = 51, RULE_initDeclaratorList = 52, RULE_eq = 53, 
		RULE_initDeclarator = 54, RULE_storageClassSpecifier = 55, RULE_tagSpecifier = 56, 
		RULE_typeSpecifier = 57, RULE_classSpecifier = 58, RULE_classInheritanceSpecifier = 59, 
		RULE_classDeclarationList = 60, RULE_classDeclaration = 61, RULE_specifierQualifierList = 62, 
		RULE_enumSpecifier = 63, RULE_enumeratorList = 64, RULE_enumerator = 65, 
		RULE_enumerationConstant = 66, RULE_atomicTypeSpecifier = 67, RULE_typeQualifier = 68, 
		RULE_typeAccessQualifier = 69, RULE_functionSpecifier = 70, RULE_alignmentSpecifier = 71, 
		RULE_declarator = 72, RULE_directDeclarator = 73, RULE_gccDeclaratorExtension = 74, 
		RULE_gccAttributeSpecifier = 75, RULE_gccAttributeList = 76, RULE_gccAttribute = 77, 
		RULE_nestedParenthesesBlock = 78, RULE_pointer = 79, RULE_typeQualifierList = 80, 
		RULE_parameterTypeList = 81, RULE_coma = 82, RULE_parameterList = 83, 
		RULE_parameterDeclaration = 84, RULE_identifierList = 85, RULE_typeName = 86, 
		RULE_abstractDeclarator = 87, RULE_directAbstractDeclarator = 88, RULE_typedefName = 89, 
		RULE_initializer = 90, RULE_initializerList = 91, RULE_designation = 92, 
		RULE_designatorList = 93, RULE_designator = 94, RULE_staticAssertDeclaration = 95, 
		RULE_statement = 96, RULE_labeledStatement = 97, RULE_compoundStatement = 98, 
		RULE_blockItemList = 99, RULE_blockItem = 100, RULE_expressionStatement = 101, 
		RULE_selectionStatement = 102, RULE_iterationStatement = 103, RULE_jumpStatement = 104, 
		RULE_compilationUnit = 105, RULE_translationUnit = 106, RULE_externalDeclaration = 107, 
		RULE_functionDefinition = 108, RULE_functionDeclarator = 109, RULE_declarationList = 110;
	public static final String[] ruleNames = {
		"primaryExpression", "genericSelection", "genericAssocList", "genericAssociation", 
		"postfixExpressionDot", "postfixExpressionArgs", "postfixExpression", 
		"argumentExpressionList", "unaryExpression", "unaryOperator", "lpar", 
		"rpar", "castExpression", "star", "div", "mod", "multiplicativeExpression", 
		"plus", "minus", "additiveExpression", "shiftl", "shiftr", "shiftExpression", 
		"less", "more", "leeq", "moeq", "relationalExpression", "eqeq", "noteq", 
		"equalityExpression", "and", "andExpression", "caret", "exclusiveOrExpression", 
		"or", "inclusiveOrExpression", "andand", "logicalAndExpression", "oror", 
		"logicalOrExpression", "question", "semi", "conditionalExpression", "assignmentExpression", 
		"assignmentOperator", "expression", "constantExpression", "declaration", 
		"declarationSpecifiers", "declarationSpecifiers2", "declarationSpecifier", 
		"initDeclaratorList", "eq", "initDeclarator", "storageClassSpecifier", 
		"tagSpecifier", "typeSpecifier", "classSpecifier", "classInheritanceSpecifier", 
		"classDeclarationList", "classDeclaration", "specifierQualifierList", 
		"enumSpecifier", "enumeratorList", "enumerator", "enumerationConstant", 
		"atomicTypeSpecifier", "typeQualifier", "typeAccessQualifier", "functionSpecifier", 
		"alignmentSpecifier", "declarator", "directDeclarator", "gccDeclaratorExtension", 
		"gccAttributeSpecifier", "gccAttributeList", "gccAttribute", "nestedParenthesesBlock", 
		"pointer", "typeQualifierList", "parameterTypeList", "coma", "parameterList", 
		"parameterDeclaration", "identifierList", "typeName", "abstractDeclarator", 
		"directAbstractDeclarator", "typedefName", "initializer", "initializerList", 
		"designation", "designatorList", "designator", "staticAssertDeclaration", 
		"statement", "labeledStatement", "compoundStatement", "blockItemList", 
		"blockItem", "expressionStatement", "selectionStatement", "iterationStatement", 
		"jumpStatement", "compilationUnit", "translationUnit", "externalDeclaration", 
		"functionDefinition", "functionDeclarator", "declarationList"
	};

	@Override
	public String getGrammarFileName() { return "SPOT.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public SPOTParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class PrimaryExpressionContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode Constant() { return getToken(SPOTParser.Constant, 0); }
		public TerminalNode Identifier() { return getToken(SPOTParser.Identifier, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> StringLiteral() { return getTokens(SPOTParser.StringLiteral); }
		public TagSpecifierContext tagSpecifier() {
			return getRuleContext(TagSpecifierContext.class,0);
		}
		public GenericSelectionContext genericSelection() {
			return getRuleContext(GenericSelectionContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public TerminalNode StringLiteral(int i) {
			return getToken(SPOTParser.StringLiteral, i);
		}
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitPrimaryExpression(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_primaryExpression);
		int _la;
		try {
			int _alt;
			setState(258);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(222); tagSpecifier();
					}
					break;
				}
				setState(225); match(Identifier);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(226); match(Constant);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(228); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(227); match(StringLiteral);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(230); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(232); match(LeftParen);
				setState(233); expression(0);
				setState(234); match(RightParen);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(236); genericSelection();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(238);
				_la = _input.LA(1);
				if (_la==2) {
					{
					setState(237); match(2);
					}
				}

				setState(240); match(LeftParen);
				setState(241); compoundStatement();
				setState(242); match(RightParen);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(244); match(14);
				setState(245); match(LeftParen);
				setState(246); unaryExpression();
				setState(247); match(Comma);
				setState(248); typeName();
				setState(249); match(RightParen);
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(251); match(4);
				setState(252); match(LeftParen);
				setState(253); typeName();
				setState(254); match(Comma);
				setState(255); unaryExpression();
				setState(256); match(RightParen);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericSelectionContext extends ParserRuleContext {
		public GenericAssocListContext genericAssocList() {
			return getRuleContext(GenericAssocListContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public GenericSelectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericSelection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterGenericSelection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitGenericSelection(this);
		}
	}

	public final GenericSelectionContext genericSelection() throws RecognitionException {
		GenericSelectionContext _localctx = new GenericSelectionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_genericSelection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260); match(Generic);
			setState(261); match(LeftParen);
			setState(262); assignmentExpression();
			setState(263); match(Comma);
			setState(264); genericAssocList(0);
			setState(265); match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericAssocListContext extends ParserRuleContext {
		public int _p;
		public GenericAssocListContext genericAssocList() {
			return getRuleContext(GenericAssocListContext.class,0);
		}
		public GenericAssociationContext genericAssociation() {
			return getRuleContext(GenericAssociationContext.class,0);
		}
		public GenericAssocListContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public GenericAssocListContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_genericAssocList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterGenericAssocList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitGenericAssocList(this);
		}
	}

	public final GenericAssocListContext genericAssocList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		GenericAssocListContext _localctx = new GenericAssocListContext(_ctx, _parentState, _p);
		GenericAssocListContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, RULE_genericAssocList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(268); genericAssociation();
			}
			_ctx.stop = _input.LT(-1);
			setState(275);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GenericAssocListContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_genericAssocList);
					setState(270);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(271); match(Comma);
					setState(272); genericAssociation();
					}
					} 
				}
				setState(277);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class GenericAssociationContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public GenericAssociationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericAssociation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterGenericAssociation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitGenericAssociation(this);
		}
	}

	public final GenericAssociationContext genericAssociation() throws RecognitionException {
		GenericAssociationContext _localctx = new GenericAssociationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_genericAssociation);
		try {
			setState(285);
			switch (_input.LA(1)) {
			case 9:
			case Const:
			case Enum:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(278); typeName();
				setState(279); match(Colon);
				setState(280); assignmentExpression();
				}
				break;
			case Default:
				enterOuterAlt(_localctx, 2);
				{
				setState(282); match(Default);
				setState(283); match(Colon);
				setState(284); assignmentExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixExpressionDotContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SPOTParser.Identifier, 0); }
		public PostfixExpressionDotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpressionDot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterPostfixExpressionDot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitPostfixExpressionDot(this);
		}
	}

	public final PostfixExpressionDotContext postfixExpressionDot() throws RecognitionException {
		PostfixExpressionDotContext _localctx = new PostfixExpressionDotContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_postfixExpressionDot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287); match(Dot);
			setState(288); match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixExpressionArgsContext extends ParserRuleContext {
		public ArgumentExpressionListContext argumentExpressionList() {
			return getRuleContext(ArgumentExpressionListContext.class,0);
		}
		public RparContext rpar() {
			return getRuleContext(RparContext.class,0);
		}
		public PostfixExpressionArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpressionArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterPostfixExpressionArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitPostfixExpressionArgs(this);
		}
	}

	public final PostfixExpressionArgsContext postfixExpressionArgs() throws RecognitionException {
		PostfixExpressionArgsContext _localctx = new PostfixExpressionArgsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_postfixExpressionArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290); match(LeftParen);
			setState(292);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 4) | (1L << 14) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (Plus - 73)) | (1L << (PlusPlus - 73)) | (1L << (Minus - 73)) | (1L << (MinusMinus - 73)) | (1L << (Star - 73)) | (1L << (And - 73)) | (1L << (AndAnd - 73)) | (1L << (Not - 73)) | (1L << (Tilde - 73)) | (1L << (Identifier - 73)) | (1L << (Constant - 73)) | (1L << (StringLiteral - 73)))) != 0)) {
				{
				setState(291); argumentExpressionList(0);
				}
			}

			setState(294); rpar();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixExpressionContext extends ParserRuleContext {
		public int _p;
		public PostfixExpressionArgsContext postfixExpressionArgs() {
			return getRuleContext(PostfixExpressionArgsContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(SPOTParser.Identifier, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PostfixExpressionDotContext postfixExpressionDot() {
			return getRuleContext(PostfixExpressionDotContext.class,0);
		}
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterPostfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitPostfixExpression(this);
		}
	}

	public final PostfixExpressionContext postfixExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, _parentState, _p);
		PostfixExpressionContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, RULE_postfixExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(297); primaryExpression();
				}
				break;

			case 2:
				{
				setState(298); match(LeftParen);
				setState(299); typeName();
				setState(300); match(RightParen);
				setState(301); match(LeftBrace);
				setState(302); initializerList(0);
				setState(303); match(RightBrace);
				}
				break;

			case 3:
				{
				setState(305); match(LeftParen);
				setState(306); typeName();
				setState(307); match(RightParen);
				setState(308); match(LeftBrace);
				setState(309); initializerList(0);
				setState(310); match(Comma);
				setState(311); match(RightBrace);
				}
				break;

			case 4:
				{
				setState(313); match(2);
				setState(314); match(LeftParen);
				setState(315); typeName();
				setState(316); match(RightParen);
				setState(317); match(LeftBrace);
				setState(318); initializerList(0);
				setState(319); match(RightBrace);
				}
				break;

			case 5:
				{
				setState(321); match(2);
				setState(322); match(LeftParen);
				setState(323); typeName();
				setState(324); match(RightParen);
				setState(325); match(LeftBrace);
				setState(326); initializerList(0);
				setState(327); match(Comma);
				setState(328); match(RightBrace);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(350);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(348);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(332);
						if (!(10 >= _localctx._p)) throw new FailedPredicateException(this, "10 >= $_p");
						setState(333); match(LeftBracket);
						setState(334); expression(0);
						setState(335); match(RightBracket);
						}
						break;

					case 2:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(337);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(338); postfixExpressionArgs();
						}
						break;

					case 3:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(339);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(340); postfixExpressionDot();
						}
						break;

					case 4:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(341);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(342); match(Arrow);
						setState(343); match(Identifier);
						}
						break;

					case 5:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(344);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(345); match(PlusPlus);
						}
						break;

					case 6:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(346);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(347); match(MinusMinus);
						}
						break;
					}
					} 
				}
				setState(352);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ArgumentExpressionListContext extends ParserRuleContext {
		public int _p;
		public ComaContext coma() {
			return getRuleContext(ComaContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ArgumentExpressionListContext argumentExpressionList() {
			return getRuleContext(ArgumentExpressionListContext.class,0);
		}
		public ArgumentExpressionListContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ArgumentExpressionListContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_argumentExpressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterArgumentExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitArgumentExpressionList(this);
		}
	}

	public final ArgumentExpressionListContext argumentExpressionList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArgumentExpressionListContext _localctx = new ArgumentExpressionListContext(_ctx, _parentState, _p);
		ArgumentExpressionListContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, RULE_argumentExpressionList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(354); assignmentExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(362);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArgumentExpressionListContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_argumentExpressionList);
					setState(356);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(357); coma();
					setState(358); assignmentExpression();
					}
					} 
				}
				setState(364);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class UnaryExpressionContext extends ParserRuleContext {
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public UnaryOperatorContext unaryOperator() {
			return getRuleContext(UnaryOperatorContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(SPOTParser.Identifier, 0); }
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitUnaryExpression(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_unaryExpression);
		try {
			setState(387);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(365); postfixExpression(0);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(366); match(PlusPlus);
				setState(367); unaryExpression();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(368); match(MinusMinus);
				setState(369); unaryExpression();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(370); unaryOperator();
				setState(371); castExpression();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(373); match(Sizeof);
				setState(374); unaryExpression();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(375); match(Sizeof);
				setState(376); match(LeftParen);
				setState(377); typeName();
				setState(378); match(RightParen);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(380); match(Alignof);
				setState(381); match(LeftParen);
				setState(382); typeName();
				setState(383); match(RightParen);
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(385); match(AndAnd);
				setState(386); match(Identifier);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryOperatorContext extends ParserRuleContext {
		public UnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterUnaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitUnaryOperator(this);
		}
	}

	public final UnaryOperatorContext unaryOperator() throws RecognitionException {
		UnaryOperatorContext _localctx = new UnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_unaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			_la = _input.LA(1);
			if ( !(((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (Plus - 73)) | (1L << (Minus - 73)) | (1L << (Star - 73)) | (1L << (And - 73)) | (1L << (Not - 73)) | (1L << (Tilde - 73)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LparContext extends ParserRuleContext {
		public LparContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lpar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterLpar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitLpar(this);
		}
	}

	public final LparContext lpar() throws RecognitionException {
		LparContext _localctx = new LparContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_lpar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391); match(LeftParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RparContext extends ParserRuleContext {
		public RparContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rpar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterRpar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitRpar(this);
		}
	}

	public final RparContext rpar() throws RecognitionException {
		RparContext _localctx = new RparContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_rpar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393); match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CastExpressionContext extends ParserRuleContext {
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public LparContext lpar() {
			return getRuleContext(LparContext.class,0);
		}
		public RparContext rpar() {
			return getRuleContext(RparContext.class,0);
		}
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitCastExpression(this);
		}
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_castExpression);
		try {
			setState(407);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(395); unaryExpression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(396); lpar();
				setState(397); typeName();
				setState(398); rpar();
				setState(399); castExpression();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(401); match(2);
				setState(402); lpar();
				setState(403); typeName();
				setState(404); rpar();
				setState(405); castExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StarContext extends ParserRuleContext {
		public StarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_star; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitStar(this);
		}
	}

	public final StarContext star() throws RecognitionException {
		StarContext _localctx = new StarContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_star);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409); match(Star);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DivContext extends ParserRuleContext {
		public DivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_div; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitDiv(this);
		}
	}

	public final DivContext div() throws RecognitionException {
		DivContext _localctx = new DivContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_div);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411); match(Div);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModContext extends ParserRuleContext {
		public ModContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitMod(this);
		}
	}

	public final ModContext mod() throws RecognitionException {
		ModContext _localctx = new ModContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_mod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413); match(Mod);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public int _p;
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public DivContext div() {
			return getRuleContext(DivContext.class,0);
		}
		public ModContext mod() {
			return getRuleContext(ModContext.class,0);
		}
		public StarContext star() {
			return getRuleContext(StarContext.class,0);
		}
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitMultiplicativeExpression(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, _parentState, _p);
		MultiplicativeExpressionContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, RULE_multiplicativeExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(416); castExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(432);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(430);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(418);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(419); star();
						setState(420); castExpression();
						}
						break;

					case 2:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(422);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(423); div();
						setState(424); castExpression();
						}
						break;

					case 3:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(426);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(427); mod();
						setState(428); castExpression();
						}
						break;
					}
					} 
				}
				setState(434);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PlusContext extends ParserRuleContext {
		public PlusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitPlus(this);
		}
	}

	public final PlusContext plus() throws RecognitionException {
		PlusContext _localctx = new PlusContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_plus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435); match(Plus);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MinusContext extends ParserRuleContext {
		public MinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitMinus(this);
		}
	}

	public final MinusContext minus() throws RecognitionException {
		MinusContext _localctx = new MinusContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_minus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437); match(Minus);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public int _p;
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public PlusContext plus() {
			return getRuleContext(PlusContext.class,0);
		}
		public MinusContext minus() {
			return getRuleContext(MinusContext.class,0);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitAdditiveExpression(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, _parentState, _p);
		AdditiveExpressionContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, RULE_additiveExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(440); multiplicativeExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(452);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(450);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(442);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(443); plus();
						setState(444); multiplicativeExpression(0);
						}
						break;

					case 2:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(446);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(447); minus();
						setState(448); multiplicativeExpression(0);
						}
						break;
					}
					} 
				}
				setState(454);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ShiftlContext extends ParserRuleContext {
		public ShiftlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterShiftl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitShiftl(this);
		}
	}

	public final ShiftlContext shiftl() throws RecognitionException {
		ShiftlContext _localctx = new ShiftlContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_shiftl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455); match(LeftShift);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShiftrContext extends ParserRuleContext {
		public ShiftrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterShiftr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitShiftr(this);
		}
	}

	public final ShiftrContext shiftr() throws RecognitionException {
		ShiftrContext _localctx = new ShiftrContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_shiftr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457); match(RightShift);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShiftExpressionContext extends ParserRuleContext {
		public int _p;
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public ShiftlContext shiftl() {
			return getRuleContext(ShiftlContext.class,0);
		}
		public ShiftrContext shiftr() {
			return getRuleContext(ShiftrContext.class,0);
		}
		public ShiftExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ShiftExpressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_shiftExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterShiftExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitShiftExpression(this);
		}
	}

	public final ShiftExpressionContext shiftExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ShiftExpressionContext _localctx = new ShiftExpressionContext(_ctx, _parentState, _p);
		ShiftExpressionContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, RULE_shiftExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(460); additiveExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(472);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(470);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(462);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(463); shiftl();
						setState(464); additiveExpression(0);
						}
						break;

					case 2:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(466);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(467); shiftr();
						setState(468); additiveExpression(0);
						}
						break;
					}
					} 
				}
				setState(474);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LessContext extends ParserRuleContext {
		public LessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_less; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterLess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitLess(this);
		}
	}

	public final LessContext less() throws RecognitionException {
		LessContext _localctx = new LessContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_less);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475); match(Less);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MoreContext extends ParserRuleContext {
		public MoreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_more; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterMore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitMore(this);
		}
	}

	public final MoreContext more() throws RecognitionException {
		MoreContext _localctx = new MoreContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_more);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477); match(Greater);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LeeqContext extends ParserRuleContext {
		public LeeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterLeeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitLeeq(this);
		}
	}

	public final LeeqContext leeq() throws RecognitionException {
		LeeqContext _localctx = new LeeqContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_leeq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479); match(LessEqual);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MoeqContext extends ParserRuleContext {
		public MoeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterMoeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitMoeq(this);
		}
	}

	public final MoeqContext moeq() throws RecognitionException {
		MoeqContext _localctx = new MoeqContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_moeq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481); match(GreaterEqual);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationalExpressionContext extends ParserRuleContext {
		public int _p;
		public MoeqContext moeq() {
			return getRuleContext(MoeqContext.class,0);
		}
		public LeeqContext leeq() {
			return getRuleContext(LeeqContext.class,0);
		}
		public LessContext less() {
			return getRuleContext(LessContext.class,0);
		}
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public MoreContext more() {
			return getRuleContext(MoreContext.class,0);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitRelationalExpression(this);
		}
	}

	public final RelationalExpressionContext relationalExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, _parentState, _p);
		RelationalExpressionContext _prevctx = _localctx;
		int _startState = 54;
		enterRecursionRule(_localctx, RULE_relationalExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(484); shiftExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(504);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(502);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(486);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(487); less();
						setState(488); shiftExpression(0);
						}
						break;

					case 2:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(490);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(491); more();
						setState(492); shiftExpression(0);
						}
						break;

					case 3:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(494);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(495); leeq();
						setState(496); shiftExpression(0);
						}
						break;

					case 4:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(498);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(499); moeq();
						setState(500); shiftExpression(0);
						}
						break;
					}
					} 
				}
				setState(506);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EqeqContext extends ParserRuleContext {
		public EqeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterEqeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitEqeq(this);
		}
	}

	public final EqeqContext eqeq() throws RecognitionException {
		EqeqContext _localctx = new EqeqContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_eqeq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507); match(Equal);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NoteqContext extends ParserRuleContext {
		public NoteqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noteq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterNoteq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitNoteq(this);
		}
	}

	public final NoteqContext noteq() throws RecognitionException {
		NoteqContext _localctx = new NoteqContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_noteq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509); match(NotEqual);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqualityExpressionContext extends ParserRuleContext {
		public int _p;
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public EqeqContext eqeq() {
			return getRuleContext(EqeqContext.class,0);
		}
		public NoteqContext noteq() {
			return getRuleContext(NoteqContext.class,0);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitEqualityExpression(this);
		}
	}

	public final EqualityExpressionContext equalityExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, _parentState, _p);
		EqualityExpressionContext _prevctx = _localctx;
		int _startState = 60;
		enterRecursionRule(_localctx, RULE_equalityExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(512); relationalExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(524);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(522);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(514);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(515); eqeq();
						setState(516); relationalExpression(0);
						}
						break;

					case 2:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(518);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(519); noteq();
						setState(520); relationalExpression(0);
						}
						break;
					}
					} 
				}
				setState(526);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AndContext extends ParserRuleContext {
		public AndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitAnd(this);
		}
	}

	public final AndContext and() throws RecognitionException {
		AndContext _localctx = new AndContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_and);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527); match(And);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AndExpressionContext extends ParserRuleContext {
		public int _p;
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public AndContext and() {
			return getRuleContext(AndContext.class,0);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public AndExpressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitAndExpression(this);
		}
	}

	public final AndExpressionContext andExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, _parentState, _p);
		AndExpressionContext _prevctx = _localctx;
		int _startState = 64;
		enterRecursionRule(_localctx, RULE_andExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(530); equalityExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(538);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExpressionContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_andExpression);
					setState(532);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(533); and();
					setState(534); equalityExpression(0);
					}
					} 
				}
				setState(540);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CaretContext extends ParserRuleContext {
		public CaretContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caret; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterCaret(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitCaret(this);
		}
	}

	public final CaretContext caret() throws RecognitionException {
		CaretContext _localctx = new CaretContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_caret);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541); match(Caret);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExclusiveOrExpressionContext extends ParserRuleContext {
		public int _p;
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public CaretContext caret() {
			return getRuleContext(CaretContext.class,0);
		}
		public ExclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExclusiveOrExpressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_exclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterExclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitExclusiveOrExpression(this);
		}
	}

	public final ExclusiveOrExpressionContext exclusiveOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExclusiveOrExpressionContext _localctx = new ExclusiveOrExpressionContext(_ctx, _parentState, _p);
		ExclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 68;
		enterRecursionRule(_localctx, RULE_exclusiveOrExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(544); andExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(552);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExclusiveOrExpressionContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_exclusiveOrExpression);
					setState(546);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(547); caret();
					setState(548); andExpression(0);
					}
					} 
				}
				setState(554);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class OrContext extends ParserRuleContext {
		public OrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitOr(this);
		}
	}

	public final OrContext or() throws RecognitionException {
		OrContext _localctx = new OrContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555); match(Or);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InclusiveOrExpressionContext extends ParserRuleContext {
		public int _p;
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public OrContext or() {
			return getRuleContext(OrContext.class,0);
		}
		public InclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public InclusiveOrExpressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_inclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterInclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitInclusiveOrExpression(this);
		}
	}

	public final InclusiveOrExpressionContext inclusiveOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InclusiveOrExpressionContext _localctx = new InclusiveOrExpressionContext(_ctx, _parentState, _p);
		InclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 72;
		enterRecursionRule(_localctx, RULE_inclusiveOrExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(558); exclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(566);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InclusiveOrExpressionContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_inclusiveOrExpression);
					setState(560);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(561); or();
					setState(562); exclusiveOrExpression(0);
					}
					} 
				}
				setState(568);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AndandContext extends ParserRuleContext {
		public AndandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterAndand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitAndand(this);
		}
	}

	public final AndandContext andand() throws RecognitionException {
		AndandContext _localctx = new AndandContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_andand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569); match(AndAnd);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicalAndExpressionContext extends ParserRuleContext {
		public int _p;
		public AndandContext andand() {
			return getRuleContext(AndandContext.class,0);
		}
		public LogicalAndExpressionContext logicalAndExpression() {
			return getRuleContext(LogicalAndExpressionContext.class,0);
		}
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public LogicalAndExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public LogicalAndExpressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_logicalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterLogicalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitLogicalAndExpression(this);
		}
	}

	public final LogicalAndExpressionContext logicalAndExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalAndExpressionContext _localctx = new LogicalAndExpressionContext(_ctx, _parentState, _p);
		LogicalAndExpressionContext _prevctx = _localctx;
		int _startState = 76;
		enterRecursionRule(_localctx, RULE_logicalAndExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(572); inclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(580);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalAndExpressionContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_logicalAndExpression);
					setState(574);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(575); andand();
					setState(576); inclusiveOrExpression(0);
					}
					} 
				}
				setState(582);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class OrorContext extends ParserRuleContext {
		public OrorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oror; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterOror(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitOror(this);
		}
	}

	public final OrorContext oror() throws RecognitionException {
		OrorContext _localctx = new OrorContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_oror);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583); match(OrOr);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicalOrExpressionContext extends ParserRuleContext {
		public int _p;
		public OrorContext oror() {
			return getRuleContext(OrorContext.class,0);
		}
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public LogicalAndExpressionContext logicalAndExpression() {
			return getRuleContext(LogicalAndExpressionContext.class,0);
		}
		public LogicalOrExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public LogicalOrExpressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_logicalOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterLogicalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitLogicalOrExpression(this);
		}
	}

	public final LogicalOrExpressionContext logicalOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalOrExpressionContext _localctx = new LogicalOrExpressionContext(_ctx, _parentState, _p);
		LogicalOrExpressionContext _prevctx = _localctx;
		int _startState = 80;
		enterRecursionRule(_localctx, RULE_logicalOrExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(586); logicalAndExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(594);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalOrExpressionContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_logicalOrExpression);
					setState(588);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(589); oror();
					setState(590); logicalAndExpression(0);
					}
					} 
				}
				setState(596);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class QuestionContext extends ParserRuleContext {
		public QuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_question; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitQuestion(this);
		}
	}

	public final QuestionContext question() throws RecognitionException {
		QuestionContext _localctx = new QuestionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_question);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597); match(Question);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SemiContext extends ParserRuleContext {
		public SemiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_semi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterSemi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitSemi(this);
		}
	}

	public final SemiContext semi() throws RecognitionException {
		SemiContext _localctx = new SemiContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_semi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(599); match(Colon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalExpressionContext extends ParserRuleContext {
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public QuestionContext question() {
			return getRuleContext(QuestionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public SemiContext semi() {
			return getRuleContext(SemiContext.class,0);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitConditionalExpression(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_conditionalExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(601); logicalOrExpression(0);
			setState(607);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(602); question();
				setState(603); expression(0);
				setState(604); semi();
				setState(605); conditionalExpression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitAssignmentExpression(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_assignmentExpression);
		try {
			setState(614);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(609); conditionalExpression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(610); unaryExpression();
				setState(611); assignmentOperator();
				setState(612); assignmentExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitAssignmentOperator(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(616);
			_la = _input.LA(1);
			if ( !(((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (Assign - 91)) | (1L << (StarAssign - 91)) | (1L << (DivAssign - 91)) | (1L << (ModAssign - 91)) | (1L << (PlusAssign - 91)) | (1L << (MinusAssign - 91)) | (1L << (LeftShiftAssign - 91)) | (1L << (RightShiftAssign - 91)) | (1L << (AndAssign - 91)) | (1L << (XorAssign - 91)) | (1L << (OrAssign - 91)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public int _p;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState, _p);
		ExpressionContext _prevctx = _localctx;
		int _startState = 92;
		enterRecursionRule(_localctx, RULE_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(619); assignmentExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(626);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(621);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(622); match(Comma);
					setState(623); assignmentExpression();
					}
					} 
				}
				setState(628);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConstantExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitConstantExpression(this);
		}
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(629); conditionalExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public StaticAssertDeclarationContext staticAssertDeclaration() {
			return getRuleContext(StaticAssertDeclarationContext.class,0);
		}
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_declaration);
		int _la;
		try {
			setState(638);
			switch (_input.LA(1)) {
			case 1:
			case 8:
			case 9:
			case 10:
			case 11:
			case 16:
			case Const:
			case Enum:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(631); declarationSpecifiers();
				setState(633);
				_la = _input.LA(1);
				if (_la==LeftParen || _la==Identifier) {
					{
					setState(632); initDeclaratorList(0);
					}
				}

				setState(635); match(Semi);
				}
				break;
			case StaticAssert:
				enterOuterAlt(_localctx, 2);
				{
				setState(637); staticAssertDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationSpecifiersContext extends ParserRuleContext {
		public DeclarationSpecifierContext declarationSpecifier(int i) {
			return getRuleContext(DeclarationSpecifierContext.class,i);
		}
		public List<DeclarationSpecifierContext> declarationSpecifier() {
			return getRuleContexts(DeclarationSpecifierContext.class);
		}
		public DeclarationSpecifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationSpecifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterDeclarationSpecifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitDeclarationSpecifiers(this);
		}
	}

	public final DeclarationSpecifiersContext declarationSpecifiers() throws RecognitionException {
		DeclarationSpecifiersContext _localctx = new DeclarationSpecifiersContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_declarationSpecifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(641); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(640); declarationSpecifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(643); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationSpecifiers2Context extends ParserRuleContext {
		public DeclarationSpecifierContext declarationSpecifier(int i) {
			return getRuleContext(DeclarationSpecifierContext.class,i);
		}
		public List<DeclarationSpecifierContext> declarationSpecifier() {
			return getRuleContexts(DeclarationSpecifierContext.class);
		}
		public DeclarationSpecifiers2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationSpecifiers2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterDeclarationSpecifiers2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitDeclarationSpecifiers2(this);
		}
	}

	public final DeclarationSpecifiers2Context declarationSpecifiers2() throws RecognitionException {
		DeclarationSpecifiers2Context _localctx = new DeclarationSpecifiers2Context(_ctx, getState());
		enterRule(_localctx, 100, RULE_declarationSpecifiers2);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(646); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(645); declarationSpecifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(648); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationSpecifierContext extends ParserRuleContext {
		public StorageClassSpecifierContext storageClassSpecifier() {
			return getRuleContext(StorageClassSpecifierContext.class,0);
		}
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TypeAccessQualifierContext typeAccessQualifier() {
			return getRuleContext(TypeAccessQualifierContext.class,0);
		}
		public TypeQualifierContext typeQualifier() {
			return getRuleContext(TypeQualifierContext.class,0);
		}
		public DeclarationSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterDeclarationSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitDeclarationSpecifier(this);
		}
	}

	public final DeclarationSpecifierContext declarationSpecifier() throws RecognitionException {
		DeclarationSpecifierContext _localctx = new DeclarationSpecifierContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_declarationSpecifier);
		try {
			setState(654);
			switch (_input.LA(1)) {
			case 1:
			case 8:
				enterOuterAlt(_localctx, 1);
				{
				setState(650); storageClassSpecifier();
				}
				break;
			case 9:
			case Enum:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(651); typeSpecifier();
				}
				break;
			case Const:
				enterOuterAlt(_localctx, 3);
				{
				setState(652); typeQualifier();
				}
				break;
			case 10:
			case 11:
			case 16:
				enterOuterAlt(_localctx, 4);
				{
				setState(653); typeAccessQualifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitDeclaratorListContext extends ParserRuleContext {
		public int _p;
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public InitDeclaratorContext initDeclarator() {
			return getRuleContext(InitDeclaratorContext.class,0);
		}
		public InitDeclaratorListContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public InitDeclaratorListContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_initDeclaratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterInitDeclaratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitInitDeclaratorList(this);
		}
	}

	public final InitDeclaratorListContext initDeclaratorList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InitDeclaratorListContext _localctx = new InitDeclaratorListContext(_ctx, _parentState, _p);
		InitDeclaratorListContext _prevctx = _localctx;
		int _startState = 104;
		enterRecursionRule(_localctx, RULE_initDeclaratorList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(657); initDeclarator();
			}
			_ctx.stop = _input.LT(-1);
			setState(664);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InitDeclaratorListContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_initDeclaratorList);
					setState(659);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(660); match(Comma);
					setState(661); initDeclarator();
					}
					} 
				}
				setState(666);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EqContext extends ParserRuleContext {
		public EqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitEq(this);
		}
	}

	public final EqContext eq() throws RecognitionException {
		EqContext _localctx = new EqContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_eq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(667); match(Assign);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitDeclaratorContext extends ParserRuleContext {
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public EqContext eq() {
			return getRuleContext(EqContext.class,0);
		}
		public InitDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterInitDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitInitDeclarator(this);
		}
	}

	public final InitDeclaratorContext initDeclarator() throws RecognitionException {
		InitDeclaratorContext _localctx = new InitDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_initDeclarator);
		try {
			setState(674);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(669); declarator();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(670); declarator();
				setState(671); eq();
				setState(672); initializer();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StorageClassSpecifierContext extends ParserRuleContext {
		public StorageClassSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageClassSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterStorageClassSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitStorageClassSpecifier(this);
		}
	}

	public final StorageClassSpecifierContext storageClassSpecifier() throws RecognitionException {
		StorageClassSpecifierContext _localctx = new StorageClassSpecifierContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_storageClassSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(676);
			_la = _input.LA(1);
			if ( !(_la==1 || _la==8) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TagSpecifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SPOTParser.Identifier, 0); }
		public TagSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterTagSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitTagSpecifier(this);
		}
	}

	public final TagSpecifierContext tagSpecifier() throws RecognitionException {
		TagSpecifierContext _localctx = new TagSpecifierContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_tagSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(678); match(Identifier);
			setState(679); match(Colon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeSpecifierContext extends ParserRuleContext {
		public EnumSpecifierContext enumSpecifier() {
			return getRuleContext(EnumSpecifierContext.class,0);
		}
		public ClassSpecifierContext classSpecifier() {
			return getRuleContext(ClassSpecifierContext.class,0);
		}
		public TagSpecifierContext tagSpecifier() {
			return getRuleContext(TagSpecifierContext.class,0);
		}
		public TypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitTypeSpecifier(this);
		}
	}

	public final TypeSpecifierContext typeSpecifier() throws RecognitionException {
		TypeSpecifierContext _localctx = new TypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_typeSpecifier);
		try {
			setState(684);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(681); tagSpecifier();
				}
				break;
			case Enum:
				enterOuterAlt(_localctx, 2);
				{
				setState(682); enumSpecifier();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 3);
				{
				setState(683); classSpecifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassSpecifierContext extends ParserRuleContext {
		public ClassInheritanceSpecifierContext classInheritanceSpecifier() {
			return getRuleContext(ClassInheritanceSpecifierContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(SPOTParser.Identifier, 0); }
		public ClassDeclarationListContext classDeclarationList() {
			return getRuleContext(ClassDeclarationListContext.class,0);
		}
		public ClassSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterClassSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitClassSpecifier(this);
		}
	}

	public final ClassSpecifierContext classSpecifier() throws RecognitionException {
		ClassSpecifierContext _localctx = new ClassSpecifierContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_classSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686); match(9);
			setState(687); match(Identifier);
			setState(689);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(688); classInheritanceSpecifier();
				}
			}

			setState(691); match(LeftBrace);
			setState(693);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 8) | (1L << 9) | (1L << 10) | (1L << 11) | (1L << 16) | (1L << Const) | (1L << Enum) | (1L << LeftParen))) != 0) || _la==Identifier || _la==LineDirective) {
				{
				setState(692); classDeclarationList(0);
				}
			}

			setState(695); match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassInheritanceSpecifierContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public ClassInheritanceSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classInheritanceSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterClassInheritanceSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitClassInheritanceSpecifier(this);
		}
	}

	public final ClassInheritanceSpecifierContext classInheritanceSpecifier() throws RecognitionException {
		ClassInheritanceSpecifierContext _localctx = new ClassInheritanceSpecifierContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_classInheritanceSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(697); match(Colon);
			setState(698); identifierList(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationListContext extends ParserRuleContext {
		public int _p;
		public ClassDeclarationListContext classDeclarationList() {
			return getRuleContext(ClassDeclarationListContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public ClassDeclarationListContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ClassDeclarationListContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_classDeclarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterClassDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitClassDeclarationList(this);
		}
	}

	public final ClassDeclarationListContext classDeclarationList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ClassDeclarationListContext _localctx = new ClassDeclarationListContext(_ctx, _parentState, _p);
		ClassDeclarationListContext _prevctx = _localctx;
		int _startState = 120;
		enterRecursionRule(_localctx, RULE_classDeclarationList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(701); classDeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(707);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ClassDeclarationListContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_classDeclarationList);
					setState(703);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(704); classDeclaration();
					}
					} 
				}
				setState(709);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode LineDirective() { return getToken(SPOTParser.LineDirective, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TagSpecifierContext tagSpecifier() {
			return getRuleContext(TagSpecifierContext.class,0);
		}
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_classDeclaration);
		try {
			setState(718);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(711);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(710); tagSpecifier();
					}
					break;
				}
				setState(713); identifierList(0);
				setState(714); match(Semi);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(716); functionDefinition();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(717); match(LineDirective);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpecifierQualifierListContext extends ParserRuleContext {
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public SpecifierQualifierListContext specifierQualifierList() {
			return getRuleContext(SpecifierQualifierListContext.class,0);
		}
		public TypeQualifierContext typeQualifier() {
			return getRuleContext(TypeQualifierContext.class,0);
		}
		public SpecifierQualifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specifierQualifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterSpecifierQualifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitSpecifierQualifierList(this);
		}
	}

	public final SpecifierQualifierListContext specifierQualifierList() throws RecognitionException {
		SpecifierQualifierListContext _localctx = new SpecifierQualifierListContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_specifierQualifierList);
		int _la;
		try {
			setState(728);
			switch (_input.LA(1)) {
			case 9:
			case Enum:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(720); typeSpecifier();
				setState(722);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 9) | (1L << Const) | (1L << Enum))) != 0) || _la==Identifier) {
					{
					setState(721); specifierQualifierList();
					}
				}

				}
				break;
			case Const:
				enterOuterAlt(_localctx, 2);
				{
				setState(724); typeQualifier();
				setState(726);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 9) | (1L << Const) | (1L << Enum))) != 0) || _la==Identifier) {
					{
					setState(725); specifierQualifierList();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumSpecifierContext extends ParserRuleContext {
		public EnumeratorListContext enumeratorList() {
			return getRuleContext(EnumeratorListContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(SPOTParser.Identifier, 0); }
		public EnumSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterEnumSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitEnumSpecifier(this);
		}
	}

	public final EnumSpecifierContext enumSpecifier() throws RecognitionException {
		EnumSpecifierContext _localctx = new EnumSpecifierContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_enumSpecifier);
		int _la;
		try {
			setState(749);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(730); match(Enum);
				setState(732);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(731); match(Identifier);
					}
				}

				setState(734); match(LeftBrace);
				setState(735); enumeratorList(0);
				setState(736); match(RightBrace);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(738); match(Enum);
				setState(740);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(739); match(Identifier);
					}
				}

				setState(742); match(LeftBrace);
				setState(743); enumeratorList(0);
				setState(744); match(Comma);
				setState(745); match(RightBrace);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(747); match(Enum);
				setState(748); match(Identifier);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumeratorListContext extends ParserRuleContext {
		public int _p;
		public EnumeratorContext enumerator() {
			return getRuleContext(EnumeratorContext.class,0);
		}
		public EnumeratorListContext enumeratorList() {
			return getRuleContext(EnumeratorListContext.class,0);
		}
		public EnumeratorListContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public EnumeratorListContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_enumeratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterEnumeratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitEnumeratorList(this);
		}
	}

	public final EnumeratorListContext enumeratorList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EnumeratorListContext _localctx = new EnumeratorListContext(_ctx, _parentState, _p);
		EnumeratorListContext _prevctx = _localctx;
		int _startState = 128;
		enterRecursionRule(_localctx, RULE_enumeratorList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(752); enumerator();
			}
			_ctx.stop = _input.LT(-1);
			setState(759);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new EnumeratorListContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_enumeratorList);
					setState(754);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(755); match(Comma);
					setState(756); enumerator();
					}
					} 
				}
				setState(761);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EnumeratorContext extends ParserRuleContext {
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public EnumerationConstantContext enumerationConstant() {
			return getRuleContext(EnumerationConstantContext.class,0);
		}
		public EnumeratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterEnumerator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitEnumerator(this);
		}
	}

	public final EnumeratorContext enumerator() throws RecognitionException {
		EnumeratorContext _localctx = new EnumeratorContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_enumerator);
		try {
			setState(767);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(762); enumerationConstant();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(763); enumerationConstant();
				setState(764); match(Assign);
				setState(765); constantExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumerationConstantContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SPOTParser.Identifier, 0); }
		public TagSpecifierContext tagSpecifier() {
			return getRuleContext(TagSpecifierContext.class,0);
		}
		public EnumerationConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerationConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterEnumerationConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitEnumerationConstant(this);
		}
	}

	public final EnumerationConstantContext enumerationConstant() throws RecognitionException {
		EnumerationConstantContext _localctx = new EnumerationConstantContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_enumerationConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(770);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(769); tagSpecifier();
				}
				break;
			}
			setState(772); match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtomicTypeSpecifierContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public AtomicTypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomicTypeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterAtomicTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitAtomicTypeSpecifier(this);
		}
	}

	public final AtomicTypeSpecifierContext atomicTypeSpecifier() throws RecognitionException {
		AtomicTypeSpecifierContext _localctx = new AtomicTypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_atomicTypeSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(774); match(Atomic);
			setState(775); match(LeftParen);
			setState(776); typeName();
			setState(777); match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeQualifierContext extends ParserRuleContext {
		public TypeQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterTypeQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitTypeQualifier(this);
		}
	}

	public final TypeQualifierContext typeQualifier() throws RecognitionException {
		TypeQualifierContext _localctx = new TypeQualifierContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_typeQualifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(779); match(Const);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeAccessQualifierContext extends ParserRuleContext {
		public TypeAccessQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeAccessQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterTypeAccessQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitTypeAccessQualifier(this);
		}
	}

	public final TypeAccessQualifierContext typeAccessQualifier() throws RecognitionException {
		TypeAccessQualifierContext _localctx = new TypeAccessQualifierContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_typeAccessQualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(781);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 10) | (1L << 11) | (1L << 16))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionSpecifierContext extends ParserRuleContext {
		public GccAttributeSpecifierContext gccAttributeSpecifier() {
			return getRuleContext(GccAttributeSpecifierContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(SPOTParser.Identifier, 0); }
		public FunctionSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterFunctionSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitFunctionSpecifier(this);
		}
	}

	public final FunctionSpecifierContext functionSpecifier() throws RecognitionException {
		FunctionSpecifierContext _localctx = new FunctionSpecifierContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_functionSpecifier);
		int _la;
		try {
			setState(789);
			switch (_input.LA(1)) {
			case 3:
			case 13:
			case Inline:
			case Noreturn:
				enterOuterAlt(_localctx, 1);
				{
				setState(783);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 13) | (1L << Inline) | (1L << Noreturn))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 2);
				{
				setState(784); gccAttributeSpecifier();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 3);
				{
				setState(785); match(6);
				setState(786); match(LeftParen);
				setState(787); match(Identifier);
				setState(788); match(RightParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlignmentSpecifierContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public AlignmentSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alignmentSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterAlignmentSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitAlignmentSpecifier(this);
		}
	}

	public final AlignmentSpecifierContext alignmentSpecifier() throws RecognitionException {
		AlignmentSpecifierContext _localctx = new AlignmentSpecifierContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_alignmentSpecifier);
		try {
			setState(801);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(791); match(Alignas);
				setState(792); match(LeftParen);
				setState(793); typeName();
				setState(794); match(RightParen);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(796); match(Alignas);
				setState(797); match(LeftParen);
				setState(798); constantExpression();
				setState(799); match(RightParen);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaratorContext extends ParserRuleContext {
		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class,0);
		}
		public DeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitDeclarator(this);
		}
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_declarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(803); directDeclarator(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DirectDeclaratorContext extends ParserRuleContext {
		public int _p;
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(SPOTParser.Identifier, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public LparContext lpar() {
			return getRuleContext(LparContext.class,0);
		}
		public RparContext rpar() {
			return getRuleContext(RparContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public ParameterTypeListContext parameterTypeList() {
			return getRuleContext(ParameterTypeListContext.class,0);
		}
		public DirectDeclaratorContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public DirectDeclaratorContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_directDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterDirectDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitDirectDeclarator(this);
		}
	}

	public final DirectDeclaratorContext directDeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DirectDeclaratorContext _localctx = new DirectDeclaratorContext(_ctx, _parentState, _p);
		DirectDeclaratorContext _prevctx = _localctx;
		int _startState = 146;
		enterRecursionRule(_localctx, RULE_directDeclarator);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(811);
			switch (_input.LA(1)) {
			case Identifier:
				{
				setState(806); match(Identifier);
				}
				break;
			case LeftParen:
				{
				setState(807); lpar();
				setState(808); declarator();
				setState(809); rpar();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(843);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(841);
					switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
					case 1:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(813);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(814); match(LeftBracket);
						setState(816);
						_la = _input.LA(1);
						if (_la==Const) {
							{
							setState(815); typeQualifierList(0);
							}
						}

						setState(819);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 4) | (1L << 14) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (Plus - 73)) | (1L << (PlusPlus - 73)) | (1L << (Minus - 73)) | (1L << (MinusMinus - 73)) | (1L << (Star - 73)) | (1L << (And - 73)) | (1L << (AndAnd - 73)) | (1L << (Not - 73)) | (1L << (Tilde - 73)) | (1L << (Identifier - 73)) | (1L << (Constant - 73)) | (1L << (StringLiteral - 73)))) != 0)) {
							{
							setState(818); assignmentExpression();
							}
						}

						setState(821); match(RightBracket);
						}
						break;

					case 2:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(822);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(823); match(LeftBracket);
						setState(825);
						_la = _input.LA(1);
						if (_la==Const) {
							{
							setState(824); typeQualifierList(0);
							}
						}

						setState(827); match(Star);
						setState(828); match(RightBracket);
						}
						break;

					case 3:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(829);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(830); lpar();
						setState(831); parameterTypeList();
						setState(832); rpar();
						}
						break;

					case 4:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(834);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(835); lpar();
						setState(837);
						_la = _input.LA(1);
						if (_la==Identifier) {
							{
							setState(836); identifierList(0);
							}
						}

						setState(839); rpar();
						}
						break;
					}
					} 
				}
				setState(845);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class GccDeclaratorExtensionContext extends ParserRuleContext {
		public GccAttributeSpecifierContext gccAttributeSpecifier() {
			return getRuleContext(GccAttributeSpecifierContext.class,0);
		}
		public List<TerminalNode> StringLiteral() { return getTokens(SPOTParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(SPOTParser.StringLiteral, i);
		}
		public GccDeclaratorExtensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gccDeclaratorExtension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterGccDeclaratorExtension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitGccDeclaratorExtension(this);
		}
	}

	public final GccDeclaratorExtensionContext gccDeclaratorExtension() throws RecognitionException {
		GccDeclaratorExtensionContext _localctx = new GccDeclaratorExtensionContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_gccDeclaratorExtension);
		int _la;
		try {
			setState(855);
			switch (_input.LA(1)) {
			case 12:
				enterOuterAlt(_localctx, 1);
				{
				setState(846); match(12);
				setState(847); match(LeftParen);
				setState(849); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(848); match(StringLiteral);
					}
					}
					setState(851); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==StringLiteral );
				setState(853); match(RightParen);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 2);
				{
				setState(854); gccAttributeSpecifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GccAttributeSpecifierContext extends ParserRuleContext {
		public GccAttributeListContext gccAttributeList() {
			return getRuleContext(GccAttributeListContext.class,0);
		}
		public GccAttributeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gccAttributeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterGccAttributeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitGccAttributeSpecifier(this);
		}
	}

	public final GccAttributeSpecifierContext gccAttributeSpecifier() throws RecognitionException {
		GccAttributeSpecifierContext _localctx = new GccAttributeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_gccAttributeSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(857); match(5);
			setState(858); match(LeftParen);
			setState(859); match(LeftParen);
			setState(860); gccAttributeList();
			setState(861); match(RightParen);
			setState(862); match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GccAttributeListContext extends ParserRuleContext {
		public GccAttributeContext gccAttribute(int i) {
			return getRuleContext(GccAttributeContext.class,i);
		}
		public List<GccAttributeContext> gccAttribute() {
			return getRuleContexts(GccAttributeContext.class);
		}
		public GccAttributeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gccAttributeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterGccAttributeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitGccAttributeList(this);
		}
	}

	public final GccAttributeListContext gccAttributeList() throws RecognitionException {
		GccAttributeListContext _localctx = new GccAttributeListContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_gccAttributeList);
		int _la;
		try {
			setState(873);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(864); gccAttribute();
				setState(869);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(865); match(Comma);
					setState(866); gccAttribute();
					}
					}
					setState(871);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GccAttributeContext extends ParserRuleContext {
		public ArgumentExpressionListContext argumentExpressionList() {
			return getRuleContext(ArgumentExpressionListContext.class,0);
		}
		public GccAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gccAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterGccAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitGccAttribute(this);
		}
	}

	public final GccAttributeContext gccAttribute() throws RecognitionException {
		GccAttributeContext _localctx = new GccAttributeContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_gccAttribute);
		int _la;
		try {
			setState(884);
			switch (_input.LA(1)) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
			case 10:
			case 11:
			case 12:
			case 13:
			case 14:
			case 15:
			case 16:
			case Auto:
			case Break:
			case Case:
			case Char:
			case Const:
			case Continue:
			case Default:
			case Do:
			case Double:
			case Else:
			case Enum:
			case Extern:
			case Float:
			case For:
			case Goto:
			case If:
			case Inline:
			case Int:
			case Long:
			case Register:
			case Restrict:
			case Return:
			case Short:
			case Signed:
			case Sizeof:
			case Static:
			case Struct:
			case Switch:
			case Typedef:
			case Union:
			case Unsigned:
			case Void:
			case Volatile:
			case While:
			case Alignas:
			case Alignof:
			case Atomic:
			case Bool:
			case Complex:
			case Generic:
			case Imaginary:
			case Noreturn:
			case StaticAssert:
			case ThreadLocal:
			case LeftBracket:
			case RightBracket:
			case LeftBrace:
			case RightBrace:
			case Less:
			case LessEqual:
			case Greater:
			case GreaterEqual:
			case LeftShift:
			case RightShift:
			case Plus:
			case PlusPlus:
			case Minus:
			case MinusMinus:
			case Star:
			case Div:
			case Mod:
			case And:
			case Or:
			case AndAnd:
			case OrOr:
			case Caret:
			case Not:
			case Tilde:
			case Question:
			case Colon:
			case Semi:
			case Assign:
			case StarAssign:
			case DivAssign:
			case ModAssign:
			case PlusAssign:
			case MinusAssign:
			case LeftShiftAssign:
			case RightShiftAssign:
			case AndAssign:
			case XorAssign:
			case OrAssign:
			case Equal:
			case NotEqual:
			case Arrow:
			case Dot:
			case Ellipsis:
			case Identifier:
			case Constant:
			case StringLiteral:
			case LineDirective:
			case Whitespace:
			case Newline:
			case BlockComment:
			case LineComment:
				enterOuterAlt(_localctx, 1);
				{
				setState(875);
				_la = _input.LA(1);
				if ( _la <= 0 || (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (LeftParen - 61)) | (1L << (RightParen - 61)) | (1L << (Comma - 61)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(881);
				_la = _input.LA(1);
				if (_la==LeftParen) {
					{
					setState(876); match(LeftParen);
					setState(878);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 4) | (1L << 14) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (Plus - 73)) | (1L << (PlusPlus - 73)) | (1L << (Minus - 73)) | (1L << (MinusMinus - 73)) | (1L << (Star - 73)) | (1L << (And - 73)) | (1L << (AndAnd - 73)) | (1L << (Not - 73)) | (1L << (Tilde - 73)) | (1L << (Identifier - 73)) | (1L << (Constant - 73)) | (1L << (StringLiteral - 73)))) != 0)) {
						{
						setState(877); argumentExpressionList(0);
						}
					}

					setState(880); match(RightParen);
					}
				}

				}
				break;
			case RightParen:
			case Comma:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NestedParenthesesBlockContext extends ParserRuleContext {
		public List<NestedParenthesesBlockContext> nestedParenthesesBlock() {
			return getRuleContexts(NestedParenthesesBlockContext.class);
		}
		public NestedParenthesesBlockContext nestedParenthesesBlock(int i) {
			return getRuleContext(NestedParenthesesBlockContext.class,i);
		}
		public NestedParenthesesBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedParenthesesBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterNestedParenthesesBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitNestedParenthesesBlock(this);
		}
	}

	public final NestedParenthesesBlockContext nestedParenthesesBlock() throws RecognitionException {
		NestedParenthesesBlockContext _localctx = new NestedParenthesesBlockContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_nestedParenthesesBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(893);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 3) | (1L << 4) | (1L << 5) | (1L << 6) | (1L << 7) | (1L << 8) | (1L << 9) | (1L << 10) | (1L << 11) | (1L << 12) | (1L << 13) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << Auto) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Const) | (1L << Continue) | (1L << Default) | (1L << Do) | (1L << Double) | (1L << Else) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << For) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static) | (1L << Struct) | (1L << Switch) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << While) | (1L << Alignas) | (1L << Alignof) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Generic) | (1L << Imaginary) | (1L << Noreturn) | (1L << StaticAssert) | (1L << ThreadLocal) | (1L << LeftParen) | (1L << LeftBracket))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (RightBracket - 64)) | (1L << (LeftBrace - 64)) | (1L << (RightBrace - 64)) | (1L << (Less - 64)) | (1L << (LessEqual - 64)) | (1L << (Greater - 64)) | (1L << (GreaterEqual - 64)) | (1L << (LeftShift - 64)) | (1L << (RightShift - 64)) | (1L << (Plus - 64)) | (1L << (PlusPlus - 64)) | (1L << (Minus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Star - 64)) | (1L << (Div - 64)) | (1L << (Mod - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Caret - 64)) | (1L << (Not - 64)) | (1L << (Tilde - 64)) | (1L << (Question - 64)) | (1L << (Colon - 64)) | (1L << (Semi - 64)) | (1L << (Comma - 64)) | (1L << (Assign - 64)) | (1L << (StarAssign - 64)) | (1L << (DivAssign - 64)) | (1L << (ModAssign - 64)) | (1L << (PlusAssign - 64)) | (1L << (MinusAssign - 64)) | (1L << (LeftShiftAssign - 64)) | (1L << (RightShiftAssign - 64)) | (1L << (AndAssign - 64)) | (1L << (XorAssign - 64)) | (1L << (OrAssign - 64)) | (1L << (Equal - 64)) | (1L << (NotEqual - 64)) | (1L << (Arrow - 64)) | (1L << (Dot - 64)) | (1L << (Ellipsis - 64)) | (1L << (Identifier - 64)) | (1L << (Constant - 64)) | (1L << (StringLiteral - 64)) | (1L << (LineDirective - 64)) | (1L << (Whitespace - 64)) | (1L << (Newline - 64)) | (1L << (BlockComment - 64)) | (1L << (LineComment - 64)))) != 0)) {
				{
				setState(891);
				switch (_input.LA(1)) {
				case 1:
				case 2:
				case 3:
				case 4:
				case 5:
				case 6:
				case 7:
				case 8:
				case 9:
				case 10:
				case 11:
				case 12:
				case 13:
				case 14:
				case 15:
				case 16:
				case Auto:
				case Break:
				case Case:
				case Char:
				case Const:
				case Continue:
				case Default:
				case Do:
				case Double:
				case Else:
				case Enum:
				case Extern:
				case Float:
				case For:
				case Goto:
				case If:
				case Inline:
				case Int:
				case Long:
				case Register:
				case Restrict:
				case Return:
				case Short:
				case Signed:
				case Sizeof:
				case Static:
				case Struct:
				case Switch:
				case Typedef:
				case Union:
				case Unsigned:
				case Void:
				case Volatile:
				case While:
				case Alignas:
				case Alignof:
				case Atomic:
				case Bool:
				case Complex:
				case Generic:
				case Imaginary:
				case Noreturn:
				case StaticAssert:
				case ThreadLocal:
				case LeftBracket:
				case RightBracket:
				case LeftBrace:
				case RightBrace:
				case Less:
				case LessEqual:
				case Greater:
				case GreaterEqual:
				case LeftShift:
				case RightShift:
				case Plus:
				case PlusPlus:
				case Minus:
				case MinusMinus:
				case Star:
				case Div:
				case Mod:
				case And:
				case Or:
				case AndAnd:
				case OrOr:
				case Caret:
				case Not:
				case Tilde:
				case Question:
				case Colon:
				case Semi:
				case Comma:
				case Assign:
				case StarAssign:
				case DivAssign:
				case ModAssign:
				case PlusAssign:
				case MinusAssign:
				case LeftShiftAssign:
				case RightShiftAssign:
				case AndAssign:
				case XorAssign:
				case OrAssign:
				case Equal:
				case NotEqual:
				case Arrow:
				case Dot:
				case Ellipsis:
				case Identifier:
				case Constant:
				case StringLiteral:
				case LineDirective:
				case Whitespace:
				case Newline:
				case BlockComment:
				case LineComment:
					{
					setState(886);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==LeftParen || _la==RightParen) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					break;
				case LeftParen:
					{
					setState(887); match(LeftParen);
					setState(888); nestedParenthesesBlock();
					setState(889); match(RightParen);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(895);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PointerContext extends ParserRuleContext {
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public PointerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterPointer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitPointer(this);
		}
	}

	public final PointerContext pointer() throws RecognitionException {
		PointerContext _localctx = new PointerContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_pointer);
		int _la;
		try {
			setState(914);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(896); match(Star);
				setState(898);
				switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
				case 1:
					{
					setState(897); typeQualifierList(0);
					}
					break;
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(900); match(Star);
				setState(902);
				_la = _input.LA(1);
				if (_la==Const) {
					{
					setState(901); typeQualifierList(0);
					}
				}

				setState(904); pointer();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(905); match(Caret);
				setState(907);
				switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
				case 1:
					{
					setState(906); typeQualifierList(0);
					}
					break;
				}
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(909); match(Caret);
				setState(911);
				_la = _input.LA(1);
				if (_la==Const) {
					{
					setState(910); typeQualifierList(0);
					}
				}

				setState(913); pointer();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeQualifierListContext extends ParserRuleContext {
		public int _p;
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public TypeQualifierContext typeQualifier() {
			return getRuleContext(TypeQualifierContext.class,0);
		}
		public TypeQualifierListContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public TypeQualifierListContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_typeQualifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterTypeQualifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitTypeQualifierList(this);
		}
	}

	public final TypeQualifierListContext typeQualifierList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeQualifierListContext _localctx = new TypeQualifierListContext(_ctx, _parentState, _p);
		TypeQualifierListContext _prevctx = _localctx;
		int _startState = 160;
		enterRecursionRule(_localctx, RULE_typeQualifierList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(917); typeQualifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(923);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeQualifierListContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_typeQualifierList);
					setState(919);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(920); typeQualifier();
					}
					} 
				}
				setState(925);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ParameterTypeListContext extends ParserRuleContext {
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ParameterTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterParameterTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitParameterTypeList(this);
		}
	}

	public final ParameterTypeListContext parameterTypeList() throws RecognitionException {
		ParameterTypeListContext _localctx = new ParameterTypeListContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_parameterTypeList);
		try {
			setState(931);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(926); parameterList(0);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(927); parameterList(0);
				setState(928); match(Comma);
				setState(929); match(Ellipsis);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComaContext extends ParserRuleContext {
		public ComaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterComa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitComa(this);
		}
	}

	public final ComaContext coma() throws RecognitionException {
		ComaContext _localctx = new ComaContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_coma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(933); match(Comma);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterListContext extends ParserRuleContext {
		public int _p;
		public ParameterDeclarationContext parameterDeclaration() {
			return getRuleContext(ParameterDeclarationContext.class,0);
		}
		public ComaContext coma() {
			return getRuleContext(ComaContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParameterListContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitParameterList(this);
		}
	}

	public final ParameterListContext parameterList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ParameterListContext _localctx = new ParameterListContext(_ctx, _parentState, _p);
		ParameterListContext _prevctx = _localctx;
		int _startState = 166;
		enterRecursionRule(_localctx, RULE_parameterList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(936); parameterDeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(944);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ParameterListContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_parameterList);
					setState(938);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(939); coma();
					setState(940); parameterDeclaration();
					}
					} 
				}
				setState(946);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ParameterDeclarationContext extends ParserRuleContext {
		public DeclarationSpecifiers2Context declarationSpecifiers2() {
			return getRuleContext(DeclarationSpecifiers2Context.class,0);
		}
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public ParameterDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterParameterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitParameterDeclaration(this);
		}
	}

	public final ParameterDeclarationContext parameterDeclaration() throws RecognitionException {
		ParameterDeclarationContext _localctx = new ParameterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_parameterDeclaration);
		try {
			setState(958);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(947); declarationSpecifiers();
				setState(948); declarator();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(950); declarationSpecifiers2();
				setState(952);
				switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
				case 1:
					{
					setState(951); abstractDeclarator();
					}
					break;
				}
				setState(955);
				switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
				case 1:
					{
					setState(954); assignmentExpression();
					}
					break;
				}
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(957); assignmentExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierListContext extends ParserRuleContext {
		public int _p;
		public TerminalNode Identifier() { return getToken(SPOTParser.Identifier, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public IdentifierListContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitIdentifierList(this);
		}
	}

	public final IdentifierListContext identifierList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, _parentState, _p);
		IdentifierListContext _prevctx = _localctx;
		int _startState = 170;
		enterRecursionRule(_localctx, RULE_identifierList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(961); match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(968);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new IdentifierListContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_identifierList);
					setState(963);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(964); match(Comma);
					setState(965); match(Identifier);
					}
					} 
				}
				setState(970);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TypeNameContext extends ParserRuleContext {
		public SpecifierQualifierListContext specifierQualifierList() {
			return getRuleContext(SpecifierQualifierListContext.class,0);
		}
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitTypeName(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_typeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(971); specifierQualifierList();
			setState(973);
			_la = _input.LA(1);
			if (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (LeftParen - 61)) | (1L << (LeftBracket - 61)) | (1L << (Star - 61)) | (1L << (Caret - 61)))) != 0)) {
				{
				setState(972); abstractDeclarator();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AbstractDeclaratorContext extends ParserRuleContext {
		public GccDeclaratorExtensionContext gccDeclaratorExtension(int i) {
			return getRuleContext(GccDeclaratorExtensionContext.class,i);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public List<GccDeclaratorExtensionContext> gccDeclaratorExtension() {
			return getRuleContexts(GccDeclaratorExtensionContext.class);
		}
		public DirectAbstractDeclaratorContext directAbstractDeclarator() {
			return getRuleContext(DirectAbstractDeclaratorContext.class,0);
		}
		public AbstractDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterAbstractDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitAbstractDeclarator(this);
		}
	}

	public final AbstractDeclaratorContext abstractDeclarator() throws RecognitionException {
		AbstractDeclaratorContext _localctx = new AbstractDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_abstractDeclarator);
		int _la;
		try {
			int _alt;
			setState(986);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(975); pointer();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(977);
				_la = _input.LA(1);
				if (_la==Star || _la==Caret) {
					{
					setState(976); pointer();
					}
				}

				setState(979); directAbstractDeclarator(0);
				setState(983);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(980); gccDeclaratorExtension();
						}
						} 
					}
					setState(985);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DirectAbstractDeclaratorContext extends ParserRuleContext {
		public int _p;
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public GccDeclaratorExtensionContext gccDeclaratorExtension(int i) {
			return getRuleContext(GccDeclaratorExtensionContext.class,i);
		}
		public List<GccDeclaratorExtensionContext> gccDeclaratorExtension() {
			return getRuleContexts(GccDeclaratorExtensionContext.class);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public DirectAbstractDeclaratorContext directAbstractDeclarator() {
			return getRuleContext(DirectAbstractDeclaratorContext.class,0);
		}
		public ParameterTypeListContext parameterTypeList() {
			return getRuleContext(ParameterTypeListContext.class,0);
		}
		public DirectAbstractDeclaratorContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public DirectAbstractDeclaratorContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_directAbstractDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterDirectAbstractDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitDirectAbstractDeclarator(this);
		}
	}

	public final DirectAbstractDeclaratorContext directAbstractDeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DirectAbstractDeclaratorContext _localctx = new DirectAbstractDeclaratorContext(_ctx, _parentState, _p);
		DirectAbstractDeclaratorContext _prevctx = _localctx;
		int _startState = 176;
		enterRecursionRule(_localctx, RULE_directAbstractDeclarator);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1034);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				{
				setState(989); match(LeftParen);
				setState(990); abstractDeclarator();
				setState(991); match(RightParen);
				setState(995);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(992); gccDeclaratorExtension();
						}
						} 
					}
					setState(997);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
				}
				}
				break;

			case 2:
				{
				setState(998); match(LeftBracket);
				setState(1000);
				_la = _input.LA(1);
				if (_la==Const) {
					{
					setState(999); typeQualifierList(0);
					}
				}

				setState(1003);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 4) | (1L << 14) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (Plus - 73)) | (1L << (PlusPlus - 73)) | (1L << (Minus - 73)) | (1L << (MinusMinus - 73)) | (1L << (Star - 73)) | (1L << (And - 73)) | (1L << (AndAnd - 73)) | (1L << (Not - 73)) | (1L << (Tilde - 73)) | (1L << (Identifier - 73)) | (1L << (Constant - 73)) | (1L << (StringLiteral - 73)))) != 0)) {
					{
					setState(1002); assignmentExpression();
					}
				}

				setState(1005); match(RightBracket);
				}
				break;

			case 3:
				{
				setState(1006); match(LeftBracket);
				setState(1007); match(Static);
				setState(1009);
				_la = _input.LA(1);
				if (_la==Const) {
					{
					setState(1008); typeQualifierList(0);
					}
				}

				setState(1011); assignmentExpression();
				setState(1012); match(RightBracket);
				}
				break;

			case 4:
				{
				setState(1014); match(LeftBracket);
				setState(1015); typeQualifierList(0);
				setState(1016); match(Static);
				setState(1017); assignmentExpression();
				setState(1018); match(RightBracket);
				}
				break;

			case 5:
				{
				setState(1020); match(LeftBracket);
				setState(1021); match(Star);
				setState(1022); match(RightBracket);
				}
				break;

			case 6:
				{
				setState(1023); match(LeftParen);
				setState(1025);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 4) | (1L << 8) | (1L << 9) | (1L << 10) | (1L << 11) | (1L << 14) | (1L << 16) | (1L << Const) | (1L << Enum) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (Plus - 73)) | (1L << (PlusPlus - 73)) | (1L << (Minus - 73)) | (1L << (MinusMinus - 73)) | (1L << (Star - 73)) | (1L << (And - 73)) | (1L << (AndAnd - 73)) | (1L << (Not - 73)) | (1L << (Tilde - 73)) | (1L << (Identifier - 73)) | (1L << (Constant - 73)) | (1L << (StringLiteral - 73)))) != 0)) {
					{
					setState(1024); parameterTypeList();
					}
				}

				setState(1027); match(RightParen);
				setState(1031);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(1028); gccDeclaratorExtension();
						}
						} 
					}
					setState(1033);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1079);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1077);
					switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
					case 1:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(1036);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(1037); match(LeftBracket);
						setState(1039);
						_la = _input.LA(1);
						if (_la==Const) {
							{
							setState(1038); typeQualifierList(0);
							}
						}

						setState(1042);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 4) | (1L << 14) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (Plus - 73)) | (1L << (PlusPlus - 73)) | (1L << (Minus - 73)) | (1L << (MinusMinus - 73)) | (1L << (Star - 73)) | (1L << (And - 73)) | (1L << (AndAnd - 73)) | (1L << (Not - 73)) | (1L << (Tilde - 73)) | (1L << (Identifier - 73)) | (1L << (Constant - 73)) | (1L << (StringLiteral - 73)))) != 0)) {
							{
							setState(1041); assignmentExpression();
							}
						}

						setState(1044); match(RightBracket);
						}
						break;

					case 2:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(1045);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(1046); match(LeftBracket);
						setState(1047); match(Static);
						setState(1049);
						_la = _input.LA(1);
						if (_la==Const) {
							{
							setState(1048); typeQualifierList(0);
							}
						}

						setState(1051); assignmentExpression();
						setState(1052); match(RightBracket);
						}
						break;

					case 3:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(1054);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(1055); match(LeftBracket);
						setState(1056); typeQualifierList(0);
						setState(1057); match(Static);
						setState(1058); assignmentExpression();
						setState(1059); match(RightBracket);
						}
						break;

					case 4:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(1061);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(1062); match(LeftBracket);
						setState(1063); match(Star);
						setState(1064); match(RightBracket);
						}
						break;

					case 5:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(1065);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(1066); match(LeftParen);
						setState(1068);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 4) | (1L << 8) | (1L << 9) | (1L << 10) | (1L << 11) | (1L << 14) | (1L << 16) | (1L << Const) | (1L << Enum) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (Plus - 73)) | (1L << (PlusPlus - 73)) | (1L << (Minus - 73)) | (1L << (MinusMinus - 73)) | (1L << (Star - 73)) | (1L << (And - 73)) | (1L << (AndAnd - 73)) | (1L << (Not - 73)) | (1L << (Tilde - 73)) | (1L << (Identifier - 73)) | (1L << (Constant - 73)) | (1L << (StringLiteral - 73)))) != 0)) {
							{
							setState(1067); parameterTypeList();
							}
						}

						setState(1070); match(RightParen);
						setState(1074);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
						while ( _alt!=2 && _alt!=-1 ) {
							if ( _alt==1 ) {
								{
								{
								setState(1071); gccDeclaratorExtension();
								}
								} 
							}
							setState(1076);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
						}
						}
						break;
					}
					} 
				}
				setState(1081);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TypedefNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SPOTParser.Identifier, 0); }
		public TypedefNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedefName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterTypedefName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitTypedefName(this);
		}
	}

	public final TypedefNameContext typedefName() throws RecognitionException {
		TypedefNameContext _localctx = new TypedefNameContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_typedefName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1082); match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerContext extends ParserRuleContext {
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitInitializer(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_initializer);
		try {
			setState(1094);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1084); assignmentExpression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1085); match(LeftBrace);
				setState(1086); initializerList(0);
				setState(1087); match(RightBrace);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1089); match(LeftBrace);
				setState(1090); initializerList(0);
				setState(1091); match(Comma);
				setState(1092); match(RightBrace);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerListContext extends ParserRuleContext {
		public int _p;
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
		}
		public DesignationContext designation() {
			return getRuleContext(DesignationContext.class,0);
		}
		public InitializerListContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public InitializerListContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_initializerList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterInitializerList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitInitializerList(this);
		}
	}

	public final InitializerListContext initializerList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InitializerListContext _localctx = new InitializerListContext(_ctx, _parentState, _p);
		InitializerListContext _prevctx = _localctx;
		int _startState = 182;
		enterRecursionRule(_localctx, RULE_initializerList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1098);
			_la = _input.LA(1);
			if (_la==LeftBracket || _la==Dot) {
				{
				setState(1097); designation();
				}
			}

			setState(1100); initializer();
			}
			_ctx.stop = _input.LT(-1);
			setState(1110);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InitializerListContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_initializerList);
					setState(1102);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(1103); match(Comma);
					setState(1105);
					_la = _input.LA(1);
					if (_la==LeftBracket || _la==Dot) {
						{
						setState(1104); designation();
						}
					}

					setState(1107); initializer();
					}
					} 
				}
				setState(1112);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DesignationContext extends ParserRuleContext {
		public DesignatorListContext designatorList() {
			return getRuleContext(DesignatorListContext.class,0);
		}
		public DesignationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterDesignation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitDesignation(this);
		}
	}

	public final DesignationContext designation() throws RecognitionException {
		DesignationContext _localctx = new DesignationContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_designation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1113); designatorList(0);
			setState(1114); match(Assign);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DesignatorListContext extends ParserRuleContext {
		public int _p;
		public DesignatorListContext designatorList() {
			return getRuleContext(DesignatorListContext.class,0);
		}
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public DesignatorListContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public DesignatorListContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_designatorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterDesignatorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitDesignatorList(this);
		}
	}

	public final DesignatorListContext designatorList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DesignatorListContext _localctx = new DesignatorListContext(_ctx, _parentState, _p);
		DesignatorListContext _prevctx = _localctx;
		int _startState = 186;
		enterRecursionRule(_localctx, RULE_designatorList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1117); designator();
			}
			_ctx.stop = _input.LT(-1);
			setState(1123);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DesignatorListContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_designatorList);
					setState(1119);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(1120); designator();
					}
					} 
				}
				setState(1125);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DesignatorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SPOTParser.Identifier, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public DesignatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterDesignator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitDesignator(this);
		}
	}

	public final DesignatorContext designator() throws RecognitionException {
		DesignatorContext _localctx = new DesignatorContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_designator);
		try {
			setState(1132);
			switch (_input.LA(1)) {
			case LeftBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(1126); match(LeftBracket);
				setState(1127); constantExpression();
				setState(1128); match(RightBracket);
				}
				break;
			case Dot:
				enterOuterAlt(_localctx, 2);
				{
				setState(1130); match(Dot);
				setState(1131); match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StaticAssertDeclarationContext extends ParserRuleContext {
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public List<TerminalNode> StringLiteral() { return getTokens(SPOTParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(SPOTParser.StringLiteral, i);
		}
		public StaticAssertDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticAssertDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterStaticAssertDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitStaticAssertDeclaration(this);
		}
	}

	public final StaticAssertDeclarationContext staticAssertDeclaration() throws RecognitionException {
		StaticAssertDeclarationContext _localctx = new StaticAssertDeclarationContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_staticAssertDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1134); match(StaticAssert);
			setState(1135); match(LeftParen);
			setState(1136); constantExpression();
			setState(1137); match(Comma);
			setState(1139); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1138); match(StringLiteral);
				}
				}
				setState(1141); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==StringLiteral );
			setState(1143); match(RightParen);
			setState(1144); match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public JumpStatementContext jumpStatement() {
			return getRuleContext(JumpStatementContext.class,0);
		}
		public IterationStatementContext iterationStatement() {
			return getRuleContext(IterationStatementContext.class,0);
		}
		public SelectionStatementContext selectionStatement() {
			return getRuleContext(SelectionStatementContext.class,0);
		}
		public List<LogicalOrExpressionContext> logicalOrExpression() {
			return getRuleContexts(LogicalOrExpressionContext.class);
		}
		public LabeledStatementContext labeledStatement() {
			return getRuleContext(LabeledStatementContext.class,0);
		}
		public LogicalOrExpressionContext logicalOrExpression(int i) {
			return getRuleContext(LogicalOrExpressionContext.class,i);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_statement);
		int _la;
		try {
			setState(1183);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1146); labeledStatement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1147); compoundStatement();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1148); expressionStatement();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1149); selectionStatement();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1150); iterationStatement();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1151); jumpStatement();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1152);
				_la = _input.LA(1);
				if ( !(_la==7 || _la==12) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(1153);
				_la = _input.LA(1);
				if ( !(_la==15 || _la==Volatile) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(1154); match(LeftParen);
				setState(1163);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 4) | (1L << 14) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (Plus - 73)) | (1L << (PlusPlus - 73)) | (1L << (Minus - 73)) | (1L << (MinusMinus - 73)) | (1L << (Star - 73)) | (1L << (And - 73)) | (1L << (AndAnd - 73)) | (1L << (Not - 73)) | (1L << (Tilde - 73)) | (1L << (Identifier - 73)) | (1L << (Constant - 73)) | (1L << (StringLiteral - 73)))) != 0)) {
					{
					setState(1155); logicalOrExpression(0);
					setState(1160);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(1156); match(Comma);
						setState(1157); logicalOrExpression(0);
						}
						}
						setState(1162);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Colon) {
					{
					{
					setState(1165); match(Colon);
					setState(1174);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 4) | (1L << 14) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (Plus - 73)) | (1L << (PlusPlus - 73)) | (1L << (Minus - 73)) | (1L << (MinusMinus - 73)) | (1L << (Star - 73)) | (1L << (And - 73)) | (1L << (AndAnd - 73)) | (1L << (Not - 73)) | (1L << (Tilde - 73)) | (1L << (Identifier - 73)) | (1L << (Constant - 73)) | (1L << (StringLiteral - 73)))) != 0)) {
						{
						setState(1166); logicalOrExpression(0);
						setState(1171);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Comma) {
							{
							{
							setState(1167); match(Comma);
							setState(1168); logicalOrExpression(0);
							}
							}
							setState(1173);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					}
					}
					setState(1180);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1181); match(RightParen);
				setState(1182); match(Semi);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabeledStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(SPOTParser.Identifier, 0); }
		public LabeledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterLabeledStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitLabeledStatement(this);
		}
	}

	public final LabeledStatementContext labeledStatement() throws RecognitionException {
		LabeledStatementContext _localctx = new LabeledStatementContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_labeledStatement);
		try {
			setState(1196);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1185); match(Identifier);
				setState(1186); match(Colon);
				setState(1187); statement();
				}
				break;
			case Case:
				enterOuterAlt(_localctx, 2);
				{
				setState(1188); match(Case);
				setState(1189); constantExpression();
				setState(1190); match(Colon);
				setState(1191); statement();
				}
				break;
			case Default:
				enterOuterAlt(_localctx, 3);
				{
				setState(1193); match(Default);
				setState(1194); match(Colon);
				setState(1195); statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompoundStatementContext extends ParserRuleContext {
		public BlockItemListContext blockItemList() {
			return getRuleContext(BlockItemListContext.class,0);
		}
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterCompoundStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitCompoundStatement(this);
		}
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_compoundStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1198); match(LeftBrace);
			setState(1200);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 4) | (1L << 7) | (1L << 8) | (1L << 9) | (1L << 10) | (1L << 11) | (1L << 12) | (1L << 14) | (1L << 16) | (1L << Break) | (1L << Case) | (1L << Const) | (1L << Continue) | (1L << Default) | (1L << Do) | (1L << Enum) | (1L << For) | (1L << Goto) | (1L << If) | (1L << Return) | (1L << Sizeof) | (1L << Switch) | (1L << While) | (1L << Alignof) | (1L << Generic) | (1L << StaticAssert) | (1L << LeftParen))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LeftBrace - 65)) | (1L << (Plus - 65)) | (1L << (PlusPlus - 65)) | (1L << (Minus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (AndAnd - 65)) | (1L << (Not - 65)) | (1L << (Tilde - 65)) | (1L << (Semi - 65)) | (1L << (Identifier - 65)) | (1L << (Constant - 65)) | (1L << (StringLiteral - 65)) | (1L << (LineDirective - 65)))) != 0)) {
				{
				setState(1199); blockItemList(0);
				}
			}

			setState(1202); match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockItemListContext extends ParserRuleContext {
		public int _p;
		public BlockItemContext blockItem() {
			return getRuleContext(BlockItemContext.class,0);
		}
		public BlockItemListContext blockItemList() {
			return getRuleContext(BlockItemListContext.class,0);
		}
		public BlockItemListContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public BlockItemListContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_blockItemList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterBlockItemList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitBlockItemList(this);
		}
	}

	public final BlockItemListContext blockItemList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BlockItemListContext _localctx = new BlockItemListContext(_ctx, _parentState, _p);
		BlockItemListContext _prevctx = _localctx;
		int _startState = 198;
		enterRecursionRule(_localctx, RULE_blockItemList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1205); blockItem();
			}
			_ctx.stop = _input.LT(-1);
			setState(1211);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BlockItemListContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_blockItemList);
					setState(1207);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(1208); blockItem();
					}
					} 
				}
				setState(1213);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BlockItemContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode LineDirective() { return getToken(SPOTParser.LineDirective, 0); }
		public BlockItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterBlockItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitBlockItem(this);
		}
	}

	public final BlockItemContext blockItem() throws RecognitionException {
		BlockItemContext _localctx = new BlockItemContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_blockItem);
		try {
			setState(1217);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1214); declaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1215); statement();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1216); match(LineDirective);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitExpressionStatement(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_expressionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1220);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 4) | (1L << 14) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (Plus - 73)) | (1L << (PlusPlus - 73)) | (1L << (Minus - 73)) | (1L << (MinusMinus - 73)) | (1L << (Star - 73)) | (1L << (And - 73)) | (1L << (AndAnd - 73)) | (1L << (Not - 73)) | (1L << (Tilde - 73)) | (1L << (Identifier - 73)) | (1L << (Constant - 73)) | (1L << (StringLiteral - 73)))) != 0)) {
				{
				setState(1219); expression(0);
				}
			}

			setState(1222); match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectionStatementContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public SelectionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterSelectionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitSelectionStatement(this);
		}
	}

	public final SelectionStatementContext selectionStatement() throws RecognitionException {
		SelectionStatementContext _localctx = new SelectionStatementContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_selectionStatement);
		try {
			setState(1239);
			switch (_input.LA(1)) {
			case If:
				enterOuterAlt(_localctx, 1);
				{
				setState(1224); match(If);
				setState(1225); match(LeftParen);
				setState(1226); expression(0);
				setState(1227); match(RightParen);
				setState(1228); statement();
				setState(1231);
				switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
				case 1:
					{
					setState(1229); match(Else);
					setState(1230); statement();
					}
					break;
				}
				}
				break;
			case Switch:
				enterOuterAlt(_localctx, 2);
				{
				setState(1233); match(Switch);
				setState(1234); match(LeftParen);
				setState(1235); expression(0);
				setState(1236); match(RightParen);
				setState(1237); statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IterationStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public IterationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterIterationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitIterationStatement(this);
		}
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_iterationStatement);
		int _la;
		try {
			setState(1283);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1241); match(While);
				setState(1242); match(LeftParen);
				setState(1243); expression(0);
				setState(1244); match(RightParen);
				setState(1245); statement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1247); match(Do);
				setState(1248); statement();
				setState(1249); match(While);
				setState(1250); match(LeftParen);
				setState(1251); expression(0);
				setState(1252); match(RightParen);
				setState(1253); match(Semi);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1255); match(For);
				setState(1256); match(LeftParen);
				setState(1258);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 4) | (1L << 14) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (Plus - 73)) | (1L << (PlusPlus - 73)) | (1L << (Minus - 73)) | (1L << (MinusMinus - 73)) | (1L << (Star - 73)) | (1L << (And - 73)) | (1L << (AndAnd - 73)) | (1L << (Not - 73)) | (1L << (Tilde - 73)) | (1L << (Identifier - 73)) | (1L << (Constant - 73)) | (1L << (StringLiteral - 73)))) != 0)) {
					{
					setState(1257); expression(0);
					}
				}

				setState(1260); match(Semi);
				setState(1262);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 4) | (1L << 14) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (Plus - 73)) | (1L << (PlusPlus - 73)) | (1L << (Minus - 73)) | (1L << (MinusMinus - 73)) | (1L << (Star - 73)) | (1L << (And - 73)) | (1L << (AndAnd - 73)) | (1L << (Not - 73)) | (1L << (Tilde - 73)) | (1L << (Identifier - 73)) | (1L << (Constant - 73)) | (1L << (StringLiteral - 73)))) != 0)) {
					{
					setState(1261); expression(0);
					}
				}

				setState(1264); match(Semi);
				setState(1266);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 4) | (1L << 14) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (Plus - 73)) | (1L << (PlusPlus - 73)) | (1L << (Minus - 73)) | (1L << (MinusMinus - 73)) | (1L << (Star - 73)) | (1L << (And - 73)) | (1L << (AndAnd - 73)) | (1L << (Not - 73)) | (1L << (Tilde - 73)) | (1L << (Identifier - 73)) | (1L << (Constant - 73)) | (1L << (StringLiteral - 73)))) != 0)) {
					{
					setState(1265); expression(0);
					}
				}

				setState(1268); match(RightParen);
				setState(1269); statement();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1270); match(For);
				setState(1271); match(LeftParen);
				setState(1272); declaration();
				setState(1274);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 4) | (1L << 14) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (Plus - 73)) | (1L << (PlusPlus - 73)) | (1L << (Minus - 73)) | (1L << (MinusMinus - 73)) | (1L << (Star - 73)) | (1L << (And - 73)) | (1L << (AndAnd - 73)) | (1L << (Not - 73)) | (1L << (Tilde - 73)) | (1L << (Identifier - 73)) | (1L << (Constant - 73)) | (1L << (StringLiteral - 73)))) != 0)) {
					{
					setState(1273); expression(0);
					}
				}

				setState(1276); match(Semi);
				setState(1278);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 4) | (1L << 14) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (Plus - 73)) | (1L << (PlusPlus - 73)) | (1L << (Minus - 73)) | (1L << (MinusMinus - 73)) | (1L << (Star - 73)) | (1L << (And - 73)) | (1L << (AndAnd - 73)) | (1L << (Not - 73)) | (1L << (Tilde - 73)) | (1L << (Identifier - 73)) | (1L << (Constant - 73)) | (1L << (StringLiteral - 73)))) != 0)) {
					{
					setState(1277); expression(0);
					}
				}

				setState(1280); match(RightParen);
				setState(1281); statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JumpStatementContext extends ParserRuleContext {
		public TerminalNode Continue() { return getToken(SPOTParser.Continue, 0); }
		public TerminalNode Identifier() { return getToken(SPOTParser.Identifier, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Break() { return getToken(SPOTParser.Break, 0); }
		public TerminalNode Return() { return getToken(SPOTParser.Return, 0); }
		public TerminalNode Goto() { return getToken(SPOTParser.Goto, 0); }
		public JumpStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterJumpStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitJumpStatement(this);
		}
	}

	public final JumpStatementContext jumpStatement() throws RecognitionException {
		JumpStatementContext _localctx = new JumpStatementContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_jumpStatement);
		int _la;
		try {
			setState(1297);
			switch (_input.LA(1)) {
			case Goto:
				enterOuterAlt(_localctx, 1);
				{
				setState(1285); match(Goto);
				setState(1286); match(Identifier);
				setState(1287); match(Semi);
				}
				break;
			case Continue:
				enterOuterAlt(_localctx, 2);
				{
				setState(1288); match(Continue);
				setState(1289); match(Semi);
				}
				break;
			case Break:
				enterOuterAlt(_localctx, 3);
				{
				setState(1290); match(Break);
				setState(1291); match(Semi);
				}
				break;
			case Return:
				enterOuterAlt(_localctx, 4);
				{
				setState(1292); match(Return);
				setState(1294);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 4) | (1L << 14) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (Plus - 73)) | (1L << (PlusPlus - 73)) | (1L << (Minus - 73)) | (1L << (MinusMinus - 73)) | (1L << (Star - 73)) | (1L << (And - 73)) | (1L << (AndAnd - 73)) | (1L << (Not - 73)) | (1L << (Tilde - 73)) | (1L << (Identifier - 73)) | (1L << (Constant - 73)) | (1L << (StringLiteral - 73)))) != 0)) {
					{
					setState(1293); expression(0);
					}
				}

				setState(1296); match(Semi);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SPOTParser.EOF, 0); }
		public TranslationUnitContext translationUnit() {
			return getRuleContext(TranslationUnitContext.class,0);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitCompilationUnit(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1300);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 8) | (1L << 9) | (1L << 10) | (1L << 11) | (1L << 16) | (1L << Const) | (1L << Enum) | (1L << StaticAssert) | (1L << LeftParen))) != 0) || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (Semi - 89)) | (1L << (Identifier - 89)) | (1L << (LineDirective - 89)))) != 0)) {
				{
				setState(1299); translationUnit(0);
				}
			}

			setState(1302); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TranslationUnitContext extends ParserRuleContext {
		public int _p;
		public ExternalDeclarationContext externalDeclaration() {
			return getRuleContext(ExternalDeclarationContext.class,0);
		}
		public TranslationUnitContext translationUnit() {
			return getRuleContext(TranslationUnitContext.class,0);
		}
		public TranslationUnitContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public TranslationUnitContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_translationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterTranslationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitTranslationUnit(this);
		}
	}

	public final TranslationUnitContext translationUnit(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TranslationUnitContext _localctx = new TranslationUnitContext(_ctx, _parentState, _p);
		TranslationUnitContext _prevctx = _localctx;
		int _startState = 212;
		enterRecursionRule(_localctx, RULE_translationUnit);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1305); externalDeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(1311);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TranslationUnitContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_translationUnit);
					setState(1307);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(1308); externalDeclaration();
					}
					} 
				}
				setState(1313);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExternalDeclarationContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode LineDirective() { return getToken(SPOTParser.LineDirective, 0); }
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public ExternalDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externalDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterExternalDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitExternalDeclaration(this);
		}
	}

	public final ExternalDeclarationContext externalDeclaration() throws RecognitionException {
		ExternalDeclarationContext _localctx = new ExternalDeclarationContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_externalDeclaration);
		try {
			setState(1318);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1314); functionDefinition();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1315); declaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1316); match(Semi);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1317); match(LineDirective);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public FunctionDeclaratorContext functionDeclarator() {
			return getRuleContext(FunctionDeclaratorContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitFunctionDefinition(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1321);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				{
				setState(1320); declarationSpecifiers();
				}
				break;
			}
			setState(1323); functionDeclarator();
			setState(1325);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 8) | (1L << 9) | (1L << 10) | (1L << 11) | (1L << 16) | (1L << Const) | (1L << Enum) | (1L << StaticAssert))) != 0) || _la==Identifier) {
				{
				setState(1324); declarationList(0);
				}
			}

			setState(1327); compoundStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDeclaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public FunctionDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterFunctionDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitFunctionDeclarator(this);
		}
	}

	public final FunctionDeclaratorContext functionDeclarator() throws RecognitionException {
		FunctionDeclaratorContext _localctx = new FunctionDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_functionDeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1329); declarator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationListContext extends ParserRuleContext {
		public int _p;
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public DeclarationListContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public DeclarationListContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_declarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitDeclarationList(this);
		}
	}

	public final DeclarationListContext declarationList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DeclarationListContext _localctx = new DeclarationListContext(_ctx, _parentState, _p);
		DeclarationListContext _prevctx = _localctx;
		int _startState = 220;
		enterRecursionRule(_localctx, RULE_declarationList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1332); declaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(1338);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DeclarationListContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_declarationList);
					setState(1334);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(1335); declaration();
					}
					} 
				}
				setState(1340);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2: return genericAssocList_sempred((GenericAssocListContext)_localctx, predIndex);

		case 6: return postfixExpression_sempred((PostfixExpressionContext)_localctx, predIndex);

		case 7: return argumentExpressionList_sempred((ArgumentExpressionListContext)_localctx, predIndex);

		case 16: return multiplicativeExpression_sempred((MultiplicativeExpressionContext)_localctx, predIndex);

		case 19: return additiveExpression_sempred((AdditiveExpressionContext)_localctx, predIndex);

		case 22: return shiftExpression_sempred((ShiftExpressionContext)_localctx, predIndex);

		case 27: return relationalExpression_sempred((RelationalExpressionContext)_localctx, predIndex);

		case 30: return equalityExpression_sempred((EqualityExpressionContext)_localctx, predIndex);

		case 32: return andExpression_sempred((AndExpressionContext)_localctx, predIndex);

		case 34: return exclusiveOrExpression_sempred((ExclusiveOrExpressionContext)_localctx, predIndex);

		case 36: return inclusiveOrExpression_sempred((InclusiveOrExpressionContext)_localctx, predIndex);

		case 38: return logicalAndExpression_sempred((LogicalAndExpressionContext)_localctx, predIndex);

		case 40: return logicalOrExpression_sempred((LogicalOrExpressionContext)_localctx, predIndex);

		case 46: return expression_sempred((ExpressionContext)_localctx, predIndex);

		case 52: return initDeclaratorList_sempred((InitDeclaratorListContext)_localctx, predIndex);

		case 60: return classDeclarationList_sempred((ClassDeclarationListContext)_localctx, predIndex);

		case 64: return enumeratorList_sempred((EnumeratorListContext)_localctx, predIndex);

		case 73: return directDeclarator_sempred((DirectDeclaratorContext)_localctx, predIndex);

		case 80: return typeQualifierList_sempred((TypeQualifierListContext)_localctx, predIndex);

		case 83: return parameterList_sempred((ParameterListContext)_localctx, predIndex);

		case 85: return identifierList_sempred((IdentifierListContext)_localctx, predIndex);

		case 88: return directAbstractDeclarator_sempred((DirectAbstractDeclaratorContext)_localctx, predIndex);

		case 91: return initializerList_sempred((InitializerListContext)_localctx, predIndex);

		case 93: return designatorList_sempred((DesignatorListContext)_localctx, predIndex);

		case 99: return blockItemList_sempred((BlockItemListContext)_localctx, predIndex);

		case 106: return translationUnit_sempred((TranslationUnitContext)_localctx, predIndex);

		case 110: return declarationList_sempred((DeclarationListContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 26: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean directDeclarator_sempred(DirectDeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 32: return 2 >= _localctx._p;

		case 33: return 1 >= _localctx._p;

		case 31: return 3 >= _localctx._p;

		case 30: return 4 >= _localctx._p;
		}
		return true;
	}
	private boolean identifierList_sempred(IdentifierListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 36: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean directAbstractDeclarator_sempred(DirectAbstractDeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 38: return 4 >= _localctx._p;

		case 39: return 3 >= _localctx._p;

		case 37: return 5 >= _localctx._p;

		case 40: return 2 >= _localctx._p;

		case 41: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean translationUnit_sempred(TranslationUnitContext _localctx, int predIndex) {
		switch (predIndex) {
		case 45: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean andExpression_sempred(AndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 21: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean typeQualifierList_sempred(TypeQualifierListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 34: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean relationalExpression_sempred(RelationalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17: return 2 >= _localctx._p;

		case 16: return 3 >= _localctx._p;

		case 18: return 1 >= _localctx._p;

		case 15: return 4 >= _localctx._p;
		}
		return true;
	}
	private boolean parameterList_sempred(ParameterListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 35: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean declarationList_sempred(DeclarationListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 46: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean shiftExpression_sempred(ShiftExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13: return 2 >= _localctx._p;

		case 14: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean blockItemList_sempred(BlockItemListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 44: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean enumeratorList_sempred(EnumeratorListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 29: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean classDeclarationList_sempred(ClassDeclarationListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 28: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean designatorList_sempred(DesignatorListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 43: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean logicalAndExpression_sempred(LogicalAndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 24: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean additiveExpression_sempred(AdditiveExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11: return 2 >= _localctx._p;

		case 12: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean argumentExpressionList_sempred(ArgumentExpressionListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean postfixExpression_sempred(PostfixExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return 10 >= _localctx._p;

		case 2: return 9 >= _localctx._p;

		case 3: return 8 >= _localctx._p;

		case 4: return 7 >= _localctx._p;

		case 5: return 6 >= _localctx._p;

		case 6: return 5 >= _localctx._p;
		}
		return true;
	}
	private boolean inclusiveOrExpression_sempred(InclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 23: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean exclusiveOrExpression_sempred(ExclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 22: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean genericAssocList_sempred(GenericAssocListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean logicalOrExpression_sempred(LogicalOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 25: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean equalityExpression_sempred(EqualityExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 19: return 2 >= _localctx._p;

		case 20: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean initializerList_sempred(InitializerListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 42: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean multiplicativeExpression_sempred(MultiplicativeExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8: return 3 >= _localctx._p;

		case 9: return 2 >= _localctx._p;

		case 10: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean initDeclaratorList_sempred(InitDeclaratorListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 27: return 1 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3t\u0540\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\3\2\5\2\u00e2\n\2\3\2\3\2\3\2\6\2\u00e7"+
		"\n\2\r\2\16\2\u00e8\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u00f1\n\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u0105"+
		"\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u0114\n\4"+
		"\f\4\16\4\u0117\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0120\n\5\3\6\3\6"+
		"\3\6\3\7\3\7\5\7\u0127\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u014d\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u015f\n\b\f\b\16\b\u0162\13"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u016b\n\t\f\t\16\t\u016e\13\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\5\n\u0186\n\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u019a\n\16\3\17\3\17"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\7\22\u01b1\n\22\f\22\16\22\u01b4\13\22\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\7\25\u01c5\n\25\f\25\16\25\u01c8\13\25\3\26\3\26\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u01d9\n\30\f\30\16"+
		"\30\u01dc\13\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\7\35\u01f9\n\35\f\35\16\35\u01fc\13\35\3\36\3\36\3\37\3\37"+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \7 \u020d\n \f \16 \u0210\13 \3!\3!\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u021b\n\"\f\"\16\"\u021e\13\"\3#\3#\3$"+
		"\3$\3$\3$\3$\3$\3$\7$\u0229\n$\f$\16$\u022c\13$\3%\3%\3&\3&\3&\3&\3&\3"+
		"&\3&\7&\u0237\n&\f&\16&\u023a\13&\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\7(\u0245"+
		"\n(\f(\16(\u0248\13(\3)\3)\3*\3*\3*\3*\3*\3*\3*\7*\u0253\n*\f*\16*\u0256"+
		"\13*\3+\3+\3,\3,\3-\3-\3-\3-\3-\3-\5-\u0262\n-\3.\3.\3.\3.\3.\5.\u0269"+
		"\n.\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\7\60\u0273\n\60\f\60\16\60\u0276"+
		"\13\60\3\61\3\61\3\62\3\62\5\62\u027c\n\62\3\62\3\62\3\62\5\62\u0281\n"+
		"\62\3\63\6\63\u0284\n\63\r\63\16\63\u0285\3\64\6\64\u0289\n\64\r\64\16"+
		"\64\u028a\3\65\3\65\3\65\3\65\5\65\u0291\n\65\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\7\66\u0299\n\66\f\66\16\66\u029c\13\66\3\67\3\67\38\38\38\38\38"+
		"\58\u02a5\n8\39\39\3:\3:\3:\3;\3;\3;\5;\u02af\n;\3<\3<\3<\5<\u02b4\n<"+
		"\3<\3<\5<\u02b8\n<\3<\3<\3=\3=\3=\3>\3>\3>\3>\3>\7>\u02c4\n>\f>\16>\u02c7"+
		"\13>\3?\5?\u02ca\n?\3?\3?\3?\3?\3?\5?\u02d1\n?\3@\3@\5@\u02d5\n@\3@\3"+
		"@\5@\u02d9\n@\5@\u02db\n@\3A\3A\5A\u02df\nA\3A\3A\3A\3A\3A\3A\5A\u02e7"+
		"\nA\3A\3A\3A\3A\3A\3A\3A\5A\u02f0\nA\3B\3B\3B\3B\3B\3B\7B\u02f8\nB\fB"+
		"\16B\u02fb\13B\3C\3C\3C\3C\3C\5C\u0302\nC\3D\5D\u0305\nD\3D\3D\3E\3E\3"+
		"E\3E\3E\3F\3F\3G\3G\3H\3H\3H\3H\3H\3H\5H\u0318\nH\3I\3I\3I\3I\3I\3I\3"+
		"I\3I\3I\3I\5I\u0324\nI\3J\3J\3K\3K\3K\3K\3K\3K\5K\u032e\nK\3K\3K\3K\5"+
		"K\u0333\nK\3K\5K\u0336\nK\3K\3K\3K\3K\5K\u033c\nK\3K\3K\3K\3K\3K\3K\3"+
		"K\3K\3K\3K\5K\u0348\nK\3K\3K\7K\u034c\nK\fK\16K\u034f\13K\3L\3L\3L\6L"+
		"\u0354\nL\rL\16L\u0355\3L\3L\5L\u035a\nL\3M\3M\3M\3M\3M\3M\3M\3N\3N\3"+
		"N\7N\u0366\nN\fN\16N\u0369\13N\3N\5N\u036c\nN\3O\3O\3O\5O\u0371\nO\3O"+
		"\5O\u0374\nO\3O\5O\u0377\nO\3P\3P\3P\3P\3P\7P\u037e\nP\fP\16P\u0381\13"+
		"P\3Q\3Q\5Q\u0385\nQ\3Q\3Q\5Q\u0389\nQ\3Q\3Q\3Q\5Q\u038e\nQ\3Q\3Q\5Q\u0392"+
		"\nQ\3Q\5Q\u0395\nQ\3R\3R\3R\3R\3R\7R\u039c\nR\fR\16R\u039f\13R\3S\3S\3"+
		"S\3S\3S\5S\u03a6\nS\3T\3T\3U\3U\3U\3U\3U\3U\3U\7U\u03b1\nU\fU\16U\u03b4"+
		"\13U\3V\3V\3V\3V\3V\5V\u03bb\nV\3V\5V\u03be\nV\3V\5V\u03c1\nV\3W\3W\3"+
		"W\3W\3W\3W\7W\u03c9\nW\fW\16W\u03cc\13W\3X\3X\5X\u03d0\nX\3Y\3Y\5Y\u03d4"+
		"\nY\3Y\3Y\7Y\u03d8\nY\fY\16Y\u03db\13Y\5Y\u03dd\nY\3Z\3Z\3Z\3Z\3Z\7Z\u03e4"+
		"\nZ\fZ\16Z\u03e7\13Z\3Z\3Z\5Z\u03eb\nZ\3Z\5Z\u03ee\nZ\3Z\3Z\3Z\3Z\5Z\u03f4"+
		"\nZ\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\5Z\u0404\nZ\3Z\3Z\7Z\u0408"+
		"\nZ\fZ\16Z\u040b\13Z\5Z\u040d\nZ\3Z\3Z\3Z\5Z\u0412\nZ\3Z\5Z\u0415\nZ\3"+
		"Z\3Z\3Z\3Z\3Z\5Z\u041c\nZ\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3"+
		"Z\3Z\3Z\5Z\u042f\nZ\3Z\3Z\7Z\u0433\nZ\fZ\16Z\u0436\13Z\7Z\u0438\nZ\fZ"+
		"\16Z\u043b\13Z\3[\3[\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\5\\\u0449"+
		"\n\\\3]\3]\5]\u044d\n]\3]\3]\3]\3]\3]\5]\u0454\n]\3]\7]\u0457\n]\f]\16"+
		"]\u045a\13]\3^\3^\3^\3_\3_\3_\3_\3_\7_\u0464\n_\f_\16_\u0467\13_\3`\3"+
		"`\3`\3`\3`\3`\5`\u046f\n`\3a\3a\3a\3a\3a\6a\u0476\na\ra\16a\u0477\3a\3"+
		"a\3a\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\7b\u0489\nb\fb\16b\u048c\13b"+
		"\5b\u048e\nb\3b\3b\3b\3b\7b\u0494\nb\fb\16b\u0497\13b\5b\u0499\nb\7b\u049b"+
		"\nb\fb\16b\u049e\13b\3b\3b\5b\u04a2\nb\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3"+
		"c\5c\u04af\nc\3d\3d\5d\u04b3\nd\3d\3d\3e\3e\3e\3e\3e\7e\u04bc\ne\fe\16"+
		"e\u04bf\13e\3f\3f\3f\5f\u04c4\nf\3g\5g\u04c7\ng\3g\3g\3h\3h\3h\3h\3h\3"+
		"h\3h\5h\u04d2\nh\3h\3h\3h\3h\3h\3h\5h\u04da\nh\3i\3i\3i\3i\3i\3i\3i\3"+
		"i\3i\3i\3i\3i\3i\3i\3i\3i\3i\5i\u04ed\ni\3i\3i\5i\u04f1\ni\3i\3i\5i\u04f5"+
		"\ni\3i\3i\3i\3i\3i\3i\5i\u04fd\ni\3i\3i\5i\u0501\ni\3i\3i\3i\5i\u0506"+
		"\ni\3j\3j\3j\3j\3j\3j\3j\3j\3j\5j\u0511\nj\3j\5j\u0514\nj\3k\5k\u0517"+
		"\nk\3k\3k\3l\3l\3l\3l\3l\7l\u0520\nl\fl\16l\u0523\13l\3m\3m\3m\3m\5m\u0529"+
		"\nm\3n\5n\u052c\nn\3n\3n\5n\u0530\nn\3n\3n\3o\3o\3p\3p\3p\3p\3p\7p\u053b"+
		"\np\fp\16p\u053e\13p\3p\2q\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$"+
		"&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c"+
		"\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4"+
		"\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc"+
		"\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\2\13\7\2KKMMOO"+
		"RRWX\3\2]g\4\2\3\3\n\n\4\2\f\r\22\22\6\2\5\5\17\17##<<\4\2?@\\\\\3\2?"+
		"@\4\2\t\t\16\16\4\2\21\21\63\63\u058e\2\u0104\3\2\2\2\4\u0106\3\2\2\2"+
		"\6\u010d\3\2\2\2\b\u011f\3\2\2\2\n\u0121\3\2\2\2\f\u0124\3\2\2\2\16\u014c"+
		"\3\2\2\2\20\u0163\3\2\2\2\22\u0185\3\2\2\2\24\u0187\3\2\2\2\26\u0189\3"+
		"\2\2\2\30\u018b\3\2\2\2\32\u0199\3\2\2\2\34\u019b\3\2\2\2\36\u019d\3\2"+
		"\2\2 \u019f\3\2\2\2\"\u01a1\3\2\2\2$\u01b5\3\2\2\2&\u01b7\3\2\2\2(\u01b9"+
		"\3\2\2\2*\u01c9\3\2\2\2,\u01cb\3\2\2\2.\u01cd\3\2\2\2\60\u01dd\3\2\2\2"+
		"\62\u01df\3\2\2\2\64\u01e1\3\2\2\2\66\u01e3\3\2\2\28\u01e5\3\2\2\2:\u01fd"+
		"\3\2\2\2<\u01ff\3\2\2\2>\u0201\3\2\2\2@\u0211\3\2\2\2B\u0213\3\2\2\2D"+
		"\u021f\3\2\2\2F\u0221\3\2\2\2H\u022d\3\2\2\2J\u022f\3\2\2\2L\u023b\3\2"+
		"\2\2N\u023d\3\2\2\2P\u0249\3\2\2\2R\u024b\3\2\2\2T\u0257\3\2\2\2V\u0259"+
		"\3\2\2\2X\u025b\3\2\2\2Z\u0268\3\2\2\2\\\u026a\3\2\2\2^\u026c\3\2\2\2"+
		"`\u0277\3\2\2\2b\u0280\3\2\2\2d\u0283\3\2\2\2f\u0288\3\2\2\2h\u0290\3"+
		"\2\2\2j\u0292\3\2\2\2l\u029d\3\2\2\2n\u02a4\3\2\2\2p\u02a6\3\2\2\2r\u02a8"+
		"\3\2\2\2t\u02ae\3\2\2\2v\u02b0\3\2\2\2x\u02bb\3\2\2\2z\u02be\3\2\2\2|"+
		"\u02d0\3\2\2\2~\u02da\3\2\2\2\u0080\u02ef\3\2\2\2\u0082\u02f1\3\2\2\2"+
		"\u0084\u0301\3\2\2\2\u0086\u0304\3\2\2\2\u0088\u0308\3\2\2\2\u008a\u030d"+
		"\3\2\2\2\u008c\u030f\3\2\2\2\u008e\u0317\3\2\2\2\u0090\u0323\3\2\2\2\u0092"+
		"\u0325\3\2\2\2\u0094\u032d\3\2\2\2\u0096\u0359\3\2\2\2\u0098\u035b\3\2"+
		"\2\2\u009a\u036b\3\2\2\2\u009c\u0376\3\2\2\2\u009e\u037f\3\2\2\2\u00a0"+
		"\u0394\3\2\2\2\u00a2\u0396\3\2\2\2\u00a4\u03a5\3\2\2\2\u00a6\u03a7\3\2"+
		"\2\2\u00a8\u03a9\3\2\2\2\u00aa\u03c0\3\2\2\2\u00ac\u03c2\3\2\2\2\u00ae"+
		"\u03cd\3\2\2\2\u00b0\u03dc\3\2\2\2\u00b2\u040c\3\2\2\2\u00b4\u043c\3\2"+
		"\2\2\u00b6\u0448\3\2\2\2\u00b8\u044a\3\2\2\2\u00ba\u045b\3\2\2\2\u00bc"+
		"\u045e\3\2\2\2\u00be\u046e\3\2\2\2\u00c0\u0470\3\2\2\2\u00c2\u04a1\3\2"+
		"\2\2\u00c4\u04ae\3\2\2\2\u00c6\u04b0\3\2\2\2\u00c8\u04b6\3\2\2\2\u00ca"+
		"\u04c3\3\2\2\2\u00cc\u04c6\3\2\2\2\u00ce\u04d9\3\2\2\2\u00d0\u0505\3\2"+
		"\2\2\u00d2\u0513\3\2\2\2\u00d4\u0516\3\2\2\2\u00d6\u051a\3\2\2\2\u00d8"+
		"\u0528\3\2\2\2\u00da\u052b\3\2\2\2\u00dc\u0533\3\2\2\2\u00de\u0535\3\2"+
		"\2\2\u00e0\u00e2\5r:\2\u00e1\u00e0\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3"+
		"\3\2\2\2\u00e3\u0105\7m\2\2\u00e4\u0105\7n\2\2\u00e5\u00e7\7o\2\2\u00e6"+
		"\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2"+
		"\2\2\u00e9\u0105\3\2\2\2\u00ea\u00eb\7?\2\2\u00eb\u00ec\5^\60\2\u00ec"+
		"\u00ed\7@\2\2\u00ed\u0105\3\2\2\2\u00ee\u0105\5\4\3\2\u00ef\u00f1\7\4"+
		"\2\2\u00f0\u00ef\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2"+
		"\u00f3\7?\2\2\u00f3\u00f4\5\u00c6d\2\u00f4\u00f5\7@\2\2\u00f5\u0105\3"+
		"\2\2\2\u00f6\u00f7\7\20\2\2\u00f7\u00f8\7?\2\2\u00f8\u00f9\5\22\n\2\u00f9"+
		"\u00fa\7\\\2\2\u00fa\u00fb\5\u00aeX\2\u00fb\u00fc\7@\2\2\u00fc\u0105\3"+
		"\2\2\2\u00fd\u00fe\7\6\2\2\u00fe\u00ff\7?\2\2\u00ff\u0100\5\u00aeX\2\u0100"+
		"\u0101\7\\\2\2\u0101\u0102\5\22\n\2\u0102\u0103\7@\2\2\u0103\u0105\3\2"+
		"\2\2\u0104\u00e1\3\2\2\2\u0104\u00e4\3\2\2\2\u0104\u00e6\3\2\2\2\u0104"+
		"\u00ea\3\2\2\2\u0104\u00ee\3\2\2\2\u0104\u00f0\3\2\2\2\u0104\u00f6\3\2"+
		"\2\2\u0104\u00fd\3\2\2\2\u0105\3\3\2\2\2\u0106\u0107\7:\2\2\u0107\u0108"+
		"\7?\2\2\u0108\u0109\5Z.\2\u0109\u010a\7\\\2\2\u010a\u010b\5\6\4\2\u010b"+
		"\u010c\7@\2\2\u010c\5\3\2\2\2\u010d\u010e\b\4\1\2\u010e\u010f\5\b\5\2"+
		"\u010f\u0115\3\2\2\2\u0110\u0111\6\4\2\3\u0111\u0112\7\\\2\2\u0112\u0114"+
		"\5\b\5\2\u0113\u0110\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0115"+
		"\u0116\3\2\2\2\u0116\7\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u0119\5\u00ae"+
		"X\2\u0119\u011a\7Z\2\2\u011a\u011b\5Z.\2\u011b\u0120\3\2\2\2\u011c\u011d"+
		"\7\31\2\2\u011d\u011e\7Z\2\2\u011e\u0120\5Z.\2\u011f\u0118\3\2\2\2\u011f"+
		"\u011c\3\2\2\2\u0120\t\3\2\2\2\u0121\u0122\7k\2\2\u0122\u0123\7m\2\2\u0123"+
		"\13\3\2\2\2\u0124\u0126\7?\2\2\u0125\u0127\5\20\t\2\u0126\u0125\3\2\2"+
		"\2\u0126\u0127\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\5\30\r\2\u0129"+
		"\r\3\2\2\2\u012a\u012b\b\b\1\2\u012b\u014d\5\2\2\2\u012c\u012d\7?\2\2"+
		"\u012d\u012e\5\u00aeX\2\u012e\u012f\7@\2\2\u012f\u0130\7C\2\2\u0130\u0131"+
		"\5\u00b8]\2\u0131\u0132\7D\2\2\u0132\u014d\3\2\2\2\u0133\u0134\7?\2\2"+
		"\u0134\u0135\5\u00aeX\2\u0135\u0136\7@\2\2\u0136\u0137\7C\2\2\u0137\u0138"+
		"\5\u00b8]\2\u0138\u0139\7\\\2\2\u0139\u013a\7D\2\2\u013a\u014d\3\2\2\2"+
		"\u013b\u013c\7\4\2\2\u013c\u013d\7?\2\2\u013d\u013e\5\u00aeX\2\u013e\u013f"+
		"\7@\2\2\u013f\u0140\7C\2\2\u0140\u0141\5\u00b8]\2\u0141\u0142\7D\2\2\u0142"+
		"\u014d\3\2\2\2\u0143\u0144\7\4\2\2\u0144\u0145\7?\2\2\u0145\u0146\5\u00ae"+
		"X\2\u0146\u0147\7@\2\2\u0147\u0148\7C\2\2\u0148\u0149\5\u00b8]\2\u0149"+
		"\u014a\7\\\2\2\u014a\u014b\7D\2\2\u014b\u014d\3\2\2\2\u014c\u012a\3\2"+
		"\2\2\u014c\u012c\3\2\2\2\u014c\u0133\3\2\2\2\u014c\u013b\3\2\2\2\u014c"+
		"\u0143\3\2\2\2\u014d\u0160\3\2\2\2\u014e\u014f\6\b\3\3\u014f\u0150\7A"+
		"\2\2\u0150\u0151\5^\60\2\u0151\u0152\7B\2\2\u0152\u015f\3\2\2\2\u0153"+
		"\u0154\6\b\4\3\u0154\u015f\5\f\7\2\u0155\u0156\6\b\5\3\u0156\u015f\5\n"+
		"\6\2\u0157\u0158\6\b\6\3\u0158\u0159\7j\2\2\u0159\u015f\7m\2\2\u015a\u015b"+
		"\6\b\7\3\u015b\u015f\7L\2\2\u015c\u015d\6\b\b\3\u015d\u015f\7N\2\2\u015e"+
		"\u014e\3\2\2\2\u015e\u0153\3\2\2\2\u015e\u0155\3\2\2\2\u015e\u0157\3\2"+
		"\2\2\u015e\u015a\3\2\2\2\u015e\u015c\3\2\2\2\u015f\u0162\3\2\2\2\u0160"+
		"\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161\17\3\2\2\2\u0162\u0160\3\2\2"+
		"\2\u0163\u0164\b\t\1\2\u0164\u0165\5Z.\2\u0165\u016c\3\2\2\2\u0166\u0167"+
		"\6\t\t\3\u0167\u0168\5\u00a6T\2\u0168\u0169\5Z.\2\u0169\u016b\3\2\2\2"+
		"\u016a\u0166\3\2\2\2\u016b\u016e\3\2\2\2\u016c\u016a\3\2\2\2\u016c\u016d"+
		"\3\2\2\2\u016d\21\3\2\2\2\u016e\u016c\3\2\2\2\u016f\u0186\5\16\b\2\u0170"+
		"\u0171\7L\2\2\u0171\u0186\5\22\n\2\u0172\u0173\7N\2\2\u0173\u0186\5\22"+
		"\n\2\u0174\u0175\5\24\13\2\u0175\u0176\5\32\16\2\u0176\u0186\3\2\2\2\u0177"+
		"\u0178\7+\2\2\u0178\u0186\5\22\n\2\u0179\u017a\7+\2\2\u017a\u017b\7?\2"+
		"\2\u017b\u017c\5\u00aeX\2\u017c\u017d\7@\2\2\u017d\u0186\3\2\2\2\u017e"+
		"\u017f\7\66\2\2\u017f\u0180\7?\2\2\u0180\u0181\5\u00aeX\2\u0181\u0182"+
		"\7@\2\2\u0182\u0186\3\2\2\2\u0183\u0184\7T\2\2\u0184\u0186\7m\2\2\u0185"+
		"\u016f\3\2\2\2\u0185\u0170\3\2\2\2\u0185\u0172\3\2\2\2\u0185\u0174\3\2"+
		"\2\2\u0185\u0177\3\2\2\2\u0185\u0179\3\2\2\2\u0185\u017e\3\2\2\2\u0185"+
		"\u0183\3\2\2\2\u0186\23\3\2\2\2\u0187\u0188\t\2\2\2\u0188\25\3\2\2\2\u0189"+
		"\u018a\7?\2\2\u018a\27\3\2\2\2\u018b\u018c\7@\2\2\u018c\31\3\2\2\2\u018d"+
		"\u019a\5\22\n\2\u018e\u018f\5\26\f\2\u018f\u0190\5\u00aeX\2\u0190\u0191"+
		"\5\30\r\2\u0191\u0192\5\32\16\2\u0192\u019a\3\2\2\2\u0193\u0194\7\4\2"+
		"\2\u0194\u0195\5\26\f\2\u0195\u0196\5\u00aeX\2\u0196\u0197\5\30\r\2\u0197"+
		"\u0198\5\32\16\2\u0198\u019a\3\2\2\2\u0199\u018d\3\2\2\2\u0199\u018e\3"+
		"\2\2\2\u0199\u0193\3\2\2\2\u019a\33\3\2\2\2\u019b\u019c\7O\2\2\u019c\35"+
		"\3\2\2\2\u019d\u019e\7P\2\2\u019e\37\3\2\2\2\u019f\u01a0\7Q\2\2\u01a0"+
		"!\3\2\2\2\u01a1\u01a2\b\22\1\2\u01a2\u01a3\5\32\16\2\u01a3\u01b2\3\2\2"+
		"\2\u01a4\u01a5\6\22\n\3\u01a5\u01a6\5\34\17\2\u01a6\u01a7\5\32\16\2\u01a7"+
		"\u01b1\3\2\2\2\u01a8\u01a9\6\22\13\3\u01a9\u01aa\5\36\20\2\u01aa\u01ab"+
		"\5\32\16\2\u01ab\u01b1\3\2\2\2\u01ac\u01ad\6\22\f\3\u01ad\u01ae\5 \21"+
		"\2\u01ae\u01af\5\32\16\2\u01af\u01b1\3\2\2\2\u01b0\u01a4\3\2\2\2\u01b0"+
		"\u01a8\3\2\2\2\u01b0\u01ac\3\2\2\2\u01b1\u01b4\3\2\2\2\u01b2\u01b0\3\2"+
		"\2\2\u01b2\u01b3\3\2\2\2\u01b3#\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b5\u01b6"+
		"\7K\2\2\u01b6%\3\2\2\2\u01b7\u01b8\7M\2\2\u01b8\'\3\2\2\2\u01b9\u01ba"+
		"\b\25\1\2\u01ba\u01bb\5\"\22\2\u01bb\u01c6\3\2\2\2\u01bc\u01bd\6\25\r"+
		"\3\u01bd\u01be\5$\23\2\u01be\u01bf\5\"\22\2\u01bf\u01c5\3\2\2\2\u01c0"+
		"\u01c1\6\25\16\3\u01c1\u01c2\5&\24\2\u01c2\u01c3\5\"\22\2\u01c3\u01c5"+
		"\3\2\2\2\u01c4\u01bc\3\2\2\2\u01c4\u01c0\3\2\2\2\u01c5\u01c8\3\2\2\2\u01c6"+
		"\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7)\3\2\2\2\u01c8\u01c6\3\2\2\2"+
		"\u01c9\u01ca\7I\2\2\u01ca+\3\2\2\2\u01cb\u01cc\7J\2\2\u01cc-\3\2\2\2\u01cd"+
		"\u01ce\b\30\1\2\u01ce\u01cf\5(\25\2\u01cf\u01da\3\2\2\2\u01d0\u01d1\6"+
		"\30\17\3\u01d1\u01d2\5*\26\2\u01d2\u01d3\5(\25\2\u01d3\u01d9\3\2\2\2\u01d4"+
		"\u01d5\6\30\20\3\u01d5\u01d6\5,\27\2\u01d6\u01d7\5(\25\2\u01d7\u01d9\3"+
		"\2\2\2\u01d8\u01d0\3\2\2\2\u01d8\u01d4\3\2\2\2\u01d9\u01dc\3\2\2\2\u01da"+
		"\u01d8\3\2\2\2\u01da\u01db\3\2\2\2\u01db/\3\2\2\2\u01dc\u01da\3\2\2\2"+
		"\u01dd\u01de\7E\2\2\u01de\61\3\2\2\2\u01df\u01e0\7G\2\2\u01e0\63\3\2\2"+
		"\2\u01e1\u01e2\7F\2\2\u01e2\65\3\2\2\2\u01e3\u01e4\7H\2\2\u01e4\67\3\2"+
		"\2\2\u01e5\u01e6\b\35\1\2\u01e6\u01e7\5.\30\2\u01e7\u01fa\3\2\2\2\u01e8"+
		"\u01e9\6\35\21\3\u01e9\u01ea\5\60\31\2\u01ea\u01eb\5.\30\2\u01eb\u01f9"+
		"\3\2\2\2\u01ec\u01ed\6\35\22\3\u01ed\u01ee\5\62\32\2\u01ee\u01ef\5.\30"+
		"\2\u01ef\u01f9\3\2\2\2\u01f0\u01f1\6\35\23\3\u01f1\u01f2\5\64\33\2\u01f2"+
		"\u01f3\5.\30\2\u01f3\u01f9\3\2\2\2\u01f4\u01f5\6\35\24\3\u01f5\u01f6\5"+
		"\66\34\2\u01f6\u01f7\5.\30\2\u01f7\u01f9\3\2\2\2\u01f8\u01e8\3\2\2\2\u01f8"+
		"\u01ec\3\2\2\2\u01f8\u01f0\3\2\2\2\u01f8\u01f4\3\2\2\2\u01f9\u01fc\3\2"+
		"\2\2\u01fa\u01f8\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb9\3\2\2\2\u01fc\u01fa"+
		"\3\2\2\2\u01fd\u01fe\7h\2\2\u01fe;\3\2\2\2\u01ff\u0200\7i\2\2\u0200=\3"+
		"\2\2\2\u0201\u0202\b \1\2\u0202\u0203\58\35\2\u0203\u020e\3\2\2\2\u0204"+
		"\u0205\6 \25\3\u0205\u0206\5:\36\2\u0206\u0207\58\35\2\u0207\u020d\3\2"+
		"\2\2\u0208\u0209\6 \26\3\u0209\u020a\5<\37\2\u020a\u020b\58\35\2\u020b"+
		"\u020d\3\2\2\2\u020c\u0204\3\2\2\2\u020c\u0208\3\2\2\2\u020d\u0210\3\2"+
		"\2\2\u020e\u020c\3\2\2\2\u020e\u020f\3\2\2\2\u020f?\3\2\2\2\u0210\u020e"+
		"\3\2\2\2\u0211\u0212\7R\2\2\u0212A\3\2\2\2\u0213\u0214\b\"\1\2\u0214\u0215"+
		"\5> \2\u0215\u021c\3\2\2\2\u0216\u0217\6\"\27\3\u0217\u0218\5@!\2\u0218"+
		"\u0219\5> \2\u0219\u021b\3\2\2\2\u021a\u0216\3\2\2\2\u021b\u021e\3\2\2"+
		"\2\u021c\u021a\3\2\2\2\u021c\u021d\3\2\2\2\u021dC\3\2\2\2\u021e\u021c"+
		"\3\2\2\2\u021f\u0220\7V\2\2\u0220E\3\2\2\2\u0221\u0222\b$\1\2\u0222\u0223"+
		"\5B\"\2\u0223\u022a\3\2\2\2\u0224\u0225\6$\30\3\u0225\u0226\5D#\2\u0226"+
		"\u0227\5B\"\2\u0227\u0229\3\2\2\2\u0228\u0224\3\2\2\2\u0229\u022c\3\2"+
		"\2\2\u022a\u0228\3\2\2\2\u022a\u022b\3\2\2\2\u022bG\3\2\2\2\u022c\u022a"+
		"\3\2\2\2\u022d\u022e\7S\2\2\u022eI\3\2\2\2\u022f\u0230\b&\1\2\u0230\u0231"+
		"\5F$\2\u0231\u0238\3\2\2\2\u0232\u0233\6&\31\3\u0233\u0234\5H%\2\u0234"+
		"\u0235\5F$\2\u0235\u0237\3\2\2\2\u0236\u0232\3\2\2\2\u0237\u023a\3\2\2"+
		"\2\u0238\u0236\3\2\2\2\u0238\u0239\3\2\2\2\u0239K\3\2\2\2\u023a\u0238"+
		"\3\2\2\2\u023b\u023c\7T\2\2\u023cM\3\2\2\2\u023d\u023e\b(\1\2\u023e\u023f"+
		"\5J&\2\u023f\u0246\3\2\2\2\u0240\u0241\6(\32\3\u0241\u0242\5L\'\2\u0242"+
		"\u0243\5J&\2\u0243\u0245\3\2\2\2\u0244\u0240\3\2\2\2\u0245\u0248\3\2\2"+
		"\2\u0246\u0244\3\2\2\2\u0246\u0247\3\2\2\2\u0247O\3\2\2\2\u0248\u0246"+
		"\3\2\2\2\u0249\u024a\7U\2\2\u024aQ\3\2\2\2\u024b\u024c\b*\1\2\u024c\u024d"+
		"\5N(\2\u024d\u0254\3\2\2\2\u024e\u024f\6*\33\3\u024f\u0250\5P)\2\u0250"+
		"\u0251\5N(\2\u0251\u0253\3\2\2\2\u0252\u024e\3\2\2\2\u0253\u0256\3\2\2"+
		"\2\u0254\u0252\3\2\2\2\u0254\u0255\3\2\2\2\u0255S\3\2\2\2\u0256\u0254"+
		"\3\2\2\2\u0257\u0258\7Y\2\2\u0258U\3\2\2\2\u0259\u025a\7Z\2\2\u025aW\3"+
		"\2\2\2\u025b\u0261\5R*\2\u025c\u025d\5T+\2\u025d\u025e\5^\60\2\u025e\u025f"+
		"\5V,\2\u025f\u0260\5X-\2\u0260\u0262\3\2\2\2\u0261\u025c\3\2\2\2\u0261"+
		"\u0262\3\2\2\2\u0262Y\3\2\2\2\u0263\u0269\5X-\2\u0264\u0265\5\22\n\2\u0265"+
		"\u0266\5\\/\2\u0266\u0267\5Z.\2\u0267\u0269\3\2\2\2\u0268\u0263\3\2\2"+
		"\2\u0268\u0264\3\2\2\2\u0269[\3\2\2\2\u026a\u026b\t\3\2\2\u026b]\3\2\2"+
		"\2\u026c\u026d\b\60\1\2\u026d\u026e\5Z.\2\u026e\u0274\3\2\2\2\u026f\u0270"+
		"\6\60\34\3\u0270\u0271\7\\\2\2\u0271\u0273\5Z.\2\u0272\u026f\3\2\2\2\u0273"+
		"\u0276\3\2\2\2\u0274\u0272\3\2\2\2\u0274\u0275\3\2\2\2\u0275_\3\2\2\2"+
		"\u0276\u0274\3\2\2\2\u0277\u0278\5X-\2\u0278a\3\2\2\2\u0279\u027b\5d\63"+
		"\2\u027a\u027c\5j\66\2\u027b\u027a\3\2\2\2\u027b\u027c\3\2\2\2\u027c\u027d"+
		"\3\2\2\2\u027d\u027e\7[\2\2\u027e\u0281\3\2\2\2\u027f\u0281\5\u00c0a\2"+
		"\u0280\u0279\3\2\2\2\u0280\u027f\3\2\2\2\u0281c\3\2\2\2\u0282\u0284\5"+
		"h\65\2\u0283\u0282\3\2\2\2\u0284\u0285\3\2\2\2\u0285\u0283\3\2\2\2\u0285"+
		"\u0286\3\2\2\2\u0286e\3\2\2\2\u0287\u0289\5h\65\2\u0288\u0287\3\2\2\2"+
		"\u0289\u028a\3\2\2\2\u028a\u0288\3\2\2\2\u028a\u028b\3\2\2\2\u028bg\3"+
		"\2\2\2\u028c\u0291\5p9\2\u028d\u0291\5t;\2\u028e\u0291\5\u008aF\2\u028f"+
		"\u0291\5\u008cG\2\u0290\u028c\3\2\2\2\u0290\u028d\3\2\2\2\u0290\u028e"+
		"\3\2\2\2\u0290\u028f\3\2\2\2\u0291i\3\2\2\2\u0292\u0293\b\66\1\2\u0293"+
		"\u0294\5n8\2\u0294\u029a\3\2\2\2\u0295\u0296\6\66\35\3\u0296\u0297\7\\"+
		"\2\2\u0297\u0299\5n8\2\u0298\u0295\3\2\2\2\u0299\u029c\3\2\2\2\u029a\u0298"+
		"\3\2\2\2\u029a\u029b\3\2\2\2\u029bk\3\2\2\2\u029c\u029a\3\2\2\2\u029d"+
		"\u029e\7]\2\2\u029em\3\2\2\2\u029f\u02a5\5\u0092J\2\u02a0\u02a1\5\u0092"+
		"J\2\u02a1\u02a2\5l\67\2\u02a2\u02a3\5\u00b6\\\2\u02a3\u02a5\3\2\2\2\u02a4"+
		"\u029f\3\2\2\2\u02a4\u02a0\3\2\2\2\u02a5o\3\2\2\2\u02a6\u02a7\t\4\2\2"+
		"\u02a7q\3\2\2\2\u02a8\u02a9\7m\2\2\u02a9\u02aa\7Z\2\2\u02aas\3\2\2\2\u02ab"+
		"\u02af\5r:\2\u02ac\u02af\5\u0080A\2\u02ad\u02af\5v<\2\u02ae\u02ab\3\2"+
		"\2\2\u02ae\u02ac\3\2\2\2\u02ae\u02ad\3\2\2\2\u02afu\3\2\2\2\u02b0\u02b1"+
		"\7\13\2\2\u02b1\u02b3\7m\2\2\u02b2\u02b4\5x=\2\u02b3\u02b2\3\2\2\2\u02b3"+
		"\u02b4\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5\u02b7\7C\2\2\u02b6\u02b8\5z>"+
		"\2\u02b7\u02b6\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8\u02b9\3\2\2\2\u02b9\u02ba"+
		"\7D\2\2\u02baw\3\2\2\2\u02bb\u02bc\7Z\2\2\u02bc\u02bd\5\u00acW\2\u02bd"+
		"y\3\2\2\2\u02be\u02bf\b>\1\2\u02bf\u02c0\5|?\2\u02c0\u02c5\3\2\2\2\u02c1"+
		"\u02c2\6>\36\3\u02c2\u02c4\5|?\2\u02c3\u02c1\3\2\2\2\u02c4\u02c7\3\2\2"+
		"\2\u02c5\u02c3\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6{\3\2\2\2\u02c7\u02c5"+
		"\3\2\2\2\u02c8\u02ca\5r:\2\u02c9\u02c8\3\2\2\2\u02c9\u02ca\3\2\2\2\u02ca"+
		"\u02cb\3\2\2\2\u02cb\u02cc\5\u00acW\2\u02cc\u02cd\7[\2\2\u02cd\u02d1\3"+
		"\2\2\2\u02ce\u02d1\5\u00dan\2\u02cf\u02d1\7p\2\2\u02d0\u02c9\3\2\2\2\u02d0"+
		"\u02ce\3\2\2\2\u02d0\u02cf\3\2\2\2\u02d1}\3\2\2\2\u02d2\u02d4\5t;\2\u02d3"+
		"\u02d5\5~@\2\u02d4\u02d3\3\2\2\2\u02d4\u02d5\3\2\2\2\u02d5\u02db\3\2\2"+
		"\2\u02d6\u02d8\5\u008aF\2\u02d7\u02d9\5~@\2\u02d8\u02d7\3\2\2\2\u02d8"+
		"\u02d9\3\2\2\2\u02d9\u02db\3\2\2\2\u02da\u02d2\3\2\2\2\u02da\u02d6\3\2"+
		"\2\2\u02db\177\3\2\2\2\u02dc\u02de\7\35\2\2\u02dd\u02df\7m\2\2\u02de\u02dd"+
		"\3\2\2\2\u02de\u02df\3\2\2\2\u02df\u02e0\3\2\2\2\u02e0\u02e1\7C\2\2\u02e1"+
		"\u02e2\5\u0082B\2\u02e2\u02e3\7D\2\2\u02e3\u02f0\3\2\2\2\u02e4\u02e6\7"+
		"\35\2\2\u02e5\u02e7\7m\2\2\u02e6\u02e5\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7"+
		"\u02e8\3\2\2\2\u02e8\u02e9\7C\2\2\u02e9\u02ea\5\u0082B\2\u02ea\u02eb\7"+
		"\\\2\2\u02eb\u02ec\7D\2\2\u02ec\u02f0\3\2\2\2\u02ed\u02ee\7\35\2\2\u02ee"+
		"\u02f0\7m\2\2\u02ef\u02dc\3\2\2\2\u02ef\u02e4\3\2\2\2\u02ef\u02ed\3\2"+
		"\2\2\u02f0\u0081\3\2\2\2\u02f1\u02f2\bB\1\2\u02f2\u02f3\5\u0084C\2\u02f3"+
		"\u02f9\3\2\2\2\u02f4\u02f5\6B\37\3\u02f5\u02f6\7\\\2\2\u02f6\u02f8\5\u0084"+
		"C\2\u02f7\u02f4\3\2\2\2\u02f8\u02fb\3\2\2\2\u02f9\u02f7\3\2\2\2\u02f9"+
		"\u02fa\3\2\2\2\u02fa\u0083\3\2\2\2\u02fb\u02f9\3\2\2\2\u02fc\u0302\5\u0086"+
		"D\2\u02fd\u02fe\5\u0086D\2\u02fe\u02ff\7]\2\2\u02ff\u0300\5`\61\2\u0300"+
		"\u0302\3\2\2\2\u0301\u02fc\3\2\2\2\u0301\u02fd\3\2\2\2\u0302\u0085\3\2"+
		"\2\2\u0303\u0305\5r:\2\u0304\u0303\3\2\2\2\u0304\u0305\3\2\2\2\u0305\u0306"+
		"\3\2\2\2\u0306\u0307\7m\2\2\u0307\u0087\3\2\2\2\u0308\u0309\7\67\2\2\u0309"+
		"\u030a\7?\2\2\u030a\u030b\5\u00aeX\2\u030b\u030c\7@\2\2\u030c\u0089\3"+
		"\2\2\2\u030d\u030e\7\27\2\2\u030e\u008b\3\2\2\2\u030f\u0310\t\5\2\2\u0310"+
		"\u008d\3\2\2\2\u0311\u0318\t\6\2\2\u0312\u0318\5\u0098M\2\u0313\u0314"+
		"\7\b\2\2\u0314\u0315\7?\2\2\u0315\u0316\7m\2\2\u0316\u0318\7@\2\2\u0317"+
		"\u0311\3\2\2\2\u0317\u0312\3\2\2\2\u0317\u0313\3\2\2\2\u0318\u008f\3\2"+
		"\2\2\u0319\u031a\7\65\2\2\u031a\u031b\7?\2\2\u031b\u031c\5\u00aeX\2\u031c"+
		"\u031d\7@\2\2\u031d\u0324\3\2\2\2\u031e\u031f\7\65\2\2\u031f\u0320\7?"+
		"\2\2\u0320\u0321\5`\61\2\u0321\u0322\7@\2\2\u0322\u0324\3\2\2\2\u0323"+
		"\u0319\3\2\2\2\u0323\u031e\3\2\2\2\u0324\u0091\3\2\2\2\u0325\u0326\5\u0094"+
		"K\2\u0326\u0093\3\2\2\2\u0327\u0328\bK\1\2\u0328\u032e\7m\2\2\u0329\u032a"+
		"\5\26\f\2\u032a\u032b\5\u0092J\2\u032b\u032c\5\30\r\2\u032c\u032e\3\2"+
		"\2\2\u032d\u0327\3\2\2\2\u032d\u0329\3\2\2\2\u032e\u034d\3\2\2\2\u032f"+
		"\u0330\6K \3\u0330\u0332\7A\2\2\u0331\u0333\5\u00a2R\2\u0332\u0331\3\2"+
		"\2\2\u0332\u0333\3\2\2\2\u0333\u0335\3\2\2\2\u0334\u0336\5Z.\2\u0335\u0334"+
		"\3\2\2\2\u0335\u0336\3\2\2\2\u0336\u0337\3\2\2\2\u0337\u034c\7B\2\2\u0338"+
		"\u0339\6K!\3\u0339\u033b\7A\2\2\u033a\u033c\5\u00a2R\2\u033b\u033a\3\2"+
		"\2\2\u033b\u033c\3\2\2\2\u033c\u033d\3\2\2\2\u033d\u033e\7O\2\2\u033e"+
		"\u034c\7B\2\2\u033f\u0340\6K\"\3\u0340\u0341\5\26\f\2\u0341\u0342\5\u00a4"+
		"S\2\u0342\u0343\5\30\r\2\u0343\u034c\3\2\2\2\u0344\u0345\6K#\3\u0345\u0347"+
		"\5\26\f\2\u0346\u0348\5\u00acW\2\u0347\u0346\3\2\2\2\u0347\u0348\3\2\2"+
		"\2\u0348\u0349\3\2\2\2\u0349\u034a\5\30\r\2\u034a\u034c\3\2\2\2\u034b"+
		"\u032f\3\2\2\2\u034b\u0338\3\2\2\2\u034b\u033f\3\2\2\2\u034b\u0344\3\2"+
		"\2\2\u034c\u034f\3\2\2\2\u034d\u034b\3\2\2\2\u034d\u034e\3\2\2\2\u034e"+
		"\u0095\3\2\2\2\u034f\u034d\3\2\2\2\u0350\u0351\7\16\2\2\u0351\u0353\7"+
		"?\2\2\u0352\u0354\7o\2\2\u0353\u0352\3\2\2\2\u0354\u0355\3\2\2\2\u0355"+
		"\u0353\3\2\2\2\u0355\u0356\3\2\2\2\u0356\u0357\3\2\2\2\u0357\u035a\7@"+
		"\2\2\u0358\u035a\5\u0098M\2\u0359\u0350\3\2\2\2\u0359\u0358\3\2\2\2\u035a"+
		"\u0097\3\2\2\2\u035b\u035c\7\7\2\2\u035c\u035d\7?\2\2\u035d\u035e\7?\2"+
		"\2\u035e\u035f\5\u009aN\2\u035f\u0360\7@\2\2\u0360\u0361\7@\2\2\u0361"+
		"\u0099\3\2\2\2\u0362\u0367\5\u009cO\2\u0363\u0364\7\\\2\2\u0364\u0366"+
		"\5\u009cO\2\u0365\u0363\3\2\2\2\u0366\u0369\3\2\2\2\u0367\u0365\3\2\2"+
		"\2\u0367\u0368\3\2\2\2\u0368\u036c\3\2\2\2\u0369\u0367\3\2\2\2\u036a\u036c"+
		"\3\2\2\2\u036b\u0362\3\2\2\2\u036b\u036a\3\2\2\2\u036c\u009b\3\2\2\2\u036d"+
		"\u0373\n\7\2\2\u036e\u0370\7?\2\2\u036f\u0371\5\20\t\2\u0370\u036f\3\2"+
		"\2\2\u0370\u0371\3\2\2\2\u0371\u0372\3\2\2\2\u0372\u0374\7@\2\2\u0373"+
		"\u036e\3\2\2\2\u0373\u0374\3\2\2\2\u0374\u0377\3\2\2\2\u0375\u0377\3\2"+
		"\2\2\u0376\u036d\3\2\2\2\u0376\u0375\3\2\2\2\u0377\u009d\3\2\2\2\u0378"+
		"\u037e\n\b\2\2\u0379\u037a\7?\2\2\u037a\u037b\5\u009eP\2\u037b\u037c\7"+
		"@\2\2\u037c\u037e\3\2\2\2\u037d\u0378\3\2\2\2\u037d\u0379\3\2\2\2\u037e"+
		"\u0381\3\2\2\2\u037f\u037d\3\2\2\2\u037f\u0380\3\2\2\2\u0380\u009f\3\2"+
		"\2\2\u0381\u037f\3\2\2\2\u0382\u0384\7O\2\2\u0383\u0385\5\u00a2R\2\u0384"+
		"\u0383\3\2\2\2\u0384\u0385\3\2\2\2\u0385\u0395\3\2\2\2\u0386\u0388\7O"+
		"\2\2\u0387\u0389\5\u00a2R\2\u0388\u0387\3\2\2\2\u0388\u0389\3\2\2\2\u0389"+
		"\u038a\3\2\2\2\u038a\u0395\5\u00a0Q\2\u038b\u038d\7V\2\2\u038c\u038e\5"+
		"\u00a2R\2\u038d\u038c\3\2\2\2\u038d\u038e\3\2\2\2\u038e\u0395\3\2\2\2"+
		"\u038f\u0391\7V\2\2\u0390\u0392\5\u00a2R\2\u0391\u0390\3\2\2\2\u0391\u0392"+
		"\3\2\2\2\u0392\u0393\3\2\2\2\u0393\u0395\5\u00a0Q\2\u0394\u0382\3\2\2"+
		"\2\u0394\u0386\3\2\2\2\u0394\u038b\3\2\2\2\u0394\u038f\3\2\2\2\u0395\u00a1"+
		"\3\2\2\2\u0396\u0397\bR\1\2\u0397\u0398\5\u008aF\2\u0398\u039d\3\2\2\2"+
		"\u0399\u039a\6R$\3\u039a\u039c\5\u008aF\2\u039b\u0399\3\2\2\2\u039c\u039f"+
		"\3\2\2\2\u039d\u039b\3\2\2\2\u039d\u039e\3\2\2\2\u039e\u00a3\3\2\2\2\u039f"+
		"\u039d\3\2\2\2\u03a0\u03a6\5\u00a8U\2\u03a1\u03a2\5\u00a8U\2\u03a2\u03a3"+
		"\7\\\2\2\u03a3\u03a4\7l\2\2\u03a4\u03a6\3\2\2\2\u03a5\u03a0\3\2\2\2\u03a5"+
		"\u03a1\3\2\2\2\u03a6\u00a5\3\2\2\2\u03a7\u03a8\7\\\2\2\u03a8\u00a7\3\2"+
		"\2\2\u03a9\u03aa\bU\1\2\u03aa\u03ab\5\u00aaV\2\u03ab\u03b2\3\2\2\2\u03ac"+
		"\u03ad\6U%\3\u03ad\u03ae\5\u00a6T\2\u03ae\u03af\5\u00aaV\2\u03af\u03b1"+
		"\3\2\2\2\u03b0\u03ac\3\2\2\2\u03b1\u03b4\3\2\2\2\u03b2\u03b0\3\2\2\2\u03b2"+
		"\u03b3\3\2\2\2\u03b3\u00a9\3\2\2\2\u03b4\u03b2\3\2\2\2\u03b5\u03b6\5d"+
		"\63\2\u03b6\u03b7\5\u0092J\2\u03b7\u03c1\3\2\2\2\u03b8\u03ba\5f\64\2\u03b9"+
		"\u03bb\5\u00b0Y\2\u03ba\u03b9\3\2\2\2\u03ba\u03bb\3\2\2\2\u03bb\u03bd"+
		"\3\2\2\2\u03bc\u03be\5Z.\2\u03bd\u03bc\3\2\2\2\u03bd\u03be\3\2\2\2\u03be"+
		"\u03c1\3\2\2\2\u03bf\u03c1\5Z.\2\u03c0\u03b5\3\2\2\2\u03c0\u03b8\3\2\2"+
		"\2\u03c0\u03bf\3\2\2\2\u03c1\u00ab\3\2\2\2\u03c2\u03c3\bW\1\2\u03c3\u03c4"+
		"\7m\2\2\u03c4\u03ca\3\2\2\2\u03c5\u03c6\6W&\3\u03c6\u03c7\7\\\2\2\u03c7"+
		"\u03c9\7m\2\2\u03c8\u03c5\3\2\2\2\u03c9\u03cc\3\2\2\2\u03ca\u03c8\3\2"+
		"\2\2\u03ca\u03cb\3\2\2\2\u03cb\u00ad\3\2\2\2\u03cc\u03ca\3\2\2\2\u03cd"+
		"\u03cf\5~@\2\u03ce\u03d0\5\u00b0Y\2\u03cf\u03ce\3\2\2\2\u03cf\u03d0\3"+
		"\2\2\2\u03d0\u00af\3\2\2\2\u03d1\u03dd\5\u00a0Q\2\u03d2\u03d4\5\u00a0"+
		"Q\2\u03d3\u03d2\3\2\2\2\u03d3\u03d4\3\2\2\2\u03d4\u03d5\3\2\2\2\u03d5"+
		"\u03d9\5\u00b2Z\2\u03d6\u03d8\5\u0096L\2\u03d7\u03d6\3\2\2\2\u03d8\u03db"+
		"\3\2\2\2\u03d9\u03d7\3\2\2\2\u03d9\u03da\3\2\2\2\u03da\u03dd\3\2\2\2\u03db"+
		"\u03d9\3\2\2\2\u03dc\u03d1\3\2\2\2\u03dc\u03d3\3\2\2\2\u03dd\u00b1\3\2"+
		"\2\2\u03de\u03df\bZ\1\2\u03df\u03e0\7?\2\2\u03e0\u03e1\5\u00b0Y\2\u03e1"+
		"\u03e5\7@\2\2\u03e2\u03e4\5\u0096L\2\u03e3\u03e2\3\2\2\2\u03e4\u03e7\3"+
		"\2\2\2\u03e5\u03e3\3\2\2\2\u03e5\u03e6\3\2\2\2\u03e6\u040d\3\2\2\2\u03e7"+
		"\u03e5\3\2\2\2\u03e8\u03ea\7A\2\2\u03e9\u03eb\5\u00a2R\2\u03ea\u03e9\3"+
		"\2\2\2\u03ea\u03eb\3\2\2\2\u03eb\u03ed\3\2\2\2\u03ec\u03ee\5Z.\2\u03ed"+
		"\u03ec\3\2\2\2\u03ed\u03ee\3\2\2\2\u03ee\u03ef\3\2\2\2\u03ef\u040d\7B"+
		"\2\2\u03f0\u03f1\7A\2\2\u03f1\u03f3\7,\2\2\u03f2\u03f4\5\u00a2R\2\u03f3"+
		"\u03f2\3\2\2\2\u03f3\u03f4\3\2\2\2\u03f4\u03f5\3\2\2\2\u03f5\u03f6\5Z"+
		".\2\u03f6\u03f7\7B\2\2\u03f7\u040d\3\2\2\2\u03f8\u03f9\7A\2\2\u03f9\u03fa"+
		"\5\u00a2R\2\u03fa\u03fb\7,\2\2\u03fb\u03fc\5Z.\2\u03fc\u03fd\7B\2\2\u03fd"+
		"\u040d\3\2\2\2\u03fe\u03ff\7A\2\2\u03ff\u0400\7O\2\2\u0400\u040d\7B\2"+
		"\2\u0401\u0403\7?\2\2\u0402\u0404\5\u00a4S\2\u0403\u0402\3\2\2\2\u0403"+
		"\u0404\3\2\2\2\u0404\u0405\3\2\2\2\u0405\u0409\7@\2\2\u0406\u0408\5\u0096"+
		"L\2\u0407\u0406\3\2\2\2\u0408\u040b\3\2\2\2\u0409\u0407\3\2\2\2\u0409"+
		"\u040a\3\2\2\2\u040a\u040d\3\2\2\2\u040b\u0409\3\2\2\2\u040c\u03de\3\2"+
		"\2\2\u040c\u03e8\3\2\2\2\u040c\u03f0\3\2\2\2\u040c\u03f8\3\2\2\2\u040c"+
		"\u03fe\3\2\2\2\u040c\u0401\3\2\2\2\u040d\u0439\3\2\2\2\u040e\u040f\6Z"+
		"\'\3\u040f\u0411\7A\2\2\u0410\u0412\5\u00a2R\2\u0411\u0410\3\2\2\2\u0411"+
		"\u0412\3\2\2\2\u0412\u0414\3\2\2\2\u0413\u0415\5Z.\2\u0414\u0413\3\2\2"+
		"\2\u0414\u0415\3\2\2\2\u0415\u0416\3\2\2\2\u0416\u0438\7B\2\2\u0417\u0418"+
		"\6Z(\3\u0418\u0419\7A\2\2\u0419\u041b\7,\2\2\u041a\u041c\5\u00a2R\2\u041b"+
		"\u041a\3\2\2\2\u041b\u041c\3\2\2\2\u041c\u041d\3\2\2\2\u041d\u041e\5Z"+
		".\2\u041e\u041f\7B\2\2\u041f\u0438\3\2\2\2\u0420\u0421\6Z)\3\u0421\u0422"+
		"\7A\2\2\u0422\u0423\5\u00a2R\2\u0423\u0424\7,\2\2\u0424\u0425\5Z.\2\u0425"+
		"\u0426\7B\2\2\u0426\u0438\3\2\2\2\u0427\u0428\6Z*\3\u0428\u0429\7A\2\2"+
		"\u0429\u042a\7O\2\2\u042a\u0438\7B\2\2\u042b\u042c\6Z+\3\u042c\u042e\7"+
		"?\2\2\u042d\u042f\5\u00a4S\2\u042e\u042d\3\2\2\2\u042e\u042f\3\2\2\2\u042f"+
		"\u0430\3\2\2\2\u0430\u0434\7@\2\2\u0431\u0433\5\u0096L\2\u0432\u0431\3"+
		"\2\2\2\u0433\u0436\3\2\2\2\u0434\u0432\3\2\2\2\u0434\u0435\3\2\2\2\u0435"+
		"\u0438\3\2\2\2\u0436\u0434\3\2\2\2\u0437\u040e\3\2\2\2\u0437\u0417\3\2"+
		"\2\2\u0437\u0420\3\2\2\2\u0437\u0427\3\2\2\2\u0437\u042b\3\2\2\2\u0438"+
		"\u043b\3\2\2\2\u0439\u0437\3\2\2\2\u0439\u043a\3\2\2\2\u043a\u00b3\3\2"+
		"\2\2\u043b\u0439\3\2\2\2\u043c\u043d\7m\2\2\u043d\u00b5\3\2\2\2\u043e"+
		"\u0449\5Z.\2\u043f\u0440\7C\2\2\u0440\u0441\5\u00b8]\2\u0441\u0442\7D"+
		"\2\2\u0442\u0449\3\2\2\2\u0443\u0444\7C\2\2\u0444\u0445\5\u00b8]\2\u0445"+
		"\u0446\7\\\2\2\u0446\u0447\7D\2\2\u0447\u0449\3\2\2\2\u0448\u043e\3\2"+
		"\2\2\u0448\u043f\3\2\2\2\u0448\u0443\3\2\2\2\u0449\u00b7\3\2\2\2\u044a"+
		"\u044c\b]\1\2\u044b\u044d\5\u00ba^\2\u044c\u044b\3\2\2\2\u044c\u044d\3"+
		"\2\2\2\u044d\u044e\3\2\2\2\u044e\u044f\5\u00b6\\\2\u044f\u0458\3\2\2\2"+
		"\u0450\u0451\6],\3\u0451\u0453\7\\\2\2\u0452\u0454\5\u00ba^\2\u0453\u0452"+
		"\3\2\2\2\u0453\u0454\3\2\2\2\u0454\u0455\3\2\2\2\u0455\u0457\5\u00b6\\"+
		"\2\u0456\u0450\3\2\2\2\u0457\u045a\3\2\2\2\u0458\u0456\3\2\2\2\u0458\u0459"+
		"\3\2\2\2\u0459\u00b9\3\2\2\2\u045a\u0458\3\2\2\2\u045b\u045c\5\u00bc_"+
		"\2\u045c\u045d\7]\2\2\u045d\u00bb\3\2\2\2\u045e\u045f\b_\1\2\u045f\u0460"+
		"\5\u00be`\2\u0460\u0465\3\2\2\2\u0461\u0462\6_-\3\u0462\u0464\5\u00be"+
		"`\2\u0463\u0461\3\2\2\2\u0464\u0467\3\2\2\2\u0465\u0463\3\2\2\2\u0465"+
		"\u0466\3\2\2\2\u0466\u00bd\3\2\2\2\u0467\u0465\3\2\2\2\u0468\u0469\7A"+
		"\2\2\u0469\u046a\5`\61\2\u046a\u046b\7B\2\2\u046b\u046f\3\2\2\2\u046c"+
		"\u046d\7k\2\2\u046d\u046f\7m\2\2\u046e\u0468\3\2\2\2\u046e\u046c\3\2\2"+
		"\2\u046f\u00bf\3\2\2\2\u0470\u0471\7=\2\2\u0471\u0472\7?\2\2\u0472\u0473"+
		"\5`\61\2\u0473\u0475\7\\\2\2\u0474\u0476\7o\2\2\u0475\u0474\3\2\2\2\u0476"+
		"\u0477\3\2\2\2\u0477\u0475\3\2\2\2\u0477\u0478\3\2\2\2\u0478\u0479\3\2"+
		"\2\2\u0479\u047a\7@\2\2\u047a\u047b\7[\2\2\u047b\u00c1\3\2\2\2\u047c\u04a2"+
		"\5\u00c4c\2\u047d\u04a2\5\u00c6d\2\u047e\u04a2\5\u00ccg\2\u047f\u04a2"+
		"\5\u00ceh\2\u0480\u04a2\5\u00d0i\2\u0481\u04a2\5\u00d2j\2\u0482\u0483"+
		"\t\t\2\2\u0483\u0484\t\n\2\2\u0484\u048d\7?\2\2\u0485\u048a\5R*\2\u0486"+
		"\u0487\7\\\2\2\u0487\u0489\5R*\2\u0488\u0486\3\2\2\2\u0489\u048c\3\2\2"+
		"\2\u048a\u0488\3\2\2\2\u048a\u048b\3\2\2\2\u048b\u048e\3\2\2\2\u048c\u048a"+
		"\3\2\2\2\u048d\u0485\3\2\2\2\u048d\u048e\3\2\2\2\u048e\u049c\3\2\2\2\u048f"+
		"\u0498\7Z\2\2\u0490\u0495\5R*\2\u0491\u0492\7\\\2\2\u0492\u0494\5R*\2"+
		"\u0493\u0491\3\2\2\2\u0494\u0497\3\2\2\2\u0495\u0493\3\2\2\2\u0495\u0496"+
		"\3\2\2\2\u0496\u0499\3\2\2\2\u0497\u0495\3\2\2\2\u0498\u0490\3\2\2\2\u0498"+
		"\u0499\3\2\2\2\u0499\u049b\3\2\2\2\u049a\u048f\3\2\2\2\u049b\u049e\3\2"+
		"\2\2\u049c\u049a\3\2\2\2\u049c\u049d\3\2\2\2\u049d\u049f\3\2\2\2\u049e"+
		"\u049c\3\2\2\2\u049f\u04a0\7@\2\2\u04a0\u04a2\7[\2\2\u04a1\u047c\3\2\2"+
		"\2\u04a1\u047d\3\2\2\2\u04a1\u047e\3\2\2\2\u04a1\u047f\3\2\2\2\u04a1\u0480"+
		"\3\2\2\2\u04a1\u0481\3\2\2\2\u04a1\u0482\3\2\2\2\u04a2\u00c3\3\2\2\2\u04a3"+
		"\u04a4\7m\2\2\u04a4\u04a5\7Z\2\2\u04a5\u04af\5\u00c2b\2\u04a6\u04a7\7"+
		"\25\2\2\u04a7\u04a8\5`\61\2\u04a8\u04a9\7Z\2\2\u04a9\u04aa\5\u00c2b\2"+
		"\u04aa\u04af\3\2\2\2\u04ab\u04ac\7\31\2\2\u04ac\u04ad\7Z\2\2\u04ad\u04af"+
		"\5\u00c2b\2\u04ae\u04a3\3\2\2\2\u04ae\u04a6\3\2\2\2\u04ae\u04ab\3\2\2"+
		"\2\u04af\u00c5\3\2\2\2\u04b0\u04b2\7C\2\2\u04b1\u04b3\5\u00c8e\2\u04b2"+
		"\u04b1\3\2\2\2\u04b2\u04b3\3\2\2\2\u04b3\u04b4\3\2\2\2\u04b4\u04b5\7D"+
		"\2\2\u04b5\u00c7\3\2\2\2\u04b6\u04b7\be\1\2\u04b7\u04b8\5\u00caf\2\u04b8"+
		"\u04bd\3\2\2\2\u04b9\u04ba\6e.\3\u04ba\u04bc\5\u00caf\2\u04bb\u04b9\3"+
		"\2\2\2\u04bc\u04bf\3\2\2\2\u04bd\u04bb\3\2\2\2\u04bd\u04be\3\2\2\2\u04be"+
		"\u00c9\3\2\2\2\u04bf\u04bd\3\2\2\2\u04c0\u04c4\5b\62\2\u04c1\u04c4\5\u00c2"+
		"b\2\u04c2\u04c4\7p\2\2\u04c3\u04c0\3\2\2\2\u04c3\u04c1\3\2\2\2\u04c3\u04c2"+
		"\3\2\2\2\u04c4\u00cb\3\2\2\2\u04c5\u04c7\5^\60\2\u04c6\u04c5\3\2\2\2\u04c6"+
		"\u04c7\3\2\2\2\u04c7\u04c8\3\2\2\2\u04c8\u04c9\7[\2\2\u04c9\u00cd\3\2"+
		"\2\2\u04ca\u04cb\7\"\2\2\u04cb\u04cc\7?\2\2\u04cc\u04cd\5^\60\2\u04cd"+
		"\u04ce\7@\2\2\u04ce\u04d1\5\u00c2b\2\u04cf\u04d0\7\34\2\2\u04d0\u04d2"+
		"\5\u00c2b\2\u04d1\u04cf\3\2\2\2\u04d1\u04d2\3\2\2\2\u04d2\u04da\3\2\2"+
		"\2\u04d3\u04d4\7.\2\2\u04d4\u04d5\7?\2\2\u04d5\u04d6\5^\60\2\u04d6\u04d7"+
		"\7@\2\2\u04d7\u04d8\5\u00c2b\2\u04d8\u04da\3\2\2\2\u04d9\u04ca\3\2\2\2"+
		"\u04d9\u04d3\3\2\2\2\u04da\u00cf\3\2\2\2\u04db\u04dc\7\64\2\2\u04dc\u04dd"+
		"\7?\2\2\u04dd\u04de\5^\60\2\u04de\u04df\7@\2\2\u04df\u04e0\5\u00c2b\2"+
		"\u04e0\u0506\3\2\2\2\u04e1\u04e2\7\32\2\2\u04e2\u04e3\5\u00c2b\2\u04e3"+
		"\u04e4\7\64\2\2\u04e4\u04e5\7?\2\2\u04e5\u04e6\5^\60\2\u04e6\u04e7\7@"+
		"\2\2\u04e7\u04e8\7[\2\2\u04e8\u0506\3\2\2\2\u04e9\u04ea\7 \2\2\u04ea\u04ec"+
		"\7?\2\2\u04eb\u04ed\5^\60\2\u04ec\u04eb\3\2\2\2\u04ec\u04ed\3\2\2\2\u04ed"+
		"\u04ee\3\2\2\2\u04ee\u04f0\7[\2\2\u04ef\u04f1\5^\60\2\u04f0\u04ef\3\2"+
		"\2\2\u04f0\u04f1\3\2\2\2\u04f1\u04f2\3\2\2\2\u04f2\u04f4\7[\2\2\u04f3"+
		"\u04f5\5^\60\2\u04f4\u04f3\3\2\2\2\u04f4\u04f5\3\2\2\2\u04f5\u04f6\3\2"+
		"\2\2\u04f6\u04f7\7@\2\2\u04f7\u0506\5\u00c2b\2\u04f8\u04f9\7 \2\2\u04f9"+
		"\u04fa\7?\2\2\u04fa\u04fc\5b\62\2\u04fb\u04fd\5^\60\2\u04fc\u04fb\3\2"+
		"\2\2\u04fc\u04fd\3\2\2\2\u04fd\u04fe\3\2\2\2\u04fe\u0500\7[\2\2\u04ff"+
		"\u0501\5^\60\2\u0500\u04ff\3\2\2\2\u0500\u0501\3\2\2\2\u0501\u0502\3\2"+
		"\2\2\u0502\u0503\7@\2\2\u0503\u0504\5\u00c2b\2\u0504\u0506\3\2\2\2\u0505"+
		"\u04db\3\2\2\2\u0505\u04e1\3\2\2\2\u0505\u04e9\3\2\2\2\u0505\u04f8\3\2"+
		"\2\2\u0506\u00d1\3\2\2\2\u0507\u0508\7!\2\2\u0508\u0509\7m\2\2\u0509\u0514"+
		"\7[\2\2\u050a\u050b\7\30\2\2\u050b\u0514\7[\2\2\u050c\u050d\7\24\2\2\u050d"+
		"\u0514\7[\2\2\u050e\u0510\7(\2\2\u050f\u0511\5^\60\2\u0510\u050f\3\2\2"+
		"\2\u0510\u0511\3\2\2\2\u0511\u0512\3\2\2\2\u0512\u0514\7[\2\2\u0513\u0507"+
		"\3\2\2\2\u0513\u050a\3\2\2\2\u0513\u050c\3\2\2\2\u0513\u050e\3\2\2\2\u0514"+
		"\u00d3\3\2\2\2\u0515\u0517\5\u00d6l\2\u0516\u0515\3\2\2\2\u0516\u0517"+
		"\3\2\2\2\u0517\u0518\3\2\2\2\u0518\u0519\7\2\2\3\u0519\u00d5\3\2\2\2\u051a"+
		"\u051b\bl\1\2\u051b\u051c\5\u00d8m\2\u051c\u0521\3\2\2\2\u051d\u051e\6"+
		"l/\3\u051e\u0520\5\u00d8m\2\u051f\u051d\3\2\2\2\u0520\u0523\3\2\2\2\u0521"+
		"\u051f\3\2\2\2\u0521\u0522\3\2\2\2\u0522\u00d7\3\2\2\2\u0523\u0521\3\2"+
		"\2\2\u0524\u0529\5\u00dan\2\u0525\u0529\5b\62\2\u0526\u0529\7[\2\2\u0527"+
		"\u0529\7p\2\2\u0528\u0524\3\2\2\2\u0528\u0525\3\2\2\2\u0528\u0526\3\2"+
		"\2\2\u0528\u0527\3\2\2\2\u0529\u00d9\3\2\2\2\u052a\u052c\5d\63\2\u052b"+
		"\u052a\3\2\2\2\u052b\u052c\3\2\2\2\u052c\u052d\3\2\2\2\u052d\u052f\5\u00dc"+
		"o\2\u052e\u0530\5\u00dep\2\u052f\u052e\3\2\2\2\u052f\u0530\3\2\2\2\u0530"+
		"\u0531\3\2\2\2\u0531\u0532\5\u00c6d\2\u0532\u00db\3\2\2\2\u0533\u0534"+
		"\5\u0092J\2\u0534\u00dd\3\2\2\2\u0535\u0536\bp\1\2\u0536\u0537\5b\62\2"+
		"\u0537\u053c\3\2\2\2\u0538\u0539\6p\60\3\u0539\u053b\5b\62\2\u053a\u0538"+
		"\3\2\2\2\u053b\u053e\3\2\2\2\u053c\u053a\3\2\2\2\u053c\u053d\3\2\2\2\u053d"+
		"\u00df\3\2\2\2\u053e\u053c\3\2\2\2\u0089\u00e1\u00e8\u00f0\u0104\u0115"+
		"\u011f\u0126\u014c\u015e\u0160\u016c\u0185\u0199\u01b0\u01b2\u01c4\u01c6"+
		"\u01d8\u01da\u01f8\u01fa\u020c\u020e\u021c\u022a\u0238\u0246\u0254\u0261"+
		"\u0268\u0274\u027b\u0280\u0285\u028a\u0290\u029a\u02a4\u02ae\u02b3\u02b7"+
		"\u02c5\u02c9\u02d0\u02d4\u02d8\u02da\u02de\u02e6\u02ef\u02f9\u0301\u0304"+
		"\u0317\u0323\u032d\u0332\u0335\u033b\u0347\u034b\u034d\u0355\u0359\u0367"+
		"\u036b\u0370\u0373\u0376\u037d\u037f\u0384\u0388\u038d\u0391\u0394\u039d"+
		"\u03a5\u03b2\u03ba\u03bd\u03c0\u03ca\u03cf\u03d3\u03d9\u03dc\u03e5\u03ea"+
		"\u03ed\u03f3\u0403\u0409\u040c\u0411\u0414\u041b\u042e\u0434\u0437\u0439"+
		"\u0448\u044c\u0453\u0458\u0465\u046e\u0477\u048a\u048d\u0495\u0498\u049c"+
		"\u04a1\u04ae\u04b2\u04bd\u04c3\u04c6\u04d1\u04d9\u04ec\u04f0\u04f4\u04fc"+
		"\u0500\u0505\u0510\u0513\u0516\u0521\u0528\u052b\u052f\u053c";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}