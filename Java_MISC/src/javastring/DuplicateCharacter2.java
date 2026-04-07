package javastring;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacter2 {

	public static void findDuplicate(String str){
		
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		
		for(int i=0; i<str.length(); i++){
			
			char ch = str.charAt(i);
			
			if(charMap.containsKey(ch)){
				
				int count = charMap.get(ch);
				
				charMap.put(ch, ++ count);
				
			}else{
				
				charMap.put(ch, 1);
			}
			
			//System.out.println(charMap);
		}
		
		
		//System.out.println(charMap);
		
		Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
		System.out.println(entrySet);
		
		for(Map.Entry<Character, Integer> entry : entrySet){
			if(entry.getValue()>1){
				System.out.printf("Character '%s' appread '%d' times.%n", entry.getKey(), entry.getValue());
			}
		}
		
	}
	public static void main(String[] args) {
		
		String str= "This is a test to count the duplicate character.";
		
		findDuplicate(str);

	}

}
