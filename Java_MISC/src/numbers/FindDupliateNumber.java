package numbers;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FindDupliateNumber {

	public static void main(String[] args) {
	    List<Integer> list = Arrays.asList(11, 11, 11, 11, 23, 58, 13, 11, 21, 34, 55, 13, 89, 144, 233, 377, 610, 23, 987, 1597, 2584, 4181, 4181, 4181, 6765);
	    System.out.println("List before sort: "+list);
	    
	    Collections
	    //.reverse(list);
	    .sort(list);
	    
	    System.out.println("List after sort: "+list);
	    
	    Map<Integer,Integer> map = new HashMap<>();

	      for(Integer r  : list) {
	          if(map.containsKey(r)) {
	             map.put(r, map.get(r) + 1);
	          }
	          else {
	              map.put(r, 1);
	          }
	      }

	      Set<Map.Entry<Integer,Integer>> entrySet = map.entrySet();
	      
	      System.out.println(entrySet);
	      System.out.println();
	      
	      int maxI = list.get(0);
	      int maxCount = 0;
	      
	      for(Map.Entry<Integer,Integer>  entry : entrySet) {
	    
	    	  if(entry.getValue()>1){
	          System.out.printf("Number '%d' appeared : '%d' times %n ", entry.getKey(),entry.getValue());
	       		}
	    	  
	    	  if(entry.getValue()>maxCount){
	    		  maxI = entry.getKey();
	    		  maxCount = entry.getValue();
	    	  }
	    	}
	      System.out.println("Max Number is: '"+maxI+"' and occurs: "+maxCount +" times.");

	}

}
