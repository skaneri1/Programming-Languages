// $ANTLR null /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g 2018-09-19 16:35:29

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class qthreeParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADD", "COL", "COM", "COMPOP", 
		"DIGIT", "DO", "EQ", "FI", "ID", "IF", "LETTER", "LPAR", "MULT", "NUM", 
		"OD", "RD", "RPAR", "SEMI", "THEN", "WE", "WHILE", "WS"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public qthreeParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public qthreeParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return qthreeParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g"; }



	// $ANTLR start "program"
	// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:32:1: program : stmt_list ;
	public final void program() throws RecognitionException {
		try {
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:32:9: ( stmt_list )
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:32:11: stmt_list
			{
			pushFollow(FOLLOW_stmt_list_in_program242);
			stmt_list();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "program"



	// $ANTLR start "stmt"
	// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:35:1: stmt : ( ID COL EQ expr | RD ID | WE expr | IF comp THEN stmt_list FI | WHILE comp DO stmt_list OD );
	public final void stmt() throws RecognitionException {
		try {
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:36:2: ( ID COL EQ expr | RD ID | WE expr | IF comp THEN stmt_list FI | WHILE comp DO stmt_list OD )
			int alt1=5;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt1=1;
				}
				break;
			case RD:
				{
				alt1=2;
				}
				break;
			case WE:
				{
				alt1=3;
				}
				break;
			case IF:
				{
				alt1=4;
				}
				break;
			case WHILE:
				{
				alt1=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:36:4: ID COL EQ expr
					{
					match(input,ID,FOLLOW_ID_in_stmt253); 
					match(input,COL,FOLLOW_COL_in_stmt255); 
					match(input,EQ,FOLLOW_EQ_in_stmt257); 
					pushFollow(FOLLOW_expr_in_stmt259);
					expr();
					state._fsp--;

					}
					break;
				case 2 :
					// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:37:4: RD ID
					{
					match(input,RD,FOLLOW_RD_in_stmt264); 
					match(input,ID,FOLLOW_ID_in_stmt266); 
					}
					break;
				case 3 :
					// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:38:4: WE expr
					{
					match(input,WE,FOLLOW_WE_in_stmt271); 
					pushFollow(FOLLOW_expr_in_stmt273);
					expr();
					state._fsp--;

					}
					break;
				case 4 :
					// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:39:4: IF comp THEN stmt_list FI
					{
					match(input,IF,FOLLOW_IF_in_stmt278); 
					pushFollow(FOLLOW_comp_in_stmt280);
					comp();
					state._fsp--;

					match(input,THEN,FOLLOW_THEN_in_stmt282); 
					pushFollow(FOLLOW_stmt_list_in_stmt284);
					stmt_list();
					state._fsp--;

					match(input,FI,FOLLOW_FI_in_stmt286); 
					}
					break;
				case 5 :
					// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:40:4: WHILE comp DO stmt_list OD
					{
					match(input,WHILE,FOLLOW_WHILE_in_stmt291); 
					pushFollow(FOLLOW_comp_in_stmt293);
					comp();
					state._fsp--;

					match(input,DO,FOLLOW_DO_in_stmt295); 
					pushFollow(FOLLOW_stmt_list_in_stmt297);
					stmt_list();
					state._fsp--;

					match(input,OD,FOLLOW_OD_in_stmt299); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "stmt"



	// $ANTLR start "stmt_list"
	// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:43:1: stmt_list : ( stmt stmt_list |);
	public final void stmt_list() throws RecognitionException {
		try {
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:44:2: ( stmt stmt_list |)
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( ((LA2_0 >= ID && LA2_0 <= IF)||LA2_0==RD||(LA2_0 >= WE && LA2_0 <= WHILE)) ) {
				alt2=1;
			}
			else if ( (LA2_0==EOF||LA2_0==FI||LA2_0==OD) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:44:5: stmt stmt_list
					{
					pushFollow(FOLLOW_stmt_in_stmt_list311);
					stmt();
					state._fsp--;

					pushFollow(FOLLOW_stmt_list_in_stmt_list313);
					stmt_list();
					state._fsp--;

					}
					break;
				case 2 :
					// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:46:2: 
					{
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "stmt_list"



	// $ANTLR start "comp"
	// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:48:1: comp : expr COMPOP expr ;
	public final void comp() throws RecognitionException {
		try {
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:48:6: ( expr COMPOP expr )
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:48:8: expr COMPOP expr
			{
			pushFollow(FOLLOW_expr_in_comp328);
			expr();
			state._fsp--;

			match(input,COMPOP,FOLLOW_COMPOP_in_comp330); 
			pushFollow(FOLLOW_expr_in_comp332);
			expr();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "comp"



	// $ANTLR start "expr"
	// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:51:1: expr : term term_tail ;
	public final void expr() throws RecognitionException {
		try {
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:51:6: ( term term_tail )
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:51:8: term term_tail
			{
			pushFollow(FOLLOW_term_in_expr342);
			term();
			state._fsp--;

			pushFollow(FOLLOW_term_tail_in_expr344);
			term_tail();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "expr"



	// $ANTLR start "term_tail"
	// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:54:1: term_tail : ( ADD term term_tail |);
	public final void term_tail() throws RecognitionException {
		try {
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:55:2: ( ADD term term_tail |)
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==ADD) ) {
				alt3=1;
			}
			else if ( (LA3_0==EOF||LA3_0==COMPOP||LA3_0==DO||(LA3_0 >= FI && LA3_0 <= IF)||(LA3_0 >= OD && LA3_0 <= RPAR)||(LA3_0 >= THEN && LA3_0 <= WHILE)) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:55:4: ADD term term_tail
					{
					match(input,ADD,FOLLOW_ADD_in_term_tail355); 
					pushFollow(FOLLOW_term_in_term_tail357);
					term();
					state._fsp--;

					pushFollow(FOLLOW_term_tail_in_term_tail359);
					term_tail();
					state._fsp--;

					}
					break;
				case 2 :
					// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:57:2: 
					{
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "term_tail"



	// $ANTLR start "term"
	// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:59:1: term : factor factor_tail ;
	public final void term() throws RecognitionException {
		try {
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:59:6: ( factor factor_tail )
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:59:8: factor factor_tail
			{
			pushFollow(FOLLOW_factor_in_term374);
			factor();
			state._fsp--;

			pushFollow(FOLLOW_factor_tail_in_term376);
			factor_tail();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "term"



	// $ANTLR start "factor_tail"
	// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:62:1: factor_tail : ( MULT factor factor_tail |);
	public final void factor_tail() throws RecognitionException {
		try {
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:63:2: ( MULT factor factor_tail |)
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==MULT) ) {
				alt4=1;
			}
			else if ( (LA4_0==EOF||LA4_0==ADD||LA4_0==COMPOP||LA4_0==DO||(LA4_0 >= FI && LA4_0 <= IF)||(LA4_0 >= OD && LA4_0 <= RPAR)||(LA4_0 >= THEN && LA4_0 <= WHILE)) ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:63:4: MULT factor factor_tail
					{
					match(input,MULT,FOLLOW_MULT_in_factor_tail388); 
					pushFollow(FOLLOW_factor_in_factor_tail390);
					factor();
					state._fsp--;

					pushFollow(FOLLOW_factor_tail_in_factor_tail392);
					factor_tail();
					state._fsp--;

					}
					break;
				case 2 :
					// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:65:2: 
					{
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "factor_tail"



	// $ANTLR start "factor"
	// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:67:1: factor : ( LPAR expr RPAR | ID | NUM );
	public final void factor() throws RecognitionException {
		try {
			// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:67:8: ( LPAR expr RPAR | ID | NUM )
			int alt5=3;
			switch ( input.LA(1) ) {
			case LPAR:
				{
				alt5=1;
				}
				break;
			case ID:
				{
				alt5=2;
				}
				break;
			case NUM:
				{
				alt5=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:67:10: LPAR expr RPAR
					{
					match(input,LPAR,FOLLOW_LPAR_in_factor405); 
					pushFollow(FOLLOW_expr_in_factor407);
					expr();
					state._fsp--;

					match(input,RPAR,FOLLOW_RPAR_in_factor409); 
					}
					break;
				case 2 :
					// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:68:4: ID
					{
					match(input,ID,FOLLOW_ID_in_factor414); 
					}
					break;
				case 3 :
					// /Users/skaneria/Documents/Villanova/Junior/Prog Lang - Grad/qthree.g:69:4: NUM
					{
					match(input,NUM,FOLLOW_NUM_in_factor419); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "factor"

	// Delegated rules



	public static final BitSet FOLLOW_stmt_list_in_program242 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_stmt253 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_COL_in_stmt255 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_EQ_in_stmt257 = new BitSet(new long[]{0x0000000000029000L});
	public static final BitSet FOLLOW_expr_in_stmt259 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RD_in_stmt264 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_ID_in_stmt266 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WE_in_stmt271 = new BitSet(new long[]{0x0000000000029000L});
	public static final BitSet FOLLOW_expr_in_stmt273 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_stmt278 = new BitSet(new long[]{0x0000000000029000L});
	public static final BitSet FOLLOW_comp_in_stmt280 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_THEN_in_stmt282 = new BitSet(new long[]{0x0000000001883800L});
	public static final BitSet FOLLOW_stmt_list_in_stmt284 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_FI_in_stmt286 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_stmt291 = new BitSet(new long[]{0x0000000000029000L});
	public static final BitSet FOLLOW_comp_in_stmt293 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_DO_in_stmt295 = new BitSet(new long[]{0x00000000018C3000L});
	public static final BitSet FOLLOW_stmt_list_in_stmt297 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_OD_in_stmt299 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stmt_in_stmt_list311 = new BitSet(new long[]{0x0000000001883000L});
	public static final BitSet FOLLOW_stmt_list_in_stmt_list313 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_comp328 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_COMPOP_in_comp330 = new BitSet(new long[]{0x0000000000029000L});
	public static final BitSet FOLLOW_expr_in_comp332 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_expr342 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_term_tail_in_expr344 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ADD_in_term_tail355 = new BitSet(new long[]{0x0000000000029000L});
	public static final BitSet FOLLOW_term_in_term_tail357 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_term_tail_in_term_tail359 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_factor_in_term374 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_factor_tail_in_term376 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MULT_in_factor_tail388 = new BitSet(new long[]{0x0000000000029000L});
	public static final BitSet FOLLOW_factor_in_factor_tail390 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_factor_tail_in_factor_tail392 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAR_in_factor405 = new BitSet(new long[]{0x0000000000029000L});
	public static final BitSet FOLLOW_expr_in_factor407 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_RPAR_in_factor409 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_factor414 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUM_in_factor419 = new BitSet(new long[]{0x0000000000000002L});
}
