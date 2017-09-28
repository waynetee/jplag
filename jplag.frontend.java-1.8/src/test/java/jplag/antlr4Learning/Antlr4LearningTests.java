package jplag.antlr4Learning;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import jplag.java18.JplagJava8Listener;
import jplag.java18.grammar.Java8Lexer;
import jplag.java18.grammar.Java8Parser;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class Antlr4LearningTests {
	private static File srcTestResources;

	@BeforeClass
	public static void getPaths() {
		srcTestResources = new File(System.getProperty("user.dir"), "src/test/resources");
	}

	@Test
	public void testVisitor() throws IOException {
		BufferedInputStream fis = new BufferedInputStream(new FileInputStream(new File(srcTestResources, "ExceptionOne.java")));
		ANTLRInputStream input = new ANTLRInputStream(fis);

		// create a lexer that feeds off of input CharStream
		Java8Lexer lexer = new Java8Lexer(input);

		// create a buffer of tokens pulled from the lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer);

		jplag.java18.grammar.Java8Parser j8p = new Java8Parser(tokens);
		j8p.addParseListener(new JplagJava8Listener(new jplag.java18.Parser()));

		j8p.compilationUnit();
	}

	@Ignore
	public void howToUseAntlr4() throws IOException {
		FileInputStream fis = new FileInputStream(new File(srcTestResources, "Java8FeatureTest.java"));
		// create a CharStream that reads from file input stream
		ANTLRInputStream input = new ANTLRInputStream(fis);

		// create a lexer that feeds off of input CharStream
		Java8Lexer lexer = new Java8Lexer(input);

		// create a buffer of tokens pulled from the lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer);

		// create a parser that feeds off the tokens buffer
		Java8Parser parser = new Java8Parser(tokens);

		ParseTree tree = parser.compilationUnit(); // begin parsing at compilationUnit rule
		System.out.println(tree.toStringTree(parser)); // print LISP-style tree

	}

	@Ignore
	public void howToUseAntlr4Tokens() throws IOException {
		FileInputStream fis = new FileInputStream(new File(srcTestResources, "Java8FeatureTest.java"));
		// create a CharStream that reads from file input stream
		ANTLRInputStream input = new ANTLRInputStream(fis);

		// create a lexer that feeds off of input CharStream
		Java8Lexer lexer = new Java8Lexer(input);

		for (Token t : lexer.getAllTokens()) {
			System.out.println(lexer.getTokenNames()[t.getType()]);
		}
	}

}
