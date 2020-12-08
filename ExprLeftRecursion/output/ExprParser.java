// $ANTLR 3.1.2 C:\\VGehlot\\Csc8310\\ANTLR\\ExprParser\\Expr.g 2009-09-10 14:07:41

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class ExprParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "LETTER", "DIGIT", "ID", "NUM", "ADD", "SUB", "MUL", "DIV", "LPAR", "RPAR", "WS"
    };
    public static final int WS=14;
    public static final int LPAR=12;
    public static final int LETTER=4;
    public static final int RPAR=13;
    public static final int SUB=9;
    public static final int DIGIT=5;
    public static final int DIV=11;
    public static final int ID=6;
    public static final int EOF=-1;
    public static final int MUL=10;
    public static final int NUM=7;
    public static final int ADD=8;

    // delegates
    // delegators


        public ExprParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public ExprParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return ExprParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\VGehlot\\Csc8310\\ANTLR\\ExprParser\\Expr.g"; }



    // $ANTLR start "input"
    // C:\\VGehlot\\Csc8310\\ANTLR\\ExprParser\\Expr.g:20:1: input : expr EOF ;
    public final void input() throws RecognitionException {
        try {
            // C:\\VGehlot\\Csc8310\\ANTLR\\ExprParser\\Expr.g:20:7: ( expr EOF )
            // C:\\VGehlot\\Csc8310\\ANTLR\\ExprParser\\Expr.g:20:9: expr EOF
            {
            pushFollow(FOLLOW_expr_in_input136);
            expr();

            state._fsp--;

            match(input,EOF,FOLLOW_EOF_in_input138); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "input"


    // $ANTLR start "expr"
    // C:\\VGehlot\\Csc8310\\ANTLR\\ExprParser\\Expr.g:22:1: expr : ( term ) ( ADD term | SUB term )* ;
    public final void expr() throws RecognitionException {
        try {
            // C:\\VGehlot\\Csc8310\\ANTLR\\ExprParser\\Expr.g:22:6: ( ( term ) ( ADD term | SUB term )* )
            // C:\\VGehlot\\Csc8310\\ANTLR\\ExprParser\\Expr.g:22:13: ( term ) ( ADD term | SUB term )*
            {
            // C:\\VGehlot\\Csc8310\\ANTLR\\ExprParser\\Expr.g:22:13: ( term )
            // C:\\VGehlot\\Csc8310\\ANTLR\\ExprParser\\Expr.g:22:14: term
            {
            pushFollow(FOLLOW_term_in_expr154);
            term();

            state._fsp--;


            }

            // C:\\VGehlot\\Csc8310\\ANTLR\\ExprParser\\Expr.g:22:20: ( ADD term | SUB term )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ADD) ) {
                    alt1=1;
                }
                else if ( (LA1_0==SUB) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\VGehlot\\Csc8310\\ANTLR\\ExprParser\\Expr.g:22:21: ADD term
            	    {
            	    match(input,ADD,FOLLOW_ADD_in_expr158); 
            	    pushFollow(FOLLOW_term_in_expr160);
            	    term();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // C:\\VGehlot\\Csc8310\\ANTLR\\ExprParser\\Expr.g:22:32: SUB term
            	    {
            	    match(input,SUB,FOLLOW_SUB_in_expr164); 
            	    pushFollow(FOLLOW_term_in_expr166);
            	    term();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "expr"


    // $ANTLR start "term"
    // C:\\VGehlot\\Csc8310\\ANTLR\\ExprParser\\Expr.g:24:1: term : ( factor ) ( MUL factor | DIV factor )* ;
    public final void term() throws RecognitionException {
        try {
            // C:\\VGehlot\\Csc8310\\ANTLR\\ExprParser\\Expr.g:24:6: ( ( factor ) ( MUL factor | DIV factor )* )
            // C:\\VGehlot\\Csc8310\\ANTLR\\ExprParser\\Expr.g:24:13: ( factor ) ( MUL factor | DIV factor )*
            {
            // C:\\VGehlot\\Csc8310\\ANTLR\\ExprParser\\Expr.g:24:13: ( factor )
            // C:\\VGehlot\\Csc8310\\ANTLR\\ExprParser\\Expr.g:24:14: factor
            {
            pushFollow(FOLLOW_factor_in_term184);
            factor();

            state._fsp--;


            }

            // C:\\VGehlot\\Csc8310\\ANTLR\\ExprParser\\Expr.g:24:22: ( MUL factor | DIV factor )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==MUL) ) {
                    alt2=1;
                }
                else if ( (LA2_0==DIV) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\VGehlot\\Csc8310\\ANTLR\\ExprParser\\Expr.g:24:23: MUL factor
            	    {
            	    match(input,MUL,FOLLOW_MUL_in_term188); 
            	    pushFollow(FOLLOW_factor_in_term190);
            	    factor();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // C:\\VGehlot\\Csc8310\\ANTLR\\ExprParser\\Expr.g:24:36: DIV factor
            	    {
            	    match(input,DIV,FOLLOW_DIV_in_term194); 
            	    pushFollow(FOLLOW_factor_in_term196);
            	    factor();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "term"


    // $ANTLR start "factor"
    // C:\\VGehlot\\Csc8310\\ANTLR\\ExprParser\\Expr.g:26:1: factor : ( LPAR expr RPAR | ID | NUM );
    public final void factor() throws RecognitionException {
        try {
            // C:\\VGehlot\\Csc8310\\ANTLR\\ExprParser\\Expr.g:26:8: ( LPAR expr RPAR | ID | NUM )
            int alt3=3;
            switch ( input.LA(1) ) {
            case LPAR:
                {
                alt3=1;
                }
                break;
            case ID:
                {
                alt3=2;
                }
                break;
            case NUM:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // C:\\VGehlot\\Csc8310\\ANTLR\\ExprParser\\Expr.g:26:14: LPAR expr RPAR
                    {
                    match(input,LPAR,FOLLOW_LPAR_in_factor218); 
                    pushFollow(FOLLOW_expr_in_factor220);
                    expr();

                    state._fsp--;

                    match(input,RPAR,FOLLOW_RPAR_in_factor222); 

                    }
                    break;
                case 2 :
                    // C:\\VGehlot\\Csc8310\\ANTLR\\ExprParser\\Expr.g:27:12: ID
                    {
                    match(input,ID,FOLLOW_ID_in_factor235); 

                    }
                    break;
                case 3 :
                    // C:\\VGehlot\\Csc8310\\ANTLR\\ExprParser\\Expr.g:28:12: NUM
                    {
                    match(input,NUM,FOLLOW_NUM_in_factor248); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "factor"

    // Delegated rules


 

    public static final BitSet FOLLOW_expr_in_input136 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_input138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_expr154 = new BitSet(new long[]{0x0000000000000302L});
    public static final BitSet FOLLOW_ADD_in_expr158 = new BitSet(new long[]{0x00000000000010C0L});
    public static final BitSet FOLLOW_term_in_expr160 = new BitSet(new long[]{0x0000000000000302L});
    public static final BitSet FOLLOW_SUB_in_expr164 = new BitSet(new long[]{0x00000000000010C0L});
    public static final BitSet FOLLOW_term_in_expr166 = new BitSet(new long[]{0x0000000000000302L});
    public static final BitSet FOLLOW_factor_in_term184 = new BitSet(new long[]{0x0000000000000C02L});
    public static final BitSet FOLLOW_MUL_in_term188 = new BitSet(new long[]{0x00000000000010C0L});
    public static final BitSet FOLLOW_factor_in_term190 = new BitSet(new long[]{0x0000000000000C02L});
    public static final BitSet FOLLOW_DIV_in_term194 = new BitSet(new long[]{0x00000000000010C0L});
    public static final BitSet FOLLOW_factor_in_term196 = new BitSet(new long[]{0x0000000000000C02L});
    public static final BitSet FOLLOW_LPAR_in_factor218 = new BitSet(new long[]{0x00000000000010C0L});
    public static final BitSet FOLLOW_expr_in_factor220 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RPAR_in_factor222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_factor235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUM_in_factor248 = new BitSet(new long[]{0x0000000000000002L});

}