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
		T__36=1, T__35=2, T__34=3, T__33=4, T__32=5, T__31=6, T__30=7, T__29=8, 
		T__28=9, T__27=10, T__26=11, T__25=12, T__24=13, T__23=14, T__22=15, T__21=16, 
		T__20=17, T__19=18, T__18=19, T__17=20, T__16=21, T__15=22, T__14=23, 
		T__13=24, T__12=25, T__11=26, T__10=27, T__9=28, T__8=29, T__7=30, T__6=31, 
		T__5=32, T__4=33, T__3=34, T__2=35, T__1=36, T__0=37, VARIABLE=38, PRINT=39, 
		EQUALS=40, NUMBER=41, BOOL=42, STRING=43, ID=44, WS=45;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'", "'&'", "'''", 
		"'('", "')'", "'*'", "'+'", "','", "'-'"
	};
	public static final String[] ruleNames = {
		"T__36", "T__35", "T__34", "T__33", "T__32", "T__31", "T__30", "T__29", 
		"T__28", "T__27", "T__26", "T__25", "T__24", "T__23", "T__22", "T__21", 
		"T__20", "T__19", "T__18", "T__17", "T__16", "T__15", "T__14", "T__13", 
		"T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", 
		"T__3", "T__2", "T__1", "T__0", "VARIABLE", "PRINT", "EQUALS", "NUMBER", 
		"BOOL", "STRING", "ID", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2/\u011a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\24"+
		"\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34"+
		"\3\34\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3!\3!\3!\3!\3"+
		"\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\3\'"+
		"\3(\3(\3(\3(\3(\3)\3)\3*\5*\u00f4\n*\3*\6*\u00f7\n*\r*\16*\u00f8\3+\3"+
		"+\3+\3+\3+\3+\3+\3+\3+\5+\u0104\n+\3,\3,\7,\u0108\n,\f,\16,\u010b\13,"+
		"\3,\3,\3-\6-\u0110\n-\r-\16-\u0111\3.\6.\u0115\n.\r.\16.\u0116\3.\3.\2"+
		"\2/\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/\3\2\6\4\2\60\60\62;\5\2\f\f\17"+
		"\17$$\5\2\62;C\\c|\5\2\13\f\17\17\"\"\u011f\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2"+
		"M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3"+
		"\2\2\2\2[\3\2\2\2\3]\3\2\2\2\5_\3\2\2\2\7d\3\2\2\2\th\3\2\2\2\13o\3\2"+
		"\2\2\rr\3\2\2\2\17x\3\2\2\2\21}\3\2\2\2\23\177\3\2\2\2\25\u0084\3\2\2"+
		"\2\27\u0086\3\2\2\2\31\u008a\3\2\2\2\33\u008d\3\2\2\2\35\u0090\3\2\2\2"+
		"\37\u0096\3\2\2\2!\u009d\3\2\2\2#\u00a2\3\2\2\2%\u00a6\3\2\2\2\'\u00a8"+
		"\3\2\2\2)\u00aa\3\2\2\2+\u00ac\3\2\2\2-\u00ae\3\2\2\2/\u00b1\3\2\2\2\61"+
		"\u00b9\3\2\2\2\63\u00be\3\2\2\2\65\u00c1\3\2\2\2\67\u00c4\3\2\2\29\u00c6"+
		"\3\2\2\2;\u00c9\3\2\2\2=\u00cb\3\2\2\2?\u00cd\3\2\2\2A\u00cf\3\2\2\2C"+
		"\u00d6\3\2\2\2E\u00db\3\2\2\2G\u00e1\3\2\2\2I\u00e3\3\2\2\2K\u00e5\3\2"+
		"\2\2M\u00e7\3\2\2\2O\u00eb\3\2\2\2Q\u00f0\3\2\2\2S\u00f3\3\2\2\2U\u0103"+
		"\3\2\2\2W\u0105\3\2\2\2Y\u010f\3\2\2\2[\u0114\3\2\2\2]^\7\61\2\2^\4\3"+
		"\2\2\2_`\7e\2\2`a\7j\2\2ab\7c\2\2bc\7t\2\2c\6\3\2\2\2de\7p\2\2ef\7g\2"+
		"\2fg\7y\2\2g\b\3\2\2\2hi\7t\2\2ij\7g\2\2jk\7v\2\2kl\7w\2\2lm\7t\2\2mn"+
		"\7p\2\2n\n\3\2\2\2op\7#\2\2pq\7?\2\2q\f\3\2\2\2rs\7h\2\2st\7n\2\2tu\7"+
		"q\2\2uv\7c\2\2vw\7v\2\2w\16\3\2\2\2xy\7x\2\2yz\7q\2\2z{\7k\2\2{|\7f\2"+
		"\2|\20\3\2\2\2}~\7}\2\2~\22\3\2\2\2\177\u0080\7d\2\2\u0080\u0081\7{\2"+
		"\2\u0081\u0082\7v\2\2\u0082\u0083\7g\2\2\u0083\24\3\2\2\2\u0084\u0085"+
		"\7\177\2\2\u0085\26\3\2\2\2\u0086\u0087\7h\2\2\u0087\u0088\7q\2\2\u0088"+
		"\u0089\7t\2\2\u0089\30\3\2\2\2\u008a\u008b\7k\2\2\u008b\u008c\7h\2\2\u008c"+
		"\32\3\2\2\2\u008d\u008e\7>\2\2\u008e\u008f\7?\2\2\u008f\34\3\2\2\2\u0090"+
		"\u0091\7u\2\2\u0091\u0092\7j\2\2\u0092\u0093\7q\2\2\u0093\u0094\7t\2\2"+
		"\u0094\u0095\7v\2\2\u0095\36\3\2\2\2\u0096\u0097\7f\2\2\u0097\u0098\7"+
		"q\2\2\u0098\u0099\7w\2\2\u0099\u009a\7d\2\2\u009a\u009b\7n\2\2\u009b\u009c"+
		"\7g\2\2\u009c \3\2\2\2\u009d\u009e\7h\2\2\u009e\u009f\7t\2\2\u009f\u00a0"+
		"\7q\2\2\u00a0\u00a1\7o\2\2\u00a1\"\3\2\2\2\u00a2\u00a3\7k\2\2\u00a3\u00a4"+
		"\7p\2\2\u00a4\u00a5\7v\2\2\u00a5$\3\2\2\2\u00a6\u00a7\7*\2\2\u00a7&\3"+
		"\2\2\2\u00a8\u00a9\7,\2\2\u00a9(\3\2\2\2\u00aa\u00ab\7.\2\2\u00ab*\3\2"+
		"\2\2\u00ac\u00ad\7\60\2\2\u00ad,\3\2\2\2\u00ae\u00af\7/\2\2\u00af\u00b0"+
		"\7@\2\2\u00b0.\3\2\2\2\u00b1\u00b2\7d\2\2\u00b2\u00b3\7q\2\2\u00b3\u00b4"+
		"\7q\2\2\u00b4\u00b5\7n\2\2\u00b5\u00b6\7g\2\2\u00b6\u00b7\7c\2\2\u00b7"+
		"\u00b8\7p\2\2\u00b8\60\3\2\2\2\u00b9\u00ba\7n\2\2\u00ba\u00bb\7q\2\2\u00bb"+
		"\u00bc\7p\2\2\u00bc\u00bd\7i\2\2\u00bd\62\3\2\2\2\u00be\u00bf\7v\2\2\u00bf"+
		"\u00c0\7q\2\2\u00c0\64\3\2\2\2\u00c1\u00c2\7@\2\2\u00c2\u00c3\7?\2\2\u00c3"+
		"\66\3\2\2\2\u00c4\u00c5\7]\2\2\u00c58\3\2\2\2\u00c6\u00c7\7?\2\2\u00c7"+
		"\u00c8\7?\2\2\u00c8:\3\2\2\2\u00c9\u00ca\7>\2\2\u00ca<\3\2\2\2\u00cb\u00cc"+
		"\7_\2\2\u00cc>\3\2\2\2\u00cd\u00ce\7@\2\2\u00ce@\3\2\2\2\u00cf\u00d0\7"+
		"u\2\2\u00d0\u00d1\7v\2\2\u00d1\u00d2\7t\2\2\u00d2\u00d3\7k\2\2\u00d3\u00d4"+
		"\7p\2\2\u00d4\u00d5\7i\2\2\u00d5B\3\2\2\2\u00d6\u00d7\7g\2\2\u00d7\u00d8"+
		"\7n\2\2\u00d8\u00d9\7u\2\2\u00d9\u00da\7g\2\2\u00daD\3\2\2\2\u00db\u00dc"+
		"\7u\2\2\u00dc\u00dd\7w\2\2\u00dd\u00de\7r\2\2\u00de\u00df\7g\2\2\u00df"+
		"\u00e0\7t\2\2\u00e0F\3\2\2\2\u00e1\u00e2\7+\2\2\u00e2H\3\2\2\2\u00e3\u00e4"+
		"\7-\2\2\u00e4J\3\2\2\2\u00e5\u00e6\7/\2\2\u00e6L\3\2\2\2\u00e7\u00e8\7"+
		"x\2\2\u00e8\u00e9\7c\2\2\u00e9\u00ea\7t\2\2\u00eaN\3\2\2\2\u00eb\u00ec"+
		"\7g\2\2\u00ec\u00ed\7e\2\2\u00ed\u00ee\7j\2\2\u00ee\u00ef\7q\2\2\u00ef"+
		"P\3\2\2\2\u00f0\u00f1\7?\2\2\u00f1R\3\2\2\2\u00f2\u00f4\7/\2\2\u00f3\u00f2"+
		"\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00f7\t\2\2\2\u00f6"+
		"\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2"+
		"\2\2\u00f9T\3\2\2\2\u00fa\u00fb\7v\2\2\u00fb\u00fc\7t\2\2\u00fc\u00fd"+
		"\7w\2\2\u00fd\u0104\7g\2\2\u00fe\u00ff\7h\2\2\u00ff\u0100\7c\2\2\u0100"+
		"\u0101\7n\2\2\u0101\u0102\7u\2\2\u0102\u0104\7g\2\2\u0103\u00fa\3\2\2"+
		"\2\u0103\u00fe\3\2\2\2\u0104V\3\2\2\2\u0105\u0109\7$\2\2\u0106\u0108\n"+
		"\3\2\2\u0107\u0106\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109"+
		"\u010a\3\2\2\2\u010a\u010c\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u010d\7$"+
		"\2\2\u010dX\3\2\2\2\u010e\u0110\t\4\2\2\u010f\u010e\3\2\2\2\u0110\u0111"+
		"\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112Z\3\2\2\2\u0113"+
		"\u0115\t\5\2\2\u0114\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0114\3\2"+
		"\2\2\u0116\u0117\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\b.\2\2\u0119"+
		"\\\3\2\2\2\t\2\u00f3\u00f8\u0103\u0109\u0111\u0116\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}