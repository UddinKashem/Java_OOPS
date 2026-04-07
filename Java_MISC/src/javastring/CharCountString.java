package javastring;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CharCountString {
	
	/*
	 * Write a program to give count of characters in a string.
	 */
	
	public static void freqCount(String str){
		
		char[] aChar = str.toCharArray();
		
		//Build HashMap with character and number of times they appear in string
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		
		for(Character ch : aChar){
			if(charMap.containsKey(ch)){
				charMap.put(ch, charMap.get(ch)+1);
			}else
			{
				charMap.put(ch, 1);
			}
		}
		
		//Iterate through HashMap to print all character count
		Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
		
		Character maxOccur = aChar[0];
		int maxCount = 0;
		
		System.out.printf("List of character in String '%s',%n", str);
		for(Map.Entry<Character, Integer> entry : entrySet){
			if(entry.getValue()>1){
				System.out.printf("%s : %d %n",entry.getKey(),entry.getValue());
			}
			if(entry.getValue()>maxCount){
				maxOccur=entry.getKey();
				maxCount=entry.getValue();
			}
		}
		//System.out.printf("%n Maxoccur['%s'] : %d times",maxOccur,maxCount);
		System.out.println("Max occur : " + maxOccur);
		System.out.println("Max count : " + maxCount);
	}

	public static void main(String[] args) {
		
		String str = "abcdserfdascbdfrdsaasdasdaddaaaa";
		
		freqCount(str);

	}

}
