public class SumFloat {
	public static void main(String[] args) {
		float mySum = 0;
		int lastnum = 0;
		for (int i = 0; i < args.length; i++) {
			for (int j = 0; j < args[i].length(); j++) {
				int k = 0;
				if (!Character.isWhitespace(args[i].charAt(j))) {
					for (int d = j; d < args[i].length(); d++) {
						if (!Character.isWhitespace(args[i].charAt(d))) {
							lastnum = d;
							k++;
						} else {
							break;
						}	
					}
					mySum += Float.parseFloat(args[i].substring(j, lastnum+1));
					j += k;
				}
			}
		}
		System.out.println(mySum);
	}
}