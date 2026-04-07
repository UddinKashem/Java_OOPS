package javastring;

public class CharCountInStringWithoutLoop {
	
	/*
	 * Write a program to count the total number of occurrences a given character in a string without using any loop
	 *Example: He is a good boy, a good student, a good friend
	 *Answer: a: 3  
	 */

	public static void main(String[] args) {
		
		String str =  "He is a good boy;, a good student and a good friend";
		
		System.out.println("Input String: "+str);
		countCharF(str, "o");
		
		System.out.println("Length of string: "+str.length());
	/*	
		int countA = str.length()-str.replaceAll("a", "").length();
		
		System.out.println("Number of 'a's in the string: "+countA);
		
		countChar(str, "g");
		countChar(str, "o");
		countChar("At the End of String count", "n");
		System.out.println("=======Character count on the string=======");
		
		System.out.println("String value: "+str+", Length of string:= "+str.length() );
		
		for(char ch: str.replaceAll(" ", "").toCharArray()){
			
			countChar(str, String.valueOf(ch));
		}
*/
	}
	
	public static void countChar(String str, String ch){
		
		//System.out.println("String value: "+str+", Length of string:= "+str.length() );
		
		int count = str.length()-str.replaceAll(ch, "").length();
		
		System.out.println("Number of '"+ch+"':= "+count);
	}
	
	public static void countCharF(String str, String ch){
		int count =str.length() - str.replaceAll(ch, "").length();
		
		System.out.println("Number of '"+ch+"' occurance:= "+count);
	}

}
