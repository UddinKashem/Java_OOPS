package collection.set;

import java.util.TreeSet;

/*
 * A TreeSet is a collection that stores unique elements in sorted order.
 * It is part of the java.util package and implements the Set interface.
 * 
 */

public class TestTreeSet {

	public static void main(String[] args) {
		
		TreeSet<String> cars = new TreeSet<>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("BMW");
		cars.add("Mazda");
		
		System.out.println(cars);
		
		System.out.println(cars.contains("BMW"));
		
		TreeSet<Integer> nums = new TreeSet<>();
		nums.add(20);
		nums.add(10);
		nums.add(40);
		nums.add(20);
		nums.add(30);
		System.out.println(nums);
		
		for(int n : nums){
			System.out.println(nums.contains(n));
		}
	}

}
