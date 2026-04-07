package javastring;

public class StringCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "one-two+two-one-two+two";
		System.out.println("Before replace"+str);
		str= str.replace("one", "1");
		System.out.println("After replace One: "+str);
		str = str.replace("two", "2");
		System.out.println("After replace One and two: "+str);
		
//		int i = Integer.parseInt(str);
//		System.out.println(i);
		int result;
		for(int i=0;i<str.length();i++)
		{
		  if(str.charAt(i)=='-')
		  {
		    result=Integer.parseInt(str.substring(0, i))-Integer.parseInt(str.substring(i+1, i+2));
		    System.out.print(result);
		  }         
		}

	}

}
