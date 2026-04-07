package collection.set;

import java.util.LinkedHashSet;

/*
 * A LinkedHashSet is a collection that stores unique elements and remembers the order they were added.
 * It is part of the java.util package and implements the Set Interface.
 * 
 */
public class TestLinkedHashSet {

	public static void main(String[] args) {
		LinkedHashSet<String> cars = new LinkedHashSet<>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("BMW");
		cars.add("Mazda");
		System.out.println(cars);
		System.out.println(cars.size());
		
		for(String st : cars){
			System.out.println(st.toUpperCase()+" : "+cars.contains(st));
			
		}
		

	}

}
