package collection.map;

import java.util.TreeMap;

/*
 * A TreeMap is a collection that stores key/value pairs in sorted order by key.
 * It is part of the java.util package and implements the Map interface.
 */

public class TestTreeMap {

	public static void main(String[] args) {
	    TreeMap<String, String> capitalCities = new TreeMap<>();
	    capitalCities.put("England", "London");
	    capitalCities.put("India", "New Dehli");
	    capitalCities.put("Austria", "Wien");
	    capitalCities.put("Norway", "Oslo");
	    capitalCities.put("Norway", "Oslo"); // Duplicate
	    capitalCities.put("USA", "Washington DC");
	    capitalCities.put("", "TelAviv");
	    capitalCities.put("2", "Abcd");
	    capitalCities.put("3","Ankara");
	    capitalCities.put("", "Braceles");
	    
	    System.out.println(capitalCities);
	    
	    for(String st : capitalCities.keySet()){
	    	System.out.println(st+" : "+capitalCities.get(st));
	    }
	    
	    for(String st : capitalCities.values()){
	    	System.out.println(st );
	    }
	}

}
