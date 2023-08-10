import java.util.ArrayList;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.FileInputStream;
import java.io.Writer;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.FileOutputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Arrays;
import java.io.FileNotFoundException;
import java.io.IOException;

public class WsppPosition {
	public static void main(String[] args) {
		LinkedHashMap<String, Integer> myHashMap = new LinkedHashMap<>();
		LinkedHashMap<String, ArrayList<Integer>> myHashMap2 = new LinkedHashMap<>();
		
		try {
			MyScanner scanner = new MyScanner(args[0], args[1]);
			try {
				int line = 1;
				int num = 1;
//				char[] myBuffer = new char[100];
//				StringBuilder myS = new StringBuilder();
				String s = scanner.myNextLine();
//				int myChar = scanner.myNextChar(); 
				
				while (s != null) {
					MyScanner scannerS = new MyScanner(s);
					String myWord = scannerS.myNextWord();
					while (myWord != null) {
						myHashMap.put(myWord, myHashMap.getOrDefault(myWord, 0) + 1);
						ArrayList<Integer> myAL = myHashMap2.getOrDefault(myWord, new ArrayList<>());
						myAL.add(line);
						myAL.add(num);
						num++;
						myHashMap2.put(myWord, myAL);						
						/*if (!(myHashMap.containsKey(myWord))) {
							myHashMap.put((myWord), 1);
							ArrayList<Integer> myAL = new ArrayList<>();
							myAL.add(line);
							myAL.add(num);
							num++;
							myHashMap2.put(myWord, myAL);
						} else {
							myHashMap.put((myWord), myHashMap.get(myWord) + 1);
							ArrayList<Integer> myAL = myHashMap2.get(myWord);
							myAL.add(line);
							myAL.add(num);
							num++;
							myHashMap2.put(myWord, myAL);
						}*/
						myWord = scannerS.myNextWord();
					}
					line++;
					num = 1;
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
					myWriter.write(entry.getKey()+" "+ entry.getValue() + " ");
/*					ArrayList<String> arr = myHashMap2(entry.getKey());
					for (String s : myHashMap2.get(entry.getKey())) {
						myWriter.write(s + " ");
					}*/
					int i = 0;
					for (i = 0; i < myHashMap2.get(entry.getKey()).size() - 2; i += 2) {
						myWriter.write(Integer.toString(myHashMap2.get(entry.getKey()).get(i)) + ":" + Integer.toString(myHashMap2.get(entry.getKey()).get(i + 1)) + " ");
					}
					myWriter.write (Integer.toString(myHashMap2.get(entry.getKey()).get(i)) + ":" + Integer.toString(myHashMap2.get(entry.getKey()).get(i + 1)));
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