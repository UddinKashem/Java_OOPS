package numbers;

public class FindPalindromeNumber {

	public static void main(String[] args) {
		/* 
		 * Write a Program to determine whether an integer is a palindrome.
		 * An integer is a palindrome when it reads the same backward as forward.
		*/
		
		int i = 4321234;
		System.out.println(i+ " is a palindrome: " + isPalindrome(i));
		
	}

	public static boolean isPalindrome(int i){
		
		String str = String.valueOf(i);
		
		int start = 0;
		int end = str.length() -1;
		
		while(start<end){
			if(str.charAt(start++) != str.charAt(end--))
				return false;
		}
		return true;
	}
}
