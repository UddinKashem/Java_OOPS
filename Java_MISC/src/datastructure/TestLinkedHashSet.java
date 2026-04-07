package datastructure;

import java.util.LinkedHashSet;

public class TestLinkedHashSet {

	public static void main(String[] args) {
		/*
		 * A LinkedHashSet is a collection that stores unique elements
		 * and remembers the order they were added.
		 */
		
		LinkedHashSet<String> cars = new LinkedHashSet<>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("BMW");//duplicate
		cars.add("Mazda");
		
		System.out.println(cars);

	}

}
