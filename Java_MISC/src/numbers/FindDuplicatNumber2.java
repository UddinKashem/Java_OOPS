package numbers;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicatNumber2 {

	public static void main(String[] args) {
		//Write a program to find the duplicate number and print them on the key value.
		
		int[] aNum={11,11,11,22,22,23,33,21,21,23,34,43,43,56,56,57,57,56};
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i : aNum){
			if(map.containsKey(i)){
				map.put(i,map.get(i)+1);
			}
			else{
				map.put(i, 1);
			}
				
		}

		Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
		
		int maxI = aNum[0];
		int maxCount = 0;
		
		for(Map.Entry<Integer, Integer> entry : entrySet){
			if(entry.getValue()>1){
				System.out.printf("Number '%d' appread: '%d' times %n",entry.getKey(), entry.getValue());
			}
			
			if(entry.getValue()>maxCount){
				maxI = entry.getKey();
				maxCount = entry.getValue();
			}
		}
		System.out.println("Max Int '"+maxI +"' occur: '"+maxCount+"' times." );
		
	}

}
