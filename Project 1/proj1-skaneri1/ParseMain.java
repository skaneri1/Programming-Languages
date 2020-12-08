import java.io.*;
import org.antlr.runtime.*;

public class ParseMain {
    public static void main(String args[]) throws Exception {
	//ProgLangLexer lexer = new ProgLangLexer(new ANTLRFileStream(args[0]));
	ProgLangLexer lexer = new ProgLangLexer(new ANTLRInputStream(System.in));
	CommonTokenStream tokens = new CommonTokenStream(lexer);
	ProgLangParser parser = new ProgLangParser(tokens);
	parser.input();
	}
}

