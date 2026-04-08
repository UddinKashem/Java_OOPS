package numbers;

public class TestPalinDrome {

	public static void main(String[] args) {

		int i = 213445678;// Max value 2 power (31)-1= 2,147,483,647

		System.out.println("['"+i+"'] is Palindrome?: "+isPalindrome(i));

	}

	public static boolean isPalindrome(int x) {
		String str = Integer.toString(x);
				//String.valueOf(x);
		int start = 0;
		int end = str.length() - 1;
		while (start < end) {
			if (str.charAt(start++) != str.charAt(end--))
				return false;
		}
		return true;
	}

}
