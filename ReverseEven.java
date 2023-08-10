import java.util.Scanner;
import java.util.Arrays;

public class ReverseEven {
	public static void main(String[] args) {
		MyScanner in = new MyScanner("System.in");
		int i = 0;
		int j = 0;
		String s = in.myNextLine();
		int[][] myReverse = new int[1][1];

		while (s != null) {
			if (i >= myReverse.length) {
				myReverse = Arrays.copyOf(myReverse, myReverse.length * 2);
			}
			MyScanner instr = new MyScanner(s);
			myReverse[i] = new int[1];
			String s2 = instr.myNextInt();
			while (s2 != null) {
				if (j >= myReverse[i].length) {
					myReverse[i] = Arrays.copyOf(myReverse[i], myReverse[i].length * 2);
				}
				myReverse[i][j] = Integer.parseInt(s2);
				s2 = instr.myNextInt();
				if ((myReverse[i][j] % 2) != 0) {
					j--;
				}
				j++;
			}
		
			myReverse[i] = Arrays.copyOf(myReverse[i], j);
			j = 0;
			i++;
			s = in.myNextLine();
		}

		myReverse = Arrays.copyOf(myReverse, i);

		for (i = myReverse.length - 1; i > -1; i--) {
			for (j = myReverse[i].length - 1; j > -1; j--) {
				System.out.print(myReverse[i][j] + " ");
			}
		System.out.println("");
		}
	}
}