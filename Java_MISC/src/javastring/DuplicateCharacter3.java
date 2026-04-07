package javastring;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacter3 {

	public static void main(String[] args) {
		/*
		 * Write a program to count frequency of Character on a given string.
		 */
		
		String str = "This is a test to find the duplicte character";
				 //"asdfg;lkjhjujyjhjmjnfrftfgfbfvaqazswsxdedckik,lol.;p;";
		
		freqCount(str);
		
	}
	
	public static void freqCount(String str){
		//char[] aChar = str.toCharArray();
		
		Map<Character, Integer> chMap = new HashMap<>();
		
		for(Character ch : str.toCharArray()){
			//aChar){
			if(chMap.containsKey(ch)){
				chMap.put(ch, chMap.get(ch) +1);
			}else
			{
				chMap.put(ch, 1);
			}
		}
		
		Set<Map.Entry<Character, Integer>> entrySet = chMap.entrySet();
		System.out.printf("List of character in String: '%s', %n",chMap);
		
		for(Map.Entry<Character, Integer> entry : entrySet){
			if(entry.getValue()>1){
				System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
			}
		}
	}
}
