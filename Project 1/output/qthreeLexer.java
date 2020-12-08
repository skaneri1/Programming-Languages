// $ANTLR null /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g 2018-09-19 16:35:29

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class qthreeLexer extends Lexer {
	public static final int EOF=-1;
	public static final int ADD=4;
	public static final int COL=5;
	public static final int COM=6;
	public static final int COMPOP=7;
	public static final int DIGIT=8;
	public static final int DO=9;
	public static final int EQ=10;
	public static final int FI=11;
	public static final int ID=12;
	public static final int IF=13;
	public static final int LETTER=14;
	public static final int LPAR=15;
	public static final int MULT=16;
	public static final int NUM=17;
	public static final int OD=18;
	public static final int RD=19;
	public static final int RPAR=20;
	public static final int SEMI=21;
	public static final int THEN=22;
	public static final int WE=23;
	public static final int WHILE=24;
	public static final int WS=25;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public qthreeLexer() {} 
	public qthreeLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public qthreeLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g"; }

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:6:2: ( 'a' .. 'z' | 'A' .. 'Z' )
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:
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
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:8:2: ( '0' .. '9' )
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:
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
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:9:9: ( 'if' )
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:9:12: 'if'
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
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:10:7: ( 'while' )
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:10:9: 'while'
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
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:11:4: ( 'do' )
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:11:6: 'do'
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
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:12:6: ( 'then' )
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:12:8: 'then'
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

	// $ANTLR start "FI"
	public final void mFI() throws RecognitionException {
		try {
			int _type = FI;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:13:4: ( 'fi' )
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:13:6: 'fi'
			{
			match("fi"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FI"

	// $ANTLR start "OD"
	public final void mOD() throws RecognitionException {
		try {
			int _type = OD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:14:4: ( 'od' )
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:14:6: 'od'
			{
			match("od"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OD"

	// $ANTLR start "RD"
	public final void mRD() throws RecognitionException {
		try {
			int _type = RD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:15:4: ( 'read' )
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:15:6: 'read'
			{
			match("read"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RD"

	// $ANTLR start "WE"
	public final void mWE() throws RecognitionException {
		try {
			int _type = WE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:16:4: ( 'write' )
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:16:6: 'write'
			{
			match("write"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WE"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:17:4: ( LETTER ( LETTER | DIGIT )* )
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:17:6: LETTER ( LETTER | DIGIT )*
			{
			mLETTER(); 

			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:17:13: ( LETTER | DIGIT )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:
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
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:18:5: ( ( DIGIT )+ )
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:18:7: ( DIGIT )+
			{
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:18:7: ( DIGIT )+
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
					// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:
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

	// $ANTLR start "SEMI"
	public final void mSEMI() throws RecognitionException {
		try {
			int _type = SEMI;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:19:6: ( ';' )
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:19:8: ';'
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

	// $ANTLR start "COL"
	public final void mCOL() throws RecognitionException {
		try {
			int _type = COL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:20:5: ( ':' )
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:20:7: ':'
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
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:21:4: ( '=' )
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:21:6: '='
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

	// $ANTLR start "LPAR"
	public final void mLPAR() throws RecognitionException {
		try {
			int _type = LPAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:22:6: ( '(' )
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:22:8: '('
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
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:23:6: ( ')' )
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:23:8: ')'
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

	// $ANTLR start "COM"
	public final void mCOM() throws RecognitionException {
		try {
			int _type = COM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:24:5: ( ',' )
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:24:7: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COM"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:25:4: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:25:6: ( ' ' | '\\t' | '\\n' | '\\r' )+
			{
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:25:6: ( ' ' | '\\t' | '\\n' | '\\r' )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '\t' && LA3_0 <= '\n')||LA3_0=='\r'||LA3_0==' ') ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
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
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			 skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "ADD"
	public final void mADD() throws RecognitionException {
		try {
			int _type = ADD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:26:5: ( '+' | '-' )
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:
			{
			if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
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
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:27:6: ( '*' | '/' )
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:
			{
			if ( input.LA(1)=='*'||input.LA(1)=='/' ) {
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

	// $ANTLR start "COMPOP"
	public final void mCOMPOP() throws RecognitionException {
		try {
			int _type = COMPOP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:28:8: ( '<' | '>' | '>=' | '<=' | '!=' )
			int alt4=5;
			switch ( input.LA(1) ) {
			case '<':
				{
				int LA4_1 = input.LA(2);
				if ( (LA4_1=='=') ) {
					alt4=4;
				}

				else {
					alt4=1;
				}

				}
				break;
			case '>':
				{
				int LA4_2 = input.LA(2);
				if ( (LA4_2=='=') ) {
					alt4=3;
				}

				else {
					alt4=2;
				}

				}
				break;
			case '!':
				{
				alt4=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:28:10: '<'
					{
					match('<'); 
					}
					break;
				case 2 :
					// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:28:16: '>'
					{
					match('>'); 
					}
					break;
				case 3 :
					// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:28:22: '>='
					{
					match(">="); 

					}
					break;
				case 4 :
					// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:28:29: '<='
					{
					match("<="); 

					}
					break;
				case 5 :
					// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:28:36: '!='
					{
					match("!="); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMPOP"

	@Override
	public void mTokens() throws RecognitionException {
		// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:1:8: ( IF | WHILE | DO | THEN | FI | OD | RD | WE | ID | NUM | SEMI | COL | EQ | LPAR | RPAR | COM | WS | ADD | MULT | COMPOP )
		int alt5=20;
		switch ( input.LA(1) ) {
		case 'i':
			{
			int LA5_1 = input.LA(2);
			if ( (LA5_1=='f') ) {
				int LA5_20 = input.LA(3);
				if ( ((LA5_20 >= '0' && LA5_20 <= '9')||(LA5_20 >= 'A' && LA5_20 <= 'Z')||(LA5_20 >= 'a' && LA5_20 <= 'z')) ) {
					alt5=9;
				}

				else {
					alt5=1;
				}

			}

			else {
				alt5=9;
			}

			}
			break;
		case 'w':
			{
			switch ( input.LA(2) ) {
			case 'h':
				{
				int LA5_21 = input.LA(3);
				if ( (LA5_21=='i') ) {
					int LA5_29 = input.LA(4);
					if ( (LA5_29=='l') ) {
						int LA5_36 = input.LA(5);
						if ( (LA5_36=='e') ) {
							int LA5_40 = input.LA(6);
							if ( ((LA5_40 >= '0' && LA5_40 <= '9')||(LA5_40 >= 'A' && LA5_40 <= 'Z')||(LA5_40 >= 'a' && LA5_40 <= 'z')) ) {
								alt5=9;
							}

							else {
								alt5=2;
							}

						}

						else {
							alt5=9;
						}

					}

					else {
						alt5=9;
					}

				}

				else {
					alt5=9;
				}

				}
				break;
			case 'r':
				{
				int LA5_22 = input.LA(3);
				if ( (LA5_22=='i') ) {
					int LA5_30 = input.LA(4);
					if ( (LA5_30=='t') ) {
						int LA5_37 = input.LA(5);
						if ( (LA5_37=='e') ) {
							int LA5_41 = input.LA(6);
							if ( ((LA5_41 >= '0' && LA5_41 <= '9')||(LA5_41 >= 'A' && LA5_41 <= 'Z')||(LA5_41 >= 'a' && LA5_41 <= 'z')) ) {
								alt5=9;
							}

							else {
								alt5=8;
							}

						}

						else {
							alt5=9;
						}

					}

					else {
						alt5=9;
					}

				}

				else {
					alt5=9;
				}

				}
				break;
			default:
				alt5=9;
			}
			}
			break;
		case 'd':
			{
			int LA5_3 = input.LA(2);
			if ( (LA5_3=='o') ) {
				int LA5_23 = input.LA(3);
				if ( ((LA5_23 >= '0' && LA5_23 <= '9')||(LA5_23 >= 'A' && LA5_23 <= 'Z')||(LA5_23 >= 'a' && LA5_23 <= 'z')) ) {
					alt5=9;
				}

				else {
					alt5=3;
				}

			}

			else {
				alt5=9;
			}

			}
			break;
		case 't':
			{
			int LA5_4 = input.LA(2);
			if ( (LA5_4=='h') ) {
				int LA5_24 = input.LA(3);
				if ( (LA5_24=='e') ) {
					int LA5_32 = input.LA(4);
					if ( (LA5_32=='n') ) {
						int LA5_38 = input.LA(5);
						if ( ((LA5_38 >= '0' && LA5_38 <= '9')||(LA5_38 >= 'A' && LA5_38 <= 'Z')||(LA5_38 >= 'a' && LA5_38 <= 'z')) ) {
							alt5=9;
						}

						else {
							alt5=4;
						}

					}

					else {
						alt5=9;
					}

				}

				else {
					alt5=9;
				}

			}

			else {
				alt5=9;
			}

			}
			break;
		case 'f':
			{
			int LA5_5 = input.LA(2);
			if ( (LA5_5=='i') ) {
				int LA5_25 = input.LA(3);
				if ( ((LA5_25 >= '0' && LA5_25 <= '9')||(LA5_25 >= 'A' && LA5_25 <= 'Z')||(LA5_25 >= 'a' && LA5_25 <= 'z')) ) {
					alt5=9;
				}

				else {
					alt5=5;
				}

			}

			else {
				alt5=9;
			}

			}
			break;
		case 'o':
			{
			int LA5_6 = input.LA(2);
			if ( (LA5_6=='d') ) {
				int LA5_26 = input.LA(3);
				if ( ((LA5_26 >= '0' && LA5_26 <= '9')||(LA5_26 >= 'A' && LA5_26 <= 'Z')||(LA5_26 >= 'a' && LA5_26 <= 'z')) ) {
					alt5=9;
				}

				else {
					alt5=6;
				}

			}

			else {
				alt5=9;
			}

			}
			break;
		case 'r':
			{
			int LA5_7 = input.LA(2);
			if ( (LA5_7=='e') ) {
				int LA5_27 = input.LA(3);
				if ( (LA5_27=='a') ) {
					int LA5_35 = input.LA(4);
					if ( (LA5_35=='d') ) {
						int LA5_39 = input.LA(5);
						if ( ((LA5_39 >= '0' && LA5_39 <= '9')||(LA5_39 >= 'A' && LA5_39 <= 'Z')||(LA5_39 >= 'a' && LA5_39 <= 'z')) ) {
							alt5=9;
						}

						else {
							alt5=7;
						}

					}

					else {
						alt5=9;
					}

				}

				else {
					alt5=9;
				}

			}

			else {
				alt5=9;
			}

			}
			break;
		case 'A':
		case 'B':
		case 'C':
		case 'D':
		case 'E':
		case 'F':
		case 'G':
		case 'H':
		case 'I':
		case 'J':
		case 'K':
		case 'L':
		case 'M':
		case 'N':
		case 'O':
		case 'P':
		case 'Q':
		case 'R':
		case 'S':
		case 'T':
		case 'U':
		case 'V':
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
		case 'a':
		case 'b':
		case 'c':
		case 'e':
		case 'g':
		case 'h':
		case 'j':
		case 'k':
		case 'l':
		case 'm':
		case 'n':
		case 'p':
		case 'q':
		case 's':
		case 'u':
		case 'v':
		case 'x':
		case 'y':
		case 'z':
			{
			alt5=9;
			}
			break;
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			{
			alt5=10;
			}
			break;
		case ';':
			{
			alt5=11;
			}
			break;
		case ':':
			{
			alt5=12;
			}
			break;
		case '=':
			{
			alt5=13;
			}
			break;
		case '(':
			{
			alt5=14;
			}
			break;
		case ')':
			{
			alt5=15;
			}
			break;
		case ',':
			{
			alt5=16;
			}
			break;
		case '\t':
		case '\n':
		case '\r':
		case ' ':
			{
			alt5=17;
			}
			break;
		case '+':
		case '-':
			{
			alt5=18;
			}
			break;
		case '*':
		case '/':
			{
			alt5=19;
			}
			break;
		case '!':
		case '<':
		case '>':
			{
			alt5=20;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 5, 0, input);
			throw nvae;
		}
		switch (alt5) {
			case 1 :
				// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:1:10: IF
				{
				mIF(); 

				}
				break;
			case 2 :
				// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:1:13: WHILE
				{
				mWHILE(); 

				}
				break;
			case 3 :
				// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:1:19: DO
				{
				mDO(); 

				}
				break;
			case 4 :
				// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:1:22: THEN
				{
				mTHEN(); 

				}
				break;
			case 5 :
				// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:1:27: FI
				{
				mFI(); 

				}
				break;
			case 6 :
				// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:1:30: OD
				{
				mOD(); 

				}
				break;
			case 7 :
				// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:1:33: RD
				{
				mRD(); 

				}
				break;
			case 8 :
				// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:1:36: WE
				{
				mWE(); 

				}
				break;
			case 9 :
				// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:1:39: ID
				{
				mID(); 

				}
				break;
			case 10 :
				// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:1:42: NUM
				{
				mNUM(); 

				}
				break;
			case 11 :
				// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:1:46: SEMI
				{
				mSEMI(); 

				}
				break;
			case 12 :
				// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:1:51: COL
				{
				mCOL(); 

				}
				break;
			case 13 :
				// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:1:55: EQ
				{
				mEQ(); 

				}
				break;
			case 14 :
				// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:1:58: LPAR
				{
				mLPAR(); 

				}
				break;
			case 15 :
				// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:1:63: RPAR
				{
				mRPAR(); 

				}
				break;
			case 16 :
				// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:1:68: COM
				{
				mCOM(); 

				}
				break;
			case 17 :
				// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:1:72: WS
				{
				mWS(); 

				}
				break;
			case 18 :
				// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:1:75: ADD
				{
				mADD(); 

				}
				break;
			case 19 :
				// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:1:79: MULT
				{
				mMULT(); 

				}
				break;
			case 20 :
				// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:1:84: COMPOP
				{
				mCOMPOP(); 

				}
				break;

		}
	}



}
