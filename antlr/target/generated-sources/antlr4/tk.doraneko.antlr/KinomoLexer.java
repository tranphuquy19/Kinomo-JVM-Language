// Generated from tk.doraneko.antlr\Kinomo.g4 by ANTLR 4.3
package tk.doraneko.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KinomoLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__16=1, T__15=2, T__14=3, T__13=4, T__12=5, T__11=6, T__10=7, T__9=8, 
		T__8=9, T__7=10, T__6=11, T__5=12, T__4=13, T__3=14, T__2=15, T__1=16, 
		T__0=17, VARIABLE=18, PRINT=19, EQUALS=20, NUMBER=21, STRING=22, ID=23, 
		QUALIFIED_NAME=24, WS=25;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'"
	};
	public static final String[] ruleNames = {
		"T__16", "T__15", "T__14", "T__13", "T__12", "T__11", "T__10", "T__9", 
		"T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", 
		"VARIABLE", "PRINT", "EQUALS", "NUMBER", "STRING", "ID", "QUALIFIED_NAME", 
		"WS"
	};


	public KinomoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Kinomo.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\33\u00a9\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\24\3\24\3\25\3\25\3\26\6\26\u008a\n\26\r\26\16\26\u008b\3\27"+
		"\3\27\7\27\u0090\n\27\f\27\16\27\u0093\13\27\3\27\3\27\3\30\6\30\u0098"+
		"\n\30\r\30\16\30\u0099\3\31\3\31\3\31\6\31\u009f\n\31\r\31\16\31\u00a0"+
		"\3\32\6\32\u00a4\n\32\r\32\16\32\u00a5\3\32\3\32\2\2\33\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\3\2\5\3\2\62;\5\2\62;C\\c|\5\2\13"+
		"\f\17\17\"\"\u00ad\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\3\65\3\2\2\2\5:\3\2\2\2\7"+
		"B\3\2\2\2\tG\3\2\2\2\13M\3\2\2\2\rR\3\2\2\2\17T\3\2\2\2\21V\3\2\2\2\23"+
		"[\3\2\2\2\25]\3\2\2\2\27_\3\2\2\2\31e\3\2\2\2\33l\3\2\2\2\35s\3\2\2\2"+
		"\37w\3\2\2\2!y\3\2\2\2#{\3\2\2\2%}\3\2\2\2\'\u0081\3\2\2\2)\u0086\3\2"+
		"\2\2+\u0089\3\2\2\2-\u008d\3\2\2\2/\u0097\3\2\2\2\61\u009b\3\2\2\2\63"+
		"\u00a3\3\2\2\2\65\66\7e\2\2\66\67\7j\2\2\678\7c\2\289\7t\2\29\4\3\2\2"+
		"\2:;\7d\2\2;<\7q\2\2<=\7q\2\2=>\7n\2\2>?\7g\2\2?@\7c\2\2@A\7p\2\2A\6\3"+
		"\2\2\2BC\7n\2\2CD\7q\2\2DE\7p\2\2EF\7i\2\2F\b\3\2\2\2GH\7h\2\2HI\7n\2"+
		"\2IJ\7q\2\2JK\7c\2\2KL\7v\2\2L\n\3\2\2\2MN\7x\2\2NO\7q\2\2OP\7k\2\2PQ"+
		"\7f\2\2Q\f\3\2\2\2RS\7]\2\2S\16\3\2\2\2TU\7}\2\2U\20\3\2\2\2VW\7d\2\2"+
		"WX\7{\2\2XY\7v\2\2YZ\7g\2\2Z\22\3\2\2\2[\\\7_\2\2\\\24\3\2\2\2]^\7\177"+
		"\2\2^\26\3\2\2\2_`\7u\2\2`a\7j\2\2ab\7q\2\2bc\7t\2\2cd\7v\2\2d\30\3\2"+
		"\2\2ef\7u\2\2fg\7v\2\2gh\7t\2\2hi\7k\2\2ij\7p\2\2jk\7i\2\2k\32\3\2\2\2"+
		"lm\7f\2\2mn\7q\2\2no\7w\2\2op\7d\2\2pq\7n\2\2qr\7g\2\2r\34\3\2\2\2st\7"+
		"k\2\2tu\7p\2\2uv\7v\2\2v\36\3\2\2\2wx\7*\2\2x \3\2\2\2yz\7+\2\2z\"\3\2"+
		"\2\2{|\7.\2\2|$\3\2\2\2}~\7x\2\2~\177\7c\2\2\177\u0080\7t\2\2\u0080&\3"+
		"\2\2\2\u0081\u0082\7g\2\2\u0082\u0083\7e\2\2\u0083\u0084\7j\2\2\u0084"+
		"\u0085\7q\2\2\u0085(\3\2\2\2\u0086\u0087\7?\2\2\u0087*\3\2\2\2\u0088\u008a"+
		"\t\2\2\2\u0089\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u0089\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c,\3\2\2\2\u008d\u0091\7$\2\2\u008e\u0090\13\2\2\2"+
		"\u008f\u008e\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092"+
		"\3\2\2\2\u0092\u0094\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0095\7$\2\2\u0095"+
		".\3\2\2\2\u0096\u0098\t\3\2\2\u0097\u0096\3\2\2\2\u0098\u0099\3\2\2\2"+
		"\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\60\3\2\2\2\u009b\u009e"+
		"\5/\30\2\u009c\u009d\7\60\2\2\u009d\u009f\5/\30\2\u009e\u009c\3\2\2\2"+
		"\u009f\u00a0\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\62"+
		"\3\2\2\2\u00a2\u00a4\t\4\2\2\u00a3\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\b\32"+
		"\2\2\u00a8\64\3\2\2\2\b\2\u008b\u0091\u0099\u00a0\u00a5\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}