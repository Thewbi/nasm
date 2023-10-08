// Generated from c:/aaa_se/nasm/grammar/nasm_parser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class nasm_parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ADD=1, EBP=2, ESP=3, MOV=4, PUSH=5, ASTERISK=6, AT=7, BYTE=8, BACKSLASH=9, 
		CALL=10, CLOSEING_BRACKET=11, COLON=12, COMMA=13, CSEG=14, DB=15, DEF=16, 
		DEVICE=17, DOT=18, DSEG=19, ELSE=20, END_MACRO=21, ENDIF=22, EQUALS=23, 
		EQU=24, ERROR=25, EXTERN=26, GLOBAL=27, GT=28, HASH_TAG=29, IF=30, INCLUDE=31, 
		LEAVE=32, LEFT_SHIFT=33, LT=34, MACRO=35, MINUS=36, OPENING_BRACKET=37, 
		ORG=38, PLUS=39, RET=40, RIGHT_SHIFT=41, SECTION=42, SLASH=43, NEWLINE=44, 
		WS=45, LINE_COMMENT=46, BLOCK_COMMENT=47, DOUBLE_SLASH_LINE_COMMENT=48, 
		STRING=49, SINGLE_QUOTE_STRING=50, CHAR=51, ESCAPED_CHAR=52, NUMBER=53, 
		HEX_NUMBER=54, BINARY_NUMBER=55, IDENTIFIER=56;
	public static final int
		RULE_compilation_unit = 0, RULE_line = 1, RULE_label = 2, RULE_instruction = 3, 
		RULE_mnemonic = 4, RULE_mnemonic_a = 5, RULE_mnemonic_c = 6, RULE_mnemonic_l = 7, 
		RULE_mnemonic_m = 8, RULE_mnemonic_p = 9, RULE_mnemonic_r = 10, RULE_param = 11, 
		RULE_register_32 = 12, RULE_assembler_instruction = 13, RULE_data_definition = 14, 
		RULE_data_definition_list = 15, RULE_data_definition_list_entry = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilation_unit", "line", "label", "instruction", "mnemonic", "mnemonic_a", 
			"mnemonic_c", "mnemonic_l", "mnemonic_m", "mnemonic_p", "mnemonic_r", 
			"param", "register_32", "assembler_instruction", "data_definition", "data_definition_list", 
			"data_definition_list_entry"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'ebp'", "'esp'", null, null, "'*'", "'@'", null, "'\\'", 
			null, "')'", "':'", "','", "'cseg'", "'db'", "'def'", "'device'", "'.'", 
			"'dseg'", "'else'", "'endmacro'", "'endif'", "'='", null, "'error'", 
			"'extern'", "'global'", "'>'", "'#'", "'if'", "'include'", null, "'<<'", 
			"'<'", "'macro'", "'-'", "'('", "'org'", "'+'", null, "'>>'", "'section'", 
			"'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ADD", "EBP", "ESP", "MOV", "PUSH", "ASTERISK", "AT", "BYTE", "BACKSLASH", 
			"CALL", "CLOSEING_BRACKET", "COLON", "COMMA", "CSEG", "DB", "DEF", "DEVICE", 
			"DOT", "DSEG", "ELSE", "END_MACRO", "ENDIF", "EQUALS", "EQU", "ERROR", 
			"EXTERN", "GLOBAL", "GT", "HASH_TAG", "IF", "INCLUDE", "LEAVE", "LEFT_SHIFT", 
			"LT", "MACRO", "MINUS", "OPENING_BRACKET", "ORG", "PLUS", "RET", "RIGHT_SHIFT", 
			"SECTION", "SLASH", "NEWLINE", "WS", "LINE_COMMENT", "BLOCK_COMMENT", 
			"DOUBLE_SLASH_LINE_COMMENT", "STRING", "SINGLE_QUOTE_STRING", "CHAR", 
			"ESCAPED_CHAR", "NUMBER", "HEX_NUMBER", "BINARY_NUMBER", "IDENTIFIER"
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
	public String getGrammarFileName() { return "nasm_parser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public nasm_parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Compilation_unitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(nasm_parser.EOF, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(nasm_parser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(nasm_parser.NEWLINE, i);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public Compilation_unitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilation_unit; }
	}

	public final Compilation_unitContext compilation_unit() throws RecognitionException {
		Compilation_unitContext _localctx = new Compilation_unitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilation_unit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(36);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NEWLINE:
					{
					setState(34);
					match(NEWLINE);
					}
					break;
				case ADD:
				case MOV:
				case PUSH:
				case CALL:
				case EXTERN:
				case GLOBAL:
				case LEAVE:
				case RET:
				case SECTION:
				case IDENTIFIER:
					{
					setState(35);
					line();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(38); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 72080688278406194L) != 0) );
			setState(40);
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
	public static class LineContext extends ParserRuleContext {
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public TerminalNode COLON() { return getToken(nasm_parser.COLON, 0); }
		public Assembler_instructionContext assembler_instruction() {
			return getRuleContext(Assembler_instructionContext.class,0);
		}
		public Data_definitionContext data_definition() {
			return getRuleContext(Data_definitionContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		int _la;
		try {
			setState(53);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(42);
					label();
					setState(43);
					match(COLON);
					}
				}

				setState(47);
				instruction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
				label();
				setState(49);
				match(COLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(51);
				assembler_instruction();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(52);
				data_definition();
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

	@SuppressWarnings("CheckReturnValue")
	public static class LabelContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(nasm_parser.IDENTIFIER, 0); }
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
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
	public static class InstructionContext extends ParserRuleContext {
		public MnemonicContext mnemonic() {
			return getRuleContext(MnemonicContext.class,0);
		}
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(nasm_parser.COMMA, 0); }
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_instruction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			mnemonic();
			setState(63);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(58);
				param();
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(59);
					match(COMMA);
					setState(60);
					param();
					}
				}

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

	@SuppressWarnings("CheckReturnValue")
	public static class MnemonicContext extends ParserRuleContext {
		public Mnemonic_aContext mnemonic_a() {
			return getRuleContext(Mnemonic_aContext.class,0);
		}
		public Mnemonic_cContext mnemonic_c() {
			return getRuleContext(Mnemonic_cContext.class,0);
		}
		public Mnemonic_lContext mnemonic_l() {
			return getRuleContext(Mnemonic_lContext.class,0);
		}
		public Mnemonic_mContext mnemonic_m() {
			return getRuleContext(Mnemonic_mContext.class,0);
		}
		public Mnemonic_pContext mnemonic_p() {
			return getRuleContext(Mnemonic_pContext.class,0);
		}
		public Mnemonic_rContext mnemonic_r() {
			return getRuleContext(Mnemonic_rContext.class,0);
		}
		public MnemonicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mnemonic; }
	}

	public final MnemonicContext mnemonic() throws RecognitionException {
		MnemonicContext _localctx = new MnemonicContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_mnemonic);
		try {
			setState(71);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				mnemonic_a();
				}
				break;
			case CALL:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				mnemonic_c();
				}
				break;
			case LEAVE:
				enterOuterAlt(_localctx, 3);
				{
				setState(67);
				mnemonic_l();
				}
				break;
			case MOV:
				enterOuterAlt(_localctx, 4);
				{
				setState(68);
				mnemonic_m();
				}
				break;
			case PUSH:
				enterOuterAlt(_localctx, 5);
				{
				setState(69);
				mnemonic_p();
				}
				break;
			case RET:
				enterOuterAlt(_localctx, 6);
				{
				setState(70);
				mnemonic_r();
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
	public static class Mnemonic_aContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(nasm_parser.ADD, 0); }
		public Mnemonic_aContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mnemonic_a; }
	}

	public final Mnemonic_aContext mnemonic_a() throws RecognitionException {
		Mnemonic_aContext _localctx = new Mnemonic_aContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_mnemonic_a);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(ADD);
			}
		}
		catch (RecognitionException re) {
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
	public static class Mnemonic_cContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(nasm_parser.CALL, 0); }
		public Mnemonic_cContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mnemonic_c; }
	}

	public final Mnemonic_cContext mnemonic_c() throws RecognitionException {
		Mnemonic_cContext _localctx = new Mnemonic_cContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_mnemonic_c);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(CALL);
			}
		}
		catch (RecognitionException re) {
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
	public static class Mnemonic_lContext extends ParserRuleContext {
		public TerminalNode LEAVE() { return getToken(nasm_parser.LEAVE, 0); }
		public Mnemonic_lContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mnemonic_l; }
	}

	public final Mnemonic_lContext mnemonic_l() throws RecognitionException {
		Mnemonic_lContext _localctx = new Mnemonic_lContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_mnemonic_l);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(LEAVE);
			}
		}
		catch (RecognitionException re) {
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
	public static class Mnemonic_mContext extends ParserRuleContext {
		public TerminalNode MOV() { return getToken(nasm_parser.MOV, 0); }
		public Mnemonic_mContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mnemonic_m; }
	}

	public final Mnemonic_mContext mnemonic_m() throws RecognitionException {
		Mnemonic_mContext _localctx = new Mnemonic_mContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_mnemonic_m);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(MOV);
			}
		}
		catch (RecognitionException re) {
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
	public static class Mnemonic_pContext extends ParserRuleContext {
		public TerminalNode PUSH() { return getToken(nasm_parser.PUSH, 0); }
		public Mnemonic_pContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mnemonic_p; }
	}

	public final Mnemonic_pContext mnemonic_p() throws RecognitionException {
		Mnemonic_pContext _localctx = new Mnemonic_pContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_mnemonic_p);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(PUSH);
			}
		}
		catch (RecognitionException re) {
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
	public static class Mnemonic_rContext extends ParserRuleContext {
		public TerminalNode RET() { return getToken(nasm_parser.RET, 0); }
		public Mnemonic_rContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mnemonic_r; }
	}

	public final Mnemonic_rContext mnemonic_r() throws RecognitionException {
		Mnemonic_rContext _localctx = new Mnemonic_rContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_mnemonic_r);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(RET);
			}
		}
		catch (RecognitionException re) {
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
	public static class ParamContext extends ParserRuleContext {
		public Register_32Context register_32() {
			return getRuleContext(Register_32Context.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(nasm_parser.IDENTIFIER, 0); }
		public TerminalNode BINARY_NUMBER() { return getToken(nasm_parser.BINARY_NUMBER, 0); }
		public TerminalNode HEX_NUMBER() { return getToken(nasm_parser.HEX_NUMBER, 0); }
		public TerminalNode NUMBER() { return getToken(nasm_parser.NUMBER, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_param);
		try {
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EBP:
			case ESP:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				register_32();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				match(IDENTIFIER);
				}
				break;
			case BINARY_NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(87);
				match(BINARY_NUMBER);
				}
				break;
			case HEX_NUMBER:
				enterOuterAlt(_localctx, 4);
				{
				setState(88);
				match(HEX_NUMBER);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 5);
				{
				setState(89);
				match(NUMBER);
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
	public static class Register_32Context extends ParserRuleContext {
		public TerminalNode EBP() { return getToken(nasm_parser.EBP, 0); }
		public TerminalNode ESP() { return getToken(nasm_parser.ESP, 0); }
		public Register_32Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_register_32; }
	}

	public final Register_32Context register_32() throws RecognitionException {
		Register_32Context _localctx = new Register_32Context(_ctx, getState());
		enterRule(_localctx, 24, RULE_register_32);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_la = _input.LA(1);
			if ( !(_la==EBP || _la==ESP) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Assembler_instructionContext extends ParserRuleContext {
		public TerminalNode EXTERN() { return getToken(nasm_parser.EXTERN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(nasm_parser.IDENTIFIER, 0); }
		public TerminalNode GLOBAL() { return getToken(nasm_parser.GLOBAL, 0); }
		public TerminalNode SECTION() { return getToken(nasm_parser.SECTION, 0); }
		public Assembler_instructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assembler_instruction; }
	}

	public final Assembler_instructionContext assembler_instruction() throws RecognitionException {
		Assembler_instructionContext _localctx = new Assembler_instructionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assembler_instruction);
		try {
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXTERN:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				match(EXTERN);
				setState(95);
				match(IDENTIFIER);
				}
				break;
			case GLOBAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				match(GLOBAL);
				setState(97);
				match(IDENTIFIER);
				}
				break;
			case SECTION:
				enterOuterAlt(_localctx, 3);
				{
				setState(98);
				match(SECTION);
				setState(99);
				match(IDENTIFIER);
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
	public static class Data_definitionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(nasm_parser.IDENTIFIER, 0); }
		public TerminalNode DB() { return getToken(nasm_parser.DB, 0); }
		public Data_definition_listContext data_definition_list() {
			return getRuleContext(Data_definition_listContext.class,0);
		}
		public Data_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_definition; }
	}

	public final Data_definitionContext data_definition() throws RecognitionException {
		Data_definitionContext _localctx = new Data_definitionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_data_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(IDENTIFIER);
			setState(103);
			match(DB);
			setState(104);
			data_definition_list();
			}
		}
		catch (RecognitionException re) {
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
	public static class Data_definition_listContext extends ParserRuleContext {
		public Data_definition_list_entryContext data_definition_list_entry() {
			return getRuleContext(Data_definition_list_entryContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(nasm_parser.COMMA, 0); }
		public Data_definition_listContext data_definition_list() {
			return getRuleContext(Data_definition_listContext.class,0);
		}
		public Data_definition_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_definition_list; }
	}

	public final Data_definition_listContext data_definition_list() throws RecognitionException {
		Data_definition_listContext _localctx = new Data_definition_listContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_data_definition_list);
		try {
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				data_definition_list_entry();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				data_definition_list_entry();
				setState(108);
				match(COMMA);
				setState(109);
				data_definition_list();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Data_definition_list_entryContext extends ParserRuleContext {
		public TerminalNode SINGLE_QUOTE_STRING() { return getToken(nasm_parser.SINGLE_QUOTE_STRING, 0); }
		public TerminalNode NUMBER() { return getToken(nasm_parser.NUMBER, 0); }
		public Data_definition_list_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_definition_list_entry; }
	}

	public final Data_definition_list_entryContext data_definition_list_entry() throws RecognitionException {
		Data_definition_list_entryContext _localctx = new Data_definition_list_entryContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_data_definition_list_entry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			_la = _input.LA(1);
			if ( !(_la==SINGLE_QUOTE_STRING || _la==NUMBER) ) {
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
		"\u0004\u00018t\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005"+
		"\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007"+
		"\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002\f\u0007"+
		"\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f\u0002"+
		"\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0004\u0000%\b\u0000\u000b"+
		"\u0000\f\u0000&\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001.\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u00016\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003>\b"+
		"\u0003\u0003\u0003@\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004H\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b[\b\u000b\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\re\b\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0003\u000fp\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0000\u0000\u0011\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \u0000\u0002\u0001\u0000\u0002\u0003\u0002"+
		"\u00002255v\u0000$\u0001\u0000\u0000\u0000\u00025\u0001\u0000\u0000\u0000"+
		"\u00047\u0001\u0000\u0000\u0000\u00069\u0001\u0000\u0000\u0000\bG\u0001"+
		"\u0000\u0000\u0000\nI\u0001\u0000\u0000\u0000\fK\u0001\u0000\u0000\u0000"+
		"\u000eM\u0001\u0000\u0000\u0000\u0010O\u0001\u0000\u0000\u0000\u0012Q"+
		"\u0001\u0000\u0000\u0000\u0014S\u0001\u0000\u0000\u0000\u0016Z\u0001\u0000"+
		"\u0000\u0000\u0018\\\u0001\u0000\u0000\u0000\u001ad\u0001\u0000\u0000"+
		"\u0000\u001cf\u0001\u0000\u0000\u0000\u001eo\u0001\u0000\u0000\u0000 "+
		"q\u0001\u0000\u0000\u0000\"%\u0005,\u0000\u0000#%\u0003\u0002\u0001\u0000"+
		"$\"\u0001\u0000\u0000\u0000$#\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000"+
		"\u0000&$\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000\u0000\'(\u0001\u0000"+
		"\u0000\u0000()\u0005\u0000\u0000\u0001)\u0001\u0001\u0000\u0000\u0000"+
		"*+\u0003\u0004\u0002\u0000+,\u0005\f\u0000\u0000,.\u0001\u0000\u0000\u0000"+
		"-*\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000./\u0001\u0000\u0000"+
		"\u0000/6\u0003\u0006\u0003\u000001\u0003\u0004\u0002\u000012\u0005\f\u0000"+
		"\u000026\u0001\u0000\u0000\u000036\u0003\u001a\r\u000046\u0003\u001c\u000e"+
		"\u00005-\u0001\u0000\u0000\u000050\u0001\u0000\u0000\u000053\u0001\u0000"+
		"\u0000\u000054\u0001\u0000\u0000\u00006\u0003\u0001\u0000\u0000\u0000"+
		"78\u00058\u0000\u00008\u0005\u0001\u0000\u0000\u00009?\u0003\b\u0004\u0000"+
		":=\u0003\u0016\u000b\u0000;<\u0005\r\u0000\u0000<>\u0003\u0016\u000b\u0000"+
		"=;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>@\u0001\u0000\u0000"+
		"\u0000?:\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@\u0007\u0001"+
		"\u0000\u0000\u0000AH\u0003\n\u0005\u0000BH\u0003\f\u0006\u0000CH\u0003"+
		"\u000e\u0007\u0000DH\u0003\u0010\b\u0000EH\u0003\u0012\t\u0000FH\u0003"+
		"\u0014\n\u0000GA\u0001\u0000\u0000\u0000GB\u0001\u0000\u0000\u0000GC\u0001"+
		"\u0000\u0000\u0000GD\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000"+
		"GF\u0001\u0000\u0000\u0000H\t\u0001\u0000\u0000\u0000IJ\u0005\u0001\u0000"+
		"\u0000J\u000b\u0001\u0000\u0000\u0000KL\u0005\n\u0000\u0000L\r\u0001\u0000"+
		"\u0000\u0000MN\u0005 \u0000\u0000N\u000f\u0001\u0000\u0000\u0000OP\u0005"+
		"\u0004\u0000\u0000P\u0011\u0001\u0000\u0000\u0000QR\u0005\u0005\u0000"+
		"\u0000R\u0013\u0001\u0000\u0000\u0000ST\u0005(\u0000\u0000T\u0015\u0001"+
		"\u0000\u0000\u0000U[\u0003\u0018\f\u0000V[\u00058\u0000\u0000W[\u0005"+
		"7\u0000\u0000X[\u00056\u0000\u0000Y[\u00055\u0000\u0000ZU\u0001\u0000"+
		"\u0000\u0000ZV\u0001\u0000\u0000\u0000ZW\u0001\u0000\u0000\u0000ZX\u0001"+
		"\u0000\u0000\u0000ZY\u0001\u0000\u0000\u0000[\u0017\u0001\u0000\u0000"+
		"\u0000\\]\u0007\u0000\u0000\u0000]\u0019\u0001\u0000\u0000\u0000^_\u0005"+
		"\u001a\u0000\u0000_e\u00058\u0000\u0000`a\u0005\u001b\u0000\u0000ae\u0005"+
		"8\u0000\u0000bc\u0005*\u0000\u0000ce\u00058\u0000\u0000d^\u0001\u0000"+
		"\u0000\u0000d`\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000e\u001b"+
		"\u0001\u0000\u0000\u0000fg\u00058\u0000\u0000gh\u0005\u000f\u0000\u0000"+
		"hi\u0003\u001e\u000f\u0000i\u001d\u0001\u0000\u0000\u0000jp\u0003 \u0010"+
		"\u0000kl\u0003 \u0010\u0000lm\u0005\r\u0000\u0000mn\u0003\u001e\u000f"+
		"\u0000np\u0001\u0000\u0000\u0000oj\u0001\u0000\u0000\u0000ok\u0001\u0000"+
		"\u0000\u0000p\u001f\u0001\u0000\u0000\u0000qr\u0007\u0001\u0000\u0000"+
		"r!\u0001\u0000\u0000\u0000\n$&-5=?GZdo";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}