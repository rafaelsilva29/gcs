// Generated from /Users/rafaelsilva/Desktop/work_space/GCS-1920/SociedadeAnonima/src/SociedadeAnonima.g4 by ANTLR 4.7.2

    import java.util.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SociedadeAnonimaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, SC=27, COMMA=28, LPAREN=29, RPAREN=30, HI=31, SP=32, 
		BAR=33, AND=34, WORD=35, NUM=36, SEPARATOR=37;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "SC", "COMMA", "LPAREN", "RPAREN", "HI", "SP", "BAR", "AND", 
			"WORD", "NUM", "SEPARATOR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Nome Empresa: '", "'Cidade: '", "'Rua: '", "'Objetivo: '", "'AGRICULTURA'", 
			"'INDUSTRIA'", "'COMERCIO'", "'Socio: '", "'\u20AC'", "'%'", "'SOCIO'", 
			"'ADMINISTRADOR'", "'Funcionario: '", "'F'", "'Telemovel: '", "'Telefone: '", 
			"'Email: '", "'@'", "'.com'", "'GERENTE'", "'PRODUCAO'", "'ESCRITORIO'", 
			"'ARMAZEM'", "'AG: '", "'Presidente: '", "'Socios: '", "';'", "','", 
			"'['", "']'", "'-'", "'<->'", "'/'", "'&'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "SC", "COMMA", "LPAREN", "RPAREN", "HI", "SP", "BAR", 
			"AND", "WORD", "NUM", "SEPARATOR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	    List<String> listSocios = new ArrayList<>();


	public SociedadeAnonimaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SociedadeAnonima.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\'\u0151\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34"+
		"\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3!\3\"\3\"\3#\3#\3$\6$\u013e"+
		"\n$\r$\16$\u013f\3%\6%\u0143\n%\r%\16%\u0144\3&\5&\u0148\n&\3&\3&\6&\u014c"+
		"\n&\r&\16&\u014d\3&\3&\2\2\'\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'\3\2\5\4\2C\\c|\3\2\62"+
		";\4\2\13\13\"\"\2\u0155\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\3M\3\2\2\2\5\\\3\2\2\2"+
		"\7e\3\2\2\2\tk\3\2\2\2\13v\3\2\2\2\r\u0082\3\2\2\2\17\u008c\3\2\2\2\21"+
		"\u0095\3\2\2\2\23\u009d\3\2\2\2\25\u009f\3\2\2\2\27\u00a1\3\2\2\2\31\u00a7"+
		"\3\2\2\2\33\u00b5\3\2\2\2\35\u00c3\3\2\2\2\37\u00c5\3\2\2\2!\u00d1\3\2"+
		"\2\2#\u00dc\3\2\2\2%\u00e4\3\2\2\2\'\u00e6\3\2\2\2)\u00eb\3\2\2\2+\u00f3"+
		"\3\2\2\2-\u00fc\3\2\2\2/\u0107\3\2\2\2\61\u010f\3\2\2\2\63\u0114\3\2\2"+
		"\2\65\u0121\3\2\2\2\67\u012a\3\2\2\29\u012c\3\2\2\2;\u012e\3\2\2\2=\u0130"+
		"\3\2\2\2?\u0132\3\2\2\2A\u0134\3\2\2\2C\u0138\3\2\2\2E\u013a\3\2\2\2G"+
		"\u013d\3\2\2\2I\u0142\3\2\2\2K\u014b\3\2\2\2MN\7P\2\2NO\7q\2\2OP\7o\2"+
		"\2PQ\7g\2\2QR\7\"\2\2RS\7G\2\2ST\7o\2\2TU\7r\2\2UV\7t\2\2VW\7g\2\2WX\7"+
		"u\2\2XY\7c\2\2YZ\7<\2\2Z[\7\"\2\2[\4\3\2\2\2\\]\7E\2\2]^\7k\2\2^_\7f\2"+
		"\2_`\7c\2\2`a\7f\2\2ab\7g\2\2bc\7<\2\2cd\7\"\2\2d\6\3\2\2\2ef\7T\2\2f"+
		"g\7w\2\2gh\7c\2\2hi\7<\2\2ij\7\"\2\2j\b\3\2\2\2kl\7Q\2\2lm\7d\2\2mn\7"+
		"l\2\2no\7g\2\2op\7v\2\2pq\7k\2\2qr\7x\2\2rs\7q\2\2st\7<\2\2tu\7\"\2\2"+
		"u\n\3\2\2\2vw\7C\2\2wx\7I\2\2xy\7T\2\2yz\7K\2\2z{\7E\2\2{|\7W\2\2|}\7"+
		"N\2\2}~\7V\2\2~\177\7W\2\2\177\u0080\7T\2\2\u0080\u0081\7C\2\2\u0081\f"+
		"\3\2\2\2\u0082\u0083\7K\2\2\u0083\u0084\7P\2\2\u0084\u0085\7F\2\2\u0085"+
		"\u0086\7W\2\2\u0086\u0087\7U\2\2\u0087\u0088\7V\2\2\u0088\u0089\7T\2\2"+
		"\u0089\u008a\7K\2\2\u008a\u008b\7C\2\2\u008b\16\3\2\2\2\u008c\u008d\7"+
		"E\2\2\u008d\u008e\7Q\2\2\u008e\u008f\7O\2\2\u008f\u0090\7G\2\2\u0090\u0091"+
		"\7T\2\2\u0091\u0092\7E\2\2\u0092\u0093\7K\2\2\u0093\u0094\7Q\2\2\u0094"+
		"\20\3\2\2\2\u0095\u0096\7U\2\2\u0096\u0097\7q\2\2\u0097\u0098\7e\2\2\u0098"+
		"\u0099\7k\2\2\u0099\u009a\7q\2\2\u009a\u009b\7<\2\2\u009b\u009c\7\"\2"+
		"\2\u009c\22\3\2\2\2\u009d\u009e\7\u20ae\2\2\u009e\24\3\2\2\2\u009f\u00a0"+
		"\7\'\2\2\u00a0\26\3\2\2\2\u00a1\u00a2\7U\2\2\u00a2\u00a3\7Q\2\2\u00a3"+
		"\u00a4\7E\2\2\u00a4\u00a5\7K\2\2\u00a5\u00a6\7Q\2\2\u00a6\30\3\2\2\2\u00a7"+
		"\u00a8\7C\2\2\u00a8\u00a9\7F\2\2\u00a9\u00aa\7O\2\2\u00aa\u00ab\7K\2\2"+
		"\u00ab\u00ac\7P\2\2\u00ac\u00ad\7K\2\2\u00ad\u00ae\7U\2\2\u00ae\u00af"+
		"\7V\2\2\u00af\u00b0\7T\2\2\u00b0\u00b1\7C\2\2\u00b1\u00b2\7F\2\2\u00b2"+
		"\u00b3\7Q\2\2\u00b3\u00b4\7T\2\2\u00b4\32\3\2\2\2\u00b5\u00b6\7H\2\2\u00b6"+
		"\u00b7\7w\2\2\u00b7\u00b8\7p\2\2\u00b8\u00b9\7e\2\2\u00b9\u00ba\7k\2\2"+
		"\u00ba\u00bb\7q\2\2\u00bb\u00bc\7p\2\2\u00bc\u00bd\7c\2\2\u00bd\u00be"+
		"\7t\2\2\u00be\u00bf\7k\2\2\u00bf\u00c0\7q\2\2\u00c0\u00c1\7<\2\2\u00c1"+
		"\u00c2\7\"\2\2\u00c2\34\3\2\2\2\u00c3\u00c4\7H\2\2\u00c4\36\3\2\2\2\u00c5"+
		"\u00c6\7V\2\2\u00c6\u00c7\7g\2\2\u00c7\u00c8\7n\2\2\u00c8\u00c9\7g\2\2"+
		"\u00c9\u00ca\7o\2\2\u00ca\u00cb\7q\2\2\u00cb\u00cc\7x\2\2\u00cc\u00cd"+
		"\7g\2\2\u00cd\u00ce\7n\2\2\u00ce\u00cf\7<\2\2\u00cf\u00d0\7\"\2\2\u00d0"+
		" \3\2\2\2\u00d1\u00d2\7V\2\2\u00d2\u00d3\7g\2\2\u00d3\u00d4\7n\2\2\u00d4"+
		"\u00d5\7g\2\2\u00d5\u00d6\7h\2\2\u00d6\u00d7\7q\2\2\u00d7\u00d8\7p\2\2"+
		"\u00d8\u00d9\7g\2\2\u00d9\u00da\7<\2\2\u00da\u00db\7\"\2\2\u00db\"\3\2"+
		"\2\2\u00dc\u00dd\7G\2\2\u00dd\u00de\7o\2\2\u00de\u00df\7c\2\2\u00df\u00e0"+
		"\7k\2\2\u00e0\u00e1\7n\2\2\u00e1\u00e2\7<\2\2\u00e2\u00e3\7\"\2\2\u00e3"+
		"$\3\2\2\2\u00e4\u00e5\7B\2\2\u00e5&\3\2\2\2\u00e6\u00e7\7\60\2\2\u00e7"+
		"\u00e8\7e\2\2\u00e8\u00e9\7q\2\2\u00e9\u00ea\7o\2\2\u00ea(\3\2\2\2\u00eb"+
		"\u00ec\7I\2\2\u00ec\u00ed\7G\2\2\u00ed\u00ee\7T\2\2\u00ee\u00ef\7G\2\2"+
		"\u00ef\u00f0\7P\2\2\u00f0\u00f1\7V\2\2\u00f1\u00f2\7G\2\2\u00f2*\3\2\2"+
		"\2\u00f3\u00f4\7R\2\2\u00f4\u00f5\7T\2\2\u00f5\u00f6\7Q\2\2\u00f6\u00f7"+
		"\7F\2\2\u00f7\u00f8\7W\2\2\u00f8\u00f9\7E\2\2\u00f9\u00fa\7C\2\2\u00fa"+
		"\u00fb\7Q\2\2\u00fb,\3\2\2\2\u00fc\u00fd\7G\2\2\u00fd\u00fe\7U\2\2\u00fe"+
		"\u00ff\7E\2\2\u00ff\u0100\7T\2\2\u0100\u0101\7K\2\2\u0101\u0102\7V\2\2"+
		"\u0102\u0103\7Q\2\2\u0103\u0104\7T\2\2\u0104\u0105\7K\2\2\u0105\u0106"+
		"\7Q\2\2\u0106.\3\2\2\2\u0107\u0108\7C\2\2\u0108\u0109\7T\2\2\u0109\u010a"+
		"\7O\2\2\u010a\u010b\7C\2\2\u010b\u010c\7\\\2\2\u010c\u010d\7G\2\2\u010d"+
		"\u010e\7O\2\2\u010e\60\3\2\2\2\u010f\u0110\7C\2\2\u0110\u0111\7I\2\2\u0111"+
		"\u0112\7<\2\2\u0112\u0113\7\"\2\2\u0113\62\3\2\2\2\u0114\u0115\7R\2\2"+
		"\u0115\u0116\7t\2\2\u0116\u0117\7g\2\2\u0117\u0118\7u\2\2\u0118\u0119"+
		"\7k\2\2\u0119\u011a\7f\2\2\u011a\u011b\7g\2\2\u011b\u011c\7p\2\2\u011c"+
		"\u011d\7v\2\2\u011d\u011e\7g\2\2\u011e\u011f\7<\2\2\u011f\u0120\7\"\2"+
		"\2\u0120\64\3\2\2\2\u0121\u0122\7U\2\2\u0122\u0123\7q\2\2\u0123\u0124"+
		"\7e\2\2\u0124\u0125\7k\2\2\u0125\u0126\7q\2\2\u0126\u0127\7u\2\2\u0127"+
		"\u0128\7<\2\2\u0128\u0129\7\"\2\2\u0129\66\3\2\2\2\u012a\u012b\7=\2\2"+
		"\u012b8\3\2\2\2\u012c\u012d\7.\2\2\u012d:\3\2\2\2\u012e\u012f\7]\2\2\u012f"+
		"<\3\2\2\2\u0130\u0131\7_\2\2\u0131>\3\2\2\2\u0132\u0133\7/\2\2\u0133@"+
		"\3\2\2\2\u0134\u0135\7>\2\2\u0135\u0136\7/\2\2\u0136\u0137\7@\2\2\u0137"+
		"B\3\2\2\2\u0138\u0139\7\61\2\2\u0139D\3\2\2\2\u013a\u013b\7(\2\2\u013b"+
		"F\3\2\2\2\u013c\u013e\t\2\2\2\u013d\u013c\3\2\2\2\u013e\u013f\3\2\2\2"+
		"\u013f\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140H\3\2\2\2\u0141\u0143\t"+
		"\3\2\2\u0142\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0142\3\2\2\2\u0144"+
		"\u0145\3\2\2\2\u0145J\3\2\2\2\u0146\u0148\7\17\2\2\u0147\u0146\3\2\2\2"+
		"\u0147\u0148\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014c\7\f\2\2\u014a\u014c"+
		"\t\4\2\2\u014b\u0147\3\2\2\2\u014b\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d"+
		"\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0150\b&"+
		"\2\2\u0150L\3\2\2\2\b\2\u013f\u0144\u0147\u014b\u014d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}