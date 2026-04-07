package javastring;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SplitString {

	public static void main(String[] args) {
		String str1 = "This$$##is$$##a$$##test$$##to$$##split$$##string";
		String str2 = "This, that, then, there, here, those";
		String str3 = "What @Who @Where @When @Whom @Why @How";
		
		String[] sp1 = str1.split("\\$\\$\\#\\#");
		System.out.println("Number of words in the string is: "+sp1.length);
		
		for(int i=0; i < sp1.length; i++){

			System.out.println("The value of index ["+i+"] is: "+sp1[i]);
		}
		
		String[] sp2 = str2.split(" ");
		System.out.println("\nNumber of words in the string is: "+sp2.length);
		
		for(int i=0; i < sp2.length; i++){
			
			System.out.println("The value of index ["+i+"] is: "+sp2[i]);
		}
		
		String[] sp3 = str3.split("@");
		System.out.println("\nNumber of words in the string is: "+sp3.length);
		
		for(int i=0; i < sp3.length; i++){
			
			System.out.println("The value of index ["+i+"] is: "+sp3[i]);
		}
		System.out.println("==============================================");
		
		freqCount(str1);
		System.out.println("==============================================");
		
		freqCount(str2);
		System.out.println("==============================================");
		
		freqCount(str3);

	}
	
	public static void freqCount(String str){
		
		char[] aChar = str.toCharArray();
		
		System.out.println("Length of Character Array: "+aChar.length);
		
		Map<Character, Integer> charMap = new HashMap<Character,Integer>();
		
		for(Character ch : aChar){
			if(charMap.containsKey(ch)){
				charMap.put(ch, charMap.get(ch) + 1);
			}
			else
			{
				charMap.put(ch, 1);
			}
		}
		
		Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
		
		for(Map.Entry<Character, Integer> entry : entrySet){
			if(entry.getValue()>1){
				System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
			}
		}
	}

}
