package javastring;

import java.util.Scanner;

/*
Given a string AA, print "Yes" if it is a palindrome, print "No" otherwise. The strings will consist lower case english letters only. The strings will have at most 50 characters.

Some examples of palindromes are "madam", "anna", "reviver".
*/
public class StringReversePalindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		StringReversePalindrome s = new StringReversePalindrome();
		
		if(s.reverse(A)){
			System.out.println("Yes");
			
		}
		else{
		System.out.println("No");
		}
	}	
		public boolean reverse(String n){
			boolean a = false;
			
			String x = "";
			
			for(int i = n.length()-1; i>=0; i--){
				
				x = x.concat(""+n.charAt(i));
			}
			
			if(n.equals(x)){
				a= true;
			}
			
			return a;
		}
	}


