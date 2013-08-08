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
		T__18=1, T__17=2, T__16=3, T__15=4, T__14=5, T__13=6, T__12=7, T__11=8, 
		T__10=9, T__9=10, T__8=11, T__7=12, T__6=13, T__5=14, T__4=15, T__3=16, 
		T__2=17, T__1=18, T__0=19, Auto=20, Break=21, Case=22, Char=23, Const=24, 
		Continue=25, Default=26, Do=27, Double=28, Else=29, Enum=30, Extern=31, 
		Float=32, For=33, Goto=34, If=35, Inline=36, Int=37, Long=38, Register=39, 
		Restrict=40, Return=41, Short=42, Signed=43, Sizeof=44, Static=45, Struct=46, 
		Switch=47, Typedef=48, Union=49, Unsigned=50, Void=51, Volatile=52, While=53, 
		Alignas=54, Alignof=55, Atomic=56, Bool=57, Complex=58, Generic=59, Imaginary=60, 
		Noreturn=61, StaticAssert=62, ThreadLocal=63, LeftParen=64, RightParen=65, 
		LeftBracket=66, RightBracket=67, LeftBrace=68, RightBrace=69, Less=70, 
		LessEqual=71, Greater=72, GreaterEqual=73, LeftShift=74, RightShift=75, 
		Plus=76, PlusPlus=77, Minus=78, MinusMinus=79, Star=80, Div=81, Mod=82, 
		And=83, Or=84, AndAnd=85, OrOr=86, Caret=87, Not=88, Tilde=89, Question=90, 
		Colon=91, Semi=92, Comma=93, Assign=94, StarAssign=95, DivAssign=96, ModAssign=97, 
		PlusAssign=98, MinusAssign=99, LeftShiftAssign=100, RightShiftAssign=101, 
		AndAssign=102, XorAssign=103, OrAssign=104, Equal=105, NotEqual=106, Arrow=107, 
		Dot=108, Ellipsis=109, Identifier=110, Constant=111, StringLiteral=112, 
		LineDirective=113, Whitespace=114, Newline=115, BlockComment=116, LineComment=117;
	public static final String[] tokenNames = {
		"<INVALID>", "'decl'", "'__extension__'", "'__private'", "'__stdcall'", 
		"'__builtin_offsetof'", "'__attribute__'", "'__declspec'", "'__asm__'", 
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
		"Constant", "StringLiteral", "LineDirective", "Whitespace", "Newline", 
		"BlockComment", "LineComment"
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
		RULE_question = 41, RULE_colon = 42, RULE_conditionalExpression = 43, 
		RULE_assignmentExpression = 44, RULE_assignmentOperator = 45, RULE_expression = 46, 
		RULE_constantExpression = 47, RULE_declaration = 48, RULE_declarationSpecifiers = 49, 
		RULE_declarationSpecifiers2 = 50, RULE_declarationSpecifier = 51, RULE_initDeclaratorList = 52, 
		RULE_eq = 53, RULE_initDeclarator = 54, RULE_storageClassSpecifier = 55, 
		RULE_tagSpecifier = 56, RULE_typeSpecifier = 57, RULE_classSpecifier = 58, 
		RULE_classInheritanceSpecifier = 59, RULE_classDeclarationList = 60, RULE_spo_public = 61, 
		RULE_spo_private = 62, RULE_spo_protected = 63, RULE_classVisibility = 64, 
		RULE_semi = 65, RULE_classDeclaration = 66, RULE_specifierQualifierList = 67, 
		RULE_enumSpecifier = 68, RULE_enumeratorList = 69, RULE_enumerator = 70, 
		RULE_enumerationConstant = 71, RULE_atomicTypeSpecifier = 72, RULE_typeQualifier = 73, 
		RULE_typeAccessQualifier = 74, RULE_functionSpecifier = 75, RULE_alignmentSpecifier = 76, 
		RULE_declarator = 77, RULE_directDeclarator = 78, RULE_gccDeclaratorExtension = 79, 
		RULE_gccAttributeSpecifier = 80, RULE_gccAttributeList = 81, RULE_gccAttribute = 82, 
		RULE_nestedParenthesesBlock = 83, RULE_pointer = 84, RULE_typeQualifierList = 85, 
		RULE_parameterTypeList = 86, RULE_coma = 87, RULE_parameterList = 88, 
		RULE_parameterDeclaration = 89, RULE_identifierList = 90, RULE_typeName = 91, 
		RULE_abstractDeclarator = 92, RULE_directAbstractDeclarator = 93, RULE_typedefName = 94, 
		RULE_initializer = 95, RULE_initializerList = 96, RULE_designation = 97, 
		RULE_designatorList = 98, RULE_designator = 99, RULE_staticAssertDeclaration = 100, 
		RULE_statement = 101, RULE_labeledStatement = 102, RULE_compoundStatement = 103, 
		RULE_blockItemList = 104, RULE_blockItem = 105, RULE_expressionStatement = 106, 
		RULE_selectionStatement = 107, RULE_iterationStatement = 108, RULE_jumpStatement = 109, 
		RULE_compilationUnit = 110, RULE_translationUnit = 111, RULE_externalDeclaration = 112, 
		RULE_functionDefinition = 113, RULE_functionDeclarator = 114, RULE_declarationList = 115;
	public static final String[] ruleNames = {
		"primaryExpression", "genericSelection", "genericAssocList", "genericAssociation", 
		"postfixExpressionDot", "postfixExpressionArgs", "postfixExpression", 
		"argumentExpressionList", "unaryExpression", "unaryOperator", "lpar", 
		"rpar", "castExpression", "star", "div", "mod", "multiplicativeExpression", 
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
			setState(268);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(232); tagSpecifier();
					}
					break;
				}
				setState(235); match(Identifier);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(236); match(Constant);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(238); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(237); match(StringLiteral);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(240); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(242); match(LeftParen);
				setState(243); expression(0);
				setState(244); match(RightParen);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(246); genericSelection();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(248);
				_la = _input.LA(1);
				if (_la==2) {
					{
					setState(247); match(2);
					}
				}

				setState(250); match(LeftParen);
				setState(251); compoundStatement();
				setState(252); match(RightParen);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(254); match(16);
				setState(255); match(LeftParen);
				setState(256); unaryExpression();
				setState(257); match(Comma);
				setState(258); typeName();
				setState(259); match(RightParen);
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(261); match(5);
				setState(262); match(LeftParen);
				setState(263); typeName();
				setState(264); match(Comma);
				setState(265); unaryExpression();
				setState(266); match(RightParen);
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
			setState(270); match(Generic);
			setState(271); match(LeftParen);
			setState(272); assignmentExpression();
			setState(273); match(Comma);
			setState(274); genericAssocList(0);
			setState(275); match(RightParen);
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
			setState(278); genericAssociation();
			}
			_ctx.stop = _input.LT(-1);
			setState(285);
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
					setState(280);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(281); match(Comma);
					setState(282); genericAssociation();
					}
					} 
				}
				setState(287);
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
			setState(295);
			switch (_input.LA(1)) {
			case 10:
			case Const:
			case Enum:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(288); typeName();
				setState(289); match(Colon);
				setState(290); assignmentExpression();
				}
				break;
			case Default:
				enterOuterAlt(_localctx, 2);
				{
				setState(292); match(Default);
				setState(293); match(Colon);
				setState(294); assignmentExpression();
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
			setState(297); match(Dot);
			setState(298); match(Identifier);
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
			setState(300); match(LeftParen);
			setState(302);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 5) | (1L << 16) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LeftParen - 64)) | (1L << (Plus - 64)) | (1L << (PlusPlus - 64)) | (1L << (Minus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (AndAnd - 64)) | (1L << (Not - 64)) | (1L << (Tilde - 64)) | (1L << (Identifier - 64)) | (1L << (Constant - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
				{
				setState(301); argumentExpressionList(0);
				}
			}

			setState(304); rpar();
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
			setState(340);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(307); primaryExpression();
				}
				break;

			case 2:
				{
				setState(308); match(LeftParen);
				setState(309); typeName();
				setState(310); match(RightParen);
				setState(311); match(LeftBrace);
				setState(312); initializerList(0);
				setState(313); match(RightBrace);
				}
				break;

			case 3:
				{
				setState(315); match(LeftParen);
				setState(316); typeName();
				setState(317); match(RightParen);
				setState(318); match(LeftBrace);
				setState(319); initializerList(0);
				setState(320); match(Comma);
				setState(321); match(RightBrace);
				}
				break;

			case 4:
				{
				setState(323); match(2);
				setState(324); match(LeftParen);
				setState(325); typeName();
				setState(326); match(RightParen);
				setState(327); match(LeftBrace);
				setState(328); initializerList(0);
				setState(329); match(RightBrace);
				}
				break;

			case 5:
				{
				setState(331); match(2);
				setState(332); match(LeftParen);
				setState(333); typeName();
				setState(334); match(RightParen);
				setState(335); match(LeftBrace);
				setState(336); initializerList(0);
				setState(337); match(Comma);
				setState(338); match(RightBrace);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(360);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(358);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(342);
						if (!(10 >= _localctx._p)) throw new FailedPredicateException(this, "10 >= $_p");
						setState(343); match(LeftBracket);
						setState(344); expression(0);
						setState(345); match(RightBracket);
						}
						break;

					case 2:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(347);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(348); postfixExpressionArgs();
						}
						break;

					case 3:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(349);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(350); postfixExpressionDot();
						}
						break;

					case 4:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(351);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(352); match(Arrow);
						setState(353); match(Identifier);
						}
						break;

					case 5:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(354);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(355); match(PlusPlus);
						}
						break;

					case 6:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(356);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(357); match(MinusMinus);
						}
						break;
					}
					} 
				}
				setState(362);
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
			setState(364); assignmentExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(372);
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
					setState(366);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(367); coma();
					setState(368); assignmentExpression();
					}
					} 
				}
				setState(374);
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
			setState(397);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(375); postfixExpression(0);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(376); match(PlusPlus);
				setState(377); unaryExpression();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(378); match(MinusMinus);
				setState(379); unaryExpression();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(380); unaryOperator();
				setState(381); castExpression();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(383); match(Sizeof);
				setState(384); unaryExpression();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(385); match(Sizeof);
				setState(386); match(LeftParen);
				setState(387); typeName();
				setState(388); match(RightParen);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(390); match(Alignof);
				setState(391); match(LeftParen);
				setState(392); typeName();
				setState(393); match(RightParen);
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(395); match(AndAnd);
				setState(396); match(Identifier);
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
			setState(399);
			_la = _input.LA(1);
			if ( !(((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (Plus - 76)) | (1L << (Minus - 76)) | (1L << (Star - 76)) | (1L << (And - 76)) | (1L << (Not - 76)) | (1L << (Tilde - 76)))) != 0)) ) {
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
			setState(401); match(LeftParen);
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
			setState(403); match(RightParen);
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
			setState(417);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(405); unaryExpression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(406); lpar();
				setState(407); typeName();
				setState(408); rpar();
				setState(409); castExpression();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(411); match(2);
				setState(412); lpar();
				setState(413); typeName();
				setState(414); rpar();
				setState(415); castExpression();
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
			setState(419); match(Star);
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
			setState(421); match(Div);
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
			setState(423); match(Mod);
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
			setState(426); castExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(442);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(440);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(428);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(429); star();
						setState(430); castExpression();
						}
						break;

					case 2:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(432);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(433); div();
						setState(434); castExpression();
						}
						break;

					case 3:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(436);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(437); mod();
						setState(438); castExpression();
						}
						break;
					}
					} 
				}
				setState(444);
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
			setState(445); match(Plus);
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
			setState(447); match(Minus);
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
			setState(450); multiplicativeExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(462);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(460);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(452);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(453); plus();
						setState(454); multiplicativeExpression(0);
						}
						break;

					case 2:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(456);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(457); minus();
						setState(458); multiplicativeExpression(0);
						}
						break;
					}
					} 
				}
				setState(464);
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
			setState(465); match(LeftShift);
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
			setState(467); match(RightShift);
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
			setState(470); additiveExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(482);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(480);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(472);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(473); shiftl();
						setState(474); additiveExpression(0);
						}
						break;

					case 2:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(476);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(477); shiftr();
						setState(478); additiveExpression(0);
						}
						break;
					}
					} 
				}
				setState(484);
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
			setState(485); match(Less);
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
			setState(487); match(Greater);
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
			setState(489); match(LessEqual);
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
			setState(491); match(GreaterEqual);
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
			setState(494); shiftExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(514);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(512);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(496);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(497); less();
						setState(498); shiftExpression(0);
						}
						break;

					case 2:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(500);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(501); more();
						setState(502); shiftExpression(0);
						}
						break;

					case 3:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(504);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(505); leeq();
						setState(506); shiftExpression(0);
						}
						break;

					case 4:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(508);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(509); moeq();
						setState(510); shiftExpression(0);
						}
						break;
					}
					} 
				}
				setState(516);
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
			setState(517); match(Equal);
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
			setState(519); match(NotEqual);
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
			setState(522); relationalExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(534);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(532);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(524);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(525); eqeq();
						setState(526); relationalExpression(0);
						}
						break;

					case 2:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(528);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(529); noteq();
						setState(530); relationalExpression(0);
						}
						break;
					}
					} 
				}
				setState(536);
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
			setState(537); match(And);
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
			setState(540); equalityExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(548);
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
					setState(542);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(543); and();
					setState(544); equalityExpression(0);
					}
					} 
				}
				setState(550);
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
			setState(551); match(Caret);
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
			setState(554); andExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(562);
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
					setState(556);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(557); caret();
					setState(558); andExpression(0);
					}
					} 
				}
				setState(564);
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
			setState(565); match(Or);
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
			setState(568); exclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(576);
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
					setState(570);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(571); or();
					setState(572); exclusiveOrExpression(0);
					}
					} 
				}
				setState(578);
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
			setState(579); match(AndAnd);
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
			setState(582); inclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(590);
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
					setState(584);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(585); andand();
					setState(586); inclusiveOrExpression(0);
					}
					} 
				}
				setState(592);
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
			setState(593); match(OrOr);
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
			setState(596); logicalAndExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(604);
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
					setState(598);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(599); oror();
					setState(600); logicalAndExpression(0);
					}
					} 
				}
				setState(606);
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
			setState(607); match(Question);
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
		enterRule(_localctx, 84, RULE_colon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609); match(Colon);
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
		enterRule(_localctx, 86, RULE_conditionalExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(611); logicalOrExpression(0);
			setState(617);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(612); question();
				setState(613); expression(0);
				setState(614); colon();
				setState(615); conditionalExpression();
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
			setState(624);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(619); conditionalExpression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(620); unaryExpression();
				setState(621); assignmentOperator();
				setState(622); assignmentExpression();
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
			setState(626);
			_la = _input.LA(1);
			if ( !(((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & ((1L << (Assign - 94)) | (1L << (StarAssign - 94)) | (1L << (DivAssign - 94)) | (1L << (ModAssign - 94)) | (1L << (PlusAssign - 94)) | (1L << (MinusAssign - 94)) | (1L << (LeftShiftAssign - 94)) | (1L << (RightShiftAssign - 94)) | (1L << (AndAssign - 94)) | (1L << (XorAssign - 94)) | (1L << (OrAssign - 94)))) != 0)) ) {
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
			setState(629); assignmentExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(636);
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
					setState(631);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(632); match(Comma);
					setState(633); assignmentExpression();
					}
					} 
				}
				setState(638);
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
			setState(639); conditionalExpression();
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
			setState(648);
			switch (_input.LA(1)) {
			case 1:
			case 9:
			case 10:
			case 11:
			case 15:
			case 17:
			case Const:
			case Enum:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(641); declarationSpecifiers();
				setState(643);
				_la = _input.LA(1);
				if (_la==LeftParen || _la==Identifier) {
					{
					setState(642); initDeclaratorList(0);
					}
				}

				setState(645); match(Semi);
				}
				break;
			case StaticAssert:
				enterOuterAlt(_localctx, 2);
				{
				setState(647); staticAssertDeclaration();
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
			setState(651); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(650); declarationSpecifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(653); 
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(656); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(655); declarationSpecifier();
				}
				}
				setState(658); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 9) | (1L << 10) | (1L << 11) | (1L << 15) | (1L << 17) | (1L << Const) | (1L << Enum))) != 0) || _la==Identifier );
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
			setState(664);
			switch (_input.LA(1)) {
			case 1:
			case 9:
				enterOuterAlt(_localctx, 1);
				{
				setState(660); storageClassSpecifier();
				}
				break;
			case 10:
			case Enum:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(661); typeSpecifier();
				}
				break;
			case Const:
				enterOuterAlt(_localctx, 3);
				{
				setState(662); typeQualifier();
				}
				break;
			case 11:
			case 15:
			case 17:
				enterOuterAlt(_localctx, 4);
				{
				setState(663); typeAccessQualifier();
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
			setState(667); initDeclarator();
			}
			_ctx.stop = _input.LT(-1);
			setState(674);
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
					setState(669);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(670); match(Comma);
					setState(671); initDeclarator();
					}
					} 
				}
				setState(676);
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
			setState(677); match(Assign);
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
			setState(684);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(679); declarator();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(680); declarator();
				setState(681); eq();
				setState(682); initializer();
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
			setState(686);
			_la = _input.LA(1);
			if ( !(_la==1 || _la==9) ) {
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
			setState(688); match(Identifier);
			setState(689); match(Colon);
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
			setState(694);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(691); tagSpecifier();
				}
				break;
			case Enum:
				enterOuterAlt(_localctx, 2);
				{
				setState(692); enumSpecifier();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 3);
				{
				setState(693); classSpecifier();
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
			setState(696); match(10);
			setState(697); match(Identifier);
			setState(699);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(698); classInheritanceSpecifier();
				}
			}

			setState(701); match(LeftBrace);
			setState(703);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 3) | (1L << 9) | (1L << 10) | (1L << 11) | (1L << 12) | (1L << 15) | (1L << 17) | (1L << 19) | (1L << Const) | (1L << Enum))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LeftParen - 64)) | (1L << (Identifier - 64)) | (1L << (LineDirective - 64)))) != 0)) {
				{
				setState(702); classDeclarationList(0);
				}
			}

			setState(705); match(RightBrace);
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
			setState(707); match(Colon);
			setState(708); identifierList(0);
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
			setState(711); classDeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(717);
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
					setState(713);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(714); classDeclaration();
					}
					} 
				}
				setState(719);
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
		enterRule(_localctx, 122, RULE_spo_public);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(720); match(12);
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
		enterRule(_localctx, 124, RULE_spo_private);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(722); match(3);
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
		enterRule(_localctx, 126, RULE_spo_protected);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(724); match(19);
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
		enterRule(_localctx, 128, RULE_classVisibility);
		try {
			setState(729);
			switch (_input.LA(1)) {
			case 12:
				enterOuterAlt(_localctx, 1);
				{
				setState(726); spo_public();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 2);
				{
				setState(727); spo_private();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 3);
				{
				setState(728); spo_protected();
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
		enterRule(_localctx, 130, RULE_semi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(731); match(Semi);
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
		enterRule(_localctx, 132, RULE_classDeclaration);
		int _la;
		try {
			setState(747);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(734);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 12) | (1L << 19))) != 0)) {
					{
					setState(733); classVisibility();
					}
				}

				setState(737);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(736); tagSpecifier();
					}
					break;
				}
				setState(739); identifierList(0);
				setState(740); semi();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(743);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 12) | (1L << 19))) != 0)) {
					{
					setState(742); classVisibility();
					}
				}

				setState(745); functionDefinition();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(746); match(LineDirective);
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
		enterRule(_localctx, 134, RULE_specifierQualifierList);
		int _la;
		try {
			setState(757);
			switch (_input.LA(1)) {
			case 10:
			case Enum:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(749); typeSpecifier();
				setState(751);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 10) | (1L << Const) | (1L << Enum))) != 0) || _la==Identifier) {
					{
					setState(750); specifierQualifierList();
					}
				}

				}
				break;
			case Const:
				enterOuterAlt(_localctx, 2);
				{
				setState(753); typeQualifier();
				setState(755);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 10) | (1L << Const) | (1L << Enum))) != 0) || _la==Identifier) {
					{
					setState(754); specifierQualifierList();
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
		enterRule(_localctx, 136, RULE_enumSpecifier);
		int _la;
		try {
			setState(778);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(759); match(Enum);
				setState(761);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(760); match(Identifier);
					}
				}

				setState(763); match(LeftBrace);
				setState(764); enumeratorList(0);
				setState(765); match(RightBrace);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(767); match(Enum);
				setState(769);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(768); match(Identifier);
					}
				}

				setState(771); match(LeftBrace);
				setState(772); enumeratorList(0);
				setState(773); match(Comma);
				setState(774); match(RightBrace);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(776); match(Enum);
				setState(777); match(Identifier);
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
		int _startState = 138;
		enterRecursionRule(_localctx, RULE_enumeratorList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(781); enumerator();
			}
			_ctx.stop = _input.LT(-1);
			setState(788);
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
					setState(783);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(784); match(Comma);
					setState(785); enumerator();
					}
					} 
				}
				setState(790);
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
		enterRule(_localctx, 140, RULE_enumerator);
		try {
			setState(796);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(791); enumerationConstant();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(792); enumerationConstant();
				setState(793); match(Assign);
				setState(794); constantExpression();
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
		enterRule(_localctx, 142, RULE_enumerationConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(799);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(798); tagSpecifier();
				}
				break;
			}
			setState(801); match(Identifier);
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
		enterRule(_localctx, 144, RULE_atomicTypeSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(803); match(Atomic);
			setState(804); match(LeftParen);
			setState(805); typeName();
			setState(806); match(RightParen);
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
		enterRule(_localctx, 146, RULE_typeQualifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(808); match(Const);
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
		enterRule(_localctx, 148, RULE_typeAccessQualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(810);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 11) | (1L << 15) | (1L << 17))) != 0)) ) {
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
		enterRule(_localctx, 150, RULE_functionSpecifier);
		int _la;
		try {
			setState(818);
			switch (_input.LA(1)) {
			case 4:
			case 14:
			case Inline:
			case Noreturn:
				enterOuterAlt(_localctx, 1);
				{
				setState(812);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 4) | (1L << 14) | (1L << Inline) | (1L << Noreturn))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 2);
				{
				setState(813); gccAttributeSpecifier();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 3);
				{
				setState(814); match(7);
				setState(815); match(LeftParen);
				setState(816); match(Identifier);
				setState(817); match(RightParen);
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
		enterRule(_localctx, 152, RULE_alignmentSpecifier);
		try {
			setState(830);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(820); match(Alignas);
				setState(821); match(LeftParen);
				setState(822); typeName();
				setState(823); match(RightParen);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(825); match(Alignas);
				setState(826); match(LeftParen);
				setState(827); constantExpression();
				setState(828); match(RightParen);
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
		enterRule(_localctx, 154, RULE_declarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(832); directDeclarator(0);
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
		int _startState = 156;
		enterRecursionRule(_localctx, RULE_directDeclarator);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(840);
			switch (_input.LA(1)) {
			case Identifier:
				{
				setState(835); match(Identifier);
				}
				break;
			case LeftParen:
				{
				setState(836); lpar();
				setState(837); declarator();
				setState(838); rpar();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(872);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(870);
					switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
					case 1:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(842);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(843); match(LeftBracket);
						setState(845);
						_la = _input.LA(1);
						if (_la==Const) {
							{
							setState(844); typeQualifierList(0);
							}
						}

						setState(848);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 5) | (1L << 16) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LeftParen - 64)) | (1L << (Plus - 64)) | (1L << (PlusPlus - 64)) | (1L << (Minus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (AndAnd - 64)) | (1L << (Not - 64)) | (1L << (Tilde - 64)) | (1L << (Identifier - 64)) | (1L << (Constant - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
							{
							setState(847); assignmentExpression();
							}
						}

						setState(850); match(RightBracket);
						}
						break;

					case 2:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(851);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(852); match(LeftBracket);
						setState(854);
						_la = _input.LA(1);
						if (_la==Const) {
							{
							setState(853); typeQualifierList(0);
							}
						}

						setState(856); match(Star);
						setState(857); match(RightBracket);
						}
						break;

					case 3:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(858);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(859); lpar();
						setState(860); parameterTypeList();
						setState(861); rpar();
						}
						break;

					case 4:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(863);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(864); lpar();
						setState(866);
						_la = _input.LA(1);
						if (_la==Identifier) {
							{
							setState(865); identifierList(0);
							}
						}

						setState(868); rpar();
						}
						break;
					}
					} 
				}
				setState(874);
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
		enterRule(_localctx, 158, RULE_gccDeclaratorExtension);
		int _la;
		try {
			setState(884);
			switch (_input.LA(1)) {
			case 13:
				enterOuterAlt(_localctx, 1);
				{
				setState(875); match(13);
				setState(876); match(LeftParen);
				setState(878); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(877); match(StringLiteral);
					}
					}
					setState(880); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==StringLiteral );
				setState(882); match(RightParen);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 2);
				{
				setState(883); gccAttributeSpecifier();
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
		enterRule(_localctx, 160, RULE_gccAttributeSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(886); match(6);
			setState(887); match(LeftParen);
			setState(888); match(LeftParen);
			setState(889); gccAttributeList();
			setState(890); match(RightParen);
			setState(891); match(RightParen);
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
		enterRule(_localctx, 162, RULE_gccAttributeList);
		int _la;
		try {
			setState(902);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(893); gccAttribute();
				setState(898);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(894); match(Comma);
					setState(895); gccAttribute();
					}
					}
					setState(900);
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
		enterRule(_localctx, 164, RULE_gccAttribute);
		int _la;
		try {
			setState(913);
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
				setState(904);
				_la = _input.LA(1);
				if ( _la <= 0 || (((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LeftParen - 64)) | (1L << (RightParen - 64)) | (1L << (Comma - 64)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(910);
				_la = _input.LA(1);
				if (_la==LeftParen) {
					{
					setState(905); match(LeftParen);
					setState(907);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 5) | (1L << 16) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LeftParen - 64)) | (1L << (Plus - 64)) | (1L << (PlusPlus - 64)) | (1L << (Minus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (AndAnd - 64)) | (1L << (Not - 64)) | (1L << (Tilde - 64)) | (1L << (Identifier - 64)) | (1L << (Constant - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
						{
						setState(906); argumentExpressionList(0);
						}
					}

					setState(909); match(RightParen);
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
		enterRule(_localctx, 166, RULE_nestedParenthesesBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(922);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 3) | (1L << 4) | (1L << 5) | (1L << 6) | (1L << 7) | (1L << 8) | (1L << 9) | (1L << 10) | (1L << 11) | (1L << 12) | (1L << 13) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 17) | (1L << 18) | (1L << 19) | (1L << Auto) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Const) | (1L << Continue) | (1L << Default) | (1L << Do) | (1L << Double) | (1L << Else) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << For) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static) | (1L << Struct) | (1L << Switch) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << While) | (1L << Alignas) | (1L << Alignof) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Generic) | (1L << Imaginary) | (1L << Noreturn) | (1L << StaticAssert) | (1L << ThreadLocal))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (RightBracket - 64)) | (1L << (LeftBrace - 64)) | (1L << (RightBrace - 64)) | (1L << (Less - 64)) | (1L << (LessEqual - 64)) | (1L << (Greater - 64)) | (1L << (GreaterEqual - 64)) | (1L << (LeftShift - 64)) | (1L << (RightShift - 64)) | (1L << (Plus - 64)) | (1L << (PlusPlus - 64)) | (1L << (Minus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Star - 64)) | (1L << (Div - 64)) | (1L << (Mod - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Caret - 64)) | (1L << (Not - 64)) | (1L << (Tilde - 64)) | (1L << (Question - 64)) | (1L << (Colon - 64)) | (1L << (Semi - 64)) | (1L << (Comma - 64)) | (1L << (Assign - 64)) | (1L << (StarAssign - 64)) | (1L << (DivAssign - 64)) | (1L << (ModAssign - 64)) | (1L << (PlusAssign - 64)) | (1L << (MinusAssign - 64)) | (1L << (LeftShiftAssign - 64)) | (1L << (RightShiftAssign - 64)) | (1L << (AndAssign - 64)) | (1L << (XorAssign - 64)) | (1L << (OrAssign - 64)) | (1L << (Equal - 64)) | (1L << (NotEqual - 64)) | (1L << (Arrow - 64)) | (1L << (Dot - 64)) | (1L << (Ellipsis - 64)) | (1L << (Identifier - 64)) | (1L << (Constant - 64)) | (1L << (StringLiteral - 64)) | (1L << (LineDirective - 64)) | (1L << (Whitespace - 64)) | (1L << (Newline - 64)) | (1L << (BlockComment - 64)) | (1L << (LineComment - 64)))) != 0)) {
				{
				setState(920);
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
					setState(915);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==LeftParen || _la==RightParen) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					break;
				case LeftParen:
					{
					setState(916); match(LeftParen);
					setState(917); nestedParenthesesBlock();
					setState(918); match(RightParen);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(924);
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
		enterRule(_localctx, 168, RULE_pointer);
		int _la;
		try {
			setState(943);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(925); match(Star);
				setState(927);
				switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
				case 1:
					{
					setState(926); typeQualifierList(0);
					}
					break;
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(929); match(Star);
				setState(931);
				_la = _input.LA(1);
				if (_la==Const) {
					{
					setState(930); typeQualifierList(0);
					}
				}

				setState(933); pointer();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(934); match(Caret);
				setState(936);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(935); typeQualifierList(0);
					}
					break;
				}
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(938); match(Caret);
				setState(940);
				_la = _input.LA(1);
				if (_la==Const) {
					{
					setState(939); typeQualifierList(0);
					}
				}

				setState(942); pointer();
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
		int _startState = 170;
		enterRecursionRule(_localctx, RULE_typeQualifierList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(946); typeQualifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(952);
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
					setState(948);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(949); typeQualifier();
					}
					} 
				}
				setState(954);
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
		enterRule(_localctx, 172, RULE_parameterTypeList);
		try {
			setState(960);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(955); parameterList(0);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(956); parameterList(0);
				setState(957); match(Comma);
				setState(958); match(Ellipsis);
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
		enterRule(_localctx, 174, RULE_coma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(962); match(Comma);
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
		int _startState = 176;
		enterRecursionRule(_localctx, RULE_parameterList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(965); parameterDeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(973);
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
					setState(967);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(968); coma();
					setState(969); parameterDeclaration();
					}
					} 
				}
				setState(975);
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
		enterRule(_localctx, 178, RULE_parameterDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(976); assignmentExpression();
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
		int _startState = 180;
		enterRecursionRule(_localctx, RULE_identifierList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(979); match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(986);
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
					setState(981);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(982); match(Comma);
					setState(983); match(Identifier);
					}
					} 
				}
				setState(988);
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
		enterRule(_localctx, 182, RULE_typeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(989); specifierQualifierList();
			setState(991);
			_la = _input.LA(1);
			if (_la==LeftParen || _la==LeftBracket) {
				{
				setState(990); abstractDeclarator();
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
		enterRule(_localctx, 184, RULE_abstractDeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(993); directAbstractDeclarator(0);
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
		int _startState = 186;
		enterRecursionRule(_localctx, RULE_directAbstractDeclarator);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1030);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				{
				setState(996); match(LeftParen);
				setState(997); abstractDeclarator();
				setState(998); match(RightParen);
				}
				break;

			case 2:
				{
				setState(1000); match(LeftBracket);
				setState(1002);
				_la = _input.LA(1);
				if (_la==Const) {
					{
					setState(1001); typeQualifierList(0);
					}
				}

				setState(1005);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 5) | (1L << 16) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LeftParen - 64)) | (1L << (Plus - 64)) | (1L << (PlusPlus - 64)) | (1L << (Minus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (AndAnd - 64)) | (1L << (Not - 64)) | (1L << (Tilde - 64)) | (1L << (Identifier - 64)) | (1L << (Constant - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
					{
					setState(1004); assignmentExpression();
					}
				}

				setState(1007); match(RightBracket);
				}
				break;

			case 3:
				{
				setState(1008); match(LeftBracket);
				setState(1009); match(Static);
				setState(1011);
				_la = _input.LA(1);
				if (_la==Const) {
					{
					setState(1010); typeQualifierList(0);
					}
				}

				setState(1013); assignmentExpression();
				setState(1014); match(RightBracket);
				}
				break;

			case 4:
				{
				setState(1016); match(LeftBracket);
				setState(1017); typeQualifierList(0);
				setState(1018); match(Static);
				setState(1019); assignmentExpression();
				setState(1020); match(RightBracket);
				}
				break;

			case 5:
				{
				setState(1022); match(LeftBracket);
				setState(1023); match(Star);
				setState(1024); match(RightBracket);
				}
				break;

			case 6:
				{
				setState(1025); match(LeftParen);
				setState(1027);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 5) | (1L << 16) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LeftParen - 64)) | (1L << (Plus - 64)) | (1L << (PlusPlus - 64)) | (1L << (Minus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (AndAnd - 64)) | (1L << (Not - 64)) | (1L << (Tilde - 64)) | (1L << (Identifier - 64)) | (1L << (Constant - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
					{
					setState(1026); parameterTypeList();
					}
				}

				setState(1029); match(RightParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1069);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1067);
					switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
					case 1:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(1032);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(1033); match(LeftBracket);
						setState(1035);
						_la = _input.LA(1);
						if (_la==Const) {
							{
							setState(1034); typeQualifierList(0);
							}
						}

						setState(1038);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 5) | (1L << 16) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LeftParen - 64)) | (1L << (Plus - 64)) | (1L << (PlusPlus - 64)) | (1L << (Minus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (AndAnd - 64)) | (1L << (Not - 64)) | (1L << (Tilde - 64)) | (1L << (Identifier - 64)) | (1L << (Constant - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
							{
							setState(1037); assignmentExpression();
							}
						}

						setState(1040); match(RightBracket);
						}
						break;

					case 2:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(1041);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(1042); match(LeftBracket);
						setState(1043); match(Static);
						setState(1045);
						_la = _input.LA(1);
						if (_la==Const) {
							{
							setState(1044); typeQualifierList(0);
							}
						}

						setState(1047); assignmentExpression();
						setState(1048); match(RightBracket);
						}
						break;

					case 3:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(1050);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(1051); match(LeftBracket);
						setState(1052); typeQualifierList(0);
						setState(1053); match(Static);
						setState(1054); assignmentExpression();
						setState(1055); match(RightBracket);
						}
						break;

					case 4:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(1057);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(1058); match(LeftBracket);
						setState(1059); match(Star);
						setState(1060); match(RightBracket);
						}
						break;

					case 5:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(1061);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(1062); match(LeftParen);
						setState(1064);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 5) | (1L << 16) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LeftParen - 64)) | (1L << (Plus - 64)) | (1L << (PlusPlus - 64)) | (1L << (Minus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (AndAnd - 64)) | (1L << (Not - 64)) | (1L << (Tilde - 64)) | (1L << (Identifier - 64)) | (1L << (Constant - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
							{
							setState(1063); parameterTypeList();
							}
						}

						setState(1066); match(RightParen);
						}
						break;
					}
					} 
				}
				setState(1071);
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
		enterRule(_localctx, 188, RULE_typedefName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1072); match(Identifier);
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
		enterRule(_localctx, 190, RULE_initializer);
		try {
			setState(1084);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1074); assignmentExpression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1075); match(LeftBrace);
				setState(1076); initializerList(0);
				setState(1077); match(RightBrace);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1079); match(LeftBrace);
				setState(1080); initializerList(0);
				setState(1081); match(Comma);
				setState(1082); match(RightBrace);
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
		int _startState = 192;
		enterRecursionRule(_localctx, RULE_initializerList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1088);
			_la = _input.LA(1);
			if (_la==LeftBracket || _la==Dot) {
				{
				setState(1087); designation();
				}
			}

			setState(1090); initializer();
			}
			_ctx.stop = _input.LT(-1);
			setState(1100);
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
					setState(1092);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(1093); match(Comma);
					setState(1095);
					_la = _input.LA(1);
					if (_la==LeftBracket || _la==Dot) {
						{
						setState(1094); designation();
						}
					}

					setState(1097); initializer();
					}
					} 
				}
				setState(1102);
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
		enterRule(_localctx, 194, RULE_designation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1103); designatorList(0);
			setState(1104); match(Assign);
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
		int _startState = 196;
		enterRecursionRule(_localctx, RULE_designatorList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1107); designator();
			}
			_ctx.stop = _input.LT(-1);
			setState(1113);
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
					setState(1109);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(1110); designator();
					}
					} 
				}
				setState(1115);
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
		enterRule(_localctx, 198, RULE_designator);
		try {
			setState(1122);
			switch (_input.LA(1)) {
			case LeftBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(1116); match(LeftBracket);
				setState(1117); constantExpression();
				setState(1118); match(RightBracket);
				}
				break;
			case Dot:
				enterOuterAlt(_localctx, 2);
				{
				setState(1120); match(Dot);
				setState(1121); match(Identifier);
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
		enterRule(_localctx, 200, RULE_staticAssertDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1124); match(StaticAssert);
			setState(1125); match(LeftParen);
			setState(1126); constantExpression();
			setState(1127); match(Comma);
			setState(1129); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1128); match(StringLiteral);
				}
				}
				setState(1131); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==StringLiteral );
			setState(1133); match(RightParen);
			setState(1134); match(Semi);
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
		enterRule(_localctx, 202, RULE_statement);
		int _la;
		try {
			setState(1173);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1136); labeledStatement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1137); compoundStatement();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1138); expressionStatement();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1139); selectionStatement();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1140); iterationStatement();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1141); jumpStatement();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1142);
				_la = _input.LA(1);
				if ( !(_la==8 || _la==13) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(1143);
				_la = _input.LA(1);
				if ( !(_la==18 || _la==Volatile) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(1144); match(LeftParen);
				setState(1153);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 5) | (1L << 16) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LeftParen - 64)) | (1L << (Plus - 64)) | (1L << (PlusPlus - 64)) | (1L << (Minus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (AndAnd - 64)) | (1L << (Not - 64)) | (1L << (Tilde - 64)) | (1L << (Identifier - 64)) | (1L << (Constant - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
					{
					setState(1145); logicalOrExpression(0);
					setState(1150);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(1146); match(Comma);
						setState(1147); logicalOrExpression(0);
						}
						}
						setState(1152);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Colon) {
					{
					{
					setState(1155); match(Colon);
					setState(1164);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 5) | (1L << 16) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LeftParen - 64)) | (1L << (Plus - 64)) | (1L << (PlusPlus - 64)) | (1L << (Minus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (AndAnd - 64)) | (1L << (Not - 64)) | (1L << (Tilde - 64)) | (1L << (Identifier - 64)) | (1L << (Constant - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
						{
						setState(1156); logicalOrExpression(0);
						setState(1161);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Comma) {
							{
							{
							setState(1157); match(Comma);
							setState(1158); logicalOrExpression(0);
							}
							}
							setState(1163);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					}
					}
					setState(1170);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1171); match(RightParen);
				setState(1172); match(Semi);
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
		enterRule(_localctx, 204, RULE_labeledStatement);
		try {
			setState(1186);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1175); match(Identifier);
				setState(1176); match(Colon);
				setState(1177); statement();
				}
				break;
			case Case:
				enterOuterAlt(_localctx, 2);
				{
				setState(1178); match(Case);
				setState(1179); constantExpression();
				setState(1180); match(Colon);
				setState(1181); statement();
				}
				break;
			case Default:
				enterOuterAlt(_localctx, 3);
				{
				setState(1183); match(Default);
				setState(1184); match(Colon);
				setState(1185); statement();
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
		enterRule(_localctx, 206, RULE_compoundStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1188); match(LeftBrace);
			setState(1190);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 5) | (1L << 8) | (1L << 9) | (1L << 10) | (1L << 11) | (1L << 13) | (1L << 15) | (1L << 16) | (1L << 17) | (1L << Break) | (1L << Case) | (1L << Const) | (1L << Continue) | (1L << Default) | (1L << Do) | (1L << Enum) | (1L << For) | (1L << Goto) | (1L << If) | (1L << Return) | (1L << Sizeof) | (1L << Switch) | (1L << While) | (1L << Alignof) | (1L << Generic) | (1L << StaticAssert))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LeftParen - 64)) | (1L << (LeftBrace - 64)) | (1L << (Plus - 64)) | (1L << (PlusPlus - 64)) | (1L << (Minus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (AndAnd - 64)) | (1L << (Not - 64)) | (1L << (Tilde - 64)) | (1L << (Semi - 64)) | (1L << (Identifier - 64)) | (1L << (Constant - 64)) | (1L << (StringLiteral - 64)) | (1L << (LineDirective - 64)))) != 0)) {
				{
				setState(1189); blockItemList(0);
				}
			}

			setState(1192); match(RightBrace);
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
		int _startState = 208;
		enterRecursionRule(_localctx, RULE_blockItemList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1195); blockItem();
			}
			_ctx.stop = _input.LT(-1);
			setState(1201);
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
					setState(1197);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(1198); blockItem();
					}
					} 
				}
				setState(1203);
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
		enterRule(_localctx, 210, RULE_blockItem);
		try {
			setState(1207);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1204); declaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1205); statement();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1206); match(LineDirective);
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
		enterRule(_localctx, 212, RULE_expressionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1210);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 5) | (1L << 16) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LeftParen - 64)) | (1L << (Plus - 64)) | (1L << (PlusPlus - 64)) | (1L << (Minus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (AndAnd - 64)) | (1L << (Not - 64)) | (1L << (Tilde - 64)) | (1L << (Identifier - 64)) | (1L << (Constant - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
				{
				setState(1209); expression(0);
				}
			}

			setState(1212); match(Semi);
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
		enterRule(_localctx, 214, RULE_selectionStatement);
		try {
			setState(1229);
			switch (_input.LA(1)) {
			case If:
				enterOuterAlt(_localctx, 1);
				{
				setState(1214); match(If);
				setState(1215); match(LeftParen);
				setState(1216); expression(0);
				setState(1217); match(RightParen);
				setState(1218); statement();
				setState(1221);
				switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
				case 1:
					{
					setState(1219); match(Else);
					setState(1220); statement();
					}
					break;
				}
				}
				break;
			case Switch:
				enterOuterAlt(_localctx, 2);
				{
				setState(1223); match(Switch);
				setState(1224); match(LeftParen);
				setState(1225); expression(0);
				setState(1226); match(RightParen);
				setState(1227); statement();
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
		enterRule(_localctx, 216, RULE_iterationStatement);
		int _la;
		try {
			setState(1273);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1231); match(While);
				setState(1232); match(LeftParen);
				setState(1233); expression(0);
				setState(1234); match(RightParen);
				setState(1235); statement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1237); match(Do);
				setState(1238); statement();
				setState(1239); match(While);
				setState(1240); match(LeftParen);
				setState(1241); expression(0);
				setState(1242); match(RightParen);
				setState(1243); match(Semi);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1245); match(For);
				setState(1246); match(LeftParen);
				setState(1248);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 5) | (1L << 16) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LeftParen - 64)) | (1L << (Plus - 64)) | (1L << (PlusPlus - 64)) | (1L << (Minus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (AndAnd - 64)) | (1L << (Not - 64)) | (1L << (Tilde - 64)) | (1L << (Identifier - 64)) | (1L << (Constant - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
					{
					setState(1247); expression(0);
					}
				}

				setState(1250); match(Semi);
				setState(1252);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 5) | (1L << 16) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LeftParen - 64)) | (1L << (Plus - 64)) | (1L << (PlusPlus - 64)) | (1L << (Minus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (AndAnd - 64)) | (1L << (Not - 64)) | (1L << (Tilde - 64)) | (1L << (Identifier - 64)) | (1L << (Constant - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
					{
					setState(1251); expression(0);
					}
				}

				setState(1254); match(Semi);
				setState(1256);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 5) | (1L << 16) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LeftParen - 64)) | (1L << (Plus - 64)) | (1L << (PlusPlus - 64)) | (1L << (Minus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (AndAnd - 64)) | (1L << (Not - 64)) | (1L << (Tilde - 64)) | (1L << (Identifier - 64)) | (1L << (Constant - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
					{
					setState(1255); expression(0);
					}
				}

				setState(1258); match(RightParen);
				setState(1259); statement();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1260); match(For);
				setState(1261); match(LeftParen);
				setState(1262); declaration();
				setState(1264);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 5) | (1L << 16) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LeftParen - 64)) | (1L << (Plus - 64)) | (1L << (PlusPlus - 64)) | (1L << (Minus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (AndAnd - 64)) | (1L << (Not - 64)) | (1L << (Tilde - 64)) | (1L << (Identifier - 64)) | (1L << (Constant - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
					{
					setState(1263); expression(0);
					}
				}

				setState(1266); match(Semi);
				setState(1268);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 5) | (1L << 16) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LeftParen - 64)) | (1L << (Plus - 64)) | (1L << (PlusPlus - 64)) | (1L << (Minus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (AndAnd - 64)) | (1L << (Not - 64)) | (1L << (Tilde - 64)) | (1L << (Identifier - 64)) | (1L << (Constant - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
					{
					setState(1267); expression(0);
					}
				}

				setState(1270); match(RightParen);
				setState(1271); statement();
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
		enterRule(_localctx, 218, RULE_jumpStatement);
		int _la;
		try {
			setState(1287);
			switch (_input.LA(1)) {
			case Goto:
				enterOuterAlt(_localctx, 1);
				{
				setState(1275); match(Goto);
				setState(1276); match(Identifier);
				setState(1277); match(Semi);
				}
				break;
			case Continue:
				enterOuterAlt(_localctx, 2);
				{
				setState(1278); match(Continue);
				setState(1279); match(Semi);
				}
				break;
			case Break:
				enterOuterAlt(_localctx, 3);
				{
				setState(1280); match(Break);
				setState(1281); match(Semi);
				}
				break;
			case Return:
				enterOuterAlt(_localctx, 4);
				{
				setState(1282); match(Return);
				setState(1284);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 5) | (1L << 16) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LeftParen - 64)) | (1L << (Plus - 64)) | (1L << (PlusPlus - 64)) | (1L << (Minus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (AndAnd - 64)) | (1L << (Not - 64)) | (1L << (Tilde - 64)) | (1L << (Identifier - 64)) | (1L << (Constant - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
					{
					setState(1283); expression(0);
					}
				}

				setState(1286); match(Semi);
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
		enterRule(_localctx, 220, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1290);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 9) | (1L << 10) | (1L << 11) | (1L << 15) | (1L << 17) | (1L << Const) | (1L << Enum) | (1L << StaticAssert))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LeftParen - 64)) | (1L << (Semi - 64)) | (1L << (Identifier - 64)) | (1L << (LineDirective - 64)))) != 0)) {
				{
				setState(1289); translationUnit(0);
				}
			}

			setState(1292); match(EOF);
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
		int _startState = 222;
		enterRecursionRule(_localctx, RULE_translationUnit);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1295); externalDeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(1301);
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
					setState(1297);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(1298); externalDeclaration();
					}
					} 
				}
				setState(1303);
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
		enterRule(_localctx, 224, RULE_externalDeclaration);
		try {
			setState(1308);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1304); functionDefinition();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1305); declaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1306); match(Semi);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1307); match(LineDirective);
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
		enterRule(_localctx, 226, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1311);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				{
				setState(1310); declarationSpecifiers();
				}
				break;
			}
			setState(1313); functionDeclarator();
			setState(1315);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 9) | (1L << 10) | (1L << 11) | (1L << 15) | (1L << 17) | (1L << Const) | (1L << Enum) | (1L << StaticAssert))) != 0) || _la==Identifier) {
				{
				setState(1314); declarationList(0);
				}
			}

			setState(1317); compoundStatement();
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
		enterRule(_localctx, 228, RULE_functionDeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1319); declarator();
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
		int _startState = 230;
		enterRecursionRule(_localctx, RULE_declarationList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1322); declaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(1328);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DeclarationListContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_declarationList);
					setState(1324);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(1325); declaration();
					}
					} 
				}
				setState(1330);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
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

		case 69: return enumeratorList_sempred((EnumeratorListContext)_localctx, predIndex);

		case 78: return directDeclarator_sempred((DirectDeclaratorContext)_localctx, predIndex);

		case 85: return typeQualifierList_sempred((TypeQualifierListContext)_localctx, predIndex);

		case 88: return parameterList_sempred((ParameterListContext)_localctx, predIndex);

		case 90: return identifierList_sempred((IdentifierListContext)_localctx, predIndex);

		case 93: return directAbstractDeclarator_sempred((DirectAbstractDeclaratorContext)_localctx, predIndex);

		case 96: return initializerList_sempred((InitializerListContext)_localctx, predIndex);

		case 98: return designatorList_sempred((DesignatorListContext)_localctx, predIndex);

		case 104: return blockItemList_sempred((BlockItemListContext)_localctx, predIndex);

		case 111: return translationUnit_sempred((TranslationUnitContext)_localctx, predIndex);

		case 115: return declarationList_sempred((DeclarationListContext)_localctx, predIndex);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3w\u0536\4\2\t\2\4"+
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
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\3\2\5\2"+
		"\u00ec\n\2\3\2\3\2\3\2\6\2\u00f1\n\2\r\2\16\2\u00f2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\5\2\u00fb\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\5\2\u010f\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\7\4\u011e\n\4\f\4\16\4\u0121\13\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\5\5\u012a\n\5\3\6\3\6\3\6\3\7\3\7\5\7\u0131\n\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0157"+
		"\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7"+
		"\b\u0169\n\b\f\b\16\b\u016c\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0175"+
		"\n\t\f\t\16\t\u0178\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0190\n\n\3\13\3\13\3\f"+
		"\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\5\16\u01a4\n\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u01bb\n\22"+
		"\f\22\16\22\u01be\13\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\7\25\u01cf\n\25\f\25\16\25\u01d2\13\25\3"+
		"\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\7\30\u01e3\n\30\f\30\16\30\u01e6\13\30\3\31\3\31\3\32\3\32\3\33\3"+
		"\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u0203\n\35\f\35\16\35\u0206"+
		"\13\35\3\36\3\36\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \7 \u0217\n"+
		" \f \16 \u021a\13 \3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u0225\n\"\f\""+
		"\16\"\u0228\13\"\3#\3#\3$\3$\3$\3$\3$\3$\3$\7$\u0233\n$\f$\16$\u0236\13"+
		"$\3%\3%\3&\3&\3&\3&\3&\3&\3&\7&\u0241\n&\f&\16&\u0244\13&\3\'\3\'\3(\3"+
		"(\3(\3(\3(\3(\3(\7(\u024f\n(\f(\16(\u0252\13(\3)\3)\3*\3*\3*\3*\3*\3*"+
		"\3*\7*\u025d\n*\f*\16*\u0260\13*\3+\3+\3,\3,\3-\3-\3-\3-\3-\3-\5-\u026c"+
		"\n-\3.\3.\3.\3.\3.\5.\u0273\n.\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\7\60"+
		"\u027d\n\60\f\60\16\60\u0280\13\60\3\61\3\61\3\62\3\62\5\62\u0286\n\62"+
		"\3\62\3\62\3\62\5\62\u028b\n\62\3\63\6\63\u028e\n\63\r\63\16\63\u028f"+
		"\3\64\6\64\u0293\n\64\r\64\16\64\u0294\3\65\3\65\3\65\3\65\5\65\u029b"+
		"\n\65\3\66\3\66\3\66\3\66\3\66\3\66\7\66\u02a3\n\66\f\66\16\66\u02a6\13"+
		"\66\3\67\3\67\38\38\38\38\38\58\u02af\n8\39\39\3:\3:\3:\3;\3;\3;\5;\u02b9"+
		"\n;\3<\3<\3<\5<\u02be\n<\3<\3<\5<\u02c2\n<\3<\3<\3=\3=\3=\3>\3>\3>\3>"+
		"\3>\7>\u02ce\n>\f>\16>\u02d1\13>\3?\3?\3@\3@\3A\3A\3B\3B\3B\5B\u02dc\n"+
		"B\3C\3C\3D\5D\u02e1\nD\3D\5D\u02e4\nD\3D\3D\3D\3D\5D\u02ea\nD\3D\3D\5"+
		"D\u02ee\nD\3E\3E\5E\u02f2\nE\3E\3E\5E\u02f6\nE\5E\u02f8\nE\3F\3F\5F\u02fc"+
		"\nF\3F\3F\3F\3F\3F\3F\5F\u0304\nF\3F\3F\3F\3F\3F\3F\3F\5F\u030d\nF\3G"+
		"\3G\3G\3G\3G\3G\7G\u0315\nG\fG\16G\u0318\13G\3H\3H\3H\3H\3H\5H\u031f\n"+
		"H\3I\5I\u0322\nI\3I\3I\3J\3J\3J\3J\3J\3K\3K\3L\3L\3M\3M\3M\3M\3M\3M\5"+
		"M\u0335\nM\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\5N\u0341\nN\3O\3O\3P\3P\3P\3"+
		"P\3P\3P\5P\u034b\nP\3P\3P\3P\5P\u0350\nP\3P\5P\u0353\nP\3P\3P\3P\3P\5"+
		"P\u0359\nP\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\5P\u0365\nP\3P\3P\7P\u0369\n"+
		"P\fP\16P\u036c\13P\3Q\3Q\3Q\6Q\u0371\nQ\rQ\16Q\u0372\3Q\3Q\5Q\u0377\n"+
		"Q\3R\3R\3R\3R\3R\3R\3R\3S\3S\3S\7S\u0383\nS\fS\16S\u0386\13S\3S\5S\u0389"+
		"\nS\3T\3T\3T\5T\u038e\nT\3T\5T\u0391\nT\3T\5T\u0394\nT\3U\3U\3U\3U\3U"+
		"\7U\u039b\nU\fU\16U\u039e\13U\3V\3V\5V\u03a2\nV\3V\3V\5V\u03a6\nV\3V\3"+
		"V\3V\5V\u03ab\nV\3V\3V\5V\u03af\nV\3V\5V\u03b2\nV\3W\3W\3W\3W\3W\7W\u03b9"+
		"\nW\fW\16W\u03bc\13W\3X\3X\3X\3X\3X\5X\u03c3\nX\3Y\3Y\3Z\3Z\3Z\3Z\3Z\3"+
		"Z\3Z\7Z\u03ce\nZ\fZ\16Z\u03d1\13Z\3[\3[\3\\\3\\\3\\\3\\\3\\\3\\\7\\\u03db"+
		"\n\\\f\\\16\\\u03de\13\\\3]\3]\5]\u03e2\n]\3^\3^\3_\3_\3_\3_\3_\3_\3_"+
		"\5_\u03ed\n_\3_\5_\u03f0\n_\3_\3_\3_\3_\5_\u03f6\n_\3_\3_\3_\3_\3_\3_"+
		"\3_\3_\3_\3_\3_\3_\3_\3_\5_\u0406\n_\3_\5_\u0409\n_\3_\3_\3_\5_\u040e"+
		"\n_\3_\5_\u0411\n_\3_\3_\3_\3_\3_\5_\u0418\n_\3_\3_\3_\3_\3_\3_\3_\3_"+
		"\3_\3_\3_\3_\3_\3_\3_\3_\3_\5_\u042b\n_\3_\7_\u042e\n_\f_\16_\u0431\13"+
		"_\3`\3`\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\5a\u043f\na\3b\3b\5b\u0443\nb\3"+
		"b\3b\3b\3b\3b\5b\u044a\nb\3b\7b\u044d\nb\fb\16b\u0450\13b\3c\3c\3c\3d"+
		"\3d\3d\3d\3d\7d\u045a\nd\fd\16d\u045d\13d\3e\3e\3e\3e\3e\3e\5e\u0465\n"+
		"e\3f\3f\3f\3f\3f\6f\u046c\nf\rf\16f\u046d\3f\3f\3f\3g\3g\3g\3g\3g\3g\3"+
		"g\3g\3g\3g\3g\3g\7g\u047f\ng\fg\16g\u0482\13g\5g\u0484\ng\3g\3g\3g\3g"+
		"\7g\u048a\ng\fg\16g\u048d\13g\5g\u048f\ng\7g\u0491\ng\fg\16g\u0494\13"+
		"g\3g\3g\5g\u0498\ng\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\5h\u04a5\nh\3i\3"+
		"i\5i\u04a9\ni\3i\3i\3j\3j\3j\3j\3j\7j\u04b2\nj\fj\16j\u04b5\13j\3k\3k"+
		"\3k\5k\u04ba\nk\3l\5l\u04bd\nl\3l\3l\3m\3m\3m\3m\3m\3m\3m\5m\u04c8\nm"+
		"\3m\3m\3m\3m\3m\3m\5m\u04d0\nm\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n"+
		"\3n\3n\3n\3n\5n\u04e3\nn\3n\3n\5n\u04e7\nn\3n\3n\5n\u04eb\nn\3n\3n\3n"+
		"\3n\3n\3n\5n\u04f3\nn\3n\3n\5n\u04f7\nn\3n\3n\3n\5n\u04fc\nn\3o\3o\3o"+
		"\3o\3o\3o\3o\3o\3o\5o\u0507\no\3o\5o\u050a\no\3p\5p\u050d\np\3p\3p\3q"+
		"\3q\3q\3q\3q\7q\u0516\nq\fq\16q\u0519\13q\3r\3r\3r\3r\5r\u051f\nr\3s\5"+
		"s\u0522\ns\3s\3s\5s\u0526\ns\3s\3s\3t\3t\3u\3u\3u\3u\3u\7u\u0531\nu\f"+
		"u\16u\u0534\13u\3u\2v\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,."+
		"\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e"+
		"\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6"+
		"\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce"+
		"\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6"+
		"\u00e8\2\13\7\2NNPPRRUUZ[\3\2`j\4\2\3\3\13\13\5\2\r\r\21\21\23\23\6\2"+
		"\6\6\20\20&&??\4\2BC__\3\2BC\4\2\n\n\17\17\4\2\24\24\66\66\u0579\2\u010e"+
		"\3\2\2\2\4\u0110\3\2\2\2\6\u0117\3\2\2\2\b\u0129\3\2\2\2\n\u012b\3\2\2"+
		"\2\f\u012e\3\2\2\2\16\u0156\3\2\2\2\20\u016d\3\2\2\2\22\u018f\3\2\2\2"+
		"\24\u0191\3\2\2\2\26\u0193\3\2\2\2\30\u0195\3\2\2\2\32\u01a3\3\2\2\2\34"+
		"\u01a5\3\2\2\2\36\u01a7\3\2\2\2 \u01a9\3\2\2\2\"\u01ab\3\2\2\2$\u01bf"+
		"\3\2\2\2&\u01c1\3\2\2\2(\u01c3\3\2\2\2*\u01d3\3\2\2\2,\u01d5\3\2\2\2."+
		"\u01d7\3\2\2\2\60\u01e7\3\2\2\2\62\u01e9\3\2\2\2\64\u01eb\3\2\2\2\66\u01ed"+
		"\3\2\2\28\u01ef\3\2\2\2:\u0207\3\2\2\2<\u0209\3\2\2\2>\u020b\3\2\2\2@"+
		"\u021b\3\2\2\2B\u021d\3\2\2\2D\u0229\3\2\2\2F\u022b\3\2\2\2H\u0237\3\2"+
		"\2\2J\u0239\3\2\2\2L\u0245\3\2\2\2N\u0247\3\2\2\2P\u0253\3\2\2\2R\u0255"+
		"\3\2\2\2T\u0261\3\2\2\2V\u0263\3\2\2\2X\u0265\3\2\2\2Z\u0272\3\2\2\2\\"+
		"\u0274\3\2\2\2^\u0276\3\2\2\2`\u0281\3\2\2\2b\u028a\3\2\2\2d\u028d\3\2"+
		"\2\2f\u0292\3\2\2\2h\u029a\3\2\2\2j\u029c\3\2\2\2l\u02a7\3\2\2\2n\u02ae"+
		"\3\2\2\2p\u02b0\3\2\2\2r\u02b2\3\2\2\2t\u02b8\3\2\2\2v\u02ba\3\2\2\2x"+
		"\u02c5\3\2\2\2z\u02c8\3\2\2\2|\u02d2\3\2\2\2~\u02d4\3\2\2\2\u0080\u02d6"+
		"\3\2\2\2\u0082\u02db\3\2\2\2\u0084\u02dd\3\2\2\2\u0086\u02ed\3\2\2\2\u0088"+
		"\u02f7\3\2\2\2\u008a\u030c\3\2\2\2\u008c\u030e\3\2\2\2\u008e\u031e\3\2"+
		"\2\2\u0090\u0321\3\2\2\2\u0092\u0325\3\2\2\2\u0094\u032a\3\2\2\2\u0096"+
		"\u032c\3\2\2\2\u0098\u0334\3\2\2\2\u009a\u0340\3\2\2\2\u009c\u0342\3\2"+
		"\2\2\u009e\u034a\3\2\2\2\u00a0\u0376\3\2\2\2\u00a2\u0378\3\2\2\2\u00a4"+
		"\u0388\3\2\2\2\u00a6\u0393\3\2\2\2\u00a8\u039c\3\2\2\2\u00aa\u03b1\3\2"+
		"\2\2\u00ac\u03b3\3\2\2\2\u00ae\u03c2\3\2\2\2\u00b0\u03c4\3\2\2\2\u00b2"+
		"\u03c6\3\2\2\2\u00b4\u03d2\3\2\2\2\u00b6\u03d4\3\2\2\2\u00b8\u03df\3\2"+
		"\2\2\u00ba\u03e3\3\2\2\2\u00bc\u0408\3\2\2\2\u00be\u0432\3\2\2\2\u00c0"+
		"\u043e\3\2\2\2\u00c2\u0440\3\2\2\2\u00c4\u0451\3\2\2\2\u00c6\u0454\3\2"+
		"\2\2\u00c8\u0464\3\2\2\2\u00ca\u0466\3\2\2\2\u00cc\u0497\3\2\2\2\u00ce"+
		"\u04a4\3\2\2\2\u00d0\u04a6\3\2\2\2\u00d2\u04ac\3\2\2\2\u00d4\u04b9\3\2"+
		"\2\2\u00d6\u04bc\3\2\2\2\u00d8\u04cf\3\2\2\2\u00da\u04fb\3\2\2\2\u00dc"+
		"\u0509\3\2\2\2\u00de\u050c\3\2\2\2\u00e0\u0510\3\2\2\2\u00e2\u051e\3\2"+
		"\2\2\u00e4\u0521\3\2\2\2\u00e6\u0529\3\2\2\2\u00e8\u052b\3\2\2\2\u00ea"+
		"\u00ec\5r:\2\u00eb\u00ea\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\3\2\2"+
		"\2\u00ed\u010f\7p\2\2\u00ee\u010f\7q\2\2\u00ef\u00f1\7r\2\2\u00f0\u00ef"+
		"\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3"+
		"\u010f\3\2\2\2\u00f4\u00f5\7B\2\2\u00f5\u00f6\5^\60\2\u00f6\u00f7\7C\2"+
		"\2\u00f7\u010f\3\2\2\2\u00f8\u010f\5\4\3\2\u00f9\u00fb\7\4\2\2\u00fa\u00f9"+
		"\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\7B\2\2\u00fd"+
		"\u00fe\5\u00d0i\2\u00fe\u00ff\7C\2\2\u00ff\u010f\3\2\2\2\u0100\u0101\7"+
		"\22\2\2\u0101\u0102\7B\2\2\u0102\u0103\5\22\n\2\u0103\u0104\7_\2\2\u0104"+
		"\u0105\5\u00b8]\2\u0105\u0106\7C\2\2\u0106\u010f\3\2\2\2\u0107\u0108\7"+
		"\7\2\2\u0108\u0109\7B\2\2\u0109\u010a\5\u00b8]\2\u010a\u010b\7_\2\2\u010b"+
		"\u010c\5\22\n\2\u010c\u010d\7C\2\2\u010d\u010f\3\2\2\2\u010e\u00eb\3\2"+
		"\2\2\u010e\u00ee\3\2\2\2\u010e\u00f0\3\2\2\2\u010e\u00f4\3\2\2\2\u010e"+
		"\u00f8\3\2\2\2\u010e\u00fa\3\2\2\2\u010e\u0100\3\2\2\2\u010e\u0107\3\2"+
		"\2\2\u010f\3\3\2\2\2\u0110\u0111\7=\2\2\u0111\u0112\7B\2\2\u0112\u0113"+
		"\5Z.\2\u0113\u0114\7_\2\2\u0114\u0115\5\6\4\2\u0115\u0116\7C\2\2\u0116"+
		"\5\3\2\2\2\u0117\u0118\b\4\1\2\u0118\u0119\5\b\5\2\u0119\u011f\3\2\2\2"+
		"\u011a\u011b\6\4\2\3\u011b\u011c\7_\2\2\u011c\u011e\5\b\5\2\u011d\u011a"+
		"\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120"+
		"\7\3\2\2\2\u0121\u011f\3\2\2\2\u0122\u0123\5\u00b8]\2\u0123\u0124\7]\2"+
		"\2\u0124\u0125\5Z.\2\u0125\u012a\3\2\2\2\u0126\u0127\7\34\2\2\u0127\u0128"+
		"\7]\2\2\u0128\u012a\5Z.\2\u0129\u0122\3\2\2\2\u0129\u0126\3\2\2\2\u012a"+
		"\t\3\2\2\2\u012b\u012c\7n\2\2\u012c\u012d\7p\2\2\u012d\13\3\2\2\2\u012e"+
		"\u0130\7B\2\2\u012f\u0131\5\20\t\2\u0130\u012f\3\2\2\2\u0130\u0131\3\2"+
		"\2\2\u0131\u0132\3\2\2\2\u0132\u0133\5\30\r\2\u0133\r\3\2\2\2\u0134\u0135"+
		"\b\b\1\2\u0135\u0157\5\2\2\2\u0136\u0137\7B\2\2\u0137\u0138\5\u00b8]\2"+
		"\u0138\u0139\7C\2\2\u0139\u013a\7F\2\2\u013a\u013b\5\u00c2b\2\u013b\u013c"+
		"\7G\2\2\u013c\u0157\3\2\2\2\u013d\u013e\7B\2\2\u013e\u013f\5\u00b8]\2"+
		"\u013f\u0140\7C\2\2\u0140\u0141\7F\2\2\u0141\u0142\5\u00c2b\2\u0142\u0143"+
		"\7_\2\2\u0143\u0144\7G\2\2\u0144\u0157\3\2\2\2\u0145\u0146\7\4\2\2\u0146"+
		"\u0147\7B\2\2\u0147\u0148\5\u00b8]\2\u0148\u0149\7C\2\2\u0149\u014a\7"+
		"F\2\2\u014a\u014b\5\u00c2b\2\u014b\u014c\7G\2\2\u014c\u0157\3\2\2\2\u014d"+
		"\u014e\7\4\2\2\u014e\u014f\7B\2\2\u014f\u0150\5\u00b8]\2\u0150\u0151\7"+
		"C\2\2\u0151\u0152\7F\2\2\u0152\u0153\5\u00c2b\2\u0153\u0154\7_\2\2\u0154"+
		"\u0155\7G\2\2\u0155\u0157\3\2\2\2\u0156\u0134\3\2\2\2\u0156\u0136\3\2"+
		"\2\2\u0156\u013d\3\2\2\2\u0156\u0145\3\2\2\2\u0156\u014d\3\2\2\2\u0157"+
		"\u016a\3\2\2\2\u0158\u0159\6\b\3\3\u0159\u015a\7D\2\2\u015a\u015b\5^\60"+
		"\2\u015b\u015c\7E\2\2\u015c\u0169\3\2\2\2\u015d\u015e\6\b\4\3\u015e\u0169"+
		"\5\f\7\2\u015f\u0160\6\b\5\3\u0160\u0169\5\n\6\2\u0161\u0162\6\b\6\3\u0162"+
		"\u0163\7m\2\2\u0163\u0169\7p\2\2\u0164\u0165\6\b\7\3\u0165\u0169\7O\2"+
		"\2\u0166\u0167\6\b\b\3\u0167\u0169\7Q\2\2\u0168\u0158\3\2\2\2\u0168\u015d"+
		"\3\2\2\2\u0168\u015f\3\2\2\2\u0168\u0161\3\2\2\2\u0168\u0164\3\2\2\2\u0168"+
		"\u0166\3\2\2\2\u0169\u016c\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2"+
		"\2\2\u016b\17\3\2\2\2\u016c\u016a\3\2\2\2\u016d\u016e\b\t\1\2\u016e\u016f"+
		"\5Z.\2\u016f\u0176\3\2\2\2\u0170\u0171\6\t\t\3\u0171\u0172\5\u00b0Y\2"+
		"\u0172\u0173\5Z.\2\u0173\u0175\3\2\2\2\u0174\u0170\3\2\2\2\u0175\u0178"+
		"\3\2\2\2\u0176\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177\21\3\2\2\2\u0178"+
		"\u0176\3\2\2\2\u0179\u0190\5\16\b\2\u017a\u017b\7O\2\2\u017b\u0190\5\22"+
		"\n\2\u017c\u017d\7Q\2\2\u017d\u0190\5\22\n\2\u017e\u017f\5\24\13\2\u017f"+
		"\u0180\5\32\16\2\u0180\u0190\3\2\2\2\u0181\u0182\7.\2\2\u0182\u0190\5"+
		"\22\n\2\u0183\u0184\7.\2\2\u0184\u0185\7B\2\2\u0185\u0186\5\u00b8]\2\u0186"+
		"\u0187\7C\2\2\u0187\u0190\3\2\2\2\u0188\u0189\79\2\2\u0189\u018a\7B\2"+
		"\2\u018a\u018b\5\u00b8]\2\u018b\u018c\7C\2\2\u018c\u0190\3\2\2\2\u018d"+
		"\u018e\7W\2\2\u018e\u0190\7p\2\2\u018f\u0179\3\2\2\2\u018f\u017a\3\2\2"+
		"\2\u018f\u017c\3\2\2\2\u018f\u017e\3\2\2\2\u018f\u0181\3\2\2\2\u018f\u0183"+
		"\3\2\2\2\u018f\u0188\3\2\2\2\u018f\u018d\3\2\2\2\u0190\23\3\2\2\2\u0191"+
		"\u0192\t\2\2\2\u0192\25\3\2\2\2\u0193\u0194\7B\2\2\u0194\27\3\2\2\2\u0195"+
		"\u0196\7C\2\2\u0196\31\3\2\2\2\u0197\u01a4\5\22\n\2\u0198\u0199\5\26\f"+
		"\2\u0199\u019a\5\u00b8]\2\u019a\u019b\5\30\r\2\u019b\u019c\5\32\16\2\u019c"+
		"\u01a4\3\2\2\2\u019d\u019e\7\4\2\2\u019e\u019f\5\26\f\2\u019f\u01a0\5"+
		"\u00b8]\2\u01a0\u01a1\5\30\r\2\u01a1\u01a2\5\32\16\2\u01a2\u01a4\3\2\2"+
		"\2\u01a3\u0197\3\2\2\2\u01a3\u0198\3\2\2\2\u01a3\u019d\3\2\2\2\u01a4\33"+
		"\3\2\2\2\u01a5\u01a6\7R\2\2\u01a6\35\3\2\2\2\u01a7\u01a8\7S\2\2\u01a8"+
		"\37\3\2\2\2\u01a9\u01aa\7T\2\2\u01aa!\3\2\2\2\u01ab\u01ac\b\22\1\2\u01ac"+
		"\u01ad\5\32\16\2\u01ad\u01bc\3\2\2\2\u01ae\u01af\6\22\n\3\u01af\u01b0"+
		"\5\34\17\2\u01b0\u01b1\5\32\16\2\u01b1\u01bb\3\2\2\2\u01b2\u01b3\6\22"+
		"\13\3\u01b3\u01b4\5\36\20\2\u01b4\u01b5\5\32\16\2\u01b5\u01bb\3\2\2\2"+
		"\u01b6\u01b7\6\22\f\3\u01b7\u01b8\5 \21\2\u01b8\u01b9\5\32\16\2\u01b9"+
		"\u01bb\3\2\2\2\u01ba\u01ae\3\2\2\2\u01ba\u01b2\3\2\2\2\u01ba\u01b6\3\2"+
		"\2\2\u01bb\u01be\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd"+
		"#\3\2\2\2\u01be\u01bc\3\2\2\2\u01bf\u01c0\7N\2\2\u01c0%\3\2\2\2\u01c1"+
		"\u01c2\7P\2\2\u01c2\'\3\2\2\2\u01c3\u01c4\b\25\1\2\u01c4\u01c5\5\"\22"+
		"\2\u01c5\u01d0\3\2\2\2\u01c6\u01c7\6\25\r\3\u01c7\u01c8\5$\23\2\u01c8"+
		"\u01c9\5\"\22\2\u01c9\u01cf\3\2\2\2\u01ca\u01cb\6\25\16\3\u01cb\u01cc"+
		"\5&\24\2\u01cc\u01cd\5\"\22\2\u01cd\u01cf\3\2\2\2\u01ce\u01c6\3\2\2\2"+
		"\u01ce\u01ca\3\2\2\2\u01cf\u01d2\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d0\u01d1"+
		"\3\2\2\2\u01d1)\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d3\u01d4\7L\2\2\u01d4+"+
		"\3\2\2\2\u01d5\u01d6\7M\2\2\u01d6-\3\2\2\2\u01d7\u01d8\b\30\1\2\u01d8"+
		"\u01d9\5(\25\2\u01d9\u01e4\3\2\2\2\u01da\u01db\6\30\17\3\u01db\u01dc\5"+
		"*\26\2\u01dc\u01dd\5(\25\2\u01dd\u01e3\3\2\2\2\u01de\u01df\6\30\20\3\u01df"+
		"\u01e0\5,\27\2\u01e0\u01e1\5(\25\2\u01e1\u01e3\3\2\2\2\u01e2\u01da\3\2"+
		"\2\2\u01e2\u01de\3\2\2\2\u01e3\u01e6\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e4"+
		"\u01e5\3\2\2\2\u01e5/\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e7\u01e8\7H\2\2\u01e8"+
		"\61\3\2\2\2\u01e9\u01ea\7J\2\2\u01ea\63\3\2\2\2\u01eb\u01ec\7I\2\2\u01ec"+
		"\65\3\2\2\2\u01ed\u01ee\7K\2\2\u01ee\67\3\2\2\2\u01ef\u01f0\b\35\1\2\u01f0"+
		"\u01f1\5.\30\2\u01f1\u0204\3\2\2\2\u01f2\u01f3\6\35\21\3\u01f3\u01f4\5"+
		"\60\31\2\u01f4\u01f5\5.\30\2\u01f5\u0203\3\2\2\2\u01f6\u01f7\6\35\22\3"+
		"\u01f7\u01f8\5\62\32\2\u01f8\u01f9\5.\30\2\u01f9\u0203\3\2\2\2\u01fa\u01fb"+
		"\6\35\23\3\u01fb\u01fc\5\64\33\2\u01fc\u01fd\5.\30\2\u01fd\u0203\3\2\2"+
		"\2\u01fe\u01ff\6\35\24\3\u01ff\u0200\5\66\34\2\u0200\u0201\5.\30\2\u0201"+
		"\u0203\3\2\2\2\u0202\u01f2\3\2\2\2\u0202\u01f6\3\2\2\2\u0202\u01fa\3\2"+
		"\2\2\u0202\u01fe\3\2\2\2\u0203\u0206\3\2\2\2\u0204\u0202\3\2\2\2\u0204"+
		"\u0205\3\2\2\2\u02059\3\2\2\2\u0206\u0204\3\2\2\2\u0207\u0208\7k\2\2\u0208"+
		";\3\2\2\2\u0209\u020a\7l\2\2\u020a=\3\2\2\2\u020b\u020c\b \1\2\u020c\u020d"+
		"\58\35\2\u020d\u0218\3\2\2\2\u020e\u020f\6 \25\3\u020f\u0210\5:\36\2\u0210"+
		"\u0211\58\35\2\u0211\u0217\3\2\2\2\u0212\u0213\6 \26\3\u0213\u0214\5<"+
		"\37\2\u0214\u0215\58\35\2\u0215\u0217\3\2\2\2\u0216\u020e\3\2\2\2\u0216"+
		"\u0212\3\2\2\2\u0217\u021a\3\2\2\2\u0218\u0216\3\2\2\2\u0218\u0219\3\2"+
		"\2\2\u0219?\3\2\2\2\u021a\u0218\3\2\2\2\u021b\u021c\7U\2\2\u021cA\3\2"+
		"\2\2\u021d\u021e\b\"\1\2\u021e\u021f\5> \2\u021f\u0226\3\2\2\2\u0220\u0221"+
		"\6\"\27\3\u0221\u0222\5@!\2\u0222\u0223\5> \2\u0223\u0225\3\2\2\2\u0224"+
		"\u0220\3\2\2\2\u0225\u0228\3\2\2\2\u0226\u0224\3\2\2\2\u0226\u0227\3\2"+
		"\2\2\u0227C\3\2\2\2\u0228\u0226\3\2\2\2\u0229\u022a\7Y\2\2\u022aE\3\2"+
		"\2\2\u022b\u022c\b$\1\2\u022c\u022d\5B\"\2\u022d\u0234\3\2\2\2\u022e\u022f"+
		"\6$\30\3\u022f\u0230\5D#\2\u0230\u0231\5B\"\2\u0231\u0233\3\2\2\2\u0232"+
		"\u022e\3\2\2\2\u0233\u0236\3\2\2\2\u0234\u0232\3\2\2\2\u0234\u0235\3\2"+
		"\2\2\u0235G\3\2\2\2\u0236\u0234\3\2\2\2\u0237\u0238\7V\2\2\u0238I\3\2"+
		"\2\2\u0239\u023a\b&\1\2\u023a\u023b\5F$\2\u023b\u0242\3\2\2\2\u023c\u023d"+
		"\6&\31\3\u023d\u023e\5H%\2\u023e\u023f\5F$\2\u023f\u0241\3\2\2\2\u0240"+
		"\u023c\3\2\2\2\u0241\u0244\3\2\2\2\u0242\u0240\3\2\2\2\u0242\u0243\3\2"+
		"\2\2\u0243K\3\2\2\2\u0244\u0242\3\2\2\2\u0245\u0246\7W\2\2\u0246M\3\2"+
		"\2\2\u0247\u0248\b(\1\2\u0248\u0249\5J&\2\u0249\u0250\3\2\2\2\u024a\u024b"+
		"\6(\32\3\u024b\u024c\5L\'\2\u024c\u024d\5J&\2\u024d\u024f\3\2\2\2\u024e"+
		"\u024a\3\2\2\2\u024f\u0252\3\2\2\2\u0250\u024e\3\2\2\2\u0250\u0251\3\2"+
		"\2\2\u0251O\3\2\2\2\u0252\u0250\3\2\2\2\u0253\u0254\7X\2\2\u0254Q\3\2"+
		"\2\2\u0255\u0256\b*\1\2\u0256\u0257\5N(\2\u0257\u025e\3\2\2\2\u0258\u0259"+
		"\6*\33\3\u0259\u025a\5P)\2\u025a\u025b\5N(\2\u025b\u025d\3\2\2\2\u025c"+
		"\u0258\3\2\2\2\u025d\u0260\3\2\2\2\u025e\u025c\3\2\2\2\u025e\u025f\3\2"+
		"\2\2\u025fS\3\2\2\2\u0260\u025e\3\2\2\2\u0261\u0262\7\\\2\2\u0262U\3\2"+
		"\2\2\u0263\u0264\7]\2\2\u0264W\3\2\2\2\u0265\u026b\5R*\2\u0266\u0267\5"+
		"T+\2\u0267\u0268\5^\60\2\u0268\u0269\5V,\2\u0269\u026a\5X-\2\u026a\u026c"+
		"\3\2\2\2\u026b\u0266\3\2\2\2\u026b\u026c\3\2\2\2\u026cY\3\2\2\2\u026d"+
		"\u0273\5X-\2\u026e\u026f\5\22\n\2\u026f\u0270\5\\/\2\u0270\u0271\5Z.\2"+
		"\u0271\u0273\3\2\2\2\u0272\u026d\3\2\2\2\u0272\u026e\3\2\2\2\u0273[\3"+
		"\2\2\2\u0274\u0275\t\3\2\2\u0275]\3\2\2\2\u0276\u0277\b\60\1\2\u0277\u0278"+
		"\5Z.\2\u0278\u027e\3\2\2\2\u0279\u027a\6\60\34\3\u027a\u027b\7_\2\2\u027b"+
		"\u027d\5Z.\2\u027c\u0279\3\2\2\2\u027d\u0280\3\2\2\2\u027e\u027c\3\2\2"+
		"\2\u027e\u027f\3\2\2\2\u027f_\3\2\2\2\u0280\u027e\3\2\2\2\u0281\u0282"+
		"\5X-\2\u0282a\3\2\2\2\u0283\u0285\5d\63\2\u0284\u0286\5j\66\2\u0285\u0284"+
		"\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u0287\3\2\2\2\u0287\u0288\7^\2\2\u0288"+
		"\u028b\3\2\2\2\u0289\u028b\5\u00caf\2\u028a\u0283\3\2\2\2\u028a\u0289"+
		"\3\2\2\2\u028bc\3\2\2\2\u028c\u028e\5h\65\2\u028d\u028c\3\2\2\2\u028e"+
		"\u028f\3\2\2\2\u028f\u028d\3\2\2\2\u028f\u0290\3\2\2\2\u0290e\3\2\2\2"+
		"\u0291\u0293\5h\65\2\u0292\u0291\3\2\2\2\u0293\u0294\3\2\2\2\u0294\u0292"+
		"\3\2\2\2\u0294\u0295\3\2\2\2\u0295g\3\2\2\2\u0296\u029b\5p9\2\u0297\u029b"+
		"\5t;\2\u0298\u029b\5\u0094K\2\u0299\u029b\5\u0096L\2\u029a\u0296\3\2\2"+
		"\2\u029a\u0297\3\2\2\2\u029a\u0298\3\2\2\2\u029a\u0299\3\2\2\2\u029bi"+
		"\3\2\2\2\u029c\u029d\b\66\1\2\u029d\u029e\5n8\2\u029e\u02a4\3\2\2\2\u029f"+
		"\u02a0\6\66\35\3\u02a0\u02a1\7_\2\2\u02a1\u02a3\5n8\2\u02a2\u029f\3\2"+
		"\2\2\u02a3\u02a6\3\2\2\2\u02a4\u02a2\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5"+
		"k\3\2\2\2\u02a6\u02a4\3\2\2\2\u02a7\u02a8\7`\2\2\u02a8m\3\2\2\2\u02a9"+
		"\u02af\5\u009cO\2\u02aa\u02ab\5\u009cO\2\u02ab\u02ac\5l\67\2\u02ac\u02ad"+
		"\5\u00c0a\2\u02ad\u02af\3\2\2\2\u02ae\u02a9\3\2\2\2\u02ae\u02aa\3\2\2"+
		"\2\u02afo\3\2\2\2\u02b0\u02b1\t\4\2\2\u02b1q\3\2\2\2\u02b2\u02b3\7p\2"+
		"\2\u02b3\u02b4\7]\2\2\u02b4s\3\2\2\2\u02b5\u02b9\5r:\2\u02b6\u02b9\5\u008a"+
		"F\2\u02b7\u02b9\5v<\2\u02b8\u02b5\3\2\2\2\u02b8\u02b6\3\2\2\2\u02b8\u02b7"+
		"\3\2\2\2\u02b9u\3\2\2\2\u02ba\u02bb\7\f\2\2\u02bb\u02bd\7p\2\2\u02bc\u02be"+
		"\5x=\2\u02bd\u02bc\3\2\2\2\u02bd\u02be\3\2\2\2\u02be\u02bf\3\2\2\2\u02bf"+
		"\u02c1\7F\2\2\u02c0\u02c2\5z>\2\u02c1\u02c0\3\2\2\2\u02c1\u02c2\3\2\2"+
		"\2\u02c2\u02c3\3\2\2\2\u02c3\u02c4\7G\2\2\u02c4w\3\2\2\2\u02c5\u02c6\7"+
		"]\2\2\u02c6\u02c7\5\u00b6\\\2\u02c7y\3\2\2\2\u02c8\u02c9\b>\1\2\u02c9"+
		"\u02ca\5\u0086D\2\u02ca\u02cf\3\2\2\2\u02cb\u02cc\6>\36\3\u02cc\u02ce"+
		"\5\u0086D\2\u02cd\u02cb\3\2\2\2\u02ce\u02d1\3\2\2\2\u02cf\u02cd\3\2\2"+
		"\2\u02cf\u02d0\3\2\2\2\u02d0{\3\2\2\2\u02d1\u02cf\3\2\2\2\u02d2\u02d3"+
		"\7\16\2\2\u02d3}\3\2\2\2\u02d4\u02d5\7\5\2\2\u02d5\177\3\2\2\2\u02d6\u02d7"+
		"\7\25\2\2\u02d7\u0081\3\2\2\2\u02d8\u02dc\5|?\2\u02d9\u02dc\5~@\2\u02da"+
		"\u02dc\5\u0080A\2\u02db\u02d8\3\2\2\2\u02db\u02d9\3\2\2\2\u02db\u02da"+
		"\3\2\2\2\u02dc\u0083\3\2\2\2\u02dd\u02de\7^\2\2\u02de\u0085\3\2\2\2\u02df"+
		"\u02e1\5\u0082B\2\u02e0\u02df\3\2\2\2\u02e0\u02e1\3\2\2\2\u02e1\u02e3"+
		"\3\2\2\2\u02e2\u02e4\5r:\2\u02e3\u02e2\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4"+
		"\u02e5\3\2\2\2\u02e5\u02e6\5\u00b6\\\2\u02e6\u02e7\5\u0084C\2\u02e7\u02ee"+
		"\3\2\2\2\u02e8\u02ea\5\u0082B\2\u02e9\u02e8\3\2\2\2\u02e9\u02ea\3\2\2"+
		"\2\u02ea\u02eb\3\2\2\2\u02eb\u02ee\5\u00e4s\2\u02ec\u02ee\7s\2\2\u02ed"+
		"\u02e0\3\2\2\2\u02ed\u02e9\3\2\2\2\u02ed\u02ec\3\2\2\2\u02ee\u0087\3\2"+
		"\2\2\u02ef\u02f1\5t;\2\u02f0\u02f2\5\u0088E\2\u02f1\u02f0\3\2\2\2\u02f1"+
		"\u02f2\3\2\2\2\u02f2\u02f8\3\2\2\2\u02f3\u02f5\5\u0094K\2\u02f4\u02f6"+
		"\5\u0088E\2\u02f5\u02f4\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6\u02f8\3\2\2"+
		"\2\u02f7\u02ef\3\2\2\2\u02f7\u02f3\3\2\2\2\u02f8\u0089\3\2\2\2\u02f9\u02fb"+
		"\7 \2\2\u02fa\u02fc\7p\2\2\u02fb\u02fa\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc"+
		"\u02fd\3\2\2\2\u02fd\u02fe\7F\2\2\u02fe\u02ff\5\u008cG\2\u02ff\u0300\7"+
		"G\2\2\u0300\u030d\3\2\2\2\u0301\u0303\7 \2\2\u0302\u0304\7p\2\2\u0303"+
		"\u0302\3\2\2\2\u0303\u0304\3\2\2\2\u0304\u0305\3\2\2\2\u0305\u0306\7F"+
		"\2\2\u0306\u0307\5\u008cG\2\u0307\u0308\7_\2\2\u0308\u0309\7G\2\2\u0309"+
		"\u030d\3\2\2\2\u030a\u030b\7 \2\2\u030b\u030d\7p\2\2\u030c\u02f9\3\2\2"+
		"\2\u030c\u0301\3\2\2\2\u030c\u030a\3\2\2\2\u030d\u008b\3\2\2\2\u030e\u030f"+
		"\bG\1\2\u030f\u0310\5\u008eH\2\u0310\u0316\3\2\2\2\u0311\u0312\6G\37\3"+
		"\u0312\u0313\7_\2\2\u0313\u0315\5\u008eH\2\u0314\u0311\3\2\2\2\u0315\u0318"+
		"\3\2\2\2\u0316\u0314\3\2\2\2\u0316\u0317\3\2\2\2\u0317\u008d\3\2\2\2\u0318"+
		"\u0316\3\2\2\2\u0319\u031f\5\u0090I\2\u031a\u031b\5\u0090I\2\u031b\u031c"+
		"\7`\2\2\u031c\u031d\5`\61\2\u031d\u031f\3\2\2\2\u031e\u0319\3\2\2\2\u031e"+
		"\u031a\3\2\2\2\u031f\u008f\3\2\2\2\u0320\u0322\5r:\2\u0321\u0320\3\2\2"+
		"\2\u0321\u0322\3\2\2\2\u0322\u0323\3\2\2\2\u0323\u0324\7p\2\2\u0324\u0091"+
		"\3\2\2\2\u0325\u0326\7:\2\2\u0326\u0327\7B\2\2\u0327\u0328\5\u00b8]\2"+
		"\u0328\u0329\7C\2\2\u0329\u0093\3\2\2\2\u032a\u032b\7\32\2\2\u032b\u0095"+
		"\3\2\2\2\u032c\u032d\t\5\2\2\u032d\u0097\3\2\2\2\u032e\u0335\t\6\2\2\u032f"+
		"\u0335\5\u00a2R\2\u0330\u0331\7\t\2\2\u0331\u0332\7B\2\2\u0332\u0333\7"+
		"p\2\2\u0333\u0335\7C\2\2\u0334\u032e\3\2\2\2\u0334\u032f\3\2\2\2\u0334"+
		"\u0330\3\2\2\2\u0335\u0099\3\2\2\2\u0336\u0337\78\2\2\u0337\u0338\7B\2"+
		"\2\u0338\u0339\5\u00b8]\2\u0339\u033a\7C\2\2\u033a\u0341\3\2\2\2\u033b"+
		"\u033c\78\2\2\u033c\u033d\7B\2\2\u033d\u033e\5`\61\2\u033e\u033f\7C\2"+
		"\2\u033f\u0341\3\2\2\2\u0340\u0336\3\2\2\2\u0340\u033b\3\2\2\2\u0341\u009b"+
		"\3\2\2\2\u0342\u0343\5\u009eP\2\u0343\u009d\3\2\2\2\u0344\u0345\bP\1\2"+
		"\u0345\u034b\7p\2\2\u0346\u0347\5\26\f\2\u0347\u0348\5\u009cO\2\u0348"+
		"\u0349\5\30\r\2\u0349\u034b\3\2\2\2\u034a\u0344\3\2\2\2\u034a\u0346\3"+
		"\2\2\2\u034b\u036a\3\2\2\2\u034c\u034d\6P \3\u034d\u034f\7D\2\2\u034e"+
		"\u0350\5\u00acW\2\u034f\u034e\3\2\2\2\u034f\u0350\3\2\2\2\u0350\u0352"+
		"\3\2\2\2\u0351\u0353\5Z.\2\u0352\u0351\3\2\2\2\u0352\u0353\3\2\2\2\u0353"+
		"\u0354\3\2\2\2\u0354\u0369\7E\2\2\u0355\u0356\6P!\3\u0356\u0358\7D\2\2"+
		"\u0357\u0359\5\u00acW\2\u0358\u0357\3\2\2\2\u0358\u0359\3\2\2\2\u0359"+
		"\u035a\3\2\2\2\u035a\u035b\7R\2\2\u035b\u0369\7E\2\2\u035c\u035d\6P\""+
		"\3\u035d\u035e\5\26\f\2\u035e\u035f\5\u00aeX\2\u035f\u0360\5\30\r\2\u0360"+
		"\u0369\3\2\2\2\u0361\u0362\6P#\3\u0362\u0364\5\26\f\2\u0363\u0365\5\u00b6"+
		"\\\2\u0364\u0363\3\2\2\2\u0364\u0365\3\2\2\2\u0365\u0366\3\2\2\2\u0366"+
		"\u0367\5\30\r\2\u0367\u0369\3\2\2\2\u0368\u034c\3\2\2\2\u0368\u0355\3"+
		"\2\2\2\u0368\u035c\3\2\2\2\u0368\u0361\3\2\2\2\u0369\u036c\3\2\2\2\u036a"+
		"\u0368\3\2\2\2\u036a\u036b\3\2\2\2\u036b\u009f\3\2\2\2\u036c\u036a\3\2"+
		"\2\2\u036d\u036e\7\17\2\2\u036e\u0370\7B\2\2\u036f\u0371\7r\2\2\u0370"+
		"\u036f\3\2\2\2\u0371\u0372\3\2\2\2\u0372\u0370\3\2\2\2\u0372\u0373\3\2"+
		"\2\2\u0373\u0374\3\2\2\2\u0374\u0377\7C\2\2\u0375\u0377\5\u00a2R\2\u0376"+
		"\u036d\3\2\2\2\u0376\u0375\3\2\2\2\u0377\u00a1\3\2\2\2\u0378\u0379\7\b"+
		"\2\2\u0379\u037a\7B\2\2\u037a\u037b\7B\2\2\u037b\u037c\5\u00a4S\2\u037c"+
		"\u037d\7C\2\2\u037d\u037e\7C\2\2\u037e\u00a3\3\2\2\2\u037f\u0384\5\u00a6"+
		"T\2\u0380\u0381\7_\2\2\u0381\u0383\5\u00a6T\2\u0382\u0380\3\2\2\2\u0383"+
		"\u0386\3\2\2\2\u0384\u0382\3\2\2\2\u0384\u0385\3\2\2\2\u0385\u0389\3\2"+
		"\2\2\u0386\u0384\3\2\2\2\u0387\u0389\3\2\2\2\u0388\u037f\3\2\2\2\u0388"+
		"\u0387\3\2\2\2\u0389\u00a5\3\2\2\2\u038a\u0390\n\7\2\2\u038b\u038d\7B"+
		"\2\2\u038c\u038e\5\20\t\2\u038d\u038c\3\2\2\2\u038d\u038e\3\2\2\2\u038e"+
		"\u038f\3\2\2\2\u038f\u0391\7C\2\2\u0390\u038b\3\2\2\2\u0390\u0391\3\2"+
		"\2\2\u0391\u0394\3\2\2\2\u0392\u0394\3\2\2\2\u0393\u038a\3\2\2\2\u0393"+
		"\u0392\3\2\2\2\u0394\u00a7\3\2\2\2\u0395\u039b\n\b\2\2\u0396\u0397\7B"+
		"\2\2\u0397\u0398\5\u00a8U\2\u0398\u0399\7C\2\2\u0399\u039b\3\2\2\2\u039a"+
		"\u0395\3\2\2\2\u039a\u0396\3\2\2\2\u039b\u039e\3\2\2\2\u039c\u039a\3\2"+
		"\2\2\u039c\u039d\3\2\2\2\u039d\u00a9\3\2\2\2\u039e\u039c\3\2\2\2\u039f"+
		"\u03a1\7R\2\2\u03a0\u03a2\5\u00acW\2\u03a1\u03a0\3\2\2\2\u03a1\u03a2\3"+
		"\2\2\2\u03a2\u03b2\3\2\2\2\u03a3\u03a5\7R\2\2\u03a4\u03a6\5\u00acW\2\u03a5"+
		"\u03a4\3\2\2\2\u03a5\u03a6\3\2\2\2\u03a6\u03a7\3\2\2\2\u03a7\u03b2\5\u00aa"+
		"V\2\u03a8\u03aa\7Y\2\2\u03a9\u03ab\5\u00acW\2\u03aa\u03a9\3\2\2\2\u03aa"+
		"\u03ab\3\2\2\2\u03ab\u03b2\3\2\2\2\u03ac\u03ae\7Y\2\2\u03ad\u03af\5\u00ac"+
		"W\2\u03ae\u03ad\3\2\2\2\u03ae\u03af\3\2\2\2\u03af\u03b0\3\2\2\2\u03b0"+
		"\u03b2\5\u00aaV\2\u03b1\u039f\3\2\2\2\u03b1\u03a3\3\2\2\2\u03b1\u03a8"+
		"\3\2\2\2\u03b1\u03ac\3\2\2\2\u03b2\u00ab\3\2\2\2\u03b3\u03b4\bW\1\2\u03b4"+
		"\u03b5\5\u0094K\2\u03b5\u03ba\3\2\2\2\u03b6\u03b7\6W$\3\u03b7\u03b9\5"+
		"\u0094K\2\u03b8\u03b6\3\2\2\2\u03b9\u03bc\3\2\2\2\u03ba\u03b8\3\2\2\2"+
		"\u03ba\u03bb\3\2\2\2\u03bb\u00ad\3\2\2\2\u03bc\u03ba\3\2\2\2\u03bd\u03c3"+
		"\5\u00b2Z\2\u03be\u03bf\5\u00b2Z\2\u03bf\u03c0\7_\2\2\u03c0\u03c1\7o\2"+
		"\2\u03c1\u03c3\3\2\2\2\u03c2\u03bd\3\2\2\2\u03c2\u03be\3\2\2\2\u03c3\u00af"+
		"\3\2\2\2\u03c4\u03c5\7_\2\2\u03c5\u00b1\3\2\2\2\u03c6\u03c7\bZ\1\2\u03c7"+
		"\u03c8\5\u00b4[\2\u03c8\u03cf\3\2\2\2\u03c9\u03ca\6Z%\3\u03ca\u03cb\5"+
		"\u00b0Y\2\u03cb\u03cc\5\u00b4[\2\u03cc\u03ce\3\2\2\2\u03cd\u03c9\3\2\2"+
		"\2\u03ce\u03d1\3\2\2\2\u03cf\u03cd\3\2\2\2\u03cf\u03d0\3\2\2\2\u03d0\u00b3"+
		"\3\2\2\2\u03d1\u03cf\3\2\2\2\u03d2\u03d3\5Z.\2\u03d3\u00b5\3\2\2\2\u03d4"+
		"\u03d5\b\\\1\2\u03d5\u03d6\7p\2\2\u03d6\u03dc\3\2\2\2\u03d7\u03d8\6\\"+
		"&\3\u03d8\u03d9\7_\2\2\u03d9\u03db\7p\2\2\u03da\u03d7\3\2\2\2\u03db\u03de"+
		"\3\2\2\2\u03dc\u03da\3\2\2\2\u03dc\u03dd\3\2\2\2\u03dd\u00b7\3\2\2\2\u03de"+
		"\u03dc\3\2\2\2\u03df\u03e1\5\u0088E\2\u03e0\u03e2\5\u00ba^\2\u03e1\u03e0"+
		"\3\2\2\2\u03e1\u03e2\3\2\2\2\u03e2\u00b9\3\2\2\2\u03e3\u03e4\5\u00bc_"+
		"\2\u03e4\u00bb\3\2\2\2\u03e5\u03e6\b_\1\2\u03e6\u03e7\7B\2\2\u03e7\u03e8"+
		"\5\u00ba^\2\u03e8\u03e9\7C\2\2\u03e9\u0409\3\2\2\2\u03ea\u03ec\7D\2\2"+
		"\u03eb\u03ed\5\u00acW\2\u03ec\u03eb\3\2\2\2\u03ec\u03ed\3\2\2\2\u03ed"+
		"\u03ef\3\2\2\2\u03ee\u03f0\5Z.\2\u03ef\u03ee\3\2\2\2\u03ef\u03f0\3\2\2"+
		"\2\u03f0\u03f1\3\2\2\2\u03f1\u0409\7E\2\2\u03f2\u03f3\7D\2\2\u03f3\u03f5"+
		"\7/\2\2\u03f4\u03f6\5\u00acW\2\u03f5\u03f4\3\2\2\2\u03f5\u03f6\3\2\2\2"+
		"\u03f6\u03f7\3\2\2\2\u03f7\u03f8\5Z.\2\u03f8\u03f9\7E\2\2\u03f9\u0409"+
		"\3\2\2\2\u03fa\u03fb\7D\2\2\u03fb\u03fc\5\u00acW\2\u03fc\u03fd\7/\2\2"+
		"\u03fd\u03fe\5Z.\2\u03fe\u03ff\7E\2\2\u03ff\u0409\3\2\2\2\u0400\u0401"+
		"\7D\2\2\u0401\u0402\7R\2\2\u0402\u0409\7E\2\2\u0403\u0405\7B\2\2\u0404"+
		"\u0406\5\u00aeX\2\u0405\u0404\3\2\2\2\u0405\u0406\3\2\2\2\u0406\u0407"+
		"\3\2\2\2\u0407\u0409\7C\2\2\u0408\u03e5\3\2\2\2\u0408\u03ea\3\2\2\2\u0408"+
		"\u03f2\3\2\2\2\u0408\u03fa\3\2\2\2\u0408\u0400\3\2\2\2\u0408\u0403\3\2"+
		"\2\2\u0409\u042f\3\2\2\2\u040a\u040b\6_\'\3\u040b\u040d\7D\2\2\u040c\u040e"+
		"\5\u00acW\2\u040d\u040c\3\2\2\2\u040d\u040e\3\2\2\2\u040e\u0410\3\2\2"+
		"\2\u040f\u0411\5Z.\2\u0410\u040f\3\2\2\2\u0410\u0411\3\2\2\2\u0411\u0412"+
		"\3\2\2\2\u0412\u042e\7E\2\2\u0413\u0414\6_(\3\u0414\u0415\7D\2\2\u0415"+
		"\u0417\7/\2\2\u0416\u0418\5\u00acW\2\u0417\u0416\3\2\2\2\u0417\u0418\3"+
		"\2\2\2\u0418\u0419\3\2\2\2\u0419\u041a\5Z.\2\u041a\u041b\7E\2\2\u041b"+
		"\u042e\3\2\2\2\u041c\u041d\6_)\3\u041d\u041e\7D\2\2\u041e\u041f\5\u00ac"+
		"W\2\u041f\u0420\7/\2\2\u0420\u0421\5Z.\2\u0421\u0422\7E\2\2\u0422\u042e"+
		"\3\2\2\2\u0423\u0424\6_*\3\u0424\u0425\7D\2\2\u0425\u0426\7R\2\2\u0426"+
		"\u042e\7E\2\2\u0427\u0428\6_+\3\u0428\u042a\7B\2\2\u0429\u042b\5\u00ae"+
		"X\2\u042a\u0429\3\2\2\2\u042a\u042b\3\2\2\2\u042b\u042c\3\2\2\2\u042c"+
		"\u042e\7C\2\2\u042d\u040a\3\2\2\2\u042d\u0413\3\2\2\2\u042d\u041c\3\2"+
		"\2\2\u042d\u0423\3\2\2\2\u042d\u0427\3\2\2\2\u042e\u0431\3\2\2\2\u042f"+
		"\u042d\3\2\2\2\u042f\u0430\3\2\2\2\u0430\u00bd\3\2\2\2\u0431\u042f\3\2"+
		"\2\2\u0432\u0433\7p\2\2\u0433\u00bf\3\2\2\2\u0434\u043f\5Z.\2\u0435\u0436"+
		"\7F\2\2\u0436\u0437\5\u00c2b\2\u0437\u0438\7G\2\2\u0438\u043f\3\2\2\2"+
		"\u0439\u043a\7F\2\2\u043a\u043b\5\u00c2b\2\u043b\u043c\7_\2\2\u043c\u043d"+
		"\7G\2\2\u043d\u043f\3\2\2\2\u043e\u0434\3\2\2\2\u043e\u0435\3\2\2\2\u043e"+
		"\u0439\3\2\2\2\u043f\u00c1\3\2\2\2\u0440\u0442\bb\1\2\u0441\u0443\5\u00c4"+
		"c\2\u0442\u0441\3\2\2\2\u0442\u0443\3\2\2\2\u0443\u0444\3\2\2\2\u0444"+
		"\u0445\5\u00c0a\2\u0445\u044e\3\2\2\2\u0446\u0447\6b,\3\u0447\u0449\7"+
		"_\2\2\u0448\u044a\5\u00c4c\2\u0449\u0448\3\2\2\2\u0449\u044a\3\2\2\2\u044a"+
		"\u044b\3\2\2\2\u044b\u044d\5\u00c0a\2\u044c\u0446\3\2\2\2\u044d\u0450"+
		"\3\2\2\2\u044e\u044c\3\2\2\2\u044e\u044f\3\2\2\2\u044f\u00c3\3\2\2\2\u0450"+
		"\u044e\3\2\2\2\u0451\u0452\5\u00c6d\2\u0452\u0453\7`\2\2\u0453\u00c5\3"+
		"\2\2\2\u0454\u0455\bd\1\2\u0455\u0456\5\u00c8e\2\u0456\u045b\3\2\2\2\u0457"+
		"\u0458\6d-\3\u0458\u045a\5\u00c8e\2\u0459\u0457\3\2\2\2\u045a\u045d\3"+
		"\2\2\2\u045b\u0459\3\2\2\2\u045b\u045c\3\2\2\2\u045c\u00c7\3\2\2\2\u045d"+
		"\u045b\3\2\2\2\u045e\u045f\7D\2\2\u045f\u0460\5`\61\2\u0460\u0461\7E\2"+
		"\2\u0461\u0465\3\2\2\2\u0462\u0463\7n\2\2\u0463\u0465\7p\2\2\u0464\u045e"+
		"\3\2\2\2\u0464\u0462\3\2\2\2\u0465\u00c9\3\2\2\2\u0466\u0467\7@\2\2\u0467"+
		"\u0468\7B\2\2\u0468\u0469\5`\61\2\u0469\u046b\7_\2\2\u046a\u046c\7r\2"+
		"\2\u046b\u046a\3\2\2\2\u046c\u046d\3\2\2\2\u046d\u046b\3\2\2\2\u046d\u046e"+
		"\3\2\2\2\u046e\u046f\3\2\2\2\u046f\u0470\7C\2\2\u0470\u0471\7^\2\2\u0471"+
		"\u00cb\3\2\2\2\u0472\u0498\5\u00ceh\2\u0473\u0498\5\u00d0i\2\u0474\u0498"+
		"\5\u00d6l\2\u0475\u0498\5\u00d8m\2\u0476\u0498\5\u00dan\2\u0477\u0498"+
		"\5\u00dco\2\u0478\u0479\t\t\2\2\u0479\u047a\t\n\2\2\u047a\u0483\7B\2\2"+
		"\u047b\u0480\5R*\2\u047c\u047d\7_\2\2\u047d\u047f\5R*\2\u047e\u047c\3"+
		"\2\2\2\u047f\u0482\3\2\2\2\u0480\u047e\3\2\2\2\u0480\u0481\3\2\2\2\u0481"+
		"\u0484\3\2\2\2\u0482\u0480\3\2\2\2\u0483\u047b\3\2\2\2\u0483\u0484\3\2"+
		"\2\2\u0484\u0492\3\2\2\2\u0485\u048e\7]\2\2\u0486\u048b\5R*\2\u0487\u0488"+
		"\7_\2\2\u0488\u048a\5R*\2\u0489\u0487\3\2\2\2\u048a\u048d\3\2\2\2\u048b"+
		"\u0489\3\2\2\2\u048b\u048c\3\2\2\2\u048c\u048f\3\2\2\2\u048d\u048b\3\2"+
		"\2\2\u048e\u0486\3\2\2\2\u048e\u048f\3\2\2\2\u048f\u0491\3\2\2\2\u0490"+
		"\u0485\3\2\2\2\u0491\u0494\3\2\2\2\u0492\u0490\3\2\2\2\u0492\u0493\3\2"+
		"\2\2\u0493\u0495\3\2\2\2\u0494\u0492\3\2\2\2\u0495\u0496\7C\2\2\u0496"+
		"\u0498\7^\2\2\u0497\u0472\3\2\2\2\u0497\u0473\3\2\2\2\u0497\u0474\3\2"+
		"\2\2\u0497\u0475\3\2\2\2\u0497\u0476\3\2\2\2\u0497\u0477\3\2\2\2\u0497"+
		"\u0478\3\2\2\2\u0498\u00cd\3\2\2\2\u0499\u049a\7p\2\2\u049a\u049b\7]\2"+
		"\2\u049b\u04a5\5\u00ccg\2\u049c\u049d\7\30\2\2\u049d\u049e\5`\61\2\u049e"+
		"\u049f\7]\2\2\u049f\u04a0\5\u00ccg\2\u04a0\u04a5\3\2\2\2\u04a1\u04a2\7"+
		"\34\2\2\u04a2\u04a3\7]\2\2\u04a3\u04a5\5\u00ccg\2\u04a4\u0499\3\2\2\2"+
		"\u04a4\u049c\3\2\2\2\u04a4\u04a1\3\2\2\2\u04a5\u00cf\3\2\2\2\u04a6\u04a8"+
		"\7F\2\2\u04a7\u04a9\5\u00d2j\2\u04a8\u04a7\3\2\2\2\u04a8\u04a9\3\2\2\2"+
		"\u04a9\u04aa\3\2\2\2\u04aa\u04ab\7G\2\2\u04ab\u00d1\3\2\2\2\u04ac\u04ad"+
		"\bj\1\2\u04ad\u04ae\5\u00d4k\2\u04ae\u04b3\3\2\2\2\u04af\u04b0\6j.\3\u04b0"+
		"\u04b2\5\u00d4k\2\u04b1\u04af\3\2\2\2\u04b2\u04b5\3\2\2\2\u04b3\u04b1"+
		"\3\2\2\2\u04b3\u04b4\3\2\2\2\u04b4\u00d3\3\2\2\2\u04b5\u04b3\3\2\2\2\u04b6"+
		"\u04ba\5b\62\2\u04b7\u04ba\5\u00ccg\2\u04b8\u04ba\7s\2\2\u04b9\u04b6\3"+
		"\2\2\2\u04b9\u04b7\3\2\2\2\u04b9\u04b8\3\2\2\2\u04ba\u00d5\3\2\2\2\u04bb"+
		"\u04bd\5^\60\2\u04bc\u04bb\3\2\2\2\u04bc\u04bd\3\2\2\2\u04bd\u04be\3\2"+
		"\2\2\u04be\u04bf\7^\2\2\u04bf\u00d7\3\2\2\2\u04c0\u04c1\7%\2\2\u04c1\u04c2"+
		"\7B\2\2\u04c2\u04c3\5^\60\2\u04c3\u04c4\7C\2\2\u04c4\u04c7\5\u00ccg\2"+
		"\u04c5\u04c6\7\37\2\2\u04c6\u04c8\5\u00ccg\2\u04c7\u04c5\3\2\2\2\u04c7"+
		"\u04c8\3\2\2\2\u04c8\u04d0\3\2\2\2\u04c9\u04ca\7\61\2\2\u04ca\u04cb\7"+
		"B\2\2\u04cb\u04cc\5^\60\2\u04cc\u04cd\7C\2\2\u04cd\u04ce\5\u00ccg\2\u04ce"+
		"\u04d0\3\2\2\2\u04cf\u04c0\3\2\2\2\u04cf\u04c9\3\2\2\2\u04d0\u00d9\3\2"+
		"\2\2\u04d1\u04d2\7\67\2\2\u04d2\u04d3\7B\2\2\u04d3\u04d4\5^\60\2\u04d4"+
		"\u04d5\7C\2\2\u04d5\u04d6\5\u00ccg\2\u04d6\u04fc\3\2\2\2\u04d7\u04d8\7"+
		"\35\2\2\u04d8\u04d9\5\u00ccg\2\u04d9\u04da\7\67\2\2\u04da\u04db\7B\2\2"+
		"\u04db\u04dc\5^\60\2\u04dc\u04dd\7C\2\2\u04dd\u04de\7^\2\2\u04de\u04fc"+
		"\3\2\2\2\u04df\u04e0\7#\2\2\u04e0\u04e2\7B\2\2\u04e1\u04e3\5^\60\2\u04e2"+
		"\u04e1\3\2\2\2\u04e2\u04e3\3\2\2\2\u04e3\u04e4\3\2\2\2\u04e4\u04e6\7^"+
		"\2\2\u04e5\u04e7\5^\60\2\u04e6\u04e5\3\2\2\2\u04e6\u04e7\3\2\2\2\u04e7"+
		"\u04e8\3\2\2\2\u04e8\u04ea\7^\2\2\u04e9\u04eb\5^\60\2\u04ea\u04e9\3\2"+
		"\2\2\u04ea\u04eb\3\2\2\2\u04eb\u04ec\3\2\2\2\u04ec\u04ed\7C\2\2\u04ed"+
		"\u04fc\5\u00ccg\2\u04ee\u04ef\7#\2\2\u04ef\u04f0\7B\2\2\u04f0\u04f2\5"+
		"b\62\2\u04f1\u04f3\5^\60\2\u04f2\u04f1\3\2\2\2\u04f2\u04f3\3\2\2\2\u04f3"+
		"\u04f4\3\2\2\2\u04f4\u04f6\7^\2\2\u04f5\u04f7\5^\60\2\u04f6\u04f5\3\2"+
		"\2\2\u04f6\u04f7\3\2\2\2\u04f7\u04f8\3\2\2\2\u04f8\u04f9\7C\2\2\u04f9"+
		"\u04fa\5\u00ccg\2\u04fa\u04fc\3\2\2\2\u04fb\u04d1\3\2\2\2\u04fb\u04d7"+
		"\3\2\2\2\u04fb\u04df\3\2\2\2\u04fb\u04ee\3\2\2\2\u04fc\u00db\3\2\2\2\u04fd"+
		"\u04fe\7$\2\2\u04fe\u04ff\7p\2\2\u04ff\u050a\7^\2\2\u0500\u0501\7\33\2"+
		"\2\u0501\u050a\7^\2\2\u0502\u0503\7\27\2\2\u0503\u050a\7^\2\2\u0504\u0506"+
		"\7+\2\2\u0505\u0507\5^\60\2\u0506\u0505\3\2\2\2\u0506\u0507\3\2\2\2\u0507"+
		"\u0508\3\2\2\2\u0508\u050a\7^\2\2\u0509\u04fd\3\2\2\2\u0509\u0500\3\2"+
		"\2\2\u0509\u0502\3\2\2\2\u0509\u0504\3\2\2\2\u050a\u00dd\3\2\2\2\u050b"+
		"\u050d\5\u00e0q\2\u050c\u050b\3\2\2\2\u050c\u050d\3\2\2\2\u050d\u050e"+
		"\3\2\2\2\u050e\u050f\7\2\2\3\u050f\u00df\3\2\2\2\u0510\u0511\bq\1\2\u0511"+
		"\u0512\5\u00e2r\2\u0512\u0517\3\2\2\2\u0513\u0514\6q/\3\u0514\u0516\5"+
		"\u00e2r\2\u0515\u0513\3\2\2\2\u0516\u0519\3\2\2\2\u0517\u0515\3\2\2\2"+
		"\u0517\u0518\3\2\2\2\u0518\u00e1\3\2\2\2\u0519\u0517\3\2\2\2\u051a\u051f"+
		"\5\u00e4s\2\u051b\u051f\5b\62\2\u051c\u051f\7^\2\2\u051d\u051f\7s\2\2"+
		"\u051e\u051a\3\2\2\2\u051e\u051b\3\2\2\2\u051e\u051c\3\2\2\2\u051e\u051d"+
		"\3\2\2\2\u051f\u00e3\3\2\2\2\u0520\u0522\5d\63\2\u0521\u0520\3\2\2\2\u0521"+
		"\u0522\3\2\2\2\u0522\u0523\3\2\2\2\u0523\u0525\5\u00e6t\2\u0524\u0526"+
		"\5\u00e8u\2\u0525\u0524\3\2\2\2\u0525\u0526\3\2\2\2\u0526\u0527\3\2\2"+
		"\2\u0527\u0528\5\u00d0i\2\u0528\u00e5\3\2\2\2\u0529\u052a\5\u009cO\2\u052a"+
		"\u00e7\3\2\2\2\u052b\u052c\bu\1\2\u052c\u052d\5b\62\2\u052d\u0532\3\2"+
		"\2\2\u052e\u052f\6u\60\3\u052f\u0531\5b\62\2\u0530\u052e\3\2\2\2\u0531"+
		"\u0534\3\2\2\2\u0532\u0530\3\2\2\2\u0532\u0533\3\2\2\2\u0533\u00e9\3\2"+
		"\2\2\u0534\u0532\3\2\2\2\u0083\u00eb\u00f2\u00fa\u010e\u011f\u0129\u0130"+
		"\u0156\u0168\u016a\u0176\u018f\u01a3\u01ba\u01bc\u01ce\u01d0\u01e2\u01e4"+
		"\u0202\u0204\u0216\u0218\u0226\u0234\u0242\u0250\u025e\u026b\u0272\u027e"+
		"\u0285\u028a\u028f\u0294\u029a\u02a4\u02ae\u02b8\u02bd\u02c1\u02cf\u02db"+
		"\u02e0\u02e3\u02e9\u02ed\u02f1\u02f5\u02f7\u02fb\u0303\u030c\u0316\u031e"+
		"\u0321\u0334\u0340\u034a\u034f\u0352\u0358\u0364\u0368\u036a\u0372\u0376"+
		"\u0384\u0388\u038d\u0390\u0393\u039a\u039c\u03a1\u03a5\u03aa\u03ae\u03b1"+
		"\u03ba\u03c2\u03cf\u03dc\u03e1\u03ec\u03ef\u03f5\u0405\u0408\u040d\u0410"+
		"\u0417\u042a\u042d\u042f\u043e\u0442\u0449\u044e\u045b\u0464\u046d\u0480"+
		"\u0483\u048b\u048e\u0492\u0497\u04a4\u04a8\u04b3\u04b9\u04bc\u04c7\u04cf"+
		"\u04e2\u04e6\u04ea\u04f2\u04f6\u04fb\u0506\u0509\u050c\u0517\u051e\u0521"+
		"\u0525\u0532";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}