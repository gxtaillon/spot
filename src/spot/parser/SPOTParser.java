// Generated from SPOT.g4 by ANTLR 4.1

    package spot.parser;

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
		T__19=1, T__18=2, T__17=3, T__16=4, T__15=5, T__14=6, T__13=7, T__12=8, 
		T__11=9, T__10=10, T__9=11, T__8=12, T__7=13, T__6=14, T__5=15, T__4=16, 
		T__3=17, T__2=18, T__1=19, T__0=20, Auto=21, Break=22, Case=23, Char=24, 
		Const=25, Continue=26, Default=27, Do=28, Double=29, Else=30, Enum=31, 
		Extern=32, Float=33, For=34, Goto=35, If=36, Inline=37, Int=38, Long=39, 
		Register=40, Restrict=41, Return=42, Short=43, Signed=44, Sizeof=45, Static=46, 
		Struct=47, Switch=48, Typedef=49, Union=50, Unsigned=51, Void=52, Volatile=53, 
		While=54, Alignas=55, Alignof=56, Atomic=57, Bool=58, Complex=59, Generic=60, 
		Imaginary=61, Noreturn=62, StaticAssert=63, ThreadLocal=64, LeftParen=65, 
		RightParen=66, LeftBracket=67, RightBracket=68, LeftBrace=69, RightBrace=70, 
		Less=71, LessEqual=72, Greater=73, GreaterEqual=74, LeftShift=75, RightShift=76, 
		Plus=77, PlusPlus=78, Minus=79, MinusMinus=80, Star=81, Div=82, Mod=83, 
		And=84, Or=85, AndAnd=86, OrOr=87, Caret=88, Not=89, Tilde=90, Question=91, 
		Colon=92, Semi=93, Comma=94, Assign=95, StarAssign=96, DivAssign=97, ModAssign=98, 
		PlusAssign=99, MinusAssign=100, LeftShiftAssign=101, RightShiftAssign=102, 
		AndAssign=103, XorAssign=104, OrAssign=105, Equal=106, NotEqual=107, Arrow=108, 
		Dot=109, Ellipsis=110, Identifier=111, Constant=112, StringLiteral=113, 
		LineDirective=114, SPOTDirective=115, Whitespace=116, Newline=117, BlockComment=118, 
		LineComment=119;
	public static final String[] tokenNames = {
		"<INVALID>", "'decl'", "'__extension__'", "'__private'", "'__stdcall'", 
		"'@'", "'__builtin_offsetof'", "'__attribute__'", "'__declspec'", "'__asm__'", 
		"'new'", "'class'", "'public'", "'__public'", "'__asm'", "'__inline__'", 
		"'native'", "'__builtin_va_arg'", "'stock'", "'__volatile__'", "'__protected'", 
		"'auto'", "'break'", "'case'", "'char'", "'const'", "'continue'", "'default'", 
		"'do'", "'double'", "'else'", "'enum'", "'extern'", "'float'", "'for'", 
		"'goto'", "'if'", "'inline'", "'int'", "'long'", "'register'", "'restrict'", 
		"'return'", "'short'", "'signed'", "'sizeof'", "'static'", "'struct'", 
		"'switch'", "'typedef'", "'union'", "'unsigned'", "'void'", "'volatile'", 
		"'while'", "'_Alignas'", "'_Alignof'", "'_Atomic'", "'_Bool'", "'_Complex'", 
		"'_Generic'", "'_Imaginary'", "'_Noreturn'", "'_Static_assert'", "'_Thread_local'", 
		"'('", "')'", "'['", "']'", "'{'", "'}'", "'<'", "'<='", "'>'", "'>='", 
		"'<<'", "'>>'", "'+'", "'++'", "'-'", "'--'", "'*'", "'/'", "'%'", "'&'", 
		"'|'", "'&&'", "'||'", "'^'", "'!'", "'~'", "'?'", "':'", "';'", "','", 
		"'='", "'*='", "'/='", "'%='", "'+='", "'-='", "'<<='", "'>>='", "'&='", 
		"'^='", "'|='", "'=='", "'!='", "'->'", "'.'", "'...'", "Identifier", 
		"Constant", "StringLiteral", "LineDirective", "SPOTDirective", "Whitespace", 
		"Newline", "BlockComment", "LineComment"
	};
	public static final int
		RULE_ntconstant = 0, RULE_primaryExpression = 1, RULE_genericSelection = 2, 
		RULE_genericAssocList = 3, RULE_genericAssociation = 4, RULE_postfixExpressionDot = 5, 
		RULE_postfixExpressionArgs = 6, RULE_postfixExpression = 7, RULE_argumentExpressionList = 8, 
		RULE_unaryExpression = 9, RULE_unaryOperator = 10, RULE_lpar = 11, RULE_rpar = 12, 
		RULE_castExpression = 13, RULE_star = 14, RULE_div = 15, RULE_mod = 16, 
		RULE_multiplicativeExpression = 17, RULE_plus = 18, RULE_minus = 19, RULE_additiveExpression = 20, 
		RULE_shiftl = 21, RULE_shiftr = 22, RULE_shiftExpression = 23, RULE_less = 24, 
		RULE_more = 25, RULE_leeq = 26, RULE_moeq = 27, RULE_relationalExpression = 28, 
		RULE_eqeq = 29, RULE_noteq = 30, RULE_equalityExpression = 31, RULE_and = 32, 
		RULE_andExpression = 33, RULE_caret = 34, RULE_exclusiveOrExpression = 35, 
		RULE_or = 36, RULE_inclusiveOrExpression = 37, RULE_andand = 38, RULE_logicalAndExpression = 39, 
		RULE_oror = 40, RULE_logicalOrExpression = 41, RULE_question = 42, RULE_colon = 43, 
		RULE_conditionalExpression = 44, RULE_assignmentExpression = 45, RULE_assignmentOperator = 46, 
		RULE_expression = 47, RULE_constantExpression = 48, RULE_declaration = 49, 
		RULE_declarationSpecifiers = 50, RULE_declarationSpecifiers2 = 51, RULE_declarationSpecifier = 52, 
		RULE_initDeclaratorList = 53, RULE_eq = 54, RULE_initDeclarator = 55, 
		RULE_storageClassSpecifier = 56, RULE_tagSpecifier = 57, RULE_typeSpecifier = 58, 
		RULE_classSpecifier = 59, RULE_classInheritanceSpecifier = 60, RULE_classDeclarationList = 61, 
		RULE_spo_public = 62, RULE_spo_private = 63, RULE_spo_protected = 64, 
		RULE_classVisibility = 65, RULE_semi = 66, RULE_classDeclaration = 67, 
		RULE_specifierQualifierList = 68, RULE_enumSpecifier = 69, RULE_enumeratorList = 70, 
		RULE_enumerator = 71, RULE_enumerationConstant = 72, RULE_atomicTypeSpecifier = 73, 
		RULE_typeQualifier = 74, RULE_typeAccessQualifier = 75, RULE_functionSpecifier = 76, 
		RULE_alignmentSpecifier = 77, RULE_declarator = 78, RULE_directDeclarator = 79, 
		RULE_gccDeclaratorExtension = 80, RULE_gccAttributeSpecifier = 81, RULE_gccAttributeList = 82, 
		RULE_gccAttribute = 83, RULE_nestedParenthesesBlock = 84, RULE_pointer = 85, 
		RULE_typeQualifierList = 86, RULE_parameterTypeList = 87, RULE_coma = 88, 
		RULE_parameterList = 89, RULE_parameterDeclaration = 90, RULE_identifierList = 91, 
		RULE_typeName = 92, RULE_abstractDeclarator = 93, RULE_directAbstractDeclarator = 94, 
		RULE_typedefName = 95, RULE_initializer = 96, RULE_initializerList = 97, 
		RULE_designation = 98, RULE_designatorList = 99, RULE_designator = 100, 
		RULE_staticAssertDeclaration = 101, RULE_statement = 102, RULE_labeledStatement = 103, 
		RULE_compoundStatement = 104, RULE_blockItemList = 105, RULE_blockItem = 106, 
		RULE_expressionStatement = 107, RULE_selectionStatement = 108, RULE_iterationStatement = 109, 
		RULE_ggoto = 110, RULE_ccontinue = 111, RULE_bbreak = 112, RULE_rreturn = 113, 
		RULE_jumpStatement = 114, RULE_compilationUnit = 115, RULE_translationUnit = 116, 
		RULE_externalDeclaration = 117, RULE_functionDefinition = 118, RULE_at = 119, 
		RULE_functionDeclarator = 120, RULE_declarationList = 121;
	public static final String[] ruleNames = {
		"ntconstant", "primaryExpression", "genericSelection", "genericAssocList", 
		"genericAssociation", "postfixExpressionDot", "postfixExpressionArgs", 
		"postfixExpression", "argumentExpressionList", "unaryExpression", "unaryOperator", 
		"lpar", "rpar", "castExpression", "star", "div", "mod", "multiplicativeExpression", 
		"plus", "minus", "additiveExpression", "shiftl", "shiftr", "shiftExpression", 
		"less", "more", "leeq", "moeq", "relationalExpression", "eqeq", "noteq", 
		"equalityExpression", "and", "andExpression", "caret", "exclusiveOrExpression", 
		"or", "inclusiveOrExpression", "andand", "logicalAndExpression", "oror", 
		"logicalOrExpression", "question", "colon", "conditionalExpression", "assignmentExpression", 
		"assignmentOperator", "expression", "constantExpression", "declaration", 
		"declarationSpecifiers", "declarationSpecifiers2", "declarationSpecifier", 
		"initDeclaratorList", "eq", "initDeclarator", "storageClassSpecifier", 
		"tagSpecifier", "typeSpecifier", "classSpecifier", "classInheritanceSpecifier", 
		"classDeclarationList", "spo_public", "spo_private", "spo_protected", 
		"classVisibility", "semi", "classDeclaration", "specifierQualifierList", 
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
		"ggoto", "ccontinue", "bbreak", "rreturn", "jumpStatement", "compilationUnit", 
		"translationUnit", "externalDeclaration", "functionDefinition", "at", 
		"functionDeclarator", "declarationList"
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
	public static class NtconstantContext extends ParserRuleContext {
		public TerminalNode Constant() { return getToken(SPOTParser.Constant, 0); }
		public NtconstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ntconstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterNtconstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitNtconstant(this);
		}
	}

	public final NtconstantContext ntconstant() throws RecognitionException {
		NtconstantContext _localctx = new NtconstantContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_ntconstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244); match(Constant);
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

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public NtconstantContext ntconstant() {
			return getRuleContext(NtconstantContext.class,0);
		}
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
		enterRule(_localctx, 2, RULE_primaryExpression);
		int _la;
		try {
			int _alt;
			setState(282);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(246); tagSpecifier();
					}
					break;
				}
				setState(249); match(Identifier);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(250); ntconstant();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(252); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(251); match(StringLiteral);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(254); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(256); match(LeftParen);
				setState(257); expression(0);
				setState(258); match(RightParen);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(260); genericSelection();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(262);
				_la = _input.LA(1);
				if (_la==2) {
					{
					setState(261); match(2);
					}
				}

				setState(264); match(LeftParen);
				setState(265); compoundStatement();
				setState(266); match(RightParen);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(268); match(17);
				setState(269); match(LeftParen);
				setState(270); unaryExpression();
				setState(271); match(Comma);
				setState(272); typeName();
				setState(273); match(RightParen);
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(275); match(6);
				setState(276); match(LeftParen);
				setState(277); typeName();
				setState(278); match(Comma);
				setState(279); unaryExpression();
				setState(280); match(RightParen);
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
		enterRule(_localctx, 4, RULE_genericSelection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284); match(Generic);
			setState(285); match(LeftParen);
			setState(286); assignmentExpression();
			setState(287); match(Comma);
			setState(288); genericAssocList(0);
			setState(289); match(RightParen);
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
		int _startState = 6;
		enterRecursionRule(_localctx, RULE_genericAssocList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(292); genericAssociation();
			}
			_ctx.stop = _input.LT(-1);
			setState(299);
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
					setState(294);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(295); match(Comma);
					setState(296); genericAssociation();
					}
					} 
				}
				setState(301);
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
		enterRule(_localctx, 8, RULE_genericAssociation);
		try {
			setState(309);
			switch (_input.LA(1)) {
			case 11:
			case Const:
			case Enum:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(302); typeName();
				setState(303); match(Colon);
				setState(304); assignmentExpression();
				}
				break;
			case Default:
				enterOuterAlt(_localctx, 2);
				{
				setState(306); match(Default);
				setState(307); match(Colon);
				setState(308); assignmentExpression();
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
		enterRule(_localctx, 10, RULE_postfixExpressionDot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311); match(Dot);
			setState(312); match(Identifier);
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
		enterRule(_localctx, 12, RULE_postfixExpressionArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314); match(LeftParen);
			setState(316);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 6) | (1L << 17) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LeftParen - 65)) | (1L << (Plus - 65)) | (1L << (PlusPlus - 65)) | (1L << (Minus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (AndAnd - 65)) | (1L << (Not - 65)) | (1L << (Tilde - 65)) | (1L << (Identifier - 65)) | (1L << (Constant - 65)) | (1L << (StringLiteral - 65)))) != 0)) {
				{
				setState(315); argumentExpressionList(0);
				}
			}

			setState(318); rpar();
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
		int _startState = 14;
		enterRecursionRule(_localctx, RULE_postfixExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(321); primaryExpression();
				}
				break;

			case 2:
				{
				setState(322); match(LeftParen);
				setState(323); typeName();
				setState(324); match(RightParen);
				setState(325); match(LeftBrace);
				setState(326); initializerList(0);
				setState(327); match(RightBrace);
				}
				break;

			case 3:
				{
				setState(329); match(LeftParen);
				setState(330); typeName();
				setState(331); match(RightParen);
				setState(332); match(LeftBrace);
				setState(333); initializerList(0);
				setState(334); match(Comma);
				setState(335); match(RightBrace);
				}
				break;

			case 4:
				{
				setState(337); match(2);
				setState(338); match(LeftParen);
				setState(339); typeName();
				setState(340); match(RightParen);
				setState(341); match(LeftBrace);
				setState(342); initializerList(0);
				setState(343); match(RightBrace);
				}
				break;

			case 5:
				{
				setState(345); match(2);
				setState(346); match(LeftParen);
				setState(347); typeName();
				setState(348); match(RightParen);
				setState(349); match(LeftBrace);
				setState(350); initializerList(0);
				setState(351); match(Comma);
				setState(352); match(RightBrace);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(374);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(372);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(356);
						if (!(10 >= _localctx._p)) throw new FailedPredicateException(this, "10 >= $_p");
						setState(357); match(LeftBracket);
						setState(358); expression(0);
						setState(359); match(RightBracket);
						}
						break;

					case 2:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(361);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(362); postfixExpressionArgs();
						}
						break;

					case 3:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(363);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(364); postfixExpressionDot();
						}
						break;

					case 4:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(365);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(366); match(Arrow);
						setState(367); match(Identifier);
						}
						break;

					case 5:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(368);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(369); match(PlusPlus);
						}
						break;

					case 6:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(370);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(371); match(MinusMinus);
						}
						break;
					}
					} 
				}
				setState(376);
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
		int _startState = 16;
		enterRecursionRule(_localctx, RULE_argumentExpressionList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(378); assignmentExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(386);
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
					setState(380);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(381); coma();
					setState(382); assignmentExpression();
					}
					} 
				}
				setState(388);
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
		enterRule(_localctx, 18, RULE_unaryExpression);
		try {
			setState(411);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(389); postfixExpression(0);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(390); match(PlusPlus);
				setState(391); unaryExpression();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(392); match(MinusMinus);
				setState(393); unaryExpression();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(394); unaryOperator();
				setState(395); castExpression();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(397); match(Sizeof);
				setState(398); unaryExpression();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(399); match(Sizeof);
				setState(400); match(LeftParen);
				setState(401); typeName();
				setState(402); match(RightParen);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(404); match(Alignof);
				setState(405); match(LeftParen);
				setState(406); typeName();
				setState(407); match(RightParen);
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(409); match(AndAnd);
				setState(410); match(Identifier);
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
		enterRule(_localctx, 20, RULE_unaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			_la = _input.LA(1);
			if ( !(((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (Plus - 77)) | (1L << (Minus - 77)) | (1L << (Star - 77)) | (1L << (And - 77)) | (1L << (Not - 77)) | (1L << (Tilde - 77)))) != 0)) ) {
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
		enterRule(_localctx, 22, RULE_lpar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415); match(LeftParen);
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
		enterRule(_localctx, 24, RULE_rpar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417); match(RightParen);
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
		enterRule(_localctx, 26, RULE_castExpression);
		try {
			setState(431);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(419); unaryExpression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(420); lpar();
				setState(421); typeName();
				setState(422); rpar();
				setState(423); castExpression();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(425); match(2);
				setState(426); lpar();
				setState(427); typeName();
				setState(428); rpar();
				setState(429); castExpression();
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
		enterRule(_localctx, 28, RULE_star);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433); match(Star);
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
		enterRule(_localctx, 30, RULE_div);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435); match(Div);
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
		enterRule(_localctx, 32, RULE_mod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437); match(Mod);
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
		int _startState = 34;
		enterRecursionRule(_localctx, RULE_multiplicativeExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(440); castExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(456);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(454);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(442);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(443); star();
						setState(444); castExpression();
						}
						break;

					case 2:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(446);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(447); div();
						setState(448); castExpression();
						}
						break;

					case 3:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(450);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(451); mod();
						setState(452); castExpression();
						}
						break;
					}
					} 
				}
				setState(458);
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
		enterRule(_localctx, 36, RULE_plus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459); match(Plus);
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
		enterRule(_localctx, 38, RULE_minus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461); match(Minus);
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
		int _startState = 40;
		enterRecursionRule(_localctx, RULE_additiveExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(464); multiplicativeExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(476);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(474);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(466);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(467); plus();
						setState(468); multiplicativeExpression(0);
						}
						break;

					case 2:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(470);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(471); minus();
						setState(472); multiplicativeExpression(0);
						}
						break;
					}
					} 
				}
				setState(478);
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
		enterRule(_localctx, 42, RULE_shiftl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479); match(LeftShift);
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
		enterRule(_localctx, 44, RULE_shiftr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481); match(RightShift);
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
		int _startState = 46;
		enterRecursionRule(_localctx, RULE_shiftExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(484); additiveExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(496);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(494);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(486);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(487); shiftl();
						setState(488); additiveExpression(0);
						}
						break;

					case 2:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(490);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(491); shiftr();
						setState(492); additiveExpression(0);
						}
						break;
					}
					} 
				}
				setState(498);
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
		enterRule(_localctx, 48, RULE_less);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499); match(Less);
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
		enterRule(_localctx, 50, RULE_more);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501); match(Greater);
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
		enterRule(_localctx, 52, RULE_leeq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503); match(LessEqual);
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
		enterRule(_localctx, 54, RULE_moeq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505); match(GreaterEqual);
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
		int _startState = 56;
		enterRecursionRule(_localctx, RULE_relationalExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(508); shiftExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(528);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(526);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(510);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(511); less();
						setState(512); shiftExpression(0);
						}
						break;

					case 2:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(514);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(515); more();
						setState(516); shiftExpression(0);
						}
						break;

					case 3:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(518);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(519); leeq();
						setState(520); shiftExpression(0);
						}
						break;

					case 4:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(522);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(523); moeq();
						setState(524); shiftExpression(0);
						}
						break;
					}
					} 
				}
				setState(530);
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
		enterRule(_localctx, 58, RULE_eqeq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531); match(Equal);
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
		enterRule(_localctx, 60, RULE_noteq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533); match(NotEqual);
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
		int _startState = 62;
		enterRecursionRule(_localctx, RULE_equalityExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(536); relationalExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(548);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(546);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(538);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(539); eqeq();
						setState(540); relationalExpression(0);
						}
						break;

					case 2:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(542);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(543); noteq();
						setState(544); relationalExpression(0);
						}
						break;
					}
					} 
				}
				setState(550);
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
		enterRule(_localctx, 64, RULE_and);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551); match(And);
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
		int _startState = 66;
		enterRecursionRule(_localctx, RULE_andExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(554); equalityExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(562);
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
					setState(556);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(557); and();
					setState(558); equalityExpression(0);
					}
					} 
				}
				setState(564);
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
		enterRule(_localctx, 68, RULE_caret);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565); match(Caret);
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
		int _startState = 70;
		enterRecursionRule(_localctx, RULE_exclusiveOrExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(568); andExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(576);
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
					setState(570);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(571); caret();
					setState(572); andExpression(0);
					}
					} 
				}
				setState(578);
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
		enterRule(_localctx, 72, RULE_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579); match(Or);
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
		int _startState = 74;
		enterRecursionRule(_localctx, RULE_inclusiveOrExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(582); exclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(590);
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
					setState(584);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(585); or();
					setState(586); exclusiveOrExpression(0);
					}
					} 
				}
				setState(592);
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
		enterRule(_localctx, 76, RULE_andand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593); match(AndAnd);
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
		int _startState = 78;
		enterRecursionRule(_localctx, RULE_logicalAndExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(596); inclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(604);
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
					setState(598);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(599); andand();
					setState(600); inclusiveOrExpression(0);
					}
					} 
				}
				setState(606);
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
		enterRule(_localctx, 80, RULE_oror);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607); match(OrOr);
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
		int _startState = 82;
		enterRecursionRule(_localctx, RULE_logicalOrExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(610); logicalAndExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(618);
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
					setState(612);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(613); oror();
					setState(614); logicalAndExpression(0);
					}
					} 
				}
				setState(620);
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
		enterRule(_localctx, 84, RULE_question);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(621); match(Question);
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

	public static class ColonContext extends ParserRuleContext {
		public ColonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterColon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitColon(this);
		}
	}

	public final ColonContext colon() throws RecognitionException {
		ColonContext _localctx = new ColonContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_colon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(623); match(Colon);
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
		public ColonContext colon() {
			return getRuleContext(ColonContext.class,0);
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
		enterRule(_localctx, 88, RULE_conditionalExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(625); logicalOrExpression(0);
			setState(631);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(626); question();
				setState(627); expression(0);
				setState(628); colon();
				setState(629); conditionalExpression();
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
		enterRule(_localctx, 90, RULE_assignmentExpression);
		try {
			setState(638);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(633); conditionalExpression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(634); unaryExpression();
				setState(635); assignmentOperator();
				setState(636); assignmentExpression();
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
		enterRule(_localctx, 92, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640);
			_la = _input.LA(1);
			if ( !(((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (Assign - 95)) | (1L << (StarAssign - 95)) | (1L << (DivAssign - 95)) | (1L << (ModAssign - 95)) | (1L << (PlusAssign - 95)) | (1L << (MinusAssign - 95)) | (1L << (LeftShiftAssign - 95)) | (1L << (RightShiftAssign - 95)) | (1L << (AndAssign - 95)) | (1L << (XorAssign - 95)) | (1L << (OrAssign - 95)))) != 0)) ) {
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
		int _startState = 94;
		enterRecursionRule(_localctx, RULE_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(643); assignmentExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(650);
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
					setState(645);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(646); match(Comma);
					setState(647); assignmentExpression();
					}
					} 
				}
				setState(652);
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
		enterRule(_localctx, 96, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(653); conditionalExpression();
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
		enterRule(_localctx, 98, RULE_declaration);
		int _la;
		try {
			setState(662);
			switch (_input.LA(1)) {
			case 1:
			case 10:
			case 11:
			case 12:
			case 16:
			case 18:
			case Const:
			case Enum:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(655); declarationSpecifiers();
				setState(657);
				_la = _input.LA(1);
				if (_la==LeftParen || _la==Identifier) {
					{
					setState(656); initDeclaratorList(0);
					}
				}

				setState(659); match(Semi);
				}
				break;
			case StaticAssert:
				enterOuterAlt(_localctx, 2);
				{
				setState(661); staticAssertDeclaration();
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
		enterRule(_localctx, 100, RULE_declarationSpecifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(665); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(664); declarationSpecifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(667); 
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
		enterRule(_localctx, 102, RULE_declarationSpecifiers2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(670); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(669); declarationSpecifier();
				}
				}
				setState(672); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 10) | (1L << 11) | (1L << 12) | (1L << 16) | (1L << 18) | (1L << Const) | (1L << Enum))) != 0) || _la==Identifier );
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
		enterRule(_localctx, 104, RULE_declarationSpecifier);
		try {
			setState(678);
			switch (_input.LA(1)) {
			case 1:
			case 10:
				enterOuterAlt(_localctx, 1);
				{
				setState(674); storageClassSpecifier();
				}
				break;
			case 11:
			case Enum:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(675); typeSpecifier();
				}
				break;
			case Const:
				enterOuterAlt(_localctx, 3);
				{
				setState(676); typeQualifier();
				}
				break;
			case 12:
			case 16:
			case 18:
				enterOuterAlt(_localctx, 4);
				{
				setState(677); typeAccessQualifier();
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
		int _startState = 106;
		enterRecursionRule(_localctx, RULE_initDeclaratorList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(681); initDeclarator();
			}
			_ctx.stop = _input.LT(-1);
			setState(688);
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
					setState(683);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(684); match(Comma);
					setState(685); initDeclarator();
					}
					} 
				}
				setState(690);
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
		enterRule(_localctx, 108, RULE_eq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(691); match(Assign);
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
		enterRule(_localctx, 110, RULE_initDeclarator);
		try {
			setState(698);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(693); declarator();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(694); declarator();
				setState(695); eq();
				setState(696); initializer();
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
		enterRule(_localctx, 112, RULE_storageClassSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(700);
			_la = _input.LA(1);
			if ( !(_la==1 || _la==10) ) {
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
		enterRule(_localctx, 114, RULE_tagSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(702); match(Identifier);
			setState(703); match(Colon);
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
		enterRule(_localctx, 116, RULE_typeSpecifier);
		try {
			setState(708);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(705); tagSpecifier();
				}
				break;
			case Enum:
				enterOuterAlt(_localctx, 2);
				{
				setState(706); enumSpecifier();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 3);
				{
				setState(707); classSpecifier();
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
		enterRule(_localctx, 118, RULE_classSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(710); match(11);
			setState(711); match(Identifier);
			setState(713);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(712); classInheritanceSpecifier();
				}
			}

			setState(715); match(LeftBrace);
			setState(717);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 3) | (1L << 5) | (1L << 10) | (1L << 11) | (1L << 12) | (1L << 13) | (1L << 16) | (1L << 18) | (1L << 20) | (1L << Const) | (1L << Enum))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LeftParen - 65)) | (1L << (Identifier - 65)) | (1L << (LineDirective - 65)))) != 0)) {
				{
				setState(716); classDeclarationList(0);
				}
			}

			setState(719); match(RightBrace);
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
		enterRule(_localctx, 120, RULE_classInheritanceSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(721); match(Colon);
			setState(722); identifierList(0);
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
		int _startState = 122;
		enterRecursionRule(_localctx, RULE_classDeclarationList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(725); classDeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(731);
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
					setState(727);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(728); classDeclaration();
					}
					} 
				}
				setState(733);
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

	public static class Spo_publicContext extends ParserRuleContext {
		public Spo_publicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spo_public; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterSpo_public(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitSpo_public(this);
		}
	}

	public final Spo_publicContext spo_public() throws RecognitionException {
		Spo_publicContext _localctx = new Spo_publicContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_spo_public);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(734); match(13);
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

	public static class Spo_privateContext extends ParserRuleContext {
		public Spo_privateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spo_private; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterSpo_private(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitSpo_private(this);
		}
	}

	public final Spo_privateContext spo_private() throws RecognitionException {
		Spo_privateContext _localctx = new Spo_privateContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_spo_private);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(736); match(3);
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

	public static class Spo_protectedContext extends ParserRuleContext {
		public Spo_protectedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spo_protected; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterSpo_protected(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitSpo_protected(this);
		}
	}

	public final Spo_protectedContext spo_protected() throws RecognitionException {
		Spo_protectedContext _localctx = new Spo_protectedContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_spo_protected);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(738); match(20);
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

	public static class ClassVisibilityContext extends ParserRuleContext {
		public Spo_protectedContext spo_protected() {
			return getRuleContext(Spo_protectedContext.class,0);
		}
		public Spo_publicContext spo_public() {
			return getRuleContext(Spo_publicContext.class,0);
		}
		public Spo_privateContext spo_private() {
			return getRuleContext(Spo_privateContext.class,0);
		}
		public ClassVisibilityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classVisibility; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterClassVisibility(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitClassVisibility(this);
		}
	}

	public final ClassVisibilityContext classVisibility() throws RecognitionException {
		ClassVisibilityContext _localctx = new ClassVisibilityContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_classVisibility);
		try {
			setState(743);
			switch (_input.LA(1)) {
			case 13:
				enterOuterAlt(_localctx, 1);
				{
				setState(740); spo_public();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 2);
				{
				setState(741); spo_private();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 3);
				{
				setState(742); spo_protected();
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
		enterRule(_localctx, 132, RULE_semi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(745); match(Semi);
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public ClassVisibilityContext classVisibility() {
			return getRuleContext(ClassVisibilityContext.class,0);
		}
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
		public SemiContext semi() {
			return getRuleContext(SemiContext.class,0);
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
		enterRule(_localctx, 134, RULE_classDeclaration);
		int _la;
		try {
			setState(761);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(748);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 13) | (1L << 20))) != 0)) {
					{
					setState(747); classVisibility();
					}
				}

				setState(751);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(750); tagSpecifier();
					}
					break;
				}
				setState(753); identifierList(0);
				setState(754); semi();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(757);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 13) | (1L << 20))) != 0)) {
					{
					setState(756); classVisibility();
					}
				}

				setState(759); functionDefinition();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(760); match(LineDirective);
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
		enterRule(_localctx, 136, RULE_specifierQualifierList);
		int _la;
		try {
			setState(771);
			switch (_input.LA(1)) {
			case 11:
			case Enum:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(763); typeSpecifier();
				setState(765);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 11) | (1L << Const) | (1L << Enum))) != 0) || _la==Identifier) {
					{
					setState(764); specifierQualifierList();
					}
				}

				}
				break;
			case Const:
				enterOuterAlt(_localctx, 2);
				{
				setState(767); typeQualifier();
				setState(769);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 11) | (1L << Const) | (1L << Enum))) != 0) || _la==Identifier) {
					{
					setState(768); specifierQualifierList();
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
		enterRule(_localctx, 138, RULE_enumSpecifier);
		int _la;
		try {
			setState(792);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(773); match(Enum);
				setState(775);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(774); match(Identifier);
					}
				}

				setState(777); match(LeftBrace);
				setState(778); enumeratorList(0);
				setState(779); match(RightBrace);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(781); match(Enum);
				setState(783);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(782); match(Identifier);
					}
				}

				setState(785); match(LeftBrace);
				setState(786); enumeratorList(0);
				setState(787); match(Comma);
				setState(788); match(RightBrace);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(790); match(Enum);
				setState(791); match(Identifier);
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
		int _startState = 140;
		enterRecursionRule(_localctx, RULE_enumeratorList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(795); enumerator();
			}
			_ctx.stop = _input.LT(-1);
			setState(802);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new EnumeratorListContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_enumeratorList);
					setState(797);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(798); match(Comma);
					setState(799); enumerator();
					}
					} 
				}
				setState(804);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
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
		enterRule(_localctx, 142, RULE_enumerator);
		try {
			setState(810);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(805); enumerationConstant();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(806); enumerationConstant();
				setState(807); match(Assign);
				setState(808); constantExpression();
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
		enterRule(_localctx, 144, RULE_enumerationConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(813);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(812); tagSpecifier();
				}
				break;
			}
			setState(815); match(Identifier);
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
		enterRule(_localctx, 146, RULE_atomicTypeSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(817); match(Atomic);
			setState(818); match(LeftParen);
			setState(819); typeName();
			setState(820); match(RightParen);
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
		enterRule(_localctx, 148, RULE_typeQualifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(822); match(Const);
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
		enterRule(_localctx, 150, RULE_typeAccessQualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(824);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 12) | (1L << 16) | (1L << 18))) != 0)) ) {
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
		enterRule(_localctx, 152, RULE_functionSpecifier);
		int _la;
		try {
			setState(832);
			switch (_input.LA(1)) {
			case 4:
			case 15:
			case Inline:
			case Noreturn:
				enterOuterAlt(_localctx, 1);
				{
				setState(826);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 4) | (1L << 15) | (1L << Inline) | (1L << Noreturn))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 2);
				{
				setState(827); gccAttributeSpecifier();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 3);
				{
				setState(828); match(8);
				setState(829); match(LeftParen);
				setState(830); match(Identifier);
				setState(831); match(RightParen);
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
		enterRule(_localctx, 154, RULE_alignmentSpecifier);
		try {
			setState(844);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(834); match(Alignas);
				setState(835); match(LeftParen);
				setState(836); typeName();
				setState(837); match(RightParen);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(839); match(Alignas);
				setState(840); match(LeftParen);
				setState(841); constantExpression();
				setState(842); match(RightParen);
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
		enterRule(_localctx, 156, RULE_declarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(846); directDeclarator(0);
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
		int _startState = 158;
		enterRecursionRule(_localctx, RULE_directDeclarator);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(854);
			switch (_input.LA(1)) {
			case Identifier:
				{
				setState(849); match(Identifier);
				}
				break;
			case LeftParen:
				{
				setState(850); lpar();
				setState(851); declarator();
				setState(852); rpar();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(886);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(884);
					switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
					case 1:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(856);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(857); match(LeftBracket);
						setState(859);
						_la = _input.LA(1);
						if (_la==Const) {
							{
							setState(858); typeQualifierList(0);
							}
						}

						setState(862);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 6) | (1L << 17) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LeftParen - 65)) | (1L << (Plus - 65)) | (1L << (PlusPlus - 65)) | (1L << (Minus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (AndAnd - 65)) | (1L << (Not - 65)) | (1L << (Tilde - 65)) | (1L << (Identifier - 65)) | (1L << (Constant - 65)) | (1L << (StringLiteral - 65)))) != 0)) {
							{
							setState(861); assignmentExpression();
							}
						}

						setState(864); match(RightBracket);
						}
						break;

					case 2:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(865);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(866); match(LeftBracket);
						setState(868);
						_la = _input.LA(1);
						if (_la==Const) {
							{
							setState(867); typeQualifierList(0);
							}
						}

						setState(870); match(Star);
						setState(871); match(RightBracket);
						}
						break;

					case 3:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(872);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(873); lpar();
						setState(874); parameterTypeList();
						setState(875); rpar();
						}
						break;

					case 4:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(877);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(878); lpar();
						setState(880);
						_la = _input.LA(1);
						if (_la==Identifier) {
							{
							setState(879); identifierList(0);
							}
						}

						setState(882); rpar();
						}
						break;
					}
					} 
				}
				setState(888);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
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
		enterRule(_localctx, 160, RULE_gccDeclaratorExtension);
		int _la;
		try {
			setState(898);
			switch (_input.LA(1)) {
			case 14:
				enterOuterAlt(_localctx, 1);
				{
				setState(889); match(14);
				setState(890); match(LeftParen);
				setState(892); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(891); match(StringLiteral);
					}
					}
					setState(894); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==StringLiteral );
				setState(896); match(RightParen);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 2);
				{
				setState(897); gccAttributeSpecifier();
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
		enterRule(_localctx, 162, RULE_gccAttributeSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(900); match(7);
			setState(901); match(LeftParen);
			setState(902); match(LeftParen);
			setState(903); gccAttributeList();
			setState(904); match(RightParen);
			setState(905); match(RightParen);
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
		enterRule(_localctx, 164, RULE_gccAttributeList);
		int _la;
		try {
			setState(916);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(907); gccAttribute();
				setState(912);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(908); match(Comma);
					setState(909); gccAttribute();
					}
					}
					setState(914);
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
		enterRule(_localctx, 166, RULE_gccAttribute);
		int _la;
		try {
			setState(927);
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
			case 17:
			case 18:
			case 19:
			case 20:
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
			case SPOTDirective:
			case Whitespace:
			case Newline:
			case BlockComment:
			case LineComment:
				enterOuterAlt(_localctx, 1);
				{
				setState(918);
				_la = _input.LA(1);
				if ( _la <= 0 || (((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LeftParen - 65)) | (1L << (RightParen - 65)) | (1L << (Comma - 65)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(924);
				_la = _input.LA(1);
				if (_la==LeftParen) {
					{
					setState(919); match(LeftParen);
					setState(921);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 6) | (1L << 17) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LeftParen - 65)) | (1L << (Plus - 65)) | (1L << (PlusPlus - 65)) | (1L << (Minus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (AndAnd - 65)) | (1L << (Not - 65)) | (1L << (Tilde - 65)) | (1L << (Identifier - 65)) | (1L << (Constant - 65)) | (1L << (StringLiteral - 65)))) != 0)) {
						{
						setState(920); argumentExpressionList(0);
						}
					}

					setState(923); match(RightParen);
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
		enterRule(_localctx, 168, RULE_nestedParenthesesBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(936);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 3) | (1L << 4) | (1L << 5) | (1L << 6) | (1L << 7) | (1L << 8) | (1L << 9) | (1L << 10) | (1L << 11) | (1L << 12) | (1L << 13) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 17) | (1L << 18) | (1L << 19) | (1L << 20) | (1L << Auto) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Const) | (1L << Continue) | (1L << Default) | (1L << Do) | (1L << Double) | (1L << Else) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << For) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static) | (1L << Struct) | (1L << Switch) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << While) | (1L << Alignas) | (1L << Alignof) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Generic) | (1L << Imaginary) | (1L << Noreturn) | (1L << StaticAssert))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ThreadLocal - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (RightBracket - 64)) | (1L << (LeftBrace - 64)) | (1L << (RightBrace - 64)) | (1L << (Less - 64)) | (1L << (LessEqual - 64)) | (1L << (Greater - 64)) | (1L << (GreaterEqual - 64)) | (1L << (LeftShift - 64)) | (1L << (RightShift - 64)) | (1L << (Plus - 64)) | (1L << (PlusPlus - 64)) | (1L << (Minus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Star - 64)) | (1L << (Div - 64)) | (1L << (Mod - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Caret - 64)) | (1L << (Not - 64)) | (1L << (Tilde - 64)) | (1L << (Question - 64)) | (1L << (Colon - 64)) | (1L << (Semi - 64)) | (1L << (Comma - 64)) | (1L << (Assign - 64)) | (1L << (StarAssign - 64)) | (1L << (DivAssign - 64)) | (1L << (ModAssign - 64)) | (1L << (PlusAssign - 64)) | (1L << (MinusAssign - 64)) | (1L << (LeftShiftAssign - 64)) | (1L << (RightShiftAssign - 64)) | (1L << (AndAssign - 64)) | (1L << (XorAssign - 64)) | (1L << (OrAssign - 64)) | (1L << (Equal - 64)) | (1L << (NotEqual - 64)) | (1L << (Arrow - 64)) | (1L << (Dot - 64)) | (1L << (Ellipsis - 64)) | (1L << (Identifier - 64)) | (1L << (Constant - 64)) | (1L << (StringLiteral - 64)) | (1L << (LineDirective - 64)) | (1L << (SPOTDirective - 64)) | (1L << (Whitespace - 64)) | (1L << (Newline - 64)) | (1L << (BlockComment - 64)) | (1L << (LineComment - 64)))) != 0)) {
				{
				setState(934);
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
				case 17:
				case 18:
				case 19:
				case 20:
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
				case SPOTDirective:
				case Whitespace:
				case Newline:
				case BlockComment:
				case LineComment:
					{
					setState(929);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==LeftParen || _la==RightParen) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					break;
				case LeftParen:
					{
					setState(930); match(LeftParen);
					setState(931); nestedParenthesesBlock();
					setState(932); match(RightParen);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(938);
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
		enterRule(_localctx, 170, RULE_pointer);
		int _la;
		try {
			setState(957);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(939); match(Star);
				setState(941);
				switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
				case 1:
					{
					setState(940); typeQualifierList(0);
					}
					break;
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(943); match(Star);
				setState(945);
				_la = _input.LA(1);
				if (_la==Const) {
					{
					setState(944); typeQualifierList(0);
					}
				}

				setState(947); pointer();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(948); match(Caret);
				setState(950);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(949); typeQualifierList(0);
					}
					break;
				}
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(952); match(Caret);
				setState(954);
				_la = _input.LA(1);
				if (_la==Const) {
					{
					setState(953); typeQualifierList(0);
					}
				}

				setState(956); pointer();
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
		int _startState = 172;
		enterRecursionRule(_localctx, RULE_typeQualifierList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(960); typeQualifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(966);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeQualifierListContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_typeQualifierList);
					setState(962);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(963); typeQualifier();
					}
					} 
				}
				setState(968);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
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
		enterRule(_localctx, 174, RULE_parameterTypeList);
		try {
			setState(974);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(969); parameterList(0);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(970); parameterList(0);
				setState(971); match(Comma);
				setState(972); match(Ellipsis);
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
		enterRule(_localctx, 176, RULE_coma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(976); match(Comma);
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
		int _startState = 178;
		enterRecursionRule(_localctx, RULE_parameterList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(979); parameterDeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(987);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ParameterListContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_parameterList);
					setState(981);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(982); coma();
					setState(983); parameterDeclaration();
					}
					} 
				}
				setState(989);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
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
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
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
		enterRule(_localctx, 180, RULE_parameterDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(990); assignmentExpression();
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
		int _startState = 182;
		enterRecursionRule(_localctx, RULE_identifierList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(993); match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(1000);
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
					setState(995);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(996); match(Comma);
					setState(997); match(Identifier);
					}
					} 
				}
				setState(1002);
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
		enterRule(_localctx, 184, RULE_typeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1003); specifierQualifierList();
			setState(1005);
			_la = _input.LA(1);
			if (_la==LeftParen || _la==LeftBracket) {
				{
				setState(1004); abstractDeclarator();
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
		enterRule(_localctx, 186, RULE_abstractDeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1007); directAbstractDeclarator(0);
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
		int _startState = 188;
		enterRecursionRule(_localctx, RULE_directAbstractDeclarator);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1044);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				{
				setState(1010); match(LeftParen);
				setState(1011); abstractDeclarator();
				setState(1012); match(RightParen);
				}
				break;

			case 2:
				{
				setState(1014); match(LeftBracket);
				setState(1016);
				_la = _input.LA(1);
				if (_la==Const) {
					{
					setState(1015); typeQualifierList(0);
					}
				}

				setState(1019);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 6) | (1L << 17) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LeftParen - 65)) | (1L << (Plus - 65)) | (1L << (PlusPlus - 65)) | (1L << (Minus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (AndAnd - 65)) | (1L << (Not - 65)) | (1L << (Tilde - 65)) | (1L << (Identifier - 65)) | (1L << (Constant - 65)) | (1L << (StringLiteral - 65)))) != 0)) {
					{
					setState(1018); assignmentExpression();
					}
				}

				setState(1021); match(RightBracket);
				}
				break;

			case 3:
				{
				setState(1022); match(LeftBracket);
				setState(1023); match(Static);
				setState(1025);
				_la = _input.LA(1);
				if (_la==Const) {
					{
					setState(1024); typeQualifierList(0);
					}
				}

				setState(1027); assignmentExpression();
				setState(1028); match(RightBracket);
				}
				break;

			case 4:
				{
				setState(1030); match(LeftBracket);
				setState(1031); typeQualifierList(0);
				setState(1032); match(Static);
				setState(1033); assignmentExpression();
				setState(1034); match(RightBracket);
				}
				break;

			case 5:
				{
				setState(1036); match(LeftBracket);
				setState(1037); match(Star);
				setState(1038); match(RightBracket);
				}
				break;

			case 6:
				{
				setState(1039); match(LeftParen);
				setState(1041);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 6) | (1L << 17) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LeftParen - 65)) | (1L << (Plus - 65)) | (1L << (PlusPlus - 65)) | (1L << (Minus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (AndAnd - 65)) | (1L << (Not - 65)) | (1L << (Tilde - 65)) | (1L << (Identifier - 65)) | (1L << (Constant - 65)) | (1L << (StringLiteral - 65)))) != 0)) {
					{
					setState(1040); parameterTypeList();
					}
				}

				setState(1043); match(RightParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1083);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1081);
					switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
					case 1:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(1046);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(1047); match(LeftBracket);
						setState(1049);
						_la = _input.LA(1);
						if (_la==Const) {
							{
							setState(1048); typeQualifierList(0);
							}
						}

						setState(1052);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 6) | (1L << 17) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LeftParen - 65)) | (1L << (Plus - 65)) | (1L << (PlusPlus - 65)) | (1L << (Minus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (AndAnd - 65)) | (1L << (Not - 65)) | (1L << (Tilde - 65)) | (1L << (Identifier - 65)) | (1L << (Constant - 65)) | (1L << (StringLiteral - 65)))) != 0)) {
							{
							setState(1051); assignmentExpression();
							}
						}

						setState(1054); match(RightBracket);
						}
						break;

					case 2:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(1055);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(1056); match(LeftBracket);
						setState(1057); match(Static);
						setState(1059);
						_la = _input.LA(1);
						if (_la==Const) {
							{
							setState(1058); typeQualifierList(0);
							}
						}

						setState(1061); assignmentExpression();
						setState(1062); match(RightBracket);
						}
						break;

					case 3:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(1064);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(1065); match(LeftBracket);
						setState(1066); typeQualifierList(0);
						setState(1067); match(Static);
						setState(1068); assignmentExpression();
						setState(1069); match(RightBracket);
						}
						break;

					case 4:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(1071);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(1072); match(LeftBracket);
						setState(1073); match(Star);
						setState(1074); match(RightBracket);
						}
						break;

					case 5:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(1075);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(1076); match(LeftParen);
						setState(1078);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 6) | (1L << 17) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LeftParen - 65)) | (1L << (Plus - 65)) | (1L << (PlusPlus - 65)) | (1L << (Minus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (AndAnd - 65)) | (1L << (Not - 65)) | (1L << (Tilde - 65)) | (1L << (Identifier - 65)) | (1L << (Constant - 65)) | (1L << (StringLiteral - 65)))) != 0)) {
							{
							setState(1077); parameterTypeList();
							}
						}

						setState(1080); match(RightParen);
						}
						break;
					}
					} 
				}
				setState(1085);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
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
		enterRule(_localctx, 190, RULE_typedefName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1086); match(Identifier);
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
		enterRule(_localctx, 192, RULE_initializer);
		try {
			setState(1098);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1088); assignmentExpression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1089); match(LeftBrace);
				setState(1090); initializerList(0);
				setState(1091); match(RightBrace);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1093); match(LeftBrace);
				setState(1094); initializerList(0);
				setState(1095); match(Comma);
				setState(1096); match(RightBrace);
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
		int _startState = 194;
		enterRecursionRule(_localctx, RULE_initializerList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1102);
			_la = _input.LA(1);
			if (_la==LeftBracket || _la==Dot) {
				{
				setState(1101); designation();
				}
			}

			setState(1104); initializer();
			}
			_ctx.stop = _input.LT(-1);
			setState(1114);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InitializerListContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_initializerList);
					setState(1106);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(1107); match(Comma);
					setState(1109);
					_la = _input.LA(1);
					if (_la==LeftBracket || _la==Dot) {
						{
						setState(1108); designation();
						}
					}

					setState(1111); initializer();
					}
					} 
				}
				setState(1116);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
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
		enterRule(_localctx, 196, RULE_designation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1117); designatorList(0);
			setState(1118); match(Assign);
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
		int _startState = 198;
		enterRecursionRule(_localctx, RULE_designatorList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1121); designator();
			}
			_ctx.stop = _input.LT(-1);
			setState(1127);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DesignatorListContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_designatorList);
					setState(1123);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(1124); designator();
					}
					} 
				}
				setState(1129);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
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
		enterRule(_localctx, 200, RULE_designator);
		try {
			setState(1136);
			switch (_input.LA(1)) {
			case LeftBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(1130); match(LeftBracket);
				setState(1131); constantExpression();
				setState(1132); match(RightBracket);
				}
				break;
			case Dot:
				enterOuterAlt(_localctx, 2);
				{
				setState(1134); match(Dot);
				setState(1135); match(Identifier);
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
		enterRule(_localctx, 202, RULE_staticAssertDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1138); match(StaticAssert);
			setState(1139); match(LeftParen);
			setState(1140); constantExpression();
			setState(1141); match(Comma);
			setState(1143); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1142); match(StringLiteral);
				}
				}
				setState(1145); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==StringLiteral );
			setState(1147); match(RightParen);
			setState(1148); match(Semi);
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
		enterRule(_localctx, 204, RULE_statement);
		int _la;
		try {
			setState(1187);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1150); labeledStatement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1151); compoundStatement();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1152); expressionStatement();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1153); selectionStatement();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1154); iterationStatement();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1155); jumpStatement();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1156);
				_la = _input.LA(1);
				if ( !(_la==9 || _la==14) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(1157);
				_la = _input.LA(1);
				if ( !(_la==19 || _la==Volatile) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(1158); match(LeftParen);
				setState(1167);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 6) | (1L << 17) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LeftParen - 65)) | (1L << (Plus - 65)) | (1L << (PlusPlus - 65)) | (1L << (Minus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (AndAnd - 65)) | (1L << (Not - 65)) | (1L << (Tilde - 65)) | (1L << (Identifier - 65)) | (1L << (Constant - 65)) | (1L << (StringLiteral - 65)))) != 0)) {
					{
					setState(1159); logicalOrExpression(0);
					setState(1164);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(1160); match(Comma);
						setState(1161); logicalOrExpression(0);
						}
						}
						setState(1166);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Colon) {
					{
					{
					setState(1169); match(Colon);
					setState(1178);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 6) | (1L << 17) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LeftParen - 65)) | (1L << (Plus - 65)) | (1L << (PlusPlus - 65)) | (1L << (Minus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (AndAnd - 65)) | (1L << (Not - 65)) | (1L << (Tilde - 65)) | (1L << (Identifier - 65)) | (1L << (Constant - 65)) | (1L << (StringLiteral - 65)))) != 0)) {
						{
						setState(1170); logicalOrExpression(0);
						setState(1175);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Comma) {
							{
							{
							setState(1171); match(Comma);
							setState(1172); logicalOrExpression(0);
							}
							}
							setState(1177);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					}
					}
					setState(1184);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1185); match(RightParen);
				setState(1186); match(Semi);
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
		enterRule(_localctx, 206, RULE_labeledStatement);
		try {
			setState(1200);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1189); match(Identifier);
				setState(1190); match(Colon);
				setState(1191); statement();
				}
				break;
			case Case:
				enterOuterAlt(_localctx, 2);
				{
				setState(1192); match(Case);
				setState(1193); constantExpression();
				setState(1194); match(Colon);
				setState(1195); statement();
				}
				break;
			case Default:
				enterOuterAlt(_localctx, 3);
				{
				setState(1197); match(Default);
				setState(1198); match(Colon);
				setState(1199); statement();
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
		enterRule(_localctx, 208, RULE_compoundStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1202); match(LeftBrace);
			setState(1204);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 6) | (1L << 9) | (1L << 10) | (1L << 11) | (1L << 12) | (1L << 14) | (1L << 16) | (1L << 17) | (1L << 18) | (1L << Break) | (1L << Case) | (1L << Const) | (1L << Continue) | (1L << Default) | (1L << Do) | (1L << Enum) | (1L << For) | (1L << Goto) | (1L << If) | (1L << Return) | (1L << Sizeof) | (1L << Switch) | (1L << While) | (1L << Alignof) | (1L << Generic) | (1L << StaticAssert))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LeftParen - 65)) | (1L << (LeftBrace - 65)) | (1L << (Plus - 65)) | (1L << (PlusPlus - 65)) | (1L << (Minus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (AndAnd - 65)) | (1L << (Not - 65)) | (1L << (Tilde - 65)) | (1L << (Semi - 65)) | (1L << (Identifier - 65)) | (1L << (Constant - 65)) | (1L << (StringLiteral - 65)) | (1L << (LineDirective - 65)))) != 0)) {
				{
				setState(1203); blockItemList(0);
				}
			}

			setState(1206); match(RightBrace);
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
		int _startState = 210;
		enterRecursionRule(_localctx, RULE_blockItemList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1209); blockItem();
			}
			_ctx.stop = _input.LT(-1);
			setState(1215);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BlockItemListContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_blockItemList);
					setState(1211);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(1212); blockItem();
					}
					} 
				}
				setState(1217);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
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
		enterRule(_localctx, 212, RULE_blockItem);
		try {
			setState(1221);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1218); declaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1219); statement();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1220); match(LineDirective);
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
		public SemiContext semi() {
			return getRuleContext(SemiContext.class,0);
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
		enterRule(_localctx, 214, RULE_expressionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1224);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 6) | (1L << 17) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LeftParen - 65)) | (1L << (Plus - 65)) | (1L << (PlusPlus - 65)) | (1L << (Minus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (AndAnd - 65)) | (1L << (Not - 65)) | (1L << (Tilde - 65)) | (1L << (Identifier - 65)) | (1L << (Constant - 65)) | (1L << (StringLiteral - 65)))) != 0)) {
				{
				setState(1223); expression(0);
				}
			}

			setState(1226); semi();
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
		enterRule(_localctx, 216, RULE_selectionStatement);
		try {
			setState(1243);
			switch (_input.LA(1)) {
			case If:
				enterOuterAlt(_localctx, 1);
				{
				setState(1228); match(If);
				setState(1229); match(LeftParen);
				setState(1230); expression(0);
				setState(1231); match(RightParen);
				setState(1232); statement();
				setState(1235);
				switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
				case 1:
					{
					setState(1233); match(Else);
					setState(1234); statement();
					}
					break;
				}
				}
				break;
			case Switch:
				enterOuterAlt(_localctx, 2);
				{
				setState(1237); match(Switch);
				setState(1238); match(LeftParen);
				setState(1239); expression(0);
				setState(1240); match(RightParen);
				setState(1241); statement();
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
		enterRule(_localctx, 218, RULE_iterationStatement);
		int _la;
		try {
			setState(1287);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1245); match(While);
				setState(1246); match(LeftParen);
				setState(1247); expression(0);
				setState(1248); match(RightParen);
				setState(1249); statement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1251); match(Do);
				setState(1252); statement();
				setState(1253); match(While);
				setState(1254); match(LeftParen);
				setState(1255); expression(0);
				setState(1256); match(RightParen);
				setState(1257); match(Semi);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1259); match(For);
				setState(1260); match(LeftParen);
				setState(1262);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 6) | (1L << 17) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LeftParen - 65)) | (1L << (Plus - 65)) | (1L << (PlusPlus - 65)) | (1L << (Minus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (AndAnd - 65)) | (1L << (Not - 65)) | (1L << (Tilde - 65)) | (1L << (Identifier - 65)) | (1L << (Constant - 65)) | (1L << (StringLiteral - 65)))) != 0)) {
					{
					setState(1261); expression(0);
					}
				}

				setState(1264); match(Semi);
				setState(1266);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 6) | (1L << 17) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LeftParen - 65)) | (1L << (Plus - 65)) | (1L << (PlusPlus - 65)) | (1L << (Minus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (AndAnd - 65)) | (1L << (Not - 65)) | (1L << (Tilde - 65)) | (1L << (Identifier - 65)) | (1L << (Constant - 65)) | (1L << (StringLiteral - 65)))) != 0)) {
					{
					setState(1265); expression(0);
					}
				}

				setState(1268); match(Semi);
				setState(1270);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 6) | (1L << 17) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LeftParen - 65)) | (1L << (Plus - 65)) | (1L << (PlusPlus - 65)) | (1L << (Minus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (AndAnd - 65)) | (1L << (Not - 65)) | (1L << (Tilde - 65)) | (1L << (Identifier - 65)) | (1L << (Constant - 65)) | (1L << (StringLiteral - 65)))) != 0)) {
					{
					setState(1269); expression(0);
					}
				}

				setState(1272); match(RightParen);
				setState(1273); statement();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1274); match(For);
				setState(1275); match(LeftParen);
				setState(1276); declaration();
				setState(1278);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 6) | (1L << 17) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LeftParen - 65)) | (1L << (Plus - 65)) | (1L << (PlusPlus - 65)) | (1L << (Minus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (AndAnd - 65)) | (1L << (Not - 65)) | (1L << (Tilde - 65)) | (1L << (Identifier - 65)) | (1L << (Constant - 65)) | (1L << (StringLiteral - 65)))) != 0)) {
					{
					setState(1277); expression(0);
					}
				}

				setState(1280); match(Semi);
				setState(1282);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 6) | (1L << 17) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LeftParen - 65)) | (1L << (Plus - 65)) | (1L << (PlusPlus - 65)) | (1L << (Minus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (AndAnd - 65)) | (1L << (Not - 65)) | (1L << (Tilde - 65)) | (1L << (Identifier - 65)) | (1L << (Constant - 65)) | (1L << (StringLiteral - 65)))) != 0)) {
					{
					setState(1281); expression(0);
					}
				}

				setState(1284); match(RightParen);
				setState(1285); statement();
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

	public static class GgotoContext extends ParserRuleContext {
		public GgotoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ggoto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterGgoto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitGgoto(this);
		}
	}

	public final GgotoContext ggoto() throws RecognitionException {
		GgotoContext _localctx = new GgotoContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_ggoto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1289); match(Goto);
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

	public static class CcontinueContext extends ParserRuleContext {
		public CcontinueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ccontinue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterCcontinue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitCcontinue(this);
		}
	}

	public final CcontinueContext ccontinue() throws RecognitionException {
		CcontinueContext _localctx = new CcontinueContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_ccontinue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1291); match(Continue);
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

	public static class BbreakContext extends ParserRuleContext {
		public BbreakContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bbreak; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterBbreak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitBbreak(this);
		}
	}

	public final BbreakContext bbreak() throws RecognitionException {
		BbreakContext _localctx = new BbreakContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_bbreak);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1293); match(Break);
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

	public static class RreturnContext extends ParserRuleContext {
		public RreturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rreturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterRreturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitRreturn(this);
		}
	}

	public final RreturnContext rreturn() throws RecognitionException {
		RreturnContext _localctx = new RreturnContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_rreturn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1295); match(Return);
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
		public CcontinueContext ccontinue() {
			return getRuleContext(CcontinueContext.class,0);
		}
		public GgotoContext ggoto() {
			return getRuleContext(GgotoContext.class,0);
		}
		public RreturnContext rreturn() {
			return getRuleContext(RreturnContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(SPOTParser.Identifier, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BbreakContext bbreak() {
			return getRuleContext(BbreakContext.class,0);
		}
		public SemiContext semi() {
			return getRuleContext(SemiContext.class,0);
		}
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
		enterRule(_localctx, 228, RULE_jumpStatement);
		int _la;
		try {
			setState(1313);
			switch (_input.LA(1)) {
			case Goto:
				enterOuterAlt(_localctx, 1);
				{
				setState(1297); ggoto();
				setState(1298); match(Identifier);
				setState(1299); semi();
				}
				break;
			case Continue:
				enterOuterAlt(_localctx, 2);
				{
				setState(1301); ccontinue();
				setState(1302); semi();
				}
				break;
			case Break:
				enterOuterAlt(_localctx, 3);
				{
				setState(1304); bbreak();
				setState(1305); semi();
				}
				break;
			case Return:
				enterOuterAlt(_localctx, 4);
				{
				setState(1307); rreturn();
				setState(1309);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 6) | (1L << 17) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LeftParen - 65)) | (1L << (Plus - 65)) | (1L << (PlusPlus - 65)) | (1L << (Minus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (AndAnd - 65)) | (1L << (Not - 65)) | (1L << (Tilde - 65)) | (1L << (Identifier - 65)) | (1L << (Constant - 65)) | (1L << (StringLiteral - 65)))) != 0)) {
					{
					setState(1308); expression(0);
					}
				}

				setState(1311); semi();
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
		enterRule(_localctx, 230, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1316);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 5) | (1L << 10) | (1L << 11) | (1L << 12) | (1L << 16) | (1L << 18) | (1L << Const) | (1L << Enum) | (1L << StaticAssert))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LeftParen - 65)) | (1L << (Semi - 65)) | (1L << (Identifier - 65)) | (1L << (LineDirective - 65)))) != 0)) {
				{
				setState(1315); translationUnit(0);
				}
			}

			setState(1318); match(EOF);
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
		int _startState = 232;
		enterRecursionRule(_localctx, RULE_translationUnit);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1321); externalDeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(1327);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TranslationUnitContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_translationUnit);
					setState(1323);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(1324); externalDeclaration();
					}
					} 
				}
				setState(1329);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
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
		enterRule(_localctx, 234, RULE_externalDeclaration);
		try {
			setState(1334);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1330); functionDefinition();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1331); declaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1332); match(Semi);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1333); match(LineDirective);
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
		enterRule(_localctx, 236, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1337);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				{
				setState(1336); declarationSpecifiers();
				}
				break;
			}
			setState(1339); functionDeclarator();
			setState(1341);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 10) | (1L << 11) | (1L << 12) | (1L << 16) | (1L << 18) | (1L << Const) | (1L << Enum) | (1L << StaticAssert))) != 0) || _la==Identifier) {
				{
				setState(1340); declarationList(0);
				}
			}

			setState(1343); compoundStatement();
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

	public static class AtContext extends ParserRuleContext {
		public AtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_at; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).enterAt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SPOTListener ) ((SPOTListener)listener).exitAt(this);
		}
	}

	public final AtContext at() throws RecognitionException {
		AtContext _localctx = new AtContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_at);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1345); match(5);
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
		public AtContext at() {
			return getRuleContext(AtContext.class,0);
		}
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
		enterRule(_localctx, 240, RULE_functionDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1348);
			_la = _input.LA(1);
			if (_la==5) {
				{
				setState(1347); at();
				}
			}

			setState(1350); declarator();
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
		int _startState = 242;
		enterRecursionRule(_localctx, RULE_declarationList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1353); declaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(1359);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DeclarationListContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_declarationList);
					setState(1355);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(1356); declaration();
					}
					} 
				}
				setState(1361);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
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
		case 3: return genericAssocList_sempred((GenericAssocListContext)_localctx, predIndex);

		case 7: return postfixExpression_sempred((PostfixExpressionContext)_localctx, predIndex);

		case 8: return argumentExpressionList_sempred((ArgumentExpressionListContext)_localctx, predIndex);

		case 17: return multiplicativeExpression_sempred((MultiplicativeExpressionContext)_localctx, predIndex);

		case 20: return additiveExpression_sempred((AdditiveExpressionContext)_localctx, predIndex);

		case 23: return shiftExpression_sempred((ShiftExpressionContext)_localctx, predIndex);

		case 28: return relationalExpression_sempred((RelationalExpressionContext)_localctx, predIndex);

		case 31: return equalityExpression_sempred((EqualityExpressionContext)_localctx, predIndex);

		case 33: return andExpression_sempred((AndExpressionContext)_localctx, predIndex);

		case 35: return exclusiveOrExpression_sempred((ExclusiveOrExpressionContext)_localctx, predIndex);

		case 37: return inclusiveOrExpression_sempred((InclusiveOrExpressionContext)_localctx, predIndex);

		case 39: return logicalAndExpression_sempred((LogicalAndExpressionContext)_localctx, predIndex);

		case 41: return logicalOrExpression_sempred((LogicalOrExpressionContext)_localctx, predIndex);

		case 47: return expression_sempred((ExpressionContext)_localctx, predIndex);

		case 53: return initDeclaratorList_sempred((InitDeclaratorListContext)_localctx, predIndex);

		case 61: return classDeclarationList_sempred((ClassDeclarationListContext)_localctx, predIndex);

		case 70: return enumeratorList_sempred((EnumeratorListContext)_localctx, predIndex);

		case 79: return directDeclarator_sempred((DirectDeclaratorContext)_localctx, predIndex);

		case 86: return typeQualifierList_sempred((TypeQualifierListContext)_localctx, predIndex);

		case 89: return parameterList_sempred((ParameterListContext)_localctx, predIndex);

		case 91: return identifierList_sempred((IdentifierListContext)_localctx, predIndex);

		case 94: return directAbstractDeclarator_sempred((DirectAbstractDeclaratorContext)_localctx, predIndex);

		case 97: return initializerList_sempred((InitializerListContext)_localctx, predIndex);

		case 99: return designatorList_sempred((DesignatorListContext)_localctx, predIndex);

		case 105: return blockItemList_sempred((BlockItemListContext)_localctx, predIndex);

		case 116: return translationUnit_sempred((TranslationUnitContext)_localctx, predIndex);

		case 121: return declarationList_sempred((DeclarationListContext)_localctx, predIndex);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3y\u0555\4\2\t\2\4"+
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
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\3\2\3\2\3\3\5\3\u00fa\n\3\3\3\3\3\3\3\6\3"+
		"\u00ff\n\3\r\3\16\3\u0100\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u0109\n\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3"+
		"\u011d\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u012c"+
		"\n\5\f\5\16\5\u012f\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0138\n\6\3\7"+
		"\3\7\3\7\3\b\3\b\5\b\u013f\n\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0165\n\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0177\n\t\f\t\16\t\u017a"+
		"\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0183\n\n\f\n\16\n\u0186\13\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u019e\n\13\3\f\3\f\3\r\3\r"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\5\17\u01b2\n\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u01c9\n\23\f\23"+
		"\16\23\u01cc\13\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\7\26\u01dd\n\26\f\26\16\26\u01e0\13\26\3\27\3"+
		"\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7"+
		"\31\u01f1\n\31\f\31\16\31\u01f4\13\31\3\32\3\32\3\33\3\33\3\34\3\34\3"+
		"\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u0211\n\36\f\36\16\36\u0214\13"+
		"\36\3\37\3\37\3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\7!\u0225\n!\f!\16"+
		"!\u0228\13!\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\7#\u0233\n#\f#\16#\u0236\13#"+
		"\3$\3$\3%\3%\3%\3%\3%\3%\3%\7%\u0241\n%\f%\16%\u0244\13%\3&\3&\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\7\'\u024f\n\'\f\'\16\'\u0252\13\'\3(\3(\3)\3)\3)"+
		"\3)\3)\3)\3)\7)\u025d\n)\f)\16)\u0260\13)\3*\3*\3+\3+\3+\3+\3+\3+\3+\7"+
		"+\u026b\n+\f+\16+\u026e\13+\3,\3,\3-\3-\3.\3.\3.\3.\3.\3.\5.\u027a\n."+
		"\3/\3/\3/\3/\3/\5/\u0281\n/\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\7"+
		"\61\u028b\n\61\f\61\16\61\u028e\13\61\3\62\3\62\3\63\3\63\5\63\u0294\n"+
		"\63\3\63\3\63\3\63\5\63\u0299\n\63\3\64\6\64\u029c\n\64\r\64\16\64\u029d"+
		"\3\65\6\65\u02a1\n\65\r\65\16\65\u02a2\3\66\3\66\3\66\3\66\5\66\u02a9"+
		"\n\66\3\67\3\67\3\67\3\67\3\67\3\67\7\67\u02b1\n\67\f\67\16\67\u02b4\13"+
		"\67\38\38\39\39\39\39\39\59\u02bd\n9\3:\3:\3;\3;\3;\3<\3<\3<\5<\u02c7"+
		"\n<\3=\3=\3=\5=\u02cc\n=\3=\3=\5=\u02d0\n=\3=\3=\3>\3>\3>\3?\3?\3?\3?"+
		"\3?\7?\u02dc\n?\f?\16?\u02df\13?\3@\3@\3A\3A\3B\3B\3C\3C\3C\5C\u02ea\n"+
		"C\3D\3D\3E\5E\u02ef\nE\3E\5E\u02f2\nE\3E\3E\3E\3E\5E\u02f8\nE\3E\3E\5"+
		"E\u02fc\nE\3F\3F\5F\u0300\nF\3F\3F\5F\u0304\nF\5F\u0306\nF\3G\3G\5G\u030a"+
		"\nG\3G\3G\3G\3G\3G\3G\5G\u0312\nG\3G\3G\3G\3G\3G\3G\3G\5G\u031b\nG\3H"+
		"\3H\3H\3H\3H\3H\7H\u0323\nH\fH\16H\u0326\13H\3I\3I\3I\3I\3I\5I\u032d\n"+
		"I\3J\5J\u0330\nJ\3J\3J\3K\3K\3K\3K\3K\3L\3L\3M\3M\3N\3N\3N\3N\3N\3N\5"+
		"N\u0343\nN\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\5O\u034f\nO\3P\3P\3Q\3Q\3Q\3"+
		"Q\3Q\3Q\5Q\u0359\nQ\3Q\3Q\3Q\5Q\u035e\nQ\3Q\5Q\u0361\nQ\3Q\3Q\3Q\3Q\5"+
		"Q\u0367\nQ\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\5Q\u0373\nQ\3Q\3Q\7Q\u0377\n"+
		"Q\fQ\16Q\u037a\13Q\3R\3R\3R\6R\u037f\nR\rR\16R\u0380\3R\3R\5R\u0385\n"+
		"R\3S\3S\3S\3S\3S\3S\3S\3T\3T\3T\7T\u0391\nT\fT\16T\u0394\13T\3T\5T\u0397"+
		"\nT\3U\3U\3U\5U\u039c\nU\3U\5U\u039f\nU\3U\5U\u03a2\nU\3V\3V\3V\3V\3V"+
		"\7V\u03a9\nV\fV\16V\u03ac\13V\3W\3W\5W\u03b0\nW\3W\3W\5W\u03b4\nW\3W\3"+
		"W\3W\5W\u03b9\nW\3W\3W\5W\u03bd\nW\3W\5W\u03c0\nW\3X\3X\3X\3X\3X\7X\u03c7"+
		"\nX\fX\16X\u03ca\13X\3Y\3Y\3Y\3Y\3Y\5Y\u03d1\nY\3Z\3Z\3[\3[\3[\3[\3[\3"+
		"[\3[\7[\u03dc\n[\f[\16[\u03df\13[\3\\\3\\\3]\3]\3]\3]\3]\3]\7]\u03e9\n"+
		"]\f]\16]\u03ec\13]\3^\3^\5^\u03f0\n^\3_\3_\3`\3`\3`\3`\3`\3`\3`\5`\u03fb"+
		"\n`\3`\5`\u03fe\n`\3`\3`\3`\3`\5`\u0404\n`\3`\3`\3`\3`\3`\3`\3`\3`\3`"+
		"\3`\3`\3`\3`\3`\5`\u0414\n`\3`\5`\u0417\n`\3`\3`\3`\5`\u041c\n`\3`\5`"+
		"\u041f\n`\3`\3`\3`\3`\3`\5`\u0426\n`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`"+
		"\3`\3`\3`\3`\3`\3`\5`\u0439\n`\3`\7`\u043c\n`\f`\16`\u043f\13`\3a\3a\3"+
		"b\3b\3b\3b\3b\3b\3b\3b\3b\3b\5b\u044d\nb\3c\3c\5c\u0451\nc\3c\3c\3c\3"+
		"c\3c\5c\u0458\nc\3c\7c\u045b\nc\fc\16c\u045e\13c\3d\3d\3d\3e\3e\3e\3e"+
		"\3e\7e\u0468\ne\fe\16e\u046b\13e\3f\3f\3f\3f\3f\3f\5f\u0473\nf\3g\3g\3"+
		"g\3g\3g\6g\u047a\ng\rg\16g\u047b\3g\3g\3g\3h\3h\3h\3h\3h\3h\3h\3h\3h\3"+
		"h\3h\3h\7h\u048d\nh\fh\16h\u0490\13h\5h\u0492\nh\3h\3h\3h\3h\7h\u0498"+
		"\nh\fh\16h\u049b\13h\5h\u049d\nh\7h\u049f\nh\fh\16h\u04a2\13h\3h\3h\5"+
		"h\u04a6\nh\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\5i\u04b3\ni\3j\3j\5j\u04b7"+
		"\nj\3j\3j\3k\3k\3k\3k\3k\7k\u04c0\nk\fk\16k\u04c3\13k\3l\3l\3l\5l\u04c8"+
		"\nl\3m\5m\u04cb\nm\3m\3m\3n\3n\3n\3n\3n\3n\3n\5n\u04d6\nn\3n\3n\3n\3n"+
		"\3n\3n\5n\u04de\nn\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o"+
		"\5o\u04f1\no\3o\3o\5o\u04f5\no\3o\3o\5o\u04f9\no\3o\3o\3o\3o\3o\3o\5o"+
		"\u0501\no\3o\3o\5o\u0505\no\3o\3o\3o\5o\u050a\no\3p\3p\3q\3q\3r\3r\3s"+
		"\3s\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\5t\u0520\nt\3t\3t\5t\u0524\nt"+
		"\3u\5u\u0527\nu\3u\3u\3v\3v\3v\3v\3v\7v\u0530\nv\fv\16v\u0533\13v\3w\3"+
		"w\3w\3w\5w\u0539\nw\3x\5x\u053c\nx\3x\3x\5x\u0540\nx\3x\3x\3y\3y\3z\5"+
		"z\u0547\nz\3z\3z\3{\3{\3{\3{\3{\7{\u0550\n{\f{\16{\u0553\13{\3{\2|\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNP"+
		"RTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6"+
		"\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be"+
		"\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6"+
		"\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee"+
		"\u00f0\u00f2\u00f4\2\13\7\2OOQQSSVV[\\\3\2ak\4\2\3\3\f\f\5\2\16\16\22"+
		"\22\24\24\6\2\6\6\21\21\'\'@@\4\2CD``\3\2CD\4\2\13\13\20\20\4\2\25\25"+
		"\67\67\u0593\2\u00f6\3\2\2\2\4\u011c\3\2\2\2\6\u011e\3\2\2\2\b\u0125\3"+
		"\2\2\2\n\u0137\3\2\2\2\f\u0139\3\2\2\2\16\u013c\3\2\2\2\20\u0164\3\2\2"+
		"\2\22\u017b\3\2\2\2\24\u019d\3\2\2\2\26\u019f\3\2\2\2\30\u01a1\3\2\2\2"+
		"\32\u01a3\3\2\2\2\34\u01b1\3\2\2\2\36\u01b3\3\2\2\2 \u01b5\3\2\2\2\"\u01b7"+
		"\3\2\2\2$\u01b9\3\2\2\2&\u01cd\3\2\2\2(\u01cf\3\2\2\2*\u01d1\3\2\2\2,"+
		"\u01e1\3\2\2\2.\u01e3\3\2\2\2\60\u01e5\3\2\2\2\62\u01f5\3\2\2\2\64\u01f7"+
		"\3\2\2\2\66\u01f9\3\2\2\28\u01fb\3\2\2\2:\u01fd\3\2\2\2<\u0215\3\2\2\2"+
		">\u0217\3\2\2\2@\u0219\3\2\2\2B\u0229\3\2\2\2D\u022b\3\2\2\2F\u0237\3"+
		"\2\2\2H\u0239\3\2\2\2J\u0245\3\2\2\2L\u0247\3\2\2\2N\u0253\3\2\2\2P\u0255"+
		"\3\2\2\2R\u0261\3\2\2\2T\u0263\3\2\2\2V\u026f\3\2\2\2X\u0271\3\2\2\2Z"+
		"\u0273\3\2\2\2\\\u0280\3\2\2\2^\u0282\3\2\2\2`\u0284\3\2\2\2b\u028f\3"+
		"\2\2\2d\u0298\3\2\2\2f\u029b\3\2\2\2h\u02a0\3\2\2\2j\u02a8\3\2\2\2l\u02aa"+
		"\3\2\2\2n\u02b5\3\2\2\2p\u02bc\3\2\2\2r\u02be\3\2\2\2t\u02c0\3\2\2\2v"+
		"\u02c6\3\2\2\2x\u02c8\3\2\2\2z\u02d3\3\2\2\2|\u02d6\3\2\2\2~\u02e0\3\2"+
		"\2\2\u0080\u02e2\3\2\2\2\u0082\u02e4\3\2\2\2\u0084\u02e9\3\2\2\2\u0086"+
		"\u02eb\3\2\2\2\u0088\u02fb\3\2\2\2\u008a\u0305\3\2\2\2\u008c\u031a\3\2"+
		"\2\2\u008e\u031c\3\2\2\2\u0090\u032c\3\2\2\2\u0092\u032f\3\2\2\2\u0094"+
		"\u0333\3\2\2\2\u0096\u0338\3\2\2\2\u0098\u033a\3\2\2\2\u009a\u0342\3\2"+
		"\2\2\u009c\u034e\3\2\2\2\u009e\u0350\3\2\2\2\u00a0\u0358\3\2\2\2\u00a2"+
		"\u0384\3\2\2\2\u00a4\u0386\3\2\2\2\u00a6\u0396\3\2\2\2\u00a8\u03a1\3\2"+
		"\2\2\u00aa\u03aa\3\2\2\2\u00ac\u03bf\3\2\2\2\u00ae\u03c1\3\2\2\2\u00b0"+
		"\u03d0\3\2\2\2\u00b2\u03d2\3\2\2\2\u00b4\u03d4\3\2\2\2\u00b6\u03e0\3\2"+
		"\2\2\u00b8\u03e2\3\2\2\2\u00ba\u03ed\3\2\2\2\u00bc\u03f1\3\2\2\2\u00be"+
		"\u0416\3\2\2\2\u00c0\u0440\3\2\2\2\u00c2\u044c\3\2\2\2\u00c4\u044e\3\2"+
		"\2\2\u00c6\u045f\3\2\2\2\u00c8\u0462\3\2\2\2\u00ca\u0472\3\2\2\2\u00cc"+
		"\u0474\3\2\2\2\u00ce\u04a5\3\2\2\2\u00d0\u04b2\3\2\2\2\u00d2\u04b4\3\2"+
		"\2\2\u00d4\u04ba\3\2\2\2\u00d6\u04c7\3\2\2\2\u00d8\u04ca\3\2\2\2\u00da"+
		"\u04dd\3\2\2\2\u00dc\u0509\3\2\2\2\u00de\u050b\3\2\2\2\u00e0\u050d\3\2"+
		"\2\2\u00e2\u050f\3\2\2\2\u00e4\u0511\3\2\2\2\u00e6\u0523\3\2\2\2\u00e8"+
		"\u0526\3\2\2\2\u00ea\u052a\3\2\2\2\u00ec\u0538\3\2\2\2\u00ee\u053b\3\2"+
		"\2\2\u00f0\u0543\3\2\2\2\u00f2\u0546\3\2\2\2\u00f4\u054a\3\2\2\2\u00f6"+
		"\u00f7\7r\2\2\u00f7\3\3\2\2\2\u00f8\u00fa\5t;\2\u00f9\u00f8\3\2\2\2\u00f9"+
		"\u00fa\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u011d\7q\2\2\u00fc\u011d\5\2"+
		"\2\2\u00fd\u00ff\7s\2\2\u00fe\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100"+
		"\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u011d\3\2\2\2\u0102\u0103\7C"+
		"\2\2\u0103\u0104\5`\61\2\u0104\u0105\7D\2\2\u0105\u011d\3\2\2\2\u0106"+
		"\u011d\5\6\4\2\u0107\u0109\7\4\2\2\u0108\u0107\3\2\2\2\u0108\u0109\3\2"+
		"\2\2\u0109\u010a\3\2\2\2\u010a\u010b\7C\2\2\u010b\u010c\5\u00d2j\2\u010c"+
		"\u010d\7D\2\2\u010d\u011d\3\2\2\2\u010e\u010f\7\23\2\2\u010f\u0110\7C"+
		"\2\2\u0110\u0111\5\24\13\2\u0111\u0112\7`\2\2\u0112\u0113\5\u00ba^\2\u0113"+
		"\u0114\7D\2\2\u0114\u011d\3\2\2\2\u0115\u0116\7\b\2\2\u0116\u0117\7C\2"+
		"\2\u0117\u0118\5\u00ba^\2\u0118\u0119\7`\2\2\u0119\u011a\5\24\13\2\u011a"+
		"\u011b\7D\2\2\u011b\u011d\3\2\2\2\u011c\u00f9\3\2\2\2\u011c\u00fc\3\2"+
		"\2\2\u011c\u00fe\3\2\2\2\u011c\u0102\3\2\2\2\u011c\u0106\3\2\2\2\u011c"+
		"\u0108\3\2\2\2\u011c\u010e\3\2\2\2\u011c\u0115\3\2\2\2\u011d\5\3\2\2\2"+
		"\u011e\u011f\7>\2\2\u011f\u0120\7C\2\2\u0120\u0121\5\\/\2\u0121\u0122"+
		"\7`\2\2\u0122\u0123\5\b\5\2\u0123\u0124\7D\2\2\u0124\7\3\2\2\2\u0125\u0126"+
		"\b\5\1\2\u0126\u0127\5\n\6\2\u0127\u012d\3\2\2\2\u0128\u0129\6\5\2\3\u0129"+
		"\u012a\7`\2\2\u012a\u012c\5\n\6\2\u012b\u0128\3\2\2\2\u012c\u012f\3\2"+
		"\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\t\3\2\2\2\u012f\u012d"+
		"\3\2\2\2\u0130\u0131\5\u00ba^\2\u0131\u0132\7^\2\2\u0132\u0133\5\\/\2"+
		"\u0133\u0138\3\2\2\2\u0134\u0135\7\35\2\2\u0135\u0136\7^\2\2\u0136\u0138"+
		"\5\\/\2\u0137\u0130\3\2\2\2\u0137\u0134\3\2\2\2\u0138\13\3\2\2\2\u0139"+
		"\u013a\7o\2\2\u013a\u013b\7q\2\2\u013b\r\3\2\2\2\u013c\u013e\7C\2\2\u013d"+
		"\u013f\5\22\n\2\u013e\u013d\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\3"+
		"\2\2\2\u0140\u0141\5\32\16\2\u0141\17\3\2\2\2\u0142\u0143\b\t\1\2\u0143"+
		"\u0165\5\4\3\2\u0144\u0145\7C\2\2\u0145\u0146\5\u00ba^\2\u0146\u0147\7"+
		"D\2\2\u0147\u0148\7G\2\2\u0148\u0149\5\u00c4c\2\u0149\u014a\7H\2\2\u014a"+
		"\u0165\3\2\2\2\u014b\u014c\7C\2\2\u014c\u014d\5\u00ba^\2\u014d\u014e\7"+
		"D\2\2\u014e\u014f\7G\2\2\u014f\u0150\5\u00c4c\2\u0150\u0151\7`\2\2\u0151"+
		"\u0152\7H\2\2\u0152\u0165\3\2\2\2\u0153\u0154\7\4\2\2\u0154\u0155\7C\2"+
		"\2\u0155\u0156\5\u00ba^\2\u0156\u0157\7D\2\2\u0157\u0158\7G\2\2\u0158"+
		"\u0159\5\u00c4c\2\u0159\u015a\7H\2\2\u015a\u0165\3\2\2\2\u015b\u015c\7"+
		"\4\2\2\u015c\u015d\7C\2\2\u015d\u015e\5\u00ba^\2\u015e\u015f\7D\2\2\u015f"+
		"\u0160\7G\2\2\u0160\u0161\5\u00c4c\2\u0161\u0162\7`\2\2\u0162\u0163\7"+
		"H\2\2\u0163\u0165\3\2\2\2\u0164\u0142\3\2\2\2\u0164\u0144\3\2\2\2\u0164"+
		"\u014b\3\2\2\2\u0164\u0153\3\2\2\2\u0164\u015b\3\2\2\2\u0165\u0178\3\2"+
		"\2\2\u0166\u0167\6\t\3\3\u0167\u0168\7E\2\2\u0168\u0169\5`\61\2\u0169"+
		"\u016a\7F\2\2\u016a\u0177\3\2\2\2\u016b\u016c\6\t\4\3\u016c\u0177\5\16"+
		"\b\2\u016d\u016e\6\t\5\3\u016e\u0177\5\f\7\2\u016f\u0170\6\t\6\3\u0170"+
		"\u0171\7n\2\2\u0171\u0177\7q\2\2\u0172\u0173\6\t\7\3\u0173\u0177\7P\2"+
		"\2\u0174\u0175\6\t\b\3\u0175\u0177\7R\2\2\u0176\u0166\3\2\2\2\u0176\u016b"+
		"\3\2\2\2\u0176\u016d\3\2\2\2\u0176\u016f\3\2\2\2\u0176\u0172\3\2\2\2\u0176"+
		"\u0174\3\2\2\2\u0177\u017a\3\2\2\2\u0178\u0176\3\2\2\2\u0178\u0179\3\2"+
		"\2\2\u0179\21\3\2\2\2\u017a\u0178\3\2\2\2\u017b\u017c\b\n\1\2\u017c\u017d"+
		"\5\\/\2\u017d\u0184\3\2\2\2\u017e\u017f\6\n\t\3\u017f\u0180\5\u00b2Z\2"+
		"\u0180\u0181\5\\/\2\u0181\u0183\3\2\2\2\u0182\u017e\3\2\2\2\u0183\u0186"+
		"\3\2\2\2\u0184\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185\23\3\2\2\2\u0186"+
		"\u0184\3\2\2\2\u0187\u019e\5\20\t\2\u0188\u0189\7P\2\2\u0189\u019e\5\24"+
		"\13\2\u018a\u018b\7R\2\2\u018b\u019e\5\24\13\2\u018c\u018d\5\26\f\2\u018d"+
		"\u018e\5\34\17\2\u018e\u019e\3\2\2\2\u018f\u0190\7/\2\2\u0190\u019e\5"+
		"\24\13\2\u0191\u0192\7/\2\2\u0192\u0193\7C\2\2\u0193\u0194\5\u00ba^\2"+
		"\u0194\u0195\7D\2\2\u0195\u019e\3\2\2\2\u0196\u0197\7:\2\2\u0197\u0198"+
		"\7C\2\2\u0198\u0199\5\u00ba^\2\u0199\u019a\7D\2\2\u019a\u019e\3\2\2\2"+
		"\u019b\u019c\7X\2\2\u019c\u019e\7q\2\2\u019d\u0187\3\2\2\2\u019d\u0188"+
		"\3\2\2\2\u019d\u018a\3\2\2\2\u019d\u018c\3\2\2\2\u019d\u018f\3\2\2\2\u019d"+
		"\u0191\3\2\2\2\u019d\u0196\3\2\2\2\u019d\u019b\3\2\2\2\u019e\25\3\2\2"+
		"\2\u019f\u01a0\t\2\2\2\u01a0\27\3\2\2\2\u01a1\u01a2\7C\2\2\u01a2\31\3"+
		"\2\2\2\u01a3\u01a4\7D\2\2\u01a4\33\3\2\2\2\u01a5\u01b2\5\24\13\2\u01a6"+
		"\u01a7\5\30\r\2\u01a7\u01a8\5\u00ba^\2\u01a8\u01a9\5\32\16\2\u01a9\u01aa"+
		"\5\34\17\2\u01aa\u01b2\3\2\2\2\u01ab\u01ac\7\4\2\2\u01ac\u01ad\5\30\r"+
		"\2\u01ad\u01ae\5\u00ba^\2\u01ae\u01af\5\32\16\2\u01af\u01b0\5\34\17\2"+
		"\u01b0\u01b2\3\2\2\2\u01b1\u01a5\3\2\2\2\u01b1\u01a6\3\2\2\2\u01b1\u01ab"+
		"\3\2\2\2\u01b2\35\3\2\2\2\u01b3\u01b4\7S\2\2\u01b4\37\3\2\2\2\u01b5\u01b6"+
		"\7T\2\2\u01b6!\3\2\2\2\u01b7\u01b8\7U\2\2\u01b8#\3\2\2\2\u01b9\u01ba\b"+
		"\23\1\2\u01ba\u01bb\5\34\17\2\u01bb\u01ca\3\2\2\2\u01bc\u01bd\6\23\n\3"+
		"\u01bd\u01be\5\36\20\2\u01be\u01bf\5\34\17\2\u01bf\u01c9\3\2\2\2\u01c0"+
		"\u01c1\6\23\13\3\u01c1\u01c2\5 \21\2\u01c2\u01c3\5\34\17\2\u01c3\u01c9"+
		"\3\2\2\2\u01c4\u01c5\6\23\f\3\u01c5\u01c6\5\"\22\2\u01c6\u01c7\5\34\17"+
		"\2\u01c7\u01c9\3\2\2\2\u01c8\u01bc\3\2\2\2\u01c8\u01c0\3\2\2\2\u01c8\u01c4"+
		"\3\2\2\2\u01c9\u01cc\3\2\2\2\u01ca\u01c8\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb"+
		"%\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cd\u01ce\7O\2\2\u01ce\'\3\2\2\2\u01cf"+
		"\u01d0\7Q\2\2\u01d0)\3\2\2\2\u01d1\u01d2\b\26\1\2\u01d2\u01d3\5$\23\2"+
		"\u01d3\u01de\3\2\2\2\u01d4\u01d5\6\26\r\3\u01d5\u01d6\5&\24\2\u01d6\u01d7"+
		"\5$\23\2\u01d7\u01dd\3\2\2\2\u01d8\u01d9\6\26\16\3\u01d9\u01da\5(\25\2"+
		"\u01da\u01db\5$\23\2\u01db\u01dd\3\2\2\2\u01dc\u01d4\3\2\2\2\u01dc\u01d8"+
		"\3\2\2\2\u01dd\u01e0\3\2\2\2\u01de\u01dc\3\2\2\2\u01de\u01df\3\2\2\2\u01df"+
		"+\3\2\2\2\u01e0\u01de\3\2\2\2\u01e1\u01e2\7M\2\2\u01e2-\3\2\2\2\u01e3"+
		"\u01e4\7N\2\2\u01e4/\3\2\2\2\u01e5\u01e6\b\31\1\2\u01e6\u01e7\5*\26\2"+
		"\u01e7\u01f2\3\2\2\2\u01e8\u01e9\6\31\17\3\u01e9\u01ea\5,\27\2\u01ea\u01eb"+
		"\5*\26\2\u01eb\u01f1\3\2\2\2\u01ec\u01ed\6\31\20\3\u01ed\u01ee\5.\30\2"+
		"\u01ee\u01ef\5*\26\2\u01ef\u01f1\3\2\2\2\u01f0\u01e8\3\2\2\2\u01f0\u01ec"+
		"\3\2\2\2\u01f1\u01f4\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3"+
		"\61\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f5\u01f6\7I\2\2\u01f6\63\3\2\2\2\u01f7"+
		"\u01f8\7K\2\2\u01f8\65\3\2\2\2\u01f9\u01fa\7J\2\2\u01fa\67\3\2\2\2\u01fb"+
		"\u01fc\7L\2\2\u01fc9\3\2\2\2\u01fd\u01fe\b\36\1\2\u01fe\u01ff\5\60\31"+
		"\2\u01ff\u0212\3\2\2\2\u0200\u0201\6\36\21\3\u0201\u0202\5\62\32\2\u0202"+
		"\u0203\5\60\31\2\u0203\u0211\3\2\2\2\u0204\u0205\6\36\22\3\u0205\u0206"+
		"\5\64\33\2\u0206\u0207\5\60\31\2\u0207\u0211\3\2\2\2\u0208\u0209\6\36"+
		"\23\3\u0209\u020a\5\66\34\2\u020a\u020b\5\60\31\2\u020b\u0211\3\2\2\2"+
		"\u020c\u020d\6\36\24\3\u020d\u020e\58\35\2\u020e\u020f\5\60\31\2\u020f"+
		"\u0211\3\2\2\2\u0210\u0200\3\2\2\2\u0210\u0204\3\2\2\2\u0210\u0208\3\2"+
		"\2\2\u0210\u020c\3\2\2\2\u0211\u0214\3\2\2\2\u0212\u0210\3\2\2\2\u0212"+
		"\u0213\3\2\2\2\u0213;\3\2\2\2\u0214\u0212\3\2\2\2\u0215\u0216\7l\2\2\u0216"+
		"=\3\2\2\2\u0217\u0218\7m\2\2\u0218?\3\2\2\2\u0219\u021a\b!\1\2\u021a\u021b"+
		"\5:\36\2\u021b\u0226\3\2\2\2\u021c\u021d\6!\25\3\u021d\u021e\5<\37\2\u021e"+
		"\u021f\5:\36\2\u021f\u0225\3\2\2\2\u0220\u0221\6!\26\3\u0221\u0222\5>"+
		" \2\u0222\u0223\5:\36\2\u0223\u0225\3\2\2\2\u0224\u021c\3\2\2\2\u0224"+
		"\u0220\3\2\2\2\u0225\u0228\3\2\2\2\u0226\u0224\3\2\2\2\u0226\u0227\3\2"+
		"\2\2\u0227A\3\2\2\2\u0228\u0226\3\2\2\2\u0229\u022a\7V\2\2\u022aC\3\2"+
		"\2\2\u022b\u022c\b#\1\2\u022c\u022d\5@!\2\u022d\u0234\3\2\2\2\u022e\u022f"+
		"\6#\27\3\u022f\u0230\5B\"\2\u0230\u0231\5@!\2\u0231\u0233\3\2\2\2\u0232"+
		"\u022e\3\2\2\2\u0233\u0236\3\2\2\2\u0234\u0232\3\2\2\2\u0234\u0235\3\2"+
		"\2\2\u0235E\3\2\2\2\u0236\u0234\3\2\2\2\u0237\u0238\7Z\2\2\u0238G\3\2"+
		"\2\2\u0239\u023a\b%\1\2\u023a\u023b\5D#\2\u023b\u0242\3\2\2\2\u023c\u023d"+
		"\6%\30\3\u023d\u023e\5F$\2\u023e\u023f\5D#\2\u023f\u0241\3\2\2\2\u0240"+
		"\u023c\3\2\2\2\u0241\u0244\3\2\2\2\u0242\u0240\3\2\2\2\u0242\u0243\3\2"+
		"\2\2\u0243I\3\2\2\2\u0244\u0242\3\2\2\2\u0245\u0246\7W\2\2\u0246K\3\2"+
		"\2\2\u0247\u0248\b\'\1\2\u0248\u0249\5H%\2\u0249\u0250\3\2\2\2\u024a\u024b"+
		"\6\'\31\3\u024b\u024c\5J&\2\u024c\u024d\5H%\2\u024d\u024f\3\2\2\2\u024e"+
		"\u024a\3\2\2\2\u024f\u0252\3\2\2\2\u0250\u024e\3\2\2\2\u0250\u0251\3\2"+
		"\2\2\u0251M\3\2\2\2\u0252\u0250\3\2\2\2\u0253\u0254\7X\2\2\u0254O\3\2"+
		"\2\2\u0255\u0256\b)\1\2\u0256\u0257\5L\'\2\u0257\u025e\3\2\2\2\u0258\u0259"+
		"\6)\32\3\u0259\u025a\5N(\2\u025a\u025b\5L\'\2\u025b\u025d\3\2\2\2\u025c"+
		"\u0258\3\2\2\2\u025d\u0260\3\2\2\2\u025e\u025c\3\2\2\2\u025e\u025f\3\2"+
		"\2\2\u025fQ\3\2\2\2\u0260\u025e\3\2\2\2\u0261\u0262\7Y\2\2\u0262S\3\2"+
		"\2\2\u0263\u0264\b+\1\2\u0264\u0265\5P)\2\u0265\u026c\3\2\2\2\u0266\u0267"+
		"\6+\33\3\u0267\u0268\5R*\2\u0268\u0269\5P)\2\u0269\u026b\3\2\2\2\u026a"+
		"\u0266\3\2\2\2\u026b\u026e\3\2\2\2\u026c\u026a\3\2\2\2\u026c\u026d\3\2"+
		"\2\2\u026dU\3\2\2\2\u026e\u026c\3\2\2\2\u026f\u0270\7]\2\2\u0270W\3\2"+
		"\2\2\u0271\u0272\7^\2\2\u0272Y\3\2\2\2\u0273\u0279\5T+\2\u0274\u0275\5"+
		"V,\2\u0275\u0276\5`\61\2\u0276\u0277\5X-\2\u0277\u0278\5Z.\2\u0278\u027a"+
		"\3\2\2\2\u0279\u0274\3\2\2\2\u0279\u027a\3\2\2\2\u027a[\3\2\2\2\u027b"+
		"\u0281\5Z.\2\u027c\u027d\5\24\13\2\u027d\u027e\5^\60\2\u027e\u027f\5\\"+
		"/\2\u027f\u0281\3\2\2\2\u0280\u027b\3\2\2\2\u0280\u027c\3\2\2\2\u0281"+
		"]\3\2\2\2\u0282\u0283\t\3\2\2\u0283_\3\2\2\2\u0284\u0285\b\61\1\2\u0285"+
		"\u0286\5\\/\2\u0286\u028c\3\2\2\2\u0287\u0288\6\61\34\3\u0288\u0289\7"+
		"`\2\2\u0289\u028b\5\\/\2\u028a\u0287\3\2\2\2\u028b\u028e\3\2\2\2\u028c"+
		"\u028a\3\2\2\2\u028c\u028d\3\2\2\2\u028da\3\2\2\2\u028e\u028c\3\2\2\2"+
		"\u028f\u0290\5Z.\2\u0290c\3\2\2\2\u0291\u0293\5f\64\2\u0292\u0294\5l\67"+
		"\2\u0293\u0292\3\2\2\2\u0293\u0294\3\2\2\2\u0294\u0295\3\2\2\2\u0295\u0296"+
		"\7_\2\2\u0296\u0299\3\2\2\2\u0297\u0299\5\u00ccg\2\u0298\u0291\3\2\2\2"+
		"\u0298\u0297\3\2\2\2\u0299e\3\2\2\2\u029a\u029c\5j\66\2\u029b\u029a\3"+
		"\2\2\2\u029c\u029d\3\2\2\2\u029d\u029b\3\2\2\2\u029d\u029e\3\2\2\2\u029e"+
		"g\3\2\2\2\u029f\u02a1\5j\66\2\u02a0\u029f\3\2\2\2\u02a1\u02a2\3\2\2\2"+
		"\u02a2\u02a0\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3i\3\2\2\2\u02a4\u02a9\5"+
		"r:\2\u02a5\u02a9\5v<\2\u02a6\u02a9\5\u0096L\2\u02a7\u02a9\5\u0098M\2\u02a8"+
		"\u02a4\3\2\2\2\u02a8\u02a5\3\2\2\2\u02a8\u02a6\3\2\2\2\u02a8\u02a7\3\2"+
		"\2\2\u02a9k\3\2\2\2\u02aa\u02ab\b\67\1\2\u02ab\u02ac\5p9\2\u02ac\u02b2"+
		"\3\2\2\2\u02ad\u02ae\6\67\35\3\u02ae\u02af\7`\2\2\u02af\u02b1\5p9\2\u02b0"+
		"\u02ad\3\2\2\2\u02b1\u02b4\3\2\2\2\u02b2\u02b0\3\2\2\2\u02b2\u02b3\3\2"+
		"\2\2\u02b3m\3\2\2\2\u02b4\u02b2\3\2\2\2\u02b5\u02b6\7a\2\2\u02b6o\3\2"+
		"\2\2\u02b7\u02bd\5\u009eP\2\u02b8\u02b9\5\u009eP\2\u02b9\u02ba\5n8\2\u02ba"+
		"\u02bb\5\u00c2b\2\u02bb\u02bd\3\2\2\2\u02bc\u02b7\3\2\2\2\u02bc\u02b8"+
		"\3\2\2\2\u02bdq\3\2\2\2\u02be\u02bf\t\4\2\2\u02bfs\3\2\2\2\u02c0\u02c1"+
		"\7q\2\2\u02c1\u02c2\7^\2\2\u02c2u\3\2\2\2\u02c3\u02c7\5t;\2\u02c4\u02c7"+
		"\5\u008cG\2\u02c5\u02c7\5x=\2\u02c6\u02c3\3\2\2\2\u02c6\u02c4\3\2\2\2"+
		"\u02c6\u02c5\3\2\2\2\u02c7w\3\2\2\2\u02c8\u02c9\7\r\2\2\u02c9\u02cb\7"+
		"q\2\2\u02ca\u02cc\5z>\2\u02cb\u02ca\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc"+
		"\u02cd\3\2\2\2\u02cd\u02cf\7G\2\2\u02ce\u02d0\5|?\2\u02cf\u02ce\3\2\2"+
		"\2\u02cf\u02d0\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1\u02d2\7H\2\2\u02d2y\3"+
		"\2\2\2\u02d3\u02d4\7^\2\2\u02d4\u02d5\5\u00b8]\2\u02d5{\3\2\2\2\u02d6"+
		"\u02d7\b?\1\2\u02d7\u02d8\5\u0088E\2\u02d8\u02dd\3\2\2\2\u02d9\u02da\6"+
		"?\36\3\u02da\u02dc\5\u0088E\2\u02db\u02d9\3\2\2\2\u02dc\u02df\3\2\2\2"+
		"\u02dd\u02db\3\2\2\2\u02dd\u02de\3\2\2\2\u02de}\3\2\2\2\u02df\u02dd\3"+
		"\2\2\2\u02e0\u02e1\7\17\2\2\u02e1\177\3\2\2\2\u02e2\u02e3\7\5\2\2\u02e3"+
		"\u0081\3\2\2\2\u02e4\u02e5\7\26\2\2\u02e5\u0083\3\2\2\2\u02e6\u02ea\5"+
		"~@\2\u02e7\u02ea\5\u0080A\2\u02e8\u02ea\5\u0082B\2\u02e9\u02e6\3\2\2\2"+
		"\u02e9\u02e7\3\2\2\2\u02e9\u02e8\3\2\2\2\u02ea\u0085\3\2\2\2\u02eb\u02ec"+
		"\7_\2\2\u02ec\u0087\3\2\2\2\u02ed\u02ef\5\u0084C\2\u02ee\u02ed\3\2\2\2"+
		"\u02ee\u02ef\3\2\2\2\u02ef\u02f1\3\2\2\2\u02f0\u02f2\5t;\2\u02f1\u02f0"+
		"\3\2\2\2\u02f1\u02f2\3\2\2\2\u02f2\u02f3\3\2\2\2\u02f3\u02f4\5\u00b8]"+
		"\2\u02f4\u02f5\5\u0086D\2\u02f5\u02fc\3\2\2\2\u02f6\u02f8\5\u0084C\2\u02f7"+
		"\u02f6\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9\u02fc\5\u00ee"+
		"x\2\u02fa\u02fc\7t\2\2\u02fb\u02ee\3\2\2\2\u02fb\u02f7\3\2\2\2\u02fb\u02fa"+
		"\3\2\2\2\u02fc\u0089\3\2\2\2\u02fd\u02ff\5v<\2\u02fe\u0300\5\u008aF\2"+
		"\u02ff\u02fe\3\2\2\2\u02ff\u0300\3\2\2\2\u0300\u0306\3\2\2\2\u0301\u0303"+
		"\5\u0096L\2\u0302\u0304\5\u008aF\2\u0303\u0302\3\2\2\2\u0303\u0304\3\2"+
		"\2\2\u0304\u0306\3\2\2\2\u0305\u02fd\3\2\2\2\u0305\u0301\3\2\2\2\u0306"+
		"\u008b\3\2\2\2\u0307\u0309\7!\2\2\u0308\u030a\7q\2\2\u0309\u0308\3\2\2"+
		"\2\u0309\u030a\3\2\2\2\u030a\u030b\3\2\2\2\u030b\u030c\7G\2\2\u030c\u030d"+
		"\5\u008eH\2\u030d\u030e\7H\2\2\u030e\u031b\3\2\2\2\u030f\u0311\7!\2\2"+
		"\u0310\u0312\7q\2\2\u0311\u0310\3\2\2\2\u0311\u0312\3\2\2\2\u0312\u0313"+
		"\3\2\2\2\u0313\u0314\7G\2\2\u0314\u0315\5\u008eH\2\u0315\u0316\7`\2\2"+
		"\u0316\u0317\7H\2\2\u0317\u031b\3\2\2\2\u0318\u0319\7!\2\2\u0319\u031b"+
		"\7q\2\2\u031a\u0307\3\2\2\2\u031a\u030f\3\2\2\2\u031a\u0318\3\2\2\2\u031b"+
		"\u008d\3\2\2\2\u031c\u031d\bH\1\2\u031d\u031e\5\u0090I\2\u031e\u0324\3"+
		"\2\2\2\u031f\u0320\6H\37\3\u0320\u0321\7`\2\2\u0321\u0323\5\u0090I\2\u0322"+
		"\u031f\3\2\2\2\u0323\u0326\3\2\2\2\u0324\u0322\3\2\2\2\u0324\u0325\3\2"+
		"\2\2\u0325\u008f\3\2\2\2\u0326\u0324\3\2\2\2\u0327\u032d\5\u0092J\2\u0328"+
		"\u0329\5\u0092J\2\u0329\u032a\7a\2\2\u032a\u032b\5b\62\2\u032b\u032d\3"+
		"\2\2\2\u032c\u0327\3\2\2\2\u032c\u0328\3\2\2\2\u032d\u0091\3\2\2\2\u032e"+
		"\u0330\5t;\2\u032f\u032e\3\2\2\2\u032f\u0330\3\2\2\2\u0330\u0331\3\2\2"+
		"\2\u0331\u0332\7q\2\2\u0332\u0093\3\2\2\2\u0333\u0334\7;\2\2\u0334\u0335"+
		"\7C\2\2\u0335\u0336\5\u00ba^\2\u0336\u0337\7D\2\2\u0337\u0095\3\2\2\2"+
		"\u0338\u0339\7\33\2\2\u0339\u0097\3\2\2\2\u033a\u033b\t\5\2\2\u033b\u0099"+
		"\3\2\2\2\u033c\u0343\t\6\2\2\u033d\u0343\5\u00a4S\2\u033e\u033f\7\n\2"+
		"\2\u033f\u0340\7C\2\2\u0340\u0341\7q\2\2\u0341\u0343\7D\2\2\u0342\u033c"+
		"\3\2\2\2\u0342\u033d\3\2\2\2\u0342\u033e\3\2\2\2\u0343\u009b\3\2\2\2\u0344"+
		"\u0345\79\2\2\u0345\u0346\7C\2\2\u0346\u0347\5\u00ba^\2\u0347\u0348\7"+
		"D\2\2\u0348\u034f\3\2\2\2\u0349\u034a\79\2\2\u034a\u034b\7C\2\2\u034b"+
		"\u034c\5b\62\2\u034c\u034d\7D\2\2\u034d\u034f\3\2\2\2\u034e\u0344\3\2"+
		"\2\2\u034e\u0349\3\2\2\2\u034f\u009d\3\2\2\2\u0350\u0351\5\u00a0Q\2\u0351"+
		"\u009f\3\2\2\2\u0352\u0353\bQ\1\2\u0353\u0359\7q\2\2\u0354\u0355\5\30"+
		"\r\2\u0355\u0356\5\u009eP\2\u0356\u0357\5\32\16\2\u0357\u0359\3\2\2\2"+
		"\u0358\u0352\3\2\2\2\u0358\u0354\3\2\2\2\u0359\u0378\3\2\2\2\u035a\u035b"+
		"\6Q \3\u035b\u035d\7E\2\2\u035c\u035e\5\u00aeX\2\u035d\u035c\3\2\2\2\u035d"+
		"\u035e\3\2\2\2\u035e\u0360\3\2\2\2\u035f\u0361\5\\/\2\u0360\u035f\3\2"+
		"\2\2\u0360\u0361\3\2\2\2\u0361\u0362\3\2\2\2\u0362\u0377\7F\2\2\u0363"+
		"\u0364\6Q!\3\u0364\u0366\7E\2\2\u0365\u0367\5\u00aeX\2\u0366\u0365\3\2"+
		"\2\2\u0366\u0367\3\2\2\2\u0367\u0368\3\2\2\2\u0368\u0369\7S\2\2\u0369"+
		"\u0377\7F\2\2\u036a\u036b\6Q\"\3\u036b\u036c\5\30\r\2\u036c\u036d\5\u00b0"+
		"Y\2\u036d\u036e\5\32\16\2\u036e\u0377\3\2\2\2\u036f\u0370\6Q#\3\u0370"+
		"\u0372\5\30\r\2\u0371\u0373\5\u00b8]\2\u0372\u0371\3\2\2\2\u0372\u0373"+
		"\3\2\2\2\u0373\u0374\3\2\2\2\u0374\u0375\5\32\16\2\u0375\u0377\3\2\2\2"+
		"\u0376\u035a\3\2\2\2\u0376\u0363\3\2\2\2\u0376\u036a\3\2\2\2\u0376\u036f"+
		"\3\2\2\2\u0377\u037a\3\2\2\2\u0378\u0376\3\2\2\2\u0378\u0379\3\2\2\2\u0379"+
		"\u00a1\3\2\2\2\u037a\u0378\3\2\2\2\u037b\u037c\7\20\2\2\u037c\u037e\7"+
		"C\2\2\u037d\u037f\7s\2\2\u037e\u037d\3\2\2\2\u037f\u0380\3\2\2\2\u0380"+
		"\u037e\3\2\2\2\u0380\u0381\3\2\2\2\u0381\u0382\3\2\2\2\u0382\u0385\7D"+
		"\2\2\u0383\u0385\5\u00a4S\2\u0384\u037b\3\2\2\2\u0384\u0383\3\2\2\2\u0385"+
		"\u00a3\3\2\2\2\u0386\u0387\7\t\2\2\u0387\u0388\7C\2\2\u0388\u0389\7C\2"+
		"\2\u0389\u038a\5\u00a6T\2\u038a\u038b\7D\2\2\u038b\u038c\7D\2\2\u038c"+
		"\u00a5\3\2\2\2\u038d\u0392\5\u00a8U\2\u038e\u038f\7`\2\2\u038f\u0391\5"+
		"\u00a8U\2\u0390\u038e\3\2\2\2\u0391\u0394\3\2\2\2\u0392\u0390\3\2\2\2"+
		"\u0392\u0393\3\2\2\2\u0393\u0397\3\2\2\2\u0394\u0392\3\2\2\2\u0395\u0397"+
		"\3\2\2\2\u0396\u038d\3\2\2\2\u0396\u0395\3\2\2\2\u0397\u00a7\3\2\2\2\u0398"+
		"\u039e\n\7\2\2\u0399\u039b\7C\2\2\u039a\u039c\5\22\n\2\u039b\u039a\3\2"+
		"\2\2\u039b\u039c\3\2\2\2\u039c\u039d\3\2\2\2\u039d\u039f\7D\2\2\u039e"+
		"\u0399\3\2\2\2\u039e\u039f\3\2\2\2\u039f\u03a2\3\2\2\2\u03a0\u03a2\3\2"+
		"\2\2\u03a1\u0398\3\2\2\2\u03a1\u03a0\3\2\2\2\u03a2\u00a9\3\2\2\2\u03a3"+
		"\u03a9\n\b\2\2\u03a4\u03a5\7C\2\2\u03a5\u03a6\5\u00aaV\2\u03a6\u03a7\7"+
		"D\2\2\u03a7\u03a9\3\2\2\2\u03a8\u03a3\3\2\2\2\u03a8\u03a4\3\2\2\2\u03a9"+
		"\u03ac\3\2\2\2\u03aa\u03a8\3\2\2\2\u03aa\u03ab\3\2\2\2\u03ab\u00ab\3\2"+
		"\2\2\u03ac\u03aa\3\2\2\2\u03ad\u03af\7S\2\2\u03ae\u03b0\5\u00aeX\2\u03af"+
		"\u03ae\3\2\2\2\u03af\u03b0\3\2\2\2\u03b0\u03c0\3\2\2\2\u03b1\u03b3\7S"+
		"\2\2\u03b2\u03b4\5\u00aeX\2\u03b3\u03b2\3\2\2\2\u03b3\u03b4\3\2\2\2\u03b4"+
		"\u03b5\3\2\2\2\u03b5\u03c0\5\u00acW\2\u03b6\u03b8\7Z\2\2\u03b7\u03b9\5"+
		"\u00aeX\2\u03b8\u03b7\3\2\2\2\u03b8\u03b9\3\2\2\2\u03b9\u03c0\3\2\2\2"+
		"\u03ba\u03bc\7Z\2\2\u03bb\u03bd\5\u00aeX\2\u03bc\u03bb\3\2\2\2\u03bc\u03bd"+
		"\3\2\2\2\u03bd\u03be\3\2\2\2\u03be\u03c0\5\u00acW\2\u03bf\u03ad\3\2\2"+
		"\2\u03bf\u03b1\3\2\2\2\u03bf\u03b6\3\2\2\2\u03bf\u03ba\3\2\2\2\u03c0\u00ad"+
		"\3\2\2\2\u03c1\u03c2\bX\1\2\u03c2\u03c3\5\u0096L\2\u03c3\u03c8\3\2\2\2"+
		"\u03c4\u03c5\6X$\3\u03c5\u03c7\5\u0096L\2\u03c6\u03c4\3\2\2\2\u03c7\u03ca"+
		"\3\2\2\2\u03c8\u03c6\3\2\2\2\u03c8\u03c9\3\2\2\2\u03c9\u00af\3\2\2\2\u03ca"+
		"\u03c8\3\2\2\2\u03cb\u03d1\5\u00b4[\2\u03cc\u03cd\5\u00b4[\2\u03cd\u03ce"+
		"\7`\2\2\u03ce\u03cf\7p\2\2\u03cf\u03d1\3\2\2\2\u03d0\u03cb\3\2\2\2\u03d0"+
		"\u03cc\3\2\2\2\u03d1\u00b1\3\2\2\2\u03d2\u03d3\7`\2\2\u03d3\u00b3\3\2"+
		"\2\2\u03d4\u03d5\b[\1\2\u03d5\u03d6\5\u00b6\\\2\u03d6\u03dd\3\2\2\2\u03d7"+
		"\u03d8\6[%\3\u03d8\u03d9\5\u00b2Z\2\u03d9\u03da\5\u00b6\\\2\u03da\u03dc"+
		"\3\2\2\2\u03db\u03d7\3\2\2\2\u03dc\u03df\3\2\2\2\u03dd\u03db\3\2\2\2\u03dd"+
		"\u03de\3\2\2\2\u03de\u00b5\3\2\2\2\u03df\u03dd\3\2\2\2\u03e0\u03e1\5\\"+
		"/\2\u03e1\u00b7\3\2\2\2\u03e2\u03e3\b]\1\2\u03e3\u03e4\7q\2\2\u03e4\u03ea"+
		"\3\2\2\2\u03e5\u03e6\6]&\3\u03e6\u03e7\7`\2\2\u03e7\u03e9\7q\2\2\u03e8"+
		"\u03e5\3\2\2\2\u03e9\u03ec\3\2\2\2\u03ea\u03e8\3\2\2\2\u03ea\u03eb\3\2"+
		"\2\2\u03eb\u00b9\3\2\2\2\u03ec\u03ea\3\2\2\2\u03ed\u03ef\5\u008aF\2\u03ee"+
		"\u03f0\5\u00bc_\2\u03ef\u03ee\3\2\2\2\u03ef\u03f0\3\2\2\2\u03f0\u00bb"+
		"\3\2\2\2\u03f1\u03f2\5\u00be`\2\u03f2\u00bd\3\2\2\2\u03f3\u03f4\b`\1\2"+
		"\u03f4\u03f5\7C\2\2\u03f5\u03f6\5\u00bc_\2\u03f6\u03f7\7D\2\2\u03f7\u0417"+
		"\3\2\2\2\u03f8\u03fa\7E\2\2\u03f9\u03fb\5\u00aeX\2\u03fa\u03f9\3\2\2\2"+
		"\u03fa\u03fb\3\2\2\2\u03fb\u03fd\3\2\2\2\u03fc\u03fe\5\\/\2\u03fd\u03fc"+
		"\3\2\2\2\u03fd\u03fe\3\2\2\2\u03fe\u03ff\3\2\2\2\u03ff\u0417\7F\2\2\u0400"+
		"\u0401\7E\2\2\u0401\u0403\7\60\2\2\u0402\u0404\5\u00aeX\2\u0403\u0402"+
		"\3\2\2\2\u0403\u0404\3\2\2\2\u0404\u0405\3\2\2\2\u0405\u0406\5\\/\2\u0406"+
		"\u0407\7F\2\2\u0407\u0417\3\2\2\2\u0408\u0409\7E\2\2\u0409\u040a\5\u00ae"+
		"X\2\u040a\u040b\7\60\2\2\u040b\u040c\5\\/\2\u040c\u040d\7F\2\2\u040d\u0417"+
		"\3\2\2\2\u040e\u040f\7E\2\2\u040f\u0410\7S\2\2\u0410\u0417\7F\2\2\u0411"+
		"\u0413\7C\2\2\u0412\u0414\5\u00b0Y\2\u0413\u0412\3\2\2\2\u0413\u0414\3"+
		"\2\2\2\u0414\u0415\3\2\2\2\u0415\u0417\7D\2\2\u0416\u03f3\3\2\2\2\u0416"+
		"\u03f8\3\2\2\2\u0416\u0400\3\2\2\2\u0416\u0408\3\2\2\2\u0416\u040e\3\2"+
		"\2\2\u0416\u0411\3\2\2\2\u0417\u043d\3\2\2\2\u0418\u0419\6`\'\3\u0419"+
		"\u041b\7E\2\2\u041a\u041c\5\u00aeX\2\u041b\u041a\3\2\2\2\u041b\u041c\3"+
		"\2\2\2\u041c\u041e\3\2\2\2\u041d\u041f\5\\/\2\u041e\u041d\3\2\2\2\u041e"+
		"\u041f\3\2\2\2\u041f\u0420\3\2\2\2\u0420\u043c\7F\2\2\u0421\u0422\6`("+
		"\3\u0422\u0423\7E\2\2\u0423\u0425\7\60\2\2\u0424\u0426\5\u00aeX\2\u0425"+
		"\u0424\3\2\2\2\u0425\u0426\3\2\2\2\u0426\u0427\3\2\2\2\u0427\u0428\5\\"+
		"/\2\u0428\u0429\7F\2\2\u0429\u043c\3\2\2\2\u042a\u042b\6`)\3\u042b\u042c"+
		"\7E\2\2\u042c\u042d\5\u00aeX\2\u042d\u042e\7\60\2\2\u042e\u042f\5\\/\2"+
		"\u042f\u0430\7F\2\2\u0430\u043c\3\2\2\2\u0431\u0432\6`*\3\u0432\u0433"+
		"\7E\2\2\u0433\u0434\7S\2\2\u0434\u043c\7F\2\2\u0435\u0436\6`+\3\u0436"+
		"\u0438\7C\2\2\u0437\u0439\5\u00b0Y\2\u0438\u0437\3\2\2\2\u0438\u0439\3"+
		"\2\2\2\u0439\u043a\3\2\2\2\u043a\u043c\7D\2\2\u043b\u0418\3\2\2\2\u043b"+
		"\u0421\3\2\2\2\u043b\u042a\3\2\2\2\u043b\u0431\3\2\2\2\u043b\u0435\3\2"+
		"\2\2\u043c\u043f\3\2\2\2\u043d\u043b\3\2\2\2\u043d\u043e\3\2\2\2\u043e"+
		"\u00bf\3\2\2\2\u043f\u043d\3\2\2\2\u0440\u0441\7q\2\2\u0441\u00c1\3\2"+
		"\2\2\u0442\u044d\5\\/\2\u0443\u0444\7G\2\2\u0444\u0445\5\u00c4c\2\u0445"+
		"\u0446\7H\2\2\u0446\u044d\3\2\2\2\u0447\u0448\7G\2\2\u0448\u0449\5\u00c4"+
		"c\2\u0449\u044a\7`\2\2\u044a\u044b\7H\2\2\u044b\u044d\3\2\2\2\u044c\u0442"+
		"\3\2\2\2\u044c\u0443\3\2\2\2\u044c\u0447\3\2\2\2\u044d\u00c3\3\2\2\2\u044e"+
		"\u0450\bc\1\2\u044f\u0451\5\u00c6d\2\u0450\u044f\3\2\2\2\u0450\u0451\3"+
		"\2\2\2\u0451\u0452\3\2\2\2\u0452\u0453\5\u00c2b\2\u0453\u045c\3\2\2\2"+
		"\u0454\u0455\6c,\3\u0455\u0457\7`\2\2\u0456\u0458\5\u00c6d\2\u0457\u0456"+
		"\3\2\2\2\u0457\u0458\3\2\2\2\u0458\u0459\3\2\2\2\u0459\u045b\5\u00c2b"+
		"\2\u045a\u0454\3\2\2\2\u045b\u045e\3\2\2\2\u045c\u045a\3\2\2\2\u045c\u045d"+
		"\3\2\2\2\u045d\u00c5\3\2\2\2\u045e\u045c\3\2\2\2\u045f\u0460\5\u00c8e"+
		"\2\u0460\u0461\7a\2\2\u0461\u00c7\3\2\2\2\u0462\u0463\be\1\2\u0463\u0464"+
		"\5\u00caf\2\u0464\u0469\3\2\2\2\u0465\u0466\6e-\3\u0466\u0468\5\u00ca"+
		"f\2\u0467\u0465\3\2\2\2\u0468\u046b\3\2\2\2\u0469\u0467\3\2\2\2\u0469"+
		"\u046a\3\2\2\2\u046a\u00c9\3\2\2\2\u046b\u0469\3\2\2\2\u046c\u046d\7E"+
		"\2\2\u046d\u046e\5b\62\2\u046e\u046f\7F\2\2\u046f\u0473\3\2\2\2\u0470"+
		"\u0471\7o\2\2\u0471\u0473\7q\2\2\u0472\u046c\3\2\2\2\u0472\u0470\3\2\2"+
		"\2\u0473\u00cb\3\2\2\2\u0474\u0475\7A\2\2\u0475\u0476\7C\2\2\u0476\u0477"+
		"\5b\62\2\u0477\u0479\7`\2\2\u0478\u047a\7s\2\2\u0479\u0478\3\2\2\2\u047a"+
		"\u047b\3\2\2\2\u047b\u0479\3\2\2\2\u047b\u047c\3\2\2\2\u047c\u047d\3\2"+
		"\2\2\u047d\u047e\7D\2\2\u047e\u047f\7_\2\2\u047f\u00cd\3\2\2\2\u0480\u04a6"+
		"\5\u00d0i\2\u0481\u04a6\5\u00d2j\2\u0482\u04a6\5\u00d8m\2\u0483\u04a6"+
		"\5\u00dan\2\u0484\u04a6\5\u00dco\2\u0485\u04a6\5\u00e6t\2\u0486\u0487"+
		"\t\t\2\2\u0487\u0488\t\n\2\2\u0488\u0491\7C\2\2\u0489\u048e\5T+\2\u048a"+
		"\u048b\7`\2\2\u048b\u048d\5T+\2\u048c\u048a\3\2\2\2\u048d\u0490\3\2\2"+
		"\2\u048e\u048c\3\2\2\2\u048e\u048f\3\2\2\2\u048f\u0492\3\2\2\2\u0490\u048e"+
		"\3\2\2\2\u0491\u0489\3\2\2\2\u0491\u0492\3\2\2\2\u0492\u04a0\3\2\2\2\u0493"+
		"\u049c\7^\2\2\u0494\u0499\5T+\2\u0495\u0496\7`\2\2\u0496\u0498\5T+\2\u0497"+
		"\u0495\3\2\2\2\u0498\u049b\3\2\2\2\u0499\u0497\3\2\2\2\u0499\u049a\3\2"+
		"\2\2\u049a\u049d\3\2\2\2\u049b\u0499\3\2\2\2\u049c\u0494\3\2\2\2\u049c"+
		"\u049d\3\2\2\2\u049d\u049f\3\2\2\2\u049e\u0493\3\2\2\2\u049f\u04a2\3\2"+
		"\2\2\u04a0\u049e\3\2\2\2\u04a0\u04a1\3\2\2\2\u04a1\u04a3\3\2\2\2\u04a2"+
		"\u04a0\3\2\2\2\u04a3\u04a4\7D\2\2\u04a4\u04a6\7_\2\2\u04a5\u0480\3\2\2"+
		"\2\u04a5\u0481\3\2\2\2\u04a5\u0482\3\2\2\2\u04a5\u0483\3\2\2\2\u04a5\u0484"+
		"\3\2\2\2\u04a5\u0485\3\2\2\2\u04a5\u0486\3\2\2\2\u04a6\u00cf\3\2\2\2\u04a7"+
		"\u04a8\7q\2\2\u04a8\u04a9\7^\2\2\u04a9\u04b3\5\u00ceh\2\u04aa\u04ab\7"+
		"\31\2\2\u04ab\u04ac\5b\62\2\u04ac\u04ad\7^\2\2\u04ad\u04ae\5\u00ceh\2"+
		"\u04ae\u04b3\3\2\2\2\u04af\u04b0\7\35\2\2\u04b0\u04b1\7^\2\2\u04b1\u04b3"+
		"\5\u00ceh\2\u04b2\u04a7\3\2\2\2\u04b2\u04aa\3\2\2\2\u04b2\u04af\3\2\2"+
		"\2\u04b3\u00d1\3\2\2\2\u04b4\u04b6\7G\2\2\u04b5\u04b7\5\u00d4k\2\u04b6"+
		"\u04b5\3\2\2\2\u04b6\u04b7\3\2\2\2\u04b7\u04b8\3\2\2\2\u04b8\u04b9\7H"+
		"\2\2\u04b9\u00d3\3\2\2\2\u04ba\u04bb\bk\1\2\u04bb\u04bc\5\u00d6l\2\u04bc"+
		"\u04c1\3\2\2\2\u04bd\u04be\6k.\3\u04be\u04c0\5\u00d6l\2\u04bf\u04bd\3"+
		"\2\2\2\u04c0\u04c3\3\2\2\2\u04c1\u04bf\3\2\2\2\u04c1\u04c2\3\2\2\2\u04c2"+
		"\u00d5\3\2\2\2\u04c3\u04c1\3\2\2\2\u04c4\u04c8\5d\63\2\u04c5\u04c8\5\u00ce"+
		"h\2\u04c6\u04c8\7t\2\2\u04c7\u04c4\3\2\2\2\u04c7\u04c5\3\2\2\2\u04c7\u04c6"+
		"\3\2\2\2\u04c8\u00d7\3\2\2\2\u04c9\u04cb\5`\61\2\u04ca\u04c9\3\2\2\2\u04ca"+
		"\u04cb\3\2\2\2\u04cb\u04cc\3\2\2\2\u04cc\u04cd\5\u0086D\2\u04cd\u00d9"+
		"\3\2\2\2\u04ce\u04cf\7&\2\2\u04cf\u04d0\7C\2\2\u04d0\u04d1\5`\61\2\u04d1"+
		"\u04d2\7D\2\2\u04d2\u04d5\5\u00ceh\2\u04d3\u04d4\7 \2\2\u04d4\u04d6\5"+
		"\u00ceh\2\u04d5\u04d3\3\2\2\2\u04d5\u04d6\3\2\2\2\u04d6\u04de\3\2\2\2"+
		"\u04d7\u04d8\7\62\2\2\u04d8\u04d9\7C\2\2\u04d9\u04da\5`\61\2\u04da\u04db"+
		"\7D\2\2\u04db\u04dc\5\u00ceh\2\u04dc\u04de\3\2\2\2\u04dd\u04ce\3\2\2\2"+
		"\u04dd\u04d7\3\2\2\2\u04de\u00db\3\2\2\2\u04df\u04e0\78\2\2\u04e0\u04e1"+
		"\7C\2\2\u04e1\u04e2\5`\61\2\u04e2\u04e3\7D\2\2\u04e3\u04e4\5\u00ceh\2"+
		"\u04e4\u050a\3\2\2\2\u04e5\u04e6\7\36\2\2\u04e6\u04e7\5\u00ceh\2\u04e7"+
		"\u04e8\78\2\2\u04e8\u04e9\7C\2\2\u04e9\u04ea\5`\61\2\u04ea\u04eb\7D\2"+
		"\2\u04eb\u04ec\7_\2\2\u04ec\u050a\3\2\2\2\u04ed\u04ee\7$\2\2\u04ee\u04f0"+
		"\7C\2\2\u04ef\u04f1\5`\61\2\u04f0\u04ef\3\2\2\2\u04f0\u04f1\3\2\2\2\u04f1"+
		"\u04f2\3\2\2\2\u04f2\u04f4\7_\2\2\u04f3\u04f5\5`\61\2\u04f4\u04f3\3\2"+
		"\2\2\u04f4\u04f5\3\2\2\2\u04f5\u04f6\3\2\2\2\u04f6\u04f8\7_\2\2\u04f7"+
		"\u04f9\5`\61\2\u04f8\u04f7\3\2\2\2\u04f8\u04f9\3\2\2\2\u04f9\u04fa\3\2"+
		"\2\2\u04fa\u04fb\7D\2\2\u04fb\u050a\5\u00ceh\2\u04fc\u04fd\7$\2\2\u04fd"+
		"\u04fe\7C\2\2\u04fe\u0500\5d\63\2\u04ff\u0501\5`\61\2\u0500\u04ff\3\2"+
		"\2\2\u0500\u0501\3\2\2\2\u0501\u0502\3\2\2\2\u0502\u0504\7_\2\2\u0503"+
		"\u0505\5`\61\2\u0504\u0503\3\2\2\2\u0504\u0505\3\2\2\2\u0505\u0506\3\2"+
		"\2\2\u0506\u0507\7D\2\2\u0507\u0508\5\u00ceh\2\u0508\u050a\3\2\2\2\u0509"+
		"\u04df\3\2\2\2\u0509\u04e5\3\2\2\2\u0509\u04ed\3\2\2\2\u0509\u04fc\3\2"+
		"\2\2\u050a\u00dd\3\2\2\2\u050b\u050c\7%\2\2\u050c\u00df\3\2\2\2\u050d"+
		"\u050e\7\34\2\2\u050e\u00e1\3\2\2\2\u050f\u0510\7\30\2\2\u0510\u00e3\3"+
		"\2\2\2\u0511\u0512\7,\2\2\u0512\u00e5\3\2\2\2\u0513\u0514\5\u00dep\2\u0514"+
		"\u0515\7q\2\2\u0515\u0516\5\u0086D\2\u0516\u0524\3\2\2\2\u0517\u0518\5"+
		"\u00e0q\2\u0518\u0519\5\u0086D\2\u0519\u0524\3\2\2\2\u051a\u051b\5\u00e2"+
		"r\2\u051b\u051c\5\u0086D\2\u051c\u0524\3\2\2\2\u051d\u051f\5\u00e4s\2"+
		"\u051e\u0520\5`\61\2\u051f\u051e\3\2\2\2\u051f\u0520\3\2\2\2\u0520\u0521"+
		"\3\2\2\2\u0521\u0522\5\u0086D\2\u0522\u0524\3\2\2\2\u0523\u0513\3\2\2"+
		"\2\u0523\u0517\3\2\2\2\u0523\u051a\3\2\2\2\u0523\u051d\3\2\2\2\u0524\u00e7"+
		"\3\2\2\2\u0525\u0527\5\u00eav\2\u0526\u0525\3\2\2\2\u0526\u0527\3\2\2"+
		"\2\u0527\u0528\3\2\2\2\u0528\u0529\7\2\2\3\u0529\u00e9\3\2\2\2\u052a\u052b"+
		"\bv\1\2\u052b\u052c\5\u00ecw\2\u052c\u0531\3\2\2\2\u052d\u052e\6v/\3\u052e"+
		"\u0530\5\u00ecw\2\u052f\u052d\3\2\2\2\u0530\u0533\3\2\2\2\u0531\u052f"+
		"\3\2\2\2\u0531\u0532\3\2\2\2\u0532\u00eb\3\2\2\2\u0533\u0531\3\2\2\2\u0534"+
		"\u0539\5\u00eex\2\u0535\u0539\5d\63\2\u0536\u0539\7_\2\2\u0537\u0539\7"+
		"t\2\2\u0538\u0534\3\2\2\2\u0538\u0535\3\2\2\2\u0538\u0536\3\2\2\2\u0538"+
		"\u0537\3\2\2\2\u0539\u00ed\3\2\2\2\u053a\u053c\5f\64\2\u053b\u053a\3\2"+
		"\2\2\u053b\u053c\3\2\2\2\u053c\u053d\3\2\2\2\u053d\u053f\5\u00f2z\2\u053e"+
		"\u0540\5\u00f4{\2\u053f\u053e\3\2\2\2\u053f\u0540\3\2\2\2\u0540\u0541"+
		"\3\2\2\2\u0541\u0542\5\u00d2j\2\u0542\u00ef\3\2\2\2\u0543\u0544\7\7\2"+
		"\2\u0544\u00f1\3\2\2\2\u0545\u0547\5\u00f0y\2\u0546\u0545\3\2\2\2\u0546"+
		"\u0547\3\2\2\2\u0547\u0548\3\2\2\2\u0548\u0549\5\u009eP\2\u0549\u00f3"+
		"\3\2\2\2\u054a\u054b\b{\1\2\u054b\u054c\5d\63\2\u054c\u0551\3\2\2\2\u054d"+
		"\u054e\6{\60\3\u054e\u0550\5d\63\2\u054f\u054d\3\2\2\2\u0550\u0553\3\2"+
		"\2\2\u0551\u054f\3\2\2\2\u0551\u0552\3\2\2\2\u0552\u00f5\3\2\2\2\u0553"+
		"\u0551\3\2\2\2\u0084\u00f9\u0100\u0108\u011c\u012d\u0137\u013e\u0164\u0176"+
		"\u0178\u0184\u019d\u01b1\u01c8\u01ca\u01dc\u01de\u01f0\u01f2\u0210\u0212"+
		"\u0224\u0226\u0234\u0242\u0250\u025e\u026c\u0279\u0280\u028c\u0293\u0298"+
		"\u029d\u02a2\u02a8\u02b2\u02bc\u02c6\u02cb\u02cf\u02dd\u02e9\u02ee\u02f1"+
		"\u02f7\u02fb\u02ff\u0303\u0305\u0309\u0311\u031a\u0324\u032c\u032f\u0342"+
		"\u034e\u0358\u035d\u0360\u0366\u0372\u0376\u0378\u0380\u0384\u0392\u0396"+
		"\u039b\u039e\u03a1\u03a8\u03aa\u03af\u03b3\u03b8\u03bc\u03bf\u03c8\u03d0"+
		"\u03dd\u03ea\u03ef\u03fa\u03fd\u0403\u0413\u0416\u041b\u041e\u0425\u0438"+
		"\u043b\u043d\u044c\u0450\u0457\u045c\u0469\u0472\u047b\u048e\u0491\u0499"+
		"\u049c\u04a0\u04a5\u04b2\u04b6\u04c1\u04c7\u04ca\u04d5\u04dd\u04f0\u04f4"+
		"\u04f8\u0500\u0504\u0509\u051f\u0523\u0526\u0531\u0538\u053b\u053f\u0546"+
		"\u0551";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}