package collection.map;

import java.util.HashMap;

/*
 * A MashMap stores items in key/value pairs, where each key maps to a specific value.
 * It is part of the java.util package and implements the Map interface.
 */

public class TestHashMap {

	public static void main(String[] args) {
		 // Create a HashMap object called capitalCities
	    HashMap<String, String> capitalCities = new HashMap<String, String>();

	    // Add keys and values (Country, City)
	    capitalCities.put("England", "London");
	    capitalCities.put("India", "New Dehli");
	    capitalCities.put("Austria", "Wien");
	    capitalCities.put("Norway", "Oslo");
	    capitalCities.put("Norway", "Oslo"); // Duplicate
	    capitalCities.put("USA", "Washington DC");

	    System.out.println(capitalCities);
	    
	    System.out.println(capitalCities.get("Norway"));
	    
	    for(String st : capitalCities.keySet()){
	    	System.out.println("Key: " + st + ", Value: " + capitalCities.get(st));
	    }
	    
	    for(String st : capitalCities.values()){
	    	System.out.println(st);
	    }

	    // Create a HashMap object called people
	    HashMap<String, Integer> people = new HashMap<String, Integer>();

	    // Add keys and values (Name, Age)
	    people.put("John", 32);
	    people.put("Steve", 30);
	    people.put("Angie", 33);

	    for (String i : people.keySet()) {
	      System.out.println("key: " + i + ", value: " + people.get(i));
	    }
	}

}
