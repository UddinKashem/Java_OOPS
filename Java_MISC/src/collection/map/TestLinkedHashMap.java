package collection.map;

import java.util.LinkedHashMap;

/*
 * A LinkedHashMap stores keys and values, and keeps them in the same order you put in them in.
 * It is part of the java.util package and implements the Map Interface.
 */

public class TestLinkedHashMap {

	public static void main(String[] args) {
	
	    LinkedHashMap<String, String> capitalCities = new LinkedHashMap<>();

	    capitalCities.put("England", "London");
	    capitalCities.put("India", "New Dehli");
	    capitalCities.put("Austria", "Wien");
	    capitalCities.put("Norway", "Oslo");
	    capitalCities.put("Norway", "Oslo"); // Duplicate
	    capitalCities.put("USA", "Washington DC");

	    System.out.println(capitalCities);
	    
	 // Print keys
	    for (String key : capitalCities.keySet()) {
	      System.out.println(key);
	    }
	    
	 // Print values
	    for (String value : capitalCities.values()) {
	      System.out.println(value);
	    }
	    
	 // Print keys and values
	    for (String key : capitalCities.keySet()) {
	      System.out.println("Key: " + key + ", Value: " + capitalCities.get(key));
	    }
	}

}
