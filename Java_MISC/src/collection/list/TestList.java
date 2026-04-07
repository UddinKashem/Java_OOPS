package collection.list;

import java.util.Arrays;
import java.util.List;

/*
 * The List interface is part of the Java Collections Framework and represents
 *  an ordered collection of elements.
 * 
 */
public class TestList {

	public static void main(String[] args) {
	List<String> sList = Arrays.asList("Apple","Car","Rat");
	System.out.println(sList);
	
	List<Integer> iList = Arrays.asList(11,22,22,33,11,33,11,22,34,33,54,22,33,43,57,54);
	System.out.println(iList);
	
	List<Character> cList = Arrays.asList('T','O','M','M','Y');
	System.out.println(cList);
	}

}
