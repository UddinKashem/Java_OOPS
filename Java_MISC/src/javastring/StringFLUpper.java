package javastring;

public class StringFLUpper {

	public static void main(String[] args) {
		/*Write a program to convert string to the sequence like first letter and the last letter to be
	    upper case, rest of the character to be lower case.
	     */
	    
	    String str= "this is a test to convert";
	    System.out.println("Original String: " + str);
	    str = str.toLowerCase();
	    
	    StringBuilder sb = new StringBuilder("");
	    
	    for(int i=0; i < str.length(); i++){
	        if(i==0 || i==str.length()-1){
	           // String.valueOf(
	          sb.append(Character.toUpperCase(str.charAt(i)));
	            
	        }
	        else{
	            sb.append(str.charAt(i));
	        }
	    }
	    
	   System.out.println("Convert String: "+ sb.toString());
	}

}
