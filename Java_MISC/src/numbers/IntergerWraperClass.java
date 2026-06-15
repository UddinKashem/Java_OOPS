package numbers;

public class IntergerWraperClass {

	public static void main(String[] args) {
		
		int i = 10; //single value container
		System.out.println("Value of i: "+i);
		
		Integer iRef = new Integer(i); //Boxing (Constructing the Object)
		System.out.println("value of iRef: "+iRef);
		
		int j = iRef.intValue(); //UnBoxing (Extracting the value from object)
		System.out.println("The value of j: "+j);
		
		Integer kRef = i;//AutoBoxing (Integer kRef = new Integer(i));
		System.out.println("Value of kRef: "+kRef);
		
		int l = kRef; //AutoUnboxing
		
		System.out.println("Value of 'l': "+l);
		
		//OOPS - Objects | 
		
	}

}
