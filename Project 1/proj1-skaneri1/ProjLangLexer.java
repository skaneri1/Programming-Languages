// $ANTLR null /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/ProjLang.g 2018-10-30 23:13:04

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ProjLangLexer extends Lexer {
	public static final int EOF=-1;
	public static final int ADD=4;
	public static final int COL=5;
	public static final int DIGIT=6;
	public static final int DO=7;
	public static final int EL=8;
	public static final int END=9;
	public static final int EQ=10;
	public static final int FALSE=11;
	public static final int FUN=12;
	public static final int ID=13;
	public static final int IF=14;
	public static final int IN=15;
	public static final int LB=16;
	public static final int LET=17;
	public static final int LETTER=18;
	public static final int LPAR=19;
	public static final int MULT=20;
	public static final int NEG=21;
	public static final int NUM=22;
	public static final int RB=23;
	public static final int RE=24;
	public static final int RPAR=25;
	public static final int SEMI=26;
	public static final int THEN=27;
	public static final int TRUE=28;
	public static final int VAL=29;
	public static final int WHILE=30;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public ProjLangLexer() {} 
	public ProjLangLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public ProjLangLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/ProjLang.g"; }

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/ProjLang.g:6:2: ( 'a' .. 'z' | 'A' .. 'Z' )
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/ProjLang.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LETTER"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/ProjLang.g:8:2: ( '0' .. '9' )
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/ProjLang.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/ProjLang.g:9:9: ( 'if' )
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/ProjLang.g:9:12: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF"

	// $ANTLR start "WHILE"
	public final void mWHILE() throws RecognitionException {
		try {
			int _type = WHILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/ProjLang.g:10:7: ( 'while' )
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/ProjLang.g:10:9: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHILE"

	// $ANTLR start "DO"
	public final void mDO() throws RecognitionException {
		try {
			int _type = DO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/ProjLang.g:11:4: ( 'do' )
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/ProjLang.g:11:6: 'do'
			{
			match("do"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DO"

	// $ANTLR start "THEN"
	public final void mTHEN() throws RecognitionException {
		try {
			int _type = THEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/ProjLang.g:12:6: ( 'then' )
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/ProjLang.g:12:8: 'then'
			{
			match("then"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "THEN"

	// $ANTLR start "EL"
	public final void mEL() throws RecognitionException {
		try {
			int _type = EL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/ProjLang.g:13:4: ( 'else' )
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/ProjLang.g:13:6: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EL"

	// $ANTLR start "LET"
	public final void mLET() throws RecognitionException {
		try {
			int _type = LET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/ProjLang.g:14:5: ( 'let' )
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/ProjLang.g:14:7: 'let'
			{
			match("let"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LET"

	// $ANTLR start "VAL"
	public final void mVAL() throws RecognitionException {
		try {
			int _type = VAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/ProjLang.g:15:5: ( 'val' )
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/ProjLang.g:15:7: 'val'
			{
			match("val"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VAL"

	// $ANTLR start "IN"
	public final void mIN() throws RecognitionException {
		try {
			int _type = IN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/ProjLang.g:16:4: ( 'in' )
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/ProjLang.g:16:6: 'in'
			{
			match("in"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IN"

	// $ANTLR start "END"
	public final void mEND() throws RecognitionException {
		try {
			int _type = END;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/ProjLang.g:17:5: ( 'end' )
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/ProjLang.g:17:7: 'end'
			{
			match("end"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "END"

	// $ANTLR start "FUN"
	public final void mFUN() throws RecognitionException {
		try {
			int _type = FUN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/ProjLang.g:18:5: ( 'fun' )
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/ProjLang.g:18:7: 'fun'
			{
			match("fun"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FUN"

	// $ANTLR start "TRUE"
	public final void mTRUE() throws RecognitionException {
		try {
			int _type = TRUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/ProjLang.g:19:6: ( 'true' )
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/ProjLang.g:19:8: 'true'
			{
			match("true"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TRUE"

	// $ANTLR start "FALSE"
	public final void mFALSE() throws RecognitionException {
		try {
			int _type = FALSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/ProjLang.g:20:7: ( 'false' )
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/ProjLang.g:20:9: 'false'
			{
			match("false"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FALSE"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/ProjLang.g:21:4: ( LETTER ( LETTER | DIGIT )* )
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/ProjLang.g:21:6: LETTER ( LETTER | DIGIT )*
			{
			mLETTER(); 

			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/ProjLang.g:21:13: ( LETTER | DIGIT )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/ProjLang.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "NUM"
	public final void mNUM() throws RecognitionException {
		try {
			int _type = NUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/ProjLang.g:22:5: ( ( DIGIT )+ )
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/ProjLang.g:22:7: ( DIGIT )+
			{
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/ProjLang.g:22:7: ( DIGIT )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/ProjLang.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUM"

	// $ANTLR start "LPAR"
	public final void mLPAR() throws RecognitionException {
		try {
			int _type = LPAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/ProjLang.g:23:6: ( '(' )
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/ProjLang.g:23:8: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LPAR"

	// $ANTLR start "RPAR"
	public final void mRPAR() throws RecognitionException {
		try {
			int _type = RPAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/ProjLang.g:24:6: ( ')' )
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/ProjLang.g:24:8: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RPAR"

	// $ANTLR start "SEMI"
	public final void mSEMI() throws RecognitionException {
		try {
			int _type = SEMI;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/ProjLang.g:25:6: ( ';' )
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/ProjLang.g:25:8: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEMI"

	// $ANTLR start "LB"
	public final void mLB() throws RecognitionException {
		try {
			int _type = LB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/ProjLang.g:26:4: ( '{' )
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/ProjLang.g:26:6: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LB"

	// $ANTLR start "RB"
	public final void mRB() throws RecognitionException {
		try {
			int _type = RB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/ProjLang.g:27:4: ( '}' )
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/ProjLang.g:27:6: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RB"

	// $ANTLR start "COL"
	public final void mCOL() throws RecognitionException {
		try {
			int _type = COL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/ProjLang.g:28:5: ( ':' )
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/ProjLang.g:28:7: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COL"

	// $ANTLR start "EQ"
	public final void mEQ() throws RecognitionException {
		try {
			int _type = EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/ProjLang.g:29:4: ( '=' )
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/ProjLang.g:29:6: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQ"

	// $ANTLR start "NEG"
	public final void mNEG() throws RecognitionException {
		try {
			int _type = NEG;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/ProjLang.g:30:5: ( '!' )
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/ProjLang.g:30:7: '!'
			{
			match('!'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEG"

	// $ANTLR start "ADD"
	public final void mADD() throws RecognitionException {
		try {
			int _type = ADD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/ProjLang.g:31:5: ( '+' | '-' | '|' )
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/ProjLang.g:
			{
			if ( input.LA(1)=='+'||input.LA(1)=='-'||input.LA(1)=='|' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ADD"

	// $ANTLR start "MULT"
	public final void mMULT() throws RecognitionException {
		try {
			int _type = MULT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/ProjLang.g:32:6: ( '*' | '/' | '&' )
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/ProjLang.g:
			{
			if ( input.LA(1)=='&'||input.LA(1)=='*'||input.LA(1)=='/' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MULT"

	// $ANTLR start "RE"
	public final void mRE() throws RecognitionException {
		try {
			int _type = RE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/ProjLang.g:33:4: ( '<' | '=' )
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/ProjLang.g:
			{
			if ( (input.LA(1) >= '<' && input.LA(1) <= '=') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RE"

	@Override
	public void mTokens() throws RecognitionException {
		// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/ProjLang.g:1:8: ( IF | WHILE | DO | THEN | EL | LET | VAL | IN | END | FUN | TRUE | FALSE | ID | NUM | LPAR | RPAR | SEMI | LB | RB | COL | EQ | NEG | ADD | MULT | RE )
		int alt3=25;
		alt3 = dfa3.predict(input);
		switch (alt3) {
			case 1 :
				// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/ProjLang.g:1:10: IF
				{
				mIF(); 

				}
				break;
			case 2 :
				// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/ProjLang.g:1:13: WHILE
				{
				mWHILE(); 

				}
				break;
			case 3 :
				// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/ProjLang.g:1:19: DO
				{
				mDO(); 

				}
				break;
			case 4 :
				// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/ProjLang.g:1:22: THEN
				{
				mTHEN(); 

				}
				break;
			case 5 :
				// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/ProjLang.g:1:27: EL
				{
				mEL(); 

				}
				break;
			case 6 :
				// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/ProjLang.g:1:30: LET
				{
				mLET(); 

				}
				break;
			case 7 :
				// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/ProjLang.g:1:34: VAL
				{
				mVAL(); 

				}
				break;
			case 8 :
				// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/ProjLang.g:1:38: IN
				{
				mIN(); 

				}
				break;
			case 9 :
				// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/ProjLang.g:1:41: END
				{
				mEND(); 

				}
				break;
			case 10 :
				// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/ProjLang.g:1:45: FUN
				{
				mFUN(); 

				}
				break;
			case 11 :
				// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/ProjLang.g:1:49: TRUE
				{
				mTRUE(); 

				}
				break;
			case 12 :
				// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/ProjLang.g:1:54: FALSE
				{
				mFALSE(); 

				}
				break;
			case 13 :
				// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/ProjLang.g:1:60: ID
				{
				mID(); 

				}
				break;
			case 14 :
				// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/ProjLang.g:1:63: NUM
				{
				mNUM(); 

				}
				break;
			case 15 :
				// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/ProjLang.g:1:67: LPAR
				{
				mLPAR(); 

				}
				break;
			case 16 :
				// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/ProjLang.g:1:72: RPAR
				{
				mRPAR(); 

				}
				break;
			case 17 :
				// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/ProjLang.g:1:77: SEMI
				{
				mSEMI(); 

				}
				break;
			case 18 :
				// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/ProjLang.g:1:82: LB
				{
				mLB(); 

				}
				break;
			case 19 :
				// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/ProjLang.g:1:85: RB
				{
				mRB(); 

				}
				break;
			case 20 :
				// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/ProjLang.g:1:88: COL
				{
				mCOL(); 

				}
				break;
			case 21 :
				// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/ProjLang.g:1:92: EQ
				{
				mEQ(); 

				}
				break;
			case 22 :
				// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/ProjLang.g:1:95: NEG
				{
				mNEG(); 

				}
				break;
			case 23 :
				// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/ProjLang.g:1:99: ADD
				{
				mADD(); 

				}
				break;
			case 24 :
				// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/ProjLang.g:1:103: MULT
				{
				mMULT(); 

				}
				break;
			case 25 :
				// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/ProjLang.g:1:108: RE
				{
				mRE(); 

				}
				break;

		}
	}


	protected DFA3 dfa3 = new DFA3(this);
	static final String DFA3_eotS =
		"\1\uffff\10\11\15\uffff\1\43\1\44\1\11\1\46\10\11\3\uffff\1\11\1\uffff"+
		"\3\11\1\63\1\64\1\65\1\66\2\11\1\71\1\72\1\73\4\uffff\1\11\1\75\3\uffff"+
		"\1\76\2\uffff";
	static final String DFA3_eofS =
		"\77\uffff";
	static final String DFA3_minS =
		"\1\41\1\146\1\150\1\157\1\150\1\154\1\145\2\141\15\uffff\2\60\1\151\1"+
		"\60\1\145\1\165\1\163\1\144\1\164\1\154\1\156\1\154\3\uffff\1\154\1\uffff"+
		"\1\156\2\145\4\60\1\163\1\145\3\60\4\uffff\1\145\1\60\3\uffff\1\60\2\uffff";
	static final String DFA3_maxS =
		"\1\175\1\156\1\150\1\157\1\162\1\156\1\145\1\141\1\165\15\uffff\2\172"+
		"\1\151\1\172\1\145\1\165\1\163\1\144\1\164\1\154\1\156\1\154\3\uffff\1"+
		"\154\1\uffff\1\156\2\145\4\172\1\163\1\145\3\172\4\uffff\1\145\1\172\3"+
		"\uffff\1\172\2\uffff";
	static final String DFA3_acceptS =
		"\11\uffff\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
		"\1\31\14\uffff\1\25\1\1\1\10\1\uffff\1\3\14\uffff\1\11\1\6\1\7\1\12\2"+
		"\uffff\1\4\1\13\1\5\1\uffff\1\2\1\14";
	static final String DFA3_specialS =
		"\77\uffff}>";
	static final String[] DFA3_transitionS = {
			"\1\22\4\uffff\1\24\1\uffff\1\13\1\14\1\24\1\23\1\uffff\1\23\1\uffff\1"+
			"\24\12\12\1\20\1\15\1\25\1\21\3\uffff\32\11\6\uffff\3\11\1\3\1\5\1\10"+
			"\2\11\1\1\2\11\1\6\7\11\1\4\1\11\1\7\1\2\3\11\1\16\1\23\1\17",
			"\1\26\7\uffff\1\27",
			"\1\30",
			"\1\31",
			"\1\32\11\uffff\1\33",
			"\1\34\1\uffff\1\35",
			"\1\36",
			"\1\37",
			"\1\41\23\uffff\1\40",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\12\11\7\uffff\32\11\6\uffff\32\11",
			"\12\11\7\uffff\32\11\6\uffff\32\11",
			"\1\45",
			"\12\11\7\uffff\32\11\6\uffff\32\11",
			"\1\47",
			"\1\50",
			"\1\51",
			"\1\52",
			"\1\53",
			"\1\54",
			"\1\55",
			"\1\56",
			"",
			"",
			"",
			"\1\57",
			"",
			"\1\60",
			"\1\61",
			"\1\62",
			"\12\11\7\uffff\32\11\6\uffff\32\11",
			"\12\11\7\uffff\32\11\6\uffff\32\11",
			"\12\11\7\uffff\32\11\6\uffff\32\11",
			"\12\11\7\uffff\32\11\6\uffff\32\11",
			"\1\67",
			"\1\70",
			"\12\11\7\uffff\32\11\6\uffff\32\11",
			"\12\11\7\uffff\32\11\6\uffff\32\11",
			"\12\11\7\uffff\32\11\6\uffff\32\11",
			"",
			"",
			"",
			"",
			"\1\74",
			"\12\11\7\uffff\32\11\6\uffff\32\11",
			"",
			"",
			"",
			"\12\11\7\uffff\32\11\6\uffff\32\11",
			"",
			""
	};

	static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
	static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
	static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
	static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
	static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
	static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
	static final short[][] DFA3_transition;

	static {
		int numStates = DFA3_transitionS.length;
		DFA3_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
		}
	}

	protected class DFA3 extends DFA {

		public DFA3(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 3;
			this.eot = DFA3_eot;
			this.eof = DFA3_eof;
			this.min = DFA3_min;
			this.max = DFA3_max;
			this.accept = DFA3_accept;
			this.special = DFA3_special;
			this.transition = DFA3_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( IF | WHILE | DO | THEN | EL | LET | VAL | IN | END | FUN | TRUE | FALSE | ID | NUM | LPAR | RPAR | SEMI | LB | RB | COL | EQ | NEG | ADD | MULT | RE );";
		}
	}

}
