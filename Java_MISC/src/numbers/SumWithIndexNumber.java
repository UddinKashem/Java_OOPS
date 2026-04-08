package numbers;

import java.util.Arrays;

class SumWithIndexNumber {

	  public static int[] twoSum(int[] nums, int target) {
	    
		  Arrays.sort(nums);
	        int left = 0;
	        int right = nums.length-1;
	        for(int i : nums){
	            int sum = nums[left]+nums[right];
	            if(sum == target)
	                return new int[]{left+1,right};
	            else if(sum > target)
	                right--;
	            else
	                left++;
	        }
	        return new int[]{0,0};
	    }

	  public static void main (String[] args) {  
	    // keep this function call here    
	        int[] nums = {3, 2, 4, 1, 5, 6};
	        int target = 11;
	        int[] result = twoSum(nums, target);
	        System.out.println(result[0] + ", " + result[1]);
	        
	        int[] nums2 = {2,7,11,15};
	        int target2 = 9;
	        int[] result2 = twoSum(nums2, target2);
	        System.out.println(result2[0] + ", " + result2[1]);

	    
	   // System.out.print("Sample test passing: " + (twoSum(new int[] {17, 4, 5, 6, 10, 11, 4, -3, -5, 3, 15, 2, 7}, 0).equals("6,11 10,7 15,2")) + "\r\n"); 
	  }

	}
