// $ANTLR 3.5.2 /Users/vgehlot/VGehlot/Csc8310/ANTLRv3/ANTLRExamples1/ExprParser/Expr.g 2017-09-12 19:03:16

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ExprLexer extends Lexer {
	public static final int EOF=-1;
	public static final int ADD=4;
	public static final int DIGIT=5;
	public static final int DIV=6;
	public static final int ID=7;
	public static final int LETTER=8;
	public static final int LPAR=9;
	public static final int MUL=10;
	public static final int NUM=11;
	public static final int RPAR=12;
	public static final int SUB=13;
	public static final int WS=14;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public ExprLexer() {} 
	public ExprLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public ExprLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/Users/vgehlot/VGehlot/Csc8310/ANTLRv3/ANTLRExamples1/ExprParser/Expr.g"; }

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// /Users/vgehlot/VGehlot/Csc8310/ANTLRv3/ANTLRExamples1/ExprParser/Expr.g:6:2: ( 'a' .. 'z' | 'A' .. 'Z' )
			// /Users/vgehlot/VGehlot/Csc8310/ANTLRv3/ANTLRExamples1/ExprParser/Expr.g:
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
			// /Users/vgehlot/VGehlot/Csc8310/ANTLRv3/ANTLRExamples1/ExprParser/Expr.g:8:2: ( '0' .. '9' )
			// /Users/vgehlot/VGehlot/Csc8310/ANTLRv3/ANTLRExamples1/ExprParser/Expr.g:
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

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/vgehlot/VGehlot/Csc8310/ANTLRv3/ANTLRExamples1/ExprParser/Expr.g:9:4: ( LETTER ( LETTER | DIGIT )* )
			// /Users/vgehlot/VGehlot/Csc8310/ANTLRv3/ANTLRExamples1/ExprParser/Expr.g:9:6: LETTER ( LETTER | DIGIT )*
			{
			mLETTER(); 

			// /Users/vgehlot/VGehlot/Csc8310/ANTLRv3/ANTLRExamples1/ExprParser/Expr.g:9:13: ( LETTER | DIGIT )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /Users/vgehlot/VGehlot/Csc8310/ANTLRv3/ANTLRExamples1/ExprParser/Expr.g:
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
			// /Users/vgehlot/VGehlot/Csc8310/ANTLRv3/ANTLRExamples1/ExprParser/Expr.g:10:5: ( ( DIGIT )+ )
			// /Users/vgehlot/VGehlot/Csc8310/ANTLRv3/ANTLRExamples1/ExprParser/Expr.g:10:7: ( DIGIT )+
			{
			// /Users/vgehlot/VGehlot/Csc8310/ANTLRv3/ANTLRExamples1/ExprParser/Expr.g:10:7: ( DIGIT )+
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
					// /Users/vgehlot/VGehlot/Csc8310/ANTLRv3/ANTLRExamples1/ExprParser/Expr.g:
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

	// $ANTLR start "ADD"
	public final void mADD() throws RecognitionException {
		try {
			int _type = ADD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/vgehlot/VGehlot/Csc8310/ANTLRv3/ANTLRExamples1/ExprParser/Expr.g:11:5: ( '+' )
			// /Users/vgehlot/VGehlot/Csc8310/ANTLRv3/ANTLRExamples1/ExprParser/Expr.g:11:7: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ADD"

	// $ANTLR start "SUB"
	public final void mSUB() throws RecognitionException {
		try {
			int _type = SUB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/vgehlot/VGehlot/Csc8310/ANTLRv3/ANTLRExamples1/ExprParser/Expr.g:12:5: ( '-' )
			// /Users/vgehlot/VGehlot/Csc8310/ANTLRv3/ANTLRExamples1/ExprParser/Expr.g:12:7: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SUB"

	// $ANTLR start "MUL"
	public final void mMUL() throws RecognitionException {
		try {
			int _type = MUL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/vgehlot/VGehlot/Csc8310/ANTLRv3/ANTLRExamples1/ExprParser/Expr.g:13:5: ( '*' )
			// /Users/vgehlot/VGehlot/Csc8310/ANTLRv3/ANTLRExamples1/ExprParser/Expr.g:13:7: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MUL"

	// $ANTLR start "DIV"
	public final void mDIV() throws RecognitionException {
		try {
			int _type = DIV;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/vgehlot/VGehlot/Csc8310/ANTLRv3/ANTLRExamples1/ExprParser/Expr.g:14:5: ( '/' )
			// /Users/vgehlot/VGehlot/Csc8310/ANTLRv3/ANTLRExamples1/ExprParser/Expr.g:14:7: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIV"

	// $ANTLR start "LPAR"
	public final void mLPAR() throws RecognitionException {
		try {
			int _type = LPAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/vgehlot/VGehlot/Csc8310/ANTLRv3/ANTLRExamples1/ExprParser/Expr.g:15:6: ( '(' )
			// /Users/vgehlot/VGehlot/Csc8310/ANTLRv3/ANTLRExamples1/ExprParser/Expr.g:15:8: '('
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
			// /Users/vgehlot/VGehlot/Csc8310/ANTLRv3/ANTLRExamples1/ExprParser/Expr.g:16:6: ( ')' )
			// /Users/vgehlot/VGehlot/Csc8310/ANTLRv3/ANTLRExamples1/ExprParser/Expr.g:16:8: ')'
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

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/vgehlot/VGehlot/Csc8310/ANTLRv3/ANTLRExamples1/ExprParser/Expr.g:17:4: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
			// /Users/vgehlot/VGehlot/Csc8310/ANTLRv3/ANTLRExamples1/ExprParser/Expr.g:17:6: ( ' ' | '\\t' | '\\n' | '\\r' )+
			{
			// /Users/vgehlot/VGehlot/Csc8310/ANTLRv3/ANTLRExamples1/ExprParser/Expr.g:17:6: ( ' ' | '\\t' | '\\n' | '\\r' )+
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
					// /Users/vgehlot/VGehlot/Csc8310/ANTLRv3/ANTLRExamples1/ExprParser/Expr.g:
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

	@Override
	public void mTokens() throws RecognitionException {
		// /Users/vgehlot/VGehlot/Csc8310/ANTLRv3/ANTLRExamples1/ExprParser/Expr.g:1:8: ( ID | NUM | ADD | SUB | MUL | DIV | LPAR | RPAR | WS )
		int alt4=9;
		switch ( input.LA(1) ) {
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
		case 'd':
		case 'e':
		case 'f':
		case 'g':
		case 'h':
		case 'i':
		case 'j':
		case 'k':
		case 'l':
		case 'm':
		case 'n':
		case 'o':
		case 'p':
		case 'q':
		case 'r':
		case 's':
		case 't':
		case 'u':
		case 'v':
		case 'w':
		case 'x':
		case 'y':
		case 'z':
			{
			alt4=1;
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
			alt4=2;
			}
			break;
		case '+':
			{
			alt4=3;
			}
			break;
		case '-':
			{
			alt4=4;
			}
			break;
		case '*':
			{
			alt4=5;
			}
			break;
		case '/':
			{
			alt4=6;
			}
			break;
		case '(':
			{
			alt4=7;
			}
			break;
		case ')':
			{
			alt4=8;
			}
			break;
		case '\t':
		case '\n':
		case '\r':
		case ' ':
			{
			alt4=9;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 4, 0, input);
			throw nvae;
		}
		switch (alt4) {
			case 1 :
				// /Users/vgehlot/VGehlot/Csc8310/ANTLRv3/ANTLRExamples1/ExprParser/Expr.g:1:10: ID
				{
				mID(); 

				}
				break;
			case 2 :
				// /Users/vgehlot/VGehlot/Csc8310/ANTLRv3/ANTLRExamples1/ExprParser/Expr.g:1:13: NUM
				{
				mNUM(); 

				}
				break;
			case 3 :
				// /Users/vgehlot/VGehlot/Csc8310/ANTLRv3/ANTLRExamples1/ExprParser/Expr.g:1:17: ADD
				{
				mADD(); 

				}
				break;
			case 4 :
				// /Users/vgehlot/VGehlot/Csc8310/ANTLRv3/ANTLRExamples1/ExprParser/Expr.g:1:21: SUB
				{
				mSUB(); 

				}
				break;
			case 5 :
				// /Users/vgehlot/VGehlot/Csc8310/ANTLRv3/ANTLRExamples1/ExprParser/Expr.g:1:25: MUL
				{
				mMUL(); 

				}
				break;
			case 6 :
				// /Users/vgehlot/VGehlot/Csc8310/ANTLRv3/ANTLRExamples1/ExprParser/Expr.g:1:29: DIV
				{
				mDIV(); 

				}
				break;
			case 7 :
				// /Users/vgehlot/VGehlot/Csc8310/ANTLRv3/ANTLRExamples1/ExprParser/Expr.g:1:33: LPAR
				{
				mLPAR(); 

				}
				break;
			case 8 :
				// /Users/vgehlot/VGehlot/Csc8310/ANTLRv3/ANTLRExamples1/ExprParser/Expr.g:1:38: RPAR
				{
				mRPAR(); 

				}
				break;
			case 9 :
				// /Users/vgehlot/VGehlot/Csc8310/ANTLRv3/ANTLRExamples1/ExprParser/Expr.g:1:43: WS
				{
				mWS(); 

				}
				break;

		}
	}



}
