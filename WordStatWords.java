import java.io.InputStreamReader;
import java.io.Reader;
import java.io.FileInputStream;
import java.io.Writer;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.FileOutputStream;
import java.util.TreeMap;
import java.util.Map;
import java.util.Arrays;
import java.io.FileNotFoundException;
import java.io.IOException;

public class WordStatWords {
	public static void main(String[] args) {
		TreeMap<String, Integer> myHashMap = new TreeMap<>();
		
		try {
			MyScanner scanner = new MyScanner(args[0], args[1]);
			try {
				StringBuilder myS = new StringBuilder();
				String s = scanner.myNextLine();
//				int myChar = scanner.myNextChar(); 
				
				while (s != null) {
					MyScanner scannerS = new MyScanner(s);
					int myChar = scannerS.myNextChar();
					while (myChar != -1) {
						myChar = Character.toLowerCase((char) myChar);
						if ((Character.isLetter(myChar)) || (myChar == '\'') || (Character.DASH_PUNCTUATION == Character.getType(myChar))) {
							while (((Character.isLetter(myChar)) || (myChar == '\'') || (Character.DASH_PUNCTUATION == Character.getType(myChar))) && (myChar != -1)) {
								myS.append((char) myChar);
								myChar = scannerS.myNextChar();
							}
						
							String word = myS.toString().toLowerCase();
						
							if (!(myHashMap.containsKey(word))) {
								myHashMap.put((word), 1);
							} else {
								myHashMap.put((word), myHashMap.get(word) + 1);
							}
							myS = new StringBuilder();
						} 
						myChar = scannerS.myNextChar();
					}
					s = scanner.myNextLine();
				}				
		    } finally {
			scanner.close();
			}
		} catch (FileNotFoundException e) {
			System.out.println("Input file not found: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Input file reading error: " + e.getMessage());
        }
		
		try {
			BufferedWriter myWriter = new BufferedWriter(new OutputStreamWriter(
				new FileOutputStream(args[1]),
				"utf-8"));
			try {
				for (Map.Entry entry : myHashMap.entrySet()) {
					myWriter.write(entry.getKey()+" "+ entry.getValue());
					myWriter.newLine();
				}
		    } finally {
			myWriter.close();
			}
		} catch (FileNotFoundException e) {
			System.out.println("Input file not found: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Input file reading error: " + e.getMessage());
        }		
	}
}