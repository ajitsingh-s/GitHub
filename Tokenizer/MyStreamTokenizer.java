package Tokenizer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StreamTokenizer;

public class MyStreamTokenizer {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("Client.txt");
		StreamTokenizer st = new StreamTokenizer(fis);
		st.eolIsSignificant(true);
		st.wordChars(33,255);
		st.whitespaceChars(0,32);
		int token =0;
		while(true) {
			token = st.nextToken();
			if (token == StreamTokenizer.TT_EOF)
			break;
			
			if (token == StreamTokenizer.TT_NUMBER)
			System.out.println(st.nval);
			
			if (token == StreamTokenizer.TT_WORD)
			System.out.println(st.sval);
		}
	}

}
