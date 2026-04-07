package javastring;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MaxOccuranceWord {

	public static void main(String[] args) {
		String str = "Functional functional Testing, functional, functional, functional, functional functional functional blackbox blackbox testing, whitebox testing, graybox testing, load testing, performance testing ";
		System.out.println(str);
		str = str.toLowerCase();
		System.out.println(str);
		str = str.replace(",", "");
		System.out.println(str);
		String[] aStr = str.split(" ");
		System.out.println(aStr.length);
		
		HashMap<String, Integer> hm = new HashMap<>();
		
		for(String s : aStr){
			if(hm.get(s)!=null){
					//.containsKey(s)){
				hm.put(s, hm.get(s)+1);
			}
			else{
				hm.put(s, 1);
			}
				
		}
		
		System.out.println(hm);
		
		Set<Map.Entry<String,Integer>> entrySet = hm.entrySet();
		System.out.println(entrySet);
		
		String maxS = aStr[0];
		int maxCount = 0;
		for(Map.Entry<String, Integer> entry : entrySet){
			if(entry.getValue()>1){
				System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
			}
			if(entry.getValue()>maxCount){
				maxS = entry.getKey();
				maxCount = entry.getValue();
			}
		}
		System.out.println("Max occuring word: '" +maxS + "' Occurs : '" + maxCount+"' times.");
		
	}

}
