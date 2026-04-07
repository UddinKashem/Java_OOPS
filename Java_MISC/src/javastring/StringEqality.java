package javastring;

public class StringEqality {

	public static void main(String[] args) {
		
		String str1 = new String("ABCD"); //str1 is a ref var. it is having the address of an object
		String str2 = new String ("ABCD"); // str2 is a ref var. it is having the address of some other object
		
		if(str1 == str2){ //Comparing references 
			System.out.println("String 1 = Strinng 2 is true");
		}
		else
			System.out.println("String 1 == string 2 is false");
		
		
		String str3 = str2;
		
		if(str2==str3){//comparing the value within the objects
			System.out.println("String 2 == String 3 is true");
		}
		else
			System.out.println("String 2 == String 3 is false");
		
		if(str1.equals(str2)){//comparing the value within the objects
			System.out.println("String 1 equals String 2 is true");
		}
		else
			System.out.println("String 1 equals String 2 is false");

	}

}
