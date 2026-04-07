package javastring;

public class StringReplacewithA {

	public static void main(String[] args) {
		String str = "This is ate asdfgTAacftba";
		System.out.println("Original String: " + str);
		
		StringBuilder sb = new StringBuilder("");
		
		for(char ch : str.toCharArray()){
			if(ch == 'a'){
				sb.append("A");
			}
			else {
				sb.append(ch);
			}
		}
		String rSt = sb.toString();
		System.out.println("Replace String: " + rSt);

	}

}
