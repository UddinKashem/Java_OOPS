package javastring;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacter {

	public static void main(String[] args) {

		String str = "This is a test to find the duplicte character";

		duplicaterCharacter(str);

	}

	static void duplicaterCharacter(String str) {

		//str = str.replace(" ", "");

		HashMap<Character, Integer> hm = new HashMap<>();

		char[] aChar = str.toCharArray();

		for (Character ch : aChar) {

			if (hm.get(ch) != null) {

				hm.put(ch, hm.get(ch) + 1);

			} else

				hm.put(ch, 1);

		}
		System.out.println(hm);
		
		Iterator<Character> tempChar = hm.keySet().iterator();
		
		while(tempChar.hasNext()){
			
			char ch = tempChar.next();
			
			if(hm.get(ch)>1){
				System.out.println("Character '"+ch+"' appeared "+ hm.get(ch)+" times;" );
			}
		}
		//Character Count by For Loop
		HashMap<Character,Integer> hm2 = new HashMap<>();
		System.out.println("=======================");
		for(Character ch : str.toCharArray()){
			if(hm2.containsKey(ch)){
				hm2.put(ch, hm2.get(ch)+1);
			}else{
				hm2.put(ch, 1);
			}
		}
		Set<Map.Entry<Character,Integer>> entrySet = hm2.entrySet();
		System.out.printf("List of character in String '%s', %n", str);
		for(Map.Entry<Character, Integer> entry : entrySet){
			if(entry.getValue()>1){
				System.out.printf("Character '%s' : apeared %d times %n", entry.getKey(), entry.getValue());
			}
		}

	}

}
