package javastring;

public class StringAddKsBeforefs {
	/*
	 * Write a program to add K before all f's
	 */
	public static String addKsBeforeFs(String str){
		
		StringBuilder builder = new StringBuilder("");
		
		for(char ch : str.toCharArray()){
			if(ch=='F' || ch=='f'){
				builder.append('K');
			}
			builder.append(ch);
		}
		
		return builder.toString();
	}

	public static void main(String[] args) {
		
		String str = "First fly the fluffy";
		System.out.println("Original string: "+str);
		
		String strK=addKsBeforeFs(str);
		System.out.println("String with K's: "+ strK);
		//addKsBeforeFs(str));
		

	}

}
