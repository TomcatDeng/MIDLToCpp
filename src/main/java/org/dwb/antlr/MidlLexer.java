package org.dwb.antlr;// Generated from /home/bowen/Code/IDEA_PROJECT/MIDLToCpp/g4/MidlLexer.g4 by ANTLR 4.12.0

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MidlLexer extends Lexer {
    public static final int
            INTEGER = 1, FLOATING_PT = 2, CHAR = 3, STRING = 4, BOOLEAN = 5, ID = 6, WS = 7;
    public static final String[] ruleNames = makeRuleNames();
    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    public static final String _serializedATN =
            "\u0004\u0000\u0007\u00ad\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002" +
                    "\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002" +
                    "\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002" +
                    "\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002" +
                    "\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000" +
                    "\u0001\u0000\u0005\u0000!\b\u0000\n\u0000\f\u0000$\t\u0000\u0003\u0000" +
                    "&\b\u0000\u0001\u0000\u0003\u0000)\b\u0000\u0001\u0001\u0004\u0001,\b" +
                    "\u0001\u000b\u0001\f\u0001-\u0001\u0001\u0001\u0001\u0005\u00012\b\u0001" +
                    "\n\u0001\f\u00015\t\u0001\u0001\u0001\u0003\u00018\b\u0001\u0001\u0001" +
                    "\u0003\u0001;\b\u0001\u0001\u0001\u0001\u0001\u0004\u0001?\b\u0001\u000b" +
                    "\u0001\f\u0001@\u0001\u0001\u0003\u0001D\b\u0001\u0001\u0001\u0003\u0001" +
                    "G\b\u0001\u0001\u0001\u0004\u0001J\b\u0001\u000b\u0001\f\u0001K\u0001" +
                    "\u0001\u0001\u0001\u0003\u0001P\b\u0001\u0001\u0001\u0004\u0001S\b\u0001" +
                    "\u000b\u0001\f\u0001T\u0001\u0001\u0003\u0001X\b\u0001\u0001\u0001\u0001" +
                    "\u0001\u0003\u0001\\\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0003" +
                    "\u0002a\b\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001" +
                    "\u0003\u0005\u0003h\b\u0003\n\u0003\f\u0003k\t\u0003\u0001\u0003\u0001" +
                    "\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001" +
                    "\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001" +
                    "\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001" +
                    "\u0004\u0003\u0004\u0081\b\u0004\u0001\u0005\u0001\u0005\u0003\u0005\u0085" +
                    "\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0089\b\u0005\u0005\u0005" +
                    "\u008b\b\u0005\n\u0005\f\u0005\u008e\t\u0005\u0001\u0006\u0004\u0006\u0091" +
                    "\b\u0006\u000b\u0006\f\u0006\u0092\u0001\u0006\u0001\u0006\u0001\u0007" +
                    "\u0003\u0007\u0098\b\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001" +
                    "\n\u0001\u000b\u0001\u000b\u0003\u000b\u00a2\b\u000b\u0001\u000b\u0004" +
                    "\u000b\u00a5\b\u000b\u000b\u000b\f\u000b\u00a6\u0001\f\u0001\f\u0001\r" +
                    "\u0001\r\u0001\r\u0000\u0000\u000e\u0001\u0001\u0003\u0002\u0005\u0003" +
                    "\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\u0000\u0011\u0000\u0013" +
                    "\u0000\u0015\u0000\u0017\u0000\u0019\u0000\u001b\u0000\u0001\u0000\u000b" +
                    "\u0001\u000019\u0002\u0000\'\'\\\\\u0002\u0000\"\"\\\\\u0003\u0000\t\n" +
                    "\r\r  \u0002\u0000AZaz\u0001\u000009\u0002\u0000LLll\u0002\u0000EEee\u0002" +
                    "\u0000++--\u0004\u0000DDFFddff\b\u0000\"\"\'\'\\\\bbffnnrrtt\u00c2\u0000" +
                    "\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000" +
                    "\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000" +
                    "\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r" +
                    "\u0001\u0000\u0000\u0000\u0001%\u0001\u0000\u0000\u0000\u0003[\u0001\u0000" +
                    "\u0000\u0000\u0005]\u0001\u0000\u0000\u0000\u0007d\u0001\u0000\u0000\u0000" +
                    "\t\u0080\u0001\u0000\u0000\u0000\u000b\u0082\u0001\u0000\u0000\u0000\r" +
                    "\u0090\u0001\u0000\u0000\u0000\u000f\u0097\u0001\u0000\u0000\u0000\u0011" +
                    "\u0099\u0001\u0000\u0000\u0000\u0013\u009b\u0001\u0000\u0000\u0000\u0015" +
                    "\u009d\u0001\u0000\u0000\u0000\u0017\u009f\u0001\u0000\u0000\u0000\u0019" +
                    "\u00a8\u0001\u0000\u0000\u0000\u001b\u00aa\u0001\u0000\u0000\u0000\u001d" +
                    "&\u00050\u0000\u0000\u001e\"\u0007\u0000\u0000\u0000\u001f!\u0003\u0011" +
                    "\b\u0000 \u001f\u0001\u0000\u0000\u0000!$\u0001\u0000\u0000\u0000\" \u0001" +
                    "\u0000\u0000\u0000\"#\u0001\u0000\u0000\u0000#&\u0001\u0000\u0000\u0000" +
                    "$\"\u0001\u0000\u0000\u0000%\u001d\u0001\u0000\u0000\u0000%\u001e\u0001" +
                    "\u0000\u0000\u0000&(\u0001\u0000\u0000\u0000\')\u0003\u0015\n\u0000(\'" +
                    "\u0001\u0000\u0000\u0000()\u0001\u0000\u0000\u0000)\u0002\u0001\u0000" +
                    "\u0000\u0000*,\u0003\u0011\b\u0000+*\u0001\u0000\u0000\u0000,-\u0001\u0000" +
                    "\u0000\u0000-+\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000./\u0001" +
                    "\u0000\u0000\u0000/3\u0005.\u0000\u000002\u0003\u0011\b\u000010\u0001" +
                    "\u0000\u0000\u000025\u0001\u0000\u0000\u000031\u0001\u0000\u0000\u0000" +
                    "34\u0001\u0000\u0000\u000047\u0001\u0000\u0000\u000053\u0001\u0000\u0000" +
                    "\u000068\u0003\u0017\u000b\u000076\u0001\u0000\u0000\u000078\u0001\u0000" +
                    "\u0000\u00008:\u0001\u0000\u0000\u00009;\u0003\u0019\f\u0000:9\u0001\u0000" +
                    "\u0000\u0000:;\u0001\u0000\u0000\u0000;\\\u0001\u0000\u0000\u0000<>\u0005" +
                    ".\u0000\u0000=?\u0003\u0011\b\u0000>=\u0001\u0000\u0000\u0000?@\u0001" +
                    "\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000" +
                    "AC\u0001\u0000\u0000\u0000BD\u0003\u0017\u000b\u0000CB\u0001\u0000\u0000" +
                    "\u0000CD\u0001\u0000\u0000\u0000DF\u0001\u0000\u0000\u0000EG\u0003\u0019" +
                    "\f\u0000FE\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000G\\\u0001" +
                    "\u0000\u0000\u0000HJ\u0003\u0011\b\u0000IH\u0001\u0000\u0000\u0000JK\u0001" +
                    "\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000" +
                    "LM\u0001\u0000\u0000\u0000MO\u0003\u0017\u000b\u0000NP\u0003\u0019\f\u0000" +
                    "ON\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000P\\\u0001\u0000\u0000" +
                    "\u0000QS\u0003\u0011\b\u0000RQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000" +
                    "\u0000TR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000UW\u0001\u0000" +
                    "\u0000\u0000VX\u0003\u0017\u000b\u0000WV\u0001\u0000\u0000\u0000WX\u0001" +
                    "\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000YZ\u0003\u0019\f\u0000Z\\" +
                    "\u0001\u0000\u0000\u0000[+\u0001\u0000\u0000\u0000[<\u0001\u0000\u0000" +
                    "\u0000[I\u0001\u0000\u0000\u0000[R\u0001\u0000\u0000\u0000\\\u0004\u0001" +
                    "\u0000\u0000\u0000]`\u0005\'\u0000\u0000^a\u0003\u001b\r\u0000_a\b\u0001" +
                    "\u0000\u0000`^\u0001\u0000\u0000\u0000`_\u0001\u0000\u0000\u0000ab\u0001" +
                    "\u0000\u0000\u0000bc\u0005\'\u0000\u0000c\u0006\u0001\u0000\u0000\u0000" +
                    "di\u0005\"\u0000\u0000eh\u0003\u001b\r\u0000fh\b\u0002\u0000\u0000ge\u0001" +
                    "\u0000\u0000\u0000gf\u0001\u0000\u0000\u0000hk\u0001\u0000\u0000\u0000" +
                    "ig\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jl\u0001\u0000\u0000" +
                    "\u0000ki\u0001\u0000\u0000\u0000lm\u0005\"\u0000\u0000m\b\u0001\u0000" +
                    "\u0000\u0000no\u0005T\u0000\u0000op\u0005R\u0000\u0000pq\u0005U\u0000" +
                    "\u0000q\u0081\u0005E\u0000\u0000rs\u0005t\u0000\u0000st\u0005r\u0000\u0000" +
                    "tu\u0005u\u0000\u0000u\u0081\u0005e\u0000\u0000vw\u0005F\u0000\u0000w" +
                    "x\u0005A\u0000\u0000xy\u0005L\u0000\u0000yz\u0005S\u0000\u0000z\u0081" +
                    "\u0005E\u0000\u0000{|\u0005f\u0000\u0000|}\u0005a\u0000\u0000}~\u0005" +
                    "l\u0000\u0000~\u007f\u0005s\u0000\u0000\u007f\u0081\u0005e\u0000\u0000" +
                    "\u0080n\u0001\u0000\u0000\u0000\u0080r\u0001\u0000\u0000\u0000\u0080v" +
                    "\u0001\u0000\u0000\u0000\u0080{\u0001\u0000\u0000\u0000\u0081\n\u0001" +
                    "\u0000\u0000\u0000\u0082\u008c\u0003\u000f\u0007\u0000\u0083\u0085\u0003" +
                    "\u0013\t\u0000\u0084\u0083\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000" +
                    "\u0000\u0000\u0085\u0088\u0001\u0000\u0000\u0000\u0086\u0089\u0003\u000f" +
                    "\u0007\u0000\u0087\u0089\u0003\u0011\b\u0000\u0088\u0086\u0001\u0000\u0000" +
                    "\u0000\u0088\u0087\u0001\u0000\u0000\u0000\u0089\u008b\u0001\u0000\u0000" +
                    "\u0000\u008a\u0084\u0001\u0000\u0000\u0000\u008b\u008e\u0001\u0000\u0000" +
                    "\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000" +
                    "\u0000\u008d\f\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000" +
                    "\u008f\u0091\u0007\u0003\u0000\u0000\u0090\u008f\u0001\u0000\u0000\u0000" +
                    "\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000" +
                    "\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000" +
                    "\u0094\u0095\u0006\u0006\u0000\u0000\u0095\u000e\u0001\u0000\u0000\u0000" +
                    "\u0096\u0098\u0007\u0004\u0000\u0000\u0097\u0096\u0001\u0000\u0000\u0000" +
                    "\u0098\u0010\u0001\u0000\u0000\u0000\u0099\u009a\u0007\u0005\u0000\u0000" +
                    "\u009a\u0012\u0001\u0000\u0000\u0000\u009b\u009c\u0005_\u0000\u0000\u009c" +
                    "\u0014\u0001\u0000\u0000\u0000\u009d\u009e\u0007\u0006\u0000\u0000\u009e" +
                    "\u0016\u0001\u0000\u0000\u0000\u009f\u00a1\u0007\u0007\u0000\u0000\u00a0" +
                    "\u00a2\u0007\b\u0000\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a1\u00a2" +
                    "\u0001\u0000\u0000\u0000\u00a2\u00a4\u0001\u0000\u0000\u0000\u00a3\u00a5" +
                    "\u0003\u0011\b\u0000\u00a4\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001" +
                    "\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001" +
                    "\u0000\u0000\u0000\u00a7\u0018\u0001\u0000\u0000\u0000\u00a8\u00a9\u0007" +
                    "\t\u0000\u0000\u00a9\u001a\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005\\" +
                    "\u0000\u0000\u00ab\u00ac\u0007\n\u0000\u0000\u00ac\u001c\u0001\u0000\u0000" +
                    "\u0000\u001b\u0000\"%(-37:@CFKOTW[`gi\u0080\u0084\u0088\u008c\u0092\u0097" +
                    "\u00a1\u00a6\u0001\u0006\u0000\u0000";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    private static final String[] _LITERAL_NAMES = makeLiteralNames();
    private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);
    public static String[] channelNames = {
            "DEFAULT_TOKEN_CHANNEL", "HIDDEN"
    };
    public static String[] modeNames = {
            "DEFAULT_MODE"
    };

    static {
        RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION);
    }

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

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }

    public MidlLexer(CharStream input) {
        super(input);
        _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    private static String[] makeRuleNames() {
        return new String[]{
                "INTEGER", "FLOATING_PT", "CHAR", "STRING", "BOOLEAN", "ID", "WS", "LETTER",
                "DIGIT", "UNDERLINE", "INTEGER_TYPE_SUFFIX", "EXPONENT", "FLOAT_TYPE_SUFFIX",
                "ESCAPE_SEQUENCE"
        };
    }

    private static String[] makeLiteralNames() {
        return new String[]{
        };
    }

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, "INTEGER", "FLOATING_PT", "CHAR", "STRING", "BOOLEAN", "ID", "WS"
        };
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

    @Override
    public String getGrammarFileName() {
        return "MidlLexer.g4";
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public String[] getChannelNames() {
        return channelNames;
    }

    @Override
    public String[] getModeNames() {
        return modeNames;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }
}