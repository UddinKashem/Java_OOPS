package datastructure;

import java.lang.reflect.Method;

/*
 * Generic methods are a very efficient way to handle multiple datatypes using a single method. This problem will test your knowledge on Java Generic methods.
 * 
 */
class Printer{
	public static <E> void printArray(E[] inputArray){
		for(E element : inputArray){
			System.out.println(element);
		}
	}
}

public class Generics {

	public static void main(String[] args) {
		
		Printer myPrinter = new Printer();
		Integer[] intArray = {1,2,3,4,5,6,7,8};
		String[] StrArray ={"Hello","Java","World"};
		myPrinter.printArray(intArray);
		myPrinter.printArray(StrArray);
		
		int count = 0;
		
		for(Method method : Printer.class.getDeclaredMethods()){
			String name = method.getName();
			
			if(name.equals("printArray")){
				count++;
			}
			if(count>1){
				System.out.println("Method overloading is not allowed!");
			}
		}
		 
	}

}
