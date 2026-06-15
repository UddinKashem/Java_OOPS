package numbers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FindDuplicateNumberWithMethod {
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(11, 11, 11, 13, 31, 23, 31, 22, 22, 31, 23);
		
		int[] iArr = {11, 11, 11, 13, 31, 23, 31, 22, 22, 31, 23};
		
		findDuplicateNumber(list);
		findDuplicateNumber(iArr);

	}
	
	public static void findDuplicateNumber(List<Integer> list){
		
		Map<Integer, Integer> iMap = new HashMap<>();
		
		for(Integer i : list){
			if(iMap.containsKey(i)){
				iMap.put(i, iMap.get(i) + 1);
			}else
				iMap.put(i, 1);
		}
		
		Set<Map.Entry<Integer, Integer>> entrySet  = iMap.entrySet();
		System.out.println(entrySet);
		
		for(Map.Entry<Integer, Integer> entry : entrySet){
			if(entry.getValue()>1){
				//System.out.printf("Number '%d" appeared: '%d' times %n", entry.getKey(), entry.getValue());
				System.out.printf("Number '%d' appeared : '%d' times %n ", entry.getKey(),entry.getValue());
			}
			
		}
	}

	private static void findDuplicateNumber(int[] iArr) {
		// TODO Auto-generated method stub
		Map<Integer, Integer> iMap = new HashMap<>();
		
		for(Integer i : iArr){
			if(iMap.containsKey(i)){
				iMap.put(i, iMap.get(i) + 1);
			}else
				iMap.put(i, 1);
		}
		
		Set<Map.Entry<Integer, Integer>> entrySet  = iMap.entrySet();
		System.out.println(entrySet);
		
		for(Map.Entry<Integer, Integer> entry : entrySet){
			if(entry.getValue()>1){
				//System.out.printf("Number '%d" appeared: '%d' times %n", entry.getKey(), entry.getValue());
				System.out.printf("Number '%d' appeared : '%d' times %n ", entry.getKey(),entry.getValue());
			}
			
		}

		
	}

}
