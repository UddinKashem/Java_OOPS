package numbers;

public class PlaindomeTest {

	/*
	 * Write a program to determine, whether an integer is a plaindrome. 
	 * An integer is a plaindrome, when it reads same backward as forward.
	 */
	
	public static boolean isPlaindrome(int i){
	
		String str = String.valueOf(i);
		int start = 0;
		int end = str.length() -1;
		
		while(start<end){
			if(str.charAt(start ++) != str.charAt(end --))
				return false;
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		
		int i = 2121212;
		
		System.out.println(i + " Is a plaindrome?: " + isPlaindrome(i));

	}

}
