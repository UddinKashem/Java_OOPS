package collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * An ArrayList is like a resizable array.
 * It is part of the java.util package and implements the List interface.
 * The difference between a built-in array and an ArrayList in Java, 
 * is that the size of an array cannot be modified 
 * (if you want to add or remove elements to/from an array, 
 * you have to create a new one). While elements can be added and removed 
 * from an ArrayList whenever you want.
 */

public class TestArrayList {

	public static void main(String[] args) {
		List<String> sList = new ArrayList<String>();
		sList.add("Honda");
		sList.add("Toyota");
		sList.add("Mazda");
		System.out.println(sList);
		for(String st : sList){
			System.out.println(st);
		}
		System.out.println("================");
		for(int i=sList.size()-1;i>=0;i--){
			System.out.println(sList.get(i));
		}
		
		ArrayList<String> sList2 = new ArrayList<>();
		sList2.add("Car");
		sList2.add("Bus");
		sList2.add("Train");
		System.out.println(sList2);
		sList2.add(0, "Bike");
		System.out.println(sList2);
		sList2.add(1, "WaterTaxi");
		System.out.println(sList2);
		int i =sList2.size();
		System.out.println("Last value of ArrayList : "+sList2.get(i-1));
		sList2.set(i-1, "Limozine");
		System.out.println(sList2);
		sList2.remove(i-1);
		System.out.println(sList2);
		
		Collections.sort(sList2);
		System.out.println(sList2);
		
		
		List<Integer> iList = new ArrayList<>();
		iList.add(123);
		iList.add(213);
		iList.add(321);
		System.out.println(iList);
		
		List<Double> fList = new ArrayList<>();
		fList.add(123.45);
		fList.add(321.0);
		fList.add(234.);
		System.out.println(fList);
		
		}

}
