package week1.day2;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		
		int[] nums = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		
		int length = nums.length;
		int count;
		
		for(int i =0; i<=length-1; i++) {
			count=0;
			for (int j = i+1; j < length; j++) {
				
				if (nums[i]==nums[j]) // compare the loop 
					{
					
					count++; //if both are same increasing the count
					
				}
				
							}
			
			if (count>0) {
				
				System.out.println(nums[i]);
				
			}
		}

	}

}
