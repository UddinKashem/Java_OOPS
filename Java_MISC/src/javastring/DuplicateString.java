package javastring;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class DuplicateString {

	public static void main(String[] args) {
		
		String str="Print the duplicate string from the string array";
		String str2="A word is longest is the length of the word is the longest in the string";

		finDuplicateString(str);
		System.out.println("============================");
		finDuplicateString(str2);
	}

	static void finDuplicateString(String str){
		
		HashMap<String, Integer> hm = new HashMap<>();
		
		String[] s = str.split(" ");
		
		for(String tempString : s){
			
			if(hm.get(tempString) != null){
				hm.put(tempString, hm.get(tempString)+1);
			}
			else
			hm.put(tempString, 1);
		}
			
		Iterator<String> tempString2 = hm.keySet().iterator();
		while(tempString2.hasNext()){
			String temp = tempString2.next();
			if(hm.get(temp)>1){
				System.out.println("The word: '"+temp+ "' appeared "+hm.get(temp)+ " times.");
			}
			
		}
		System.out.println(hm);
	}
}
