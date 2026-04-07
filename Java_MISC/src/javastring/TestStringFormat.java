package javastring;

public class TestStringFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "This is a string \"Test\" of class";
		//System.out.println(10==10);
//		for(int i=0;i<5;i++){
//			System.out.println(i);
//		}
		String aStr[] = str.split(" ");
		System.out.println("Length of string array is: "+ aStr.length);
		for(String i : aStr){
			System.out.println(i);
		}
		System.out.println("=================");
		for(int j=0; j<aStr.length; j++){
			System.out.println(aStr[j]);
		}
		
		// Objects Arrays
		Object obj[] = new Object[5];
		obj[0]=123;
		obj[1]='C';
		obj[2]=23.45;
		obj[3]="Str";
		obj[4]=true;
		
		for(Object ob:obj){
			System.out.println("Value of object: "+ob);
		}

	}

}
