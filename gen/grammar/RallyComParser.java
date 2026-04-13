// Generated from C:/Users/wikto/IdeaProjects/MiASI/Rally-co-driverSimulator/src/grammar/RallyComParser.g4 by ANTLR 4.13.2
package grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class RallyComParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LEWY=1, PRAWY=2, NAWROT=3, SZCZYT=4, PROSTO=5, JEDEN=6, DWA=7, TRZY=8, 
		CZTERY=9, PIEC=10, MAKS=11, HALF=12, DNEM=13, PLUS=14, HAMUJ=15, PRZYHAMUJ=16, 
		PELNE_HAMOWANIE=17, ZDUS=18, DO_LEWEJ=19, DO_PRAWEJ=20, Z_DROGI=21, CIAC=22, 
		NIE_CIAC=23, POZNO=24, WCZESNIE=25, SMIALO=26, CELUJ=27, ZACISK=28, PRZEZ=29, 
		DO=30, PRZED=31, NA=32, COMMA=33, NEWLINE=34, WS=35, INT=36;
	public static final int
		RULE_program = 0, RULE_pacenote = 1, RULE_sequence = 2, RULE_element = 3, 
		RULE_turnSpec = 4, RULE_modifier = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "pacenote", "sequence", "element", "turnSpec", "modifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "'hamuj'", "'przyhamuj'", "'pe\\u0142ne hamowanie'", 
			"'zdu\\u015B'", "'do lewej'", "'do prawej'", null, "'ci\\u0105\\u0107'", 
			"'nie ci\\u0105\\u0107'", "'p\\u00F3\\u017Ano'", "'wcze\\u015Bnie'", 
			"'\\u015Bmia\\u0142o'", "'celuj'", "'zacisk'", "'przez'", "'do'", "'przed'", 
			"'na'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LEWY", "PRAWY", "NAWROT", "SZCZYT", "PROSTO", "JEDEN", "DWA", 
			"TRZY", "CZTERY", "PIEC", "MAKS", "HALF", "DNEM", "PLUS", "HAMUJ", "PRZYHAMUJ", 
			"PELNE_HAMOWANIE", "ZDUS", "DO_LEWEJ", "DO_PRAWEJ", "Z_DROGI", "CIAC", 
			"NIE_CIAC", "POZNO", "WCZESNIE", "SMIALO", "CELUJ", "ZACISK", "PRZEZ", 
			"DO", "PRZED", "NA", "COMMA", "NEWLINE", "WS", "INT"
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

	@Override
	public String getGrammarFileName() { return "RallyComParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RallyComParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<PacenoteContext> pacenote() {
			return getRuleContexts(PacenoteContext.class);
		}
		public PacenoteContext pacenote(int i) {
			return getRuleContext(PacenoteContext.class,i);
		}
		public TerminalNode EOF() { return getToken(RallyComParser.EOF, 0); }
		public List<TerminalNode> COMMA() { return getTokens(RallyComParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RallyComParser.COMMA, i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RallyComParserListener ) ((RallyComParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RallyComParserListener ) ((RallyComParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RallyComParserVisitor ) return ((RallyComParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			pacenote();
			setState(17);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(13);
				match(COMMA);
				setState(14);
				pacenote();
				}
				}
				setState(19);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(20);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PacenoteContext extends ParserRuleContext {
		public SequenceContext sequence() {
			return getRuleContext(SequenceContext.class,0);
		}
		public PacenoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pacenote; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RallyComParserListener ) ((RallyComParserListener)listener).enterPacenote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RallyComParserListener ) ((RallyComParserListener)listener).exitPacenote(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RallyComParserVisitor ) return ((RallyComParserVisitor<? extends T>)visitor).visitPacenote(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PacenoteContext pacenote() throws RecognitionException {
		PacenoteContext _localctx = new PacenoteContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_pacenote);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			sequence();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SequenceContext extends ParserRuleContext {
		public Token connect;
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public List<TerminalNode> DO() { return getTokens(RallyComParser.DO); }
		public TerminalNode DO(int i) {
			return getToken(RallyComParser.DO, i);
		}
		public List<TerminalNode> PRZED() { return getTokens(RallyComParser.PRZED); }
		public TerminalNode PRZED(int i) {
			return getToken(RallyComParser.PRZED, i);
		}
		public List<TerminalNode> NA() { return getTokens(RallyComParser.NA); }
		public TerminalNode NA(int i) {
			return getToken(RallyComParser.NA, i);
		}
		public SequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RallyComParserListener ) ((RallyComParserListener)listener).enterSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RallyComParserListener ) ((RallyComParserListener)listener).exitSequence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RallyComParserVisitor ) return ((RallyComParserVisitor<? extends T>)visitor).visitSequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SequenceContext sequence() throws RecognitionException {
		SequenceContext _localctx = new SequenceContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sequence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			element();
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7516192768L) != 0)) {
				{
				{
				setState(25);
				((SequenceContext)_localctx).connect = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7516192768L) != 0)) ) {
					((SequenceContext)_localctx).connect = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(26);
				element();
				}
				}
				setState(31);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElementContext extends ParserRuleContext {
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
	 
		public ElementContext() { }
		public void copyFrom(ElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CrestPhraseContext extends ElementContext {
		public TerminalNode SZCZYT() { return getToken(RallyComParser.SZCZYT, 0); }
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public CrestPhraseContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RallyComParserListener ) ((RallyComParserListener)listener).enterCrestPhrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RallyComParserListener ) ((RallyComParserListener)listener).exitCrestPhrase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RallyComParserVisitor ) return ((RallyComParserVisitor<? extends T>)visitor).visitCrestPhrase(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PositioningPhraseContext extends ElementContext {
		public TerminalNode DO_LEWEJ() { return getToken(RallyComParser.DO_LEWEJ, 0); }
		public TerminalNode DO_PRAWEJ() { return getToken(RallyComParser.DO_PRAWEJ, 0); }
		public TerminalNode Z_DROGI() { return getToken(RallyComParser.Z_DROGI, 0); }
		public PositioningPhraseContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RallyComParserListener ) ((RallyComParserListener)listener).enterPositioningPhrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RallyComParserListener ) ((RallyComParserListener)listener).exitPositioningPhrase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RallyComParserVisitor ) return ((RallyComParserVisitor<? extends T>)visitor).visitPositioningPhrase(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ActionPhraseContext extends ElementContext {
		public Token action;
		public TerminalNode HAMUJ() { return getToken(RallyComParser.HAMUJ, 0); }
		public TerminalNode PRZYHAMUJ() { return getToken(RallyComParser.PRZYHAMUJ, 0); }
		public TerminalNode PELNE_HAMOWANIE() { return getToken(RallyComParser.PELNE_HAMOWANIE, 0); }
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public ActionPhraseContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RallyComParserListener ) ((RallyComParserListener)listener).enterActionPhrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RallyComParserListener ) ((RallyComParserListener)listener).exitActionPhrase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RallyComParserVisitor ) return ((RallyComParserVisitor<? extends T>)visitor).visitActionPhrase(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TurnPhraseContext extends ElementContext {
		public Token direct;
		public TerminalNode LEWY() { return getToken(RallyComParser.LEWY, 0); }
		public TerminalNode PRAWY() { return getToken(RallyComParser.PRAWY, 0); }
		public TurnSpecContext turnSpec() {
			return getRuleContext(TurnSpecContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public TurnPhraseContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RallyComParserListener ) ((RallyComParserListener)listener).enterTurnPhrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RallyComParserListener ) ((RallyComParserListener)listener).exitTurnPhrase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RallyComParserVisitor ) return ((RallyComParserVisitor<? extends T>)visitor).visitTurnPhrase(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DistancePhraseContext extends ElementContext {
		public Token dist;
		public TerminalNode INT() { return getToken(RallyComParser.INT, 0); }
		public TerminalNode PROSTO() { return getToken(RallyComParser.PROSTO, 0); }
		public DistancePhraseContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RallyComParserListener ) ((RallyComParserListener)listener).enterDistancePhrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RallyComParserListener ) ((RallyComParserListener)listener).exitDistancePhrase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RallyComParserVisitor ) return ((RallyComParserVisitor<? extends T>)visitor).visitDistancePhrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_element);
		int _la;
		try {
			setState(58);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HAMUJ:
			case PRZYHAMUJ:
			case PELNE_HAMOWANIE:
				_localctx = new ActionPhraseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				((ActionPhraseContext)_localctx).action = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 229376L) != 0)) ) {
					((ActionPhraseContext)_localctx).action = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68723376150L) != 0)) {
					{
					setState(33);
					element();
					}
				}

				}
				break;
			case LEWY:
			case PRAWY:
				_localctx = new TurnPhraseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				((TurnPhraseContext)_localctx).direct = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==LEWY || _la==PRAWY) ) {
					((TurnPhraseContext)_localctx).direct = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4040L) != 0)) {
					{
					setState(37);
					turnSpec();
					}
				}

				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1069838336L) != 0)) {
					{
					{
					setState(40);
					modifier();
					}
					}
					setState(45);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case INT:
				_localctx = new DistancePhraseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(46);
				((DistancePhraseContext)_localctx).dist = match(INT);
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PROSTO) {
					{
					setState(47);
					match(PROSTO);
					}
				}

				}
				break;
			case SZCZYT:
				_localctx = new CrestPhraseContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(50);
				match(SZCZYT);
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1069838336L) != 0)) {
					{
					{
					setState(51);
					modifier();
					}
					}
					setState(56);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case DO_LEWEJ:
			case DO_PRAWEJ:
			case Z_DROGI:
				_localctx = new PositioningPhraseContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(57);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3670016L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TurnSpecContext extends ParserRuleContext {
		public Token degree;
		public TerminalNode JEDEN() { return getToken(RallyComParser.JEDEN, 0); }
		public TerminalNode DWA() { return getToken(RallyComParser.DWA, 0); }
		public TerminalNode TRZY() { return getToken(RallyComParser.TRZY, 0); }
		public TerminalNode CZTERY() { return getToken(RallyComParser.CZTERY, 0); }
		public TerminalNode PIEC() { return getToken(RallyComParser.PIEC, 0); }
		public TerminalNode MAKS() { return getToken(RallyComParser.MAKS, 0); }
		public TerminalNode NAWROT() { return getToken(RallyComParser.NAWROT, 0); }
		public TurnSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_turnSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RallyComParserListener ) ((RallyComParserListener)listener).enterTurnSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RallyComParserListener ) ((RallyComParserListener)listener).exitTurnSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RallyComParserVisitor ) return ((RallyComParserVisitor<? extends T>)visitor).visitTurnSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TurnSpecContext turnSpec() throws RecognitionException {
		TurnSpecContext _localctx = new TurnSpecContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_turnSpec);
		int _la;
		try {
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JEDEN:
			case DWA:
			case TRZY:
			case CZTERY:
			case PIEC:
			case MAKS:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				((TurnSpecContext)_localctx).degree = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4032L) != 0)) ) {
					((TurnSpecContext)_localctx).degree = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case NAWROT:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				match(NAWROT);
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4032L) != 0)) {
					{
					setState(62);
					((TurnSpecContext)_localctx).degree = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4032L) != 0)) ) {
						((TurnSpecContext)_localctx).degree = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ModifierContext extends ParserRuleContext {
		public TerminalNode HALF() { return getToken(RallyComParser.HALF, 0); }
		public TerminalNode DNEM() { return getToken(RallyComParser.DNEM, 0); }
		public TerminalNode PLUS() { return getToken(RallyComParser.PLUS, 0); }
		public TerminalNode CIAC() { return getToken(RallyComParser.CIAC, 0); }
		public TerminalNode NIE_CIAC() { return getToken(RallyComParser.NIE_CIAC, 0); }
		public TerminalNode POZNO() { return getToken(RallyComParser.POZNO, 0); }
		public TerminalNode WCZESNIE() { return getToken(RallyComParser.WCZESNIE, 0); }
		public TerminalNode SMIALO() { return getToken(RallyComParser.SMIALO, 0); }
		public TerminalNode CELUJ() { return getToken(RallyComParser.CELUJ, 0); }
		public TerminalNode ZACISK() { return getToken(RallyComParser.ZACISK, 0); }
		public TerminalNode PRZEZ() { return getToken(RallyComParser.PRZEZ, 0); }
		public TerminalNode ZDUS() { return getToken(RallyComParser.ZDUS, 0); }
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RallyComParserListener ) ((RallyComParserListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RallyComParserListener ) ((RallyComParserListener)listener).exitModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RallyComParserVisitor ) return ((RallyComParserVisitor<? extends T>)visitor).visitModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1069838336L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static final String _serializedATN =
		"\u0004\u0001$F\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005"+
		"\u0007\u0005\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u0010\b\u0000"+
		"\n\u0000\f\u0000\u0013\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u001c\b\u0002\n"+
		"\u0002\f\u0002\u001f\t\u0002\u0001\u0003\u0001\u0003\u0003\u0003#\b\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003\'\b\u0003\u0001\u0003\u0005\u0003"+
		"*\b\u0003\n\u0003\f\u0003-\t\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"1\b\u0003\u0001\u0003\u0001\u0003\u0005\u00035\b\u0003\n\u0003\f\u0003"+
		"8\t\u0003\u0001\u0003\u0003\u0003;\b\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004@\b\u0004\u0003\u0004B\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0000\u0000\u0006\u0000\u0002\u0004\u0006\b\n\u0000\u0006"+
		"\u0001\u0000\u001e \u0001\u0000\u000f\u0011\u0001\u0000\u0001\u0002\u0001"+
		"\u0000\u0013\u0015\u0001\u0000\u0006\u000b\u0003\u0000\f\u000e\u0012\u0012"+
		"\u0016\u001dL\u0000\f\u0001\u0000\u0000\u0000\u0002\u0016\u0001\u0000"+
		"\u0000\u0000\u0004\u0018\u0001\u0000\u0000\u0000\u0006:\u0001\u0000\u0000"+
		"\u0000\bA\u0001\u0000\u0000\u0000\nC\u0001\u0000\u0000\u0000\f\u0011\u0003"+
		"\u0002\u0001\u0000\r\u000e\u0005!\u0000\u0000\u000e\u0010\u0003\u0002"+
		"\u0001\u0000\u000f\r\u0001\u0000\u0000\u0000\u0010\u0013\u0001\u0000\u0000"+
		"\u0000\u0011\u000f\u0001\u0000\u0000\u0000\u0011\u0012\u0001\u0000\u0000"+
		"\u0000\u0012\u0014\u0001\u0000\u0000\u0000\u0013\u0011\u0001\u0000\u0000"+
		"\u0000\u0014\u0015\u0005\u0000\u0000\u0001\u0015\u0001\u0001\u0000\u0000"+
		"\u0000\u0016\u0017\u0003\u0004\u0002\u0000\u0017\u0003\u0001\u0000\u0000"+
		"\u0000\u0018\u001d\u0003\u0006\u0003\u0000\u0019\u001a\u0007\u0000\u0000"+
		"\u0000\u001a\u001c\u0003\u0006\u0003\u0000\u001b\u0019\u0001\u0000\u0000"+
		"\u0000\u001c\u001f\u0001\u0000\u0000\u0000\u001d\u001b\u0001\u0000\u0000"+
		"\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e\u0005\u0001\u0000\u0000"+
		"\u0000\u001f\u001d\u0001\u0000\u0000\u0000 \"\u0007\u0001\u0000\u0000"+
		"!#\u0003\u0006\u0003\u0000\"!\u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000"+
		"\u0000#;\u0001\u0000\u0000\u0000$&\u0007\u0002\u0000\u0000%\'\u0003\b"+
		"\u0004\u0000&%\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000\u0000\'+\u0001"+
		"\u0000\u0000\u0000(*\u0003\n\u0005\u0000)(\u0001\u0000\u0000\u0000*-\u0001"+
		"\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000"+
		",;\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000.0\u0005$\u0000\u0000"+
		"/1\u0005\u0005\u0000\u00000/\u0001\u0000\u0000\u000001\u0001\u0000\u0000"+
		"\u00001;\u0001\u0000\u0000\u000026\u0005\u0004\u0000\u000035\u0003\n\u0005"+
		"\u000043\u0001\u0000\u0000\u000058\u0001\u0000\u0000\u000064\u0001\u0000"+
		"\u0000\u000067\u0001\u0000\u0000\u00007;\u0001\u0000\u0000\u000086\u0001"+
		"\u0000\u0000\u00009;\u0007\u0003\u0000\u0000: \u0001\u0000\u0000\u0000"+
		":$\u0001\u0000\u0000\u0000:.\u0001\u0000\u0000\u0000:2\u0001\u0000\u0000"+
		"\u0000:9\u0001\u0000\u0000\u0000;\u0007\u0001\u0000\u0000\u0000<B\u0007"+
		"\u0004\u0000\u0000=?\u0005\u0003\u0000\u0000>@\u0007\u0004\u0000\u0000"+
		"?>\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@B\u0001\u0000\u0000"+
		"\u0000A<\u0001\u0000\u0000\u0000A=\u0001\u0000\u0000\u0000B\t\u0001\u0000"+
		"\u0000\u0000CD\u0007\u0005\u0000\u0000D\u000b\u0001\u0000\u0000\u0000"+
		"\n\u0011\u001d\"&+06:?A";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}