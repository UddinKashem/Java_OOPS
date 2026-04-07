package collection.set;

import java.util.HashSet;
/*
 * A HashSet is a collection of elements where every element is unique.
 * It is part of the java.util package and implements the Set interface.
 */

public class TestHashSet {

	public static void main(String[] args) {
	
		HashSet<String> cars = new HashSet<>();
		cars.add("BMW");
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("BMW");
		cars.add("Mazda");
		System.out.println(cars);
		
		for(String st : cars){
			System.out.println(st);
		}
		
		HashSet<Integer> nums = new HashSet<Integer>();
		nums.add(89);
		nums.add(23);
		nums.add(45);
		nums.add(67);
		
		System.out.println(nums);
	}

}
