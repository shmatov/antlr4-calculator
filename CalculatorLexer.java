// Generated from Calculator.g4 by ANTLR 4.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalculatorLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, DOUBLE=2, PI=3, E=4, POW=5, NL=6, WS=7, ID=8, PLUS=9, EQUAL=10, 
		MINUS=11, MULT=12, DIV=13, LPAR=14, RPAR=15;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"INT", "DOUBLE", "'pi'", "'e'", "'^'", "'\n'", "WS", "ID", "'+'", "'='", 
		"'-'", "'*'", "'/'", "'('", "')'"
	};
	public static final String[] ruleNames = {
		"INT", "DOUBLE", "PI", "E", "POW", "NL", "WS", "ID", "PLUS", "EQUAL", 
		"MINUS", "MULT", "DIV", "LPAR", "RPAR"
	};


	public CalculatorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Calculator.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 6: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\21V\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\6\2#\n\2\r\2\16"+
		"\2$\3\3\6\3(\n\3\r\3\16\3)\3\3\3\3\6\3.\n\3\r\3\16\3/\3\4\3\4\3\4\3\5"+
		"\3\5\3\6\3\6\3\7\3\7\3\b\6\b<\n\b\r\b\16\b=\3\b\3\b\3\t\3\t\7\tD\n\t\f"+
		"\t\16\tG\13\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3"+
		"\20\3\20\2\21\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\2\21\n\1\23\13"+
		"\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1\3\2\6\3\2\62;\5\2\13"+
		"\13\17\17\"\"\5\2C\\aac|\6\2\62;C\\aac|Z\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\3\"\3\2\2\2\5\'\3\2\2\2\7\61\3\2\2\2\t\64\3\2\2"+
		"\2\13\66\3\2\2\2\r8\3\2\2\2\17;\3\2\2\2\21A\3\2\2\2\23H\3\2\2\2\25J\3"+
		"\2\2\2\27L\3\2\2\2\31N\3\2\2\2\33P\3\2\2\2\35R\3\2\2\2\37T\3\2\2\2!#\t"+
		"\2\2\2\"!\3\2\2\2#$\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%\4\3\2\2\2&(\t\2\2\2"+
		"\'&\3\2\2\2()\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*+\3\2\2\2+-\7\60\2\2,.\t\2"+
		"\2\2-,\3\2\2\2./\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\6\3\2\2\2\61\62\7r\2"+
		"\2\62\63\7k\2\2\63\b\3\2\2\2\64\65\7g\2\2\65\n\3\2\2\2\66\67\7`\2\2\67"+
		"\f\3\2\2\289\7\f\2\29\16\3\2\2\2:<\t\3\2\2;:\3\2\2\2<=\3\2\2\2=;\3\2\2"+
		"\2=>\3\2\2\2>?\3\2\2\2?@\b\b\2\2@\20\3\2\2\2AE\t\4\2\2BD\t\5\2\2CB\3\2"+
		"\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\22\3\2\2\2GE\3\2\2\2HI\7-\2\2I\24"+
		"\3\2\2\2JK\7?\2\2K\26\3\2\2\2LM\7/\2\2M\30\3\2\2\2NO\7,\2\2O\32\3\2\2"+
		"\2PQ\7\61\2\2Q\34\3\2\2\2RS\7*\2\2S\36\3\2\2\2TU\7+\2\2U \3\2\2\2\b\2"+
		"$)/=E";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}