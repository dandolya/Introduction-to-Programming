import java.io.InputStreamReader;
import java.io.Reader;
import java.io.FileInputStream;
import java.io.StringReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

public class MyScanner {
    // :NOTE: encapsulation
	/*private*/ private Reader myReader;

    // :NOTE: public | private
	

    // :NOTE: constructor(InputStream)
    // MyScanner(System.in)
    // MyScanner(IputStream in) {
    //     ...
    // }
	MyScanner() {
        myReader = new InputStreamReader(System.in);
    }
	
	MyScanner(String s) {
        // :NOTE: equals
			myReader = new StringReader(s);
	}
	
	MyScanner(String fileIn, String fileOut) throws FileNotFoundException, UnsupportedEncodingException{
		myReader = new InputStreamReader(
				new FileInputStream(fileIn),
				"utf-8");
	}

	char[] myBuffer = new char[1024];
	int myRead = 0;
	int right = 0;

	private void reading() throws IOException {
		myRead = myReader.read(myBuffer);
	}

	public void close() throws IOException {
		myReader.close();
	}

	public int myNextChar() {
		if (right >= myRead) {
			try {
				reading();
			} catch (IOException e) {
				System.out.println("Input file reading error: " + e.getMessage());
			}

			right = 0;
		}

		if ((myRead != -1) && (myRead >= right)) {
			return myBuffer[right++];
		} else {
			return -1;
		}
	}

	public String myNextInt() {
		StringBuilder myS = new StringBuilder();
		int myChar = myNextChar();

		if (myChar == -1) {
			return null;
		}
		while (myChar != -1) {
			if ((Character.isDigit((char) myChar)) || ((char) myChar == '-')) {
				while ((myChar != -1) && ((Character.isDigit((char) myChar)) || ((char) myChar == '-'))) {
					myS.append((char) myChar);
					myChar = myNextChar();
				}

				return myS.toString();
			} else {
				myChar = myNextChar();
			}
		}
		return null;
	}

    // copy-paste :: meNextInt()  ->  myNextToken(Predicate<Character> isGoodSymbol)
	public String myNextLine() {
		StringBuilder myS = new StringBuilder();
		int myChar;
		myChar = myNextChar();

		if (myChar == -1) {
			return null;
		}
		while (myChar != -1) {
			if (((char) myChar != '\r') && (((char) myChar != '\n'))) {
				while ((myChar != -1) && (myChar != '\r') && ( myChar != '\n')) {
					myS.append((char) myChar);
					myChar = myNextChar();
				}

				if (((char) myChar == '\r') && (right != 1024) && (myBuffer[right] == '\n')) {
					myChar = myNextChar();
				} else if (right == 1024) {
					try {
						reading();
					} catch (IOException e) {
						System.out.println("Input file reading error: " + e.getMessage());
					}
					right = 0;
					myChar = myNextChar();
				}

				return myS.toString();
			} else {
                // copy-paste :: 97-110
				if (((char) myChar == '\r') && (right != 1024) && (myBuffer[right] == '\n')) {
					myChar = myNextChar();
				} else if (right == 1024) {
					try {
						reading();
					} catch (IOException e) {
						System.out.println("Input file reading error: " + e.getMessage());
					}
					right = 0;
					myChar = myNextChar();
				}
				return "";
			}
		}
		return null;
	}
	
	public String myNextWord() {
		StringBuilder myS = new StringBuilder();
		int myChar;
		myChar = myNextChar();

		if (myChar == -1) {
			return null;
		}
		while (myChar != -1) { 
			myChar = Character.toLowerCase((char) myChar);
			if ((Character.isLetter(myChar)) || (myChar == '\'') || (Character.DASH_PUNCTUATION == Character.getType(myChar))) {
				while (((Character.isLetter(myChar)) || (myChar == '\'') || (Character.DASH_PUNCTUATION == Character.getType(myChar))) && (myChar != -1)) {
					myS.append((char) myChar);
					myChar = myNextChar();
				}
							
				String word = myS.toString().toLowerCase();
				return word;
			}
			myChar = myNextChar();
		}
		return null;
	}
}


