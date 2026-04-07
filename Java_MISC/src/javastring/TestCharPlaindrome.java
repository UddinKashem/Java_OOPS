package javastring;

public class TestCharPlaindrome {

	public static void main(String[] args) {
		String str = "MADAM";
		System.out.println("=================");
		System.out.println("["+str+"] is Plaindrome ?: "+isPlaindrome(str));

	}
	
	public static boolean isPlaindrome(String str){
		
		int start = 0;
		int end = str.length() - 1;
		
		while(start < end){
			
			if(str.charAt(start ++) != str.charAt(end --))
				return false;
		}
		/*
		char[] ch = str.toCharArray();
		
		int start = 0;
		int end = ch.length -1;
		
		while(start < end){
			
			if(ch[start ++] != ch[end --]){
				return false;
			}
		}
		*/
		return true;
	}

}
