package javastring;

public class SwapStringWithoutTempVariable {

	/*
	 * Write a program to Swap two String variable without using third/temp variable
	 *Example: str1= String, str2 = swaping
	 *Answer: str1 = Swapping, str2 = String
	 */
	public static void main(String[] args) {
		
		String str1 = "Strings";
		String str2 = "swaping";
		
		System.out.println("Before swap str1:= "+str1+", str2:= "+str2);
		
		str1 = str1+str2;
		
		System.out.println("str1:= "+str1);
		
		str2 = str1.substring(0, str1.length()-str2.length());
		
		System.out.println("str2:="+str2);
		
		str1 = str1.substring(str2.length());
		
		System.out.println("After swap str1:= "+str1+" , str2:= "+str2);
		
		

	}

}
