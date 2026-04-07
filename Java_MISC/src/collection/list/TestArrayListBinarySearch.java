package collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
/*
 * An algorithm is a procedure to solve a problem.
Java provides built-in algorithms in the Collections class.
Common algorithms include searching, sorting, iterating, and finding min/max.
Algorithms work together with data structures (like ArrayList, HashSet, etc.)
 to make your programs more powerful and efficient.
 */

public class TestArrayListBinarySearch {

	public static void main(String[] args) {
		ArrayList<String> sList = new ArrayList<>();
		sList.add("Mango");
		sList.add("Orange");
		sList.add("GreenApple");
		sList.add("Cherry");
		sList.add("Banana");
		System.out.println("Fruits list: "+sList);
		
		System.out.println("Maximum : "+Collections.max(sList));
		System.out.println("Minimum : "+Collections.min(sList));
		
		Collections.sort(sList);
		System.out.println("Sorted Fruits list: "+sList);
		
		int index = Collections.binarySearch(sList, "Cherry");
		System.out.println("Cherry is index of: "+index);
		
		for(String st : sList){
			System.out.println(st);
		}
		System.out.println("============================");
		Iterator<String> it = sList.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		//Integer arraylist:
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(19);
		nums.add(12);
		nums.add(32);
		nums.add(15);
		nums.add(21);
		nums.add(43);
		nums.add(11);
		nums.add(49);
		System.out.println("List of numbers: "+nums);
		
		System.out.println("Maximum : "+Collections.max(nums));
		System.out.println("Minimum : "+Collections.min(nums));
		
		int i0 = Collections.binarySearch(nums, 21);
		System.out.println("Index of [21] is in: "+i0);
		
		Collections.reverse(nums);
		System.out.println("List of numbers in reverse order: "+nums);
		
		Collections.sort(nums);
		System.out.println("List of Sorted numbers: "+nums);
		
		int i = Collections.binarySearch(nums, 15);
		System.out.println("Index of [15] is in: "+i);
		
		Collections.sort(nums, Collections.reverseOrder());
		System.out.println("List of Sorted numbers in reverse order: "+nums);
		
		int i2 = Collections.binarySearch(nums, 43);
		System.out.println("Index of [43] is in: "+i2);
		
	    ArrayList<String> cards = new ArrayList<>();
	    cards.add("Ace");
	    cards.add("King");
	    cards.add("Queen");
	    cards.add("Jack");

	    Collections.shuffle(cards);
	    System.out.println(cards);
	    
	    ArrayList<String> fruits = new ArrayList<>();
	    fruits.add("Apple");
	    fruits.add("Banana");
	    fruits.add("Orange");
	    fruits.add("Banana");
	    fruits.add("Mango");
	    System.out.println(fruits);
	    
	    int count = Collections.frequency(fruits, "Banana");
	    System.out.println("Banana appears: " + count + " times");
	    
	    Collections.swap(fruits, 0, 2); // Swap first and third element
	    System.out.println(fruits);

	}

}
