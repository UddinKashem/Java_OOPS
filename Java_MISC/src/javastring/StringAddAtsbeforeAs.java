package javastring;

public class StringAddAtsbeforeAs {

	public static String addAtsBeforeAs(String str){
		StringBuilder sb = new StringBuilder("");
		
		for(char ch: str.toCharArray()){
			
			if(ch=='A' || ch=='a'){
				sb.append("@");
				
			}sb.append(ch);
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		String str = "At a time Karim play football";
		System.out.println("Original String: "+str);
		
		String strA = addAtsBeforeAs(str);
		System.out.println("String with '@' : "+strA);

	}

}
