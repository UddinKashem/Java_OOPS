package javastring;

import java.util.HashMap;
import java.util.Iterator;

public class FindDuplicateWorld {

	public static void main(String[] args) {
		/*
		 * Write a program to find the duplicate on the given string.
		 */

		String str = "This a test to find the duplicate string word from the string";
		
		findDuplicate(str);
	}
	
	public static void findDuplicate(String str){
		
		HashMap<String, Integer> hm = new HashMap<>();
		
		String[] st = str.split(" ");
		
		for(String tempString : st){
			if(hm.get(tempString) != null){
				hm.put(tempString, hm.get(tempString) +1);
			}else
			{
				hm.put(tempString, 1);
			}
		}
		
		Iterator<String> tempString = hm.keySet().iterator();
		
		while(tempString.hasNext()){
			String temp = tempString.next();
			if(hm.get(temp)>1){
				System.out.println("The word : '"+temp+"' appeared "+hm.get(temp)+" times.");
			}
		}
		System.out.println(hm);
	}

}
