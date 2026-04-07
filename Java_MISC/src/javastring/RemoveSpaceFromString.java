package javastring;

public class RemoveSpaceFromString {
	/*Q. Write a java program to remove all white spaces from a string?
	 * Example: this is a test
	 * Answer: thisisatest
	 * 
	 */

	public static void main(String[] args) {
		String str = "This is a test to revome while spaces.";
		System.out.println("String with spaces: "+str);
		
		String ws = str.replaceAll(" ", "");
		System.out.println("String without spaces: "+ws);
		
		System.out.println(replaceStr(str));
		
		String swr = str.replaceAll(" ", "*&*");
		System.out.println("Replace Str: "+ swr);
		

	}
	//Write a method to replace a string with given one
	public static String replaceStr(String str){
		StringBuilder sb = new StringBuilder("");
		
		for(char ch : str.toCharArray()){
			if(ch==' '){
				sb.append("*");
				continue;
			}
			sb.append(ch);
		}
		
		return sb.toString();
		
	}

}
