package algorithm;

import java.util.Arrays;

public class ZigzagConversion {

	public static void main(String[] args) {
		String s = "PAYPALISHIRING";
		int numRows = 3;
		
		convert(s, numRows);

	}
	
	public static String convert(String s, int numRows){
		
		if(numRows == 1){
			return s;
		}
		
		StringBuilder[] g = new StringBuilder[numRows];
		Arrays.setAll(g, k -> new StringBuilder());
		
		int i = 0, k = -1;
		for(char c : s.toCharArray()) {
			g[i].append(c);
			if(i == 0 || i == numRows - 1) {
				k = -k;
			}
			i += k;
		}
		return String.join("", g);
		
	}

}
