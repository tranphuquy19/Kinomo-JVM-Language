// Generated from tk.doraneko.antlr\Kinomo.g4 by ANTLR 4.3
package tk.doraneko.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KinomoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__16=1, T__15=2, T__14=3, T__13=4, T__12=5, T__11=6, T__10=7, T__9=8, 
		T__8=9, T__7=10, T__6=11, T__5=12, T__4=13, T__3=14, T__2=15, T__1=16, 
		T__0=17, VARIABLE=18, PRINT=19, EQUALS=20, NUMBER=21, STRING=22, ID=23, 
		QUALIFIED_NAME=24, WS=25;
	public static final String[] tokenNames = {
		"<INVALID>", "'char'", "'boolean'", "'long'", "'float'", "'void'", "'['", 
		"'{'", "'byte'", "']'", "'}'", "'short'", "'string'", "'double'", "'int'", 
		"'('", "')'", "','", "'var'", "'echo'", "'='", "NUMBER", "STRING", "ID", 
		"QUALIFIED_NAME", "WS"
	};
	public static final int
		RULE_compilationUnit = 0, RULE_classDeclaration = 1, RULE_className = 2, 
		RULE_classBody = 3, RULE_function = 4, RULE_functionDeclaration = 5, RULE_functionName = 6, 
		RULE_functionArgument = 7, RULE_functionParamdefaultValue = 8, RULE_type = 9, 
		RULE_primitiveType = 10, RULE_classType = 11, RULE_blockStatement = 12, 
		RULE_variableDeclaration = 13, RULE_printStatement = 14, RULE_functionCall = 15, 
		RULE_identifier = 16, RULE_expressionList = 17, RULE_expression = 18, 
		RULE_value = 19;
	public static final String[] ruleNames = {
		"compilationUnit", "classDeclaration", "className", "classBody", "function", 
		"functionDeclaration", "functionName", "functionArgument", "functionParamdefaultValue", 
		"type", "primitiveType", "classType", "blockStatement", "variableDeclaration", 
		"printStatement", "functionCall", "identifier", "expressionList", "expression", 
		"value"
	};

	@Override
	public String getGrammarFileName() { return "Kinomo.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public KinomoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CompilationUnitContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public TerminalNode EOF() { return getToken(KinomoParser.EOF, 0); }
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KinomoVisitor ) return ((KinomoVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40); classDeclaration();
			setState(41); match(EOF);
			}
		}
		catch (RecognitionException re) {
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
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KinomoVisitor ) return ((KinomoVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_classDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43); className();
			setState(44); match(T__10);
			setState(45); classBody();
			setState(46); match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(KinomoParser.ID, 0); }
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KinomoVisitor ) return ((KinomoVisitor<? extends T>)visitor).visitClassName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_className);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyContext extends ParserRuleContext {
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KinomoVisitor ) return ((KinomoVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__15) | (1L << T__14) | (1L << T__13) | (1L << T__12) | (1L << T__9) | (1L << T__6) | (1L << T__5) | (1L << T__4) | (1L << T__3) | (1L << ID) | (1L << QUALIFIED_NAME))) != 0)) {
				{
				{
				setState(50); function();
				}
				}
				setState(55);
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

	public static class FunctionContext extends ParserRuleContext {
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KinomoVisitor ) return ((KinomoVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56); functionDeclaration();
			setState(57); match(T__10);
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VARIABLE) | (1L << PRINT) | (1L << ID))) != 0)) {
				{
				{
				setState(58); blockStatement();
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64); match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public int paramIndex;
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<FunctionArgumentContext> functionArgument() {
			return getRuleContexts(FunctionArgumentContext.class);
		}
		public FunctionArgumentContext functionArgument(int i) {
			return getRuleContext(FunctionArgumentContext.class,i);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KinomoVisitor ) return ((KinomoVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__15) | (1L << T__14) | (1L << T__13) | (1L << T__12) | (1L << T__9) | (1L << T__6) | (1L << T__5) | (1L << T__4) | (1L << T__3) | (1L << QUALIFIED_NAME))) != 0)) {
				{
				setState(66); type();
				}
			}

			setState(69); functionName();
			setState(70); match(T__2);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__15) | (1L << T__14) | (1L << T__13) | (1L << T__12) | (1L << T__9) | (1L << T__6) | (1L << T__5) | (1L << T__4) | (1L << T__3) | (1L << QUALIFIED_NAME))) != 0)) {
				{
				{
				setState(71); functionArgument( _localctx.paramIndex++ );
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77); match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(KinomoParser.ID, 0); }
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KinomoVisitor ) return ((KinomoVisitor<? extends T>)visitor).visitFunctionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionArgumentContext extends ParserRuleContext {
		public int index;
		public TerminalNode ID() { return getToken(KinomoParser.ID, 0); }
		public FunctionParamdefaultValueContext functionParamdefaultValue() {
			return getRuleContext(FunctionParamdefaultValueContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FunctionArgumentContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public FunctionArgumentContext(ParserRuleContext parent, int invokingState, int index) {
			super(parent, invokingState);
			this.index = index;
		}
		@Override public int getRuleIndex() { return RULE_functionArgument; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KinomoVisitor ) return ((KinomoVisitor<? extends T>)visitor).visitFunctionArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionArgumentContext functionArgument(int index) throws RecognitionException {
		FunctionArgumentContext _localctx = new FunctionArgumentContext(_ctx, getState(), index);
		enterRule(_localctx, 14, RULE_functionArgument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81); type();
			setState(82); match(ID);
			setState(84);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(83); functionParamdefaultValue();
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

	public static class FunctionParamdefaultValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionParamdefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParamdefaultValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KinomoVisitor ) return ((KinomoVisitor<? extends T>)visitor).visitFunctionParamdefaultValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionParamdefaultValueContext functionParamdefaultValue() throws RecognitionException {
		FunctionParamdefaultValueContext _localctx = new FunctionParamdefaultValueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_functionParamdefaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86); match(EQUALS);
			setState(87); expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KinomoVisitor ) return ((KinomoVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_type);
		try {
			setState(91);
			switch (_input.LA(1)) {
			case T__16:
			case T__15:
			case T__14:
			case T__13:
			case T__12:
			case T__9:
			case T__6:
			case T__5:
			case T__4:
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(89); primitiveType();
				}
				break;
			case QUALIFIED_NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(90); classType();
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

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KinomoVisitor ) return ((KinomoVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_primitiveType);
		int _la;
		try {
			setState(173);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(93); match(T__15);
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(94); match(T__11);
					setState(95); match(T__8);
					}
					}
					setState(100);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(101); match(T__5);
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(102); match(T__11);
					setState(103); match(T__8);
					}
					}
					setState(108);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 3);
				{
				setState(109); match(T__16);
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(110); match(T__11);
					setState(111); match(T__8);
					}
					}
					setState(116);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 4);
				{
				setState(117); match(T__9);
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(118); match(T__11);
					setState(119); match(T__8);
					}
					}
					setState(124);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 5);
				{
				setState(125); match(T__6);
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(126); match(T__11);
					setState(127); match(T__8);
					}
					}
					setState(132);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 6);
				{
				setState(133); match(T__3);
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(134); match(T__11);
					setState(135); match(T__8);
					}
					}
					setState(140);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 7);
				{
				setState(141); match(T__14);
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(142); match(T__11);
					setState(143); match(T__8);
					}
					}
					setState(148);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 8);
				{
				setState(149); match(T__13);
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(150); match(T__11);
					setState(151); match(T__8);
					}
					}
					setState(156);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 9);
				{
				setState(157); match(T__4);
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(158); match(T__11);
					setState(159); match(T__8);
					}
					}
					setState(164);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 10);
				{
				setState(165); match(T__12);
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(166); match(T__11);
					setState(167); match(T__8);
					}
					}
					setState(172);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class ClassTypeContext extends ParserRuleContext {
		public TerminalNode QUALIFIED_NAME() { return getToken(KinomoParser.QUALIFIED_NAME, 0); }
		public ClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KinomoVisitor ) return ((KinomoVisitor<? extends T>)visitor).visitClassType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassTypeContext classType() throws RecognitionException {
		ClassTypeContext _localctx = new ClassTypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_classType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175); match(QUALIFIED_NAME);
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(176); match(T__11);
				setState(177); match(T__8);
				}
				}
				setState(182);
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

	public static class BlockStatementContext extends ParserRuleContext {
		public int lastVarIndex;
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KinomoVisitor ) return ((KinomoVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_blockStatement);
		try {
			setState(186);
			switch (_input.LA(1)) {
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(183); variableDeclaration( _localctx.lastVarIndex++ );
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(184); printStatement();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(185); functionCall();
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public int index;
		public TerminalNode EQUALS() { return getToken(KinomoParser.EQUALS, 0); }
		public TerminalNode VARIABLE() { return getToken(KinomoParser.VARIABLE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState, int index) {
			super(parent, invokingState);
			this.index = index;
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KinomoVisitor ) return ((KinomoVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration(int index) throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState(), index);
		enterRule(_localctx, 26, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188); match(VARIABLE);
			setState(189); identifier();
			setState(190); match(EQUALS);
			setState(191); expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintStatementContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(KinomoParser.PRINT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KinomoVisitor ) return ((KinomoVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193); match(PRINT);
			setState(194); expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallContext extends ParserRuleContext {
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KinomoVisitor ) return ((KinomoVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196); functionName();
			setState(197); match(T__2);
			setState(198); expressionList();
			setState(199); match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(KinomoParser.ID, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KinomoVisitor ) return ((KinomoVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KinomoVisitor ) return ((KinomoVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203); expression();
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(204); match(T__0);
				setState(205); expression();
				}
				}
				setState(210);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KinomoVisitor ) return ((KinomoVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expression);
		try {
			setState(214);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(211); identifier();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(212); value();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(213); functionCall();
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(KinomoParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(KinomoParser.NUMBER, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KinomoVisitor ) return ((KinomoVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			_la = _input.LA(1);
			if ( !(_la==NUMBER || _la==STRING) ) {
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\33\u00dd\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\5\7\5\66\n\5\f\5\16\59\13\5\3\6\3\6\3\6\7\6>\n\6\f\6\16\6A\13\6\3\6"+
		"\3\6\3\7\5\7F\n\7\3\7\3\7\3\7\7\7K\n\7\f\7\16\7N\13\7\3\7\3\7\3\b\3\b"+
		"\3\t\3\t\3\t\5\tW\n\t\3\n\3\n\3\n\3\13\3\13\5\13^\n\13\3\f\3\f\3\f\7\f"+
		"c\n\f\f\f\16\ff\13\f\3\f\3\f\3\f\7\fk\n\f\f\f\16\fn\13\f\3\f\3\f\3\f\7"+
		"\fs\n\f\f\f\16\fv\13\f\3\f\3\f\3\f\7\f{\n\f\f\f\16\f~\13\f\3\f\3\f\3\f"+
		"\7\f\u0083\n\f\f\f\16\f\u0086\13\f\3\f\3\f\3\f\7\f\u008b\n\f\f\f\16\f"+
		"\u008e\13\f\3\f\3\f\3\f\7\f\u0093\n\f\f\f\16\f\u0096\13\f\3\f\3\f\3\f"+
		"\7\f\u009b\n\f\f\f\16\f\u009e\13\f\3\f\3\f\3\f\7\f\u00a3\n\f\f\f\16\f"+
		"\u00a6\13\f\3\f\3\f\3\f\7\f\u00ab\n\f\f\f\16\f\u00ae\13\f\5\f\u00b0\n"+
		"\f\3\r\3\r\3\r\7\r\u00b5\n\r\f\r\16\r\u00b8\13\r\3\16\3\16\3\16\5\16\u00bd"+
		"\n\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\3\23\7\23\u00d1\n\23\f\23\16\23\u00d4\13\23\3\24"+
		"\3\24\3\24\5\24\u00d9\n\24\3\25\3\25\3\25\2\2\26\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(\2\3\3\2\27\30\u00e7\2*\3\2\2\2\4-\3\2\2\2\6\62"+
		"\3\2\2\2\b\67\3\2\2\2\n:\3\2\2\2\fE\3\2\2\2\16Q\3\2\2\2\20S\3\2\2\2\22"+
		"X\3\2\2\2\24]\3\2\2\2\26\u00af\3\2\2\2\30\u00b1\3\2\2\2\32\u00bc\3\2\2"+
		"\2\34\u00be\3\2\2\2\36\u00c3\3\2\2\2 \u00c6\3\2\2\2\"\u00cb\3\2\2\2$\u00cd"+
		"\3\2\2\2&\u00d8\3\2\2\2(\u00da\3\2\2\2*+\5\4\3\2+,\7\2\2\3,\3\3\2\2\2"+
		"-.\5\6\4\2./\7\t\2\2/\60\5\b\5\2\60\61\7\f\2\2\61\5\3\2\2\2\62\63\7\31"+
		"\2\2\63\7\3\2\2\2\64\66\5\n\6\2\65\64\3\2\2\2\669\3\2\2\2\67\65\3\2\2"+
		"\2\678\3\2\2\28\t\3\2\2\29\67\3\2\2\2:;\5\f\7\2;?\7\t\2\2<>\5\32\16\2"+
		"=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@B\3\2\2\2A?\3\2\2\2BC\7\f\2\2"+
		"C\13\3\2\2\2DF\5\24\13\2ED\3\2\2\2EF\3\2\2\2FG\3\2\2\2GH\5\16\b\2HL\7"+
		"\21\2\2IK\5\20\t\2JI\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MO\3\2\2\2N"+
		"L\3\2\2\2OP\7\22\2\2P\r\3\2\2\2QR\7\31\2\2R\17\3\2\2\2ST\5\24\13\2TV\7"+
		"\31\2\2UW\5\22\n\2VU\3\2\2\2VW\3\2\2\2W\21\3\2\2\2XY\7\26\2\2YZ\5&\24"+
		"\2Z\23\3\2\2\2[^\5\26\f\2\\^\5\30\r\2][\3\2\2\2]\\\3\2\2\2^\25\3\2\2\2"+
		"_d\7\4\2\2`a\7\b\2\2ac\7\13\2\2b`\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2"+
		"\2e\u00b0\3\2\2\2fd\3\2\2\2gl\7\16\2\2hi\7\b\2\2ik\7\13\2\2jh\3\2\2\2"+
		"kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2m\u00b0\3\2\2\2nl\3\2\2\2ot\7\3\2\2pq\7"+
		"\b\2\2qs\7\13\2\2rp\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2u\u00b0\3\2\2"+
		"\2vt\3\2\2\2w|\7\n\2\2xy\7\b\2\2y{\7\13\2\2zx\3\2\2\2{~\3\2\2\2|z\3\2"+
		"\2\2|}\3\2\2\2}\u00b0\3\2\2\2~|\3\2\2\2\177\u0084\7\r\2\2\u0080\u0081"+
		"\7\b\2\2\u0081\u0083\7\13\2\2\u0082\u0080\3\2\2\2\u0083\u0086\3\2\2\2"+
		"\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u00b0\3\2\2\2\u0086\u0084"+
		"\3\2\2\2\u0087\u008c\7\20\2\2\u0088\u0089\7\b\2\2\u0089\u008b\7\13\2\2"+
		"\u008a\u0088\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d"+
		"\3\2\2\2\u008d\u00b0\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0094\7\5\2\2\u0090"+
		"\u0091\7\b\2\2\u0091\u0093\7\13\2\2\u0092\u0090\3\2\2\2\u0093\u0096\3"+
		"\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u00b0\3\2\2\2\u0096"+
		"\u0094\3\2\2\2\u0097\u009c\7\6\2\2\u0098\u0099\7\b\2\2\u0099\u009b\7\13"+
		"\2\2\u009a\u0098\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\u00b0\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a4\7\17"+
		"\2\2\u00a0\u00a1\7\b\2\2\u00a1\u00a3\7\13\2\2\u00a2\u00a0\3\2\2\2\u00a3"+
		"\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00b0\3\2"+
		"\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00ac\7\7\2\2\u00a8\u00a9\7\b\2\2\u00a9"+
		"\u00ab\7\13\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3"+
		"\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af"+
		"_\3\2\2\2\u00afg\3\2\2\2\u00afo\3\2\2\2\u00afw\3\2\2\2\u00af\177\3\2\2"+
		"\2\u00af\u0087\3\2\2\2\u00af\u008f\3\2\2\2\u00af\u0097\3\2\2\2\u00af\u009f"+
		"\3\2\2\2\u00af\u00a7\3\2\2\2\u00b0\27\3\2\2\2\u00b1\u00b6\7\32\2\2\u00b2"+
		"\u00b3\7\b\2\2\u00b3\u00b5\7\13\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b8\3"+
		"\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\31\3\2\2\2\u00b8"+
		"\u00b6\3\2\2\2\u00b9\u00bd\5\34\17\2\u00ba\u00bd\5\36\20\2\u00bb\u00bd"+
		"\5 \21\2\u00bc\u00b9\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bb\3\2\2\2\u00bd"+
		"\33\3\2\2\2\u00be\u00bf\7\24\2\2\u00bf\u00c0\5\"\22\2\u00c0\u00c1\7\26"+
		"\2\2\u00c1\u00c2\5&\24\2\u00c2\35\3\2\2\2\u00c3\u00c4\7\25\2\2\u00c4\u00c5"+
		"\5&\24\2\u00c5\37\3\2\2\2\u00c6\u00c7\5\16\b\2\u00c7\u00c8\7\21\2\2\u00c8"+
		"\u00c9\5$\23\2\u00c9\u00ca\7\22\2\2\u00ca!\3\2\2\2\u00cb\u00cc\7\31\2"+
		"\2\u00cc#\3\2\2\2\u00cd\u00d2\5&\24\2\u00ce\u00cf\7\23\2\2\u00cf\u00d1"+
		"\5&\24\2\u00d0\u00ce\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2"+
		"\u00d3\3\2\2\2\u00d3%\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d9\5\"\22\2"+
		"\u00d6\u00d9\5(\25\2\u00d7\u00d9\5 \21\2\u00d8\u00d5\3\2\2\2\u00d8\u00d6"+
		"\3\2\2\2\u00d8\u00d7\3\2\2\2\u00d9\'\3\2\2\2\u00da\u00db\t\2\2\2\u00db"+
		")\3\2\2\2\27\67?ELV]dlt|\u0084\u008c\u0094\u009c\u00a4\u00ac\u00af\u00b6"+
		"\u00bc\u00d2\u00d8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}