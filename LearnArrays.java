package week1.day2;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {
		
		int nums[] = {10,20,40,25,30};
		
		//Get Number of items
		
		int length = nums.length; //Length is a global variable
		System.out.println(length);
		
		//get first item in array
		
		System.out.println(nums[0]);
		
		//get last item in array
		
		System.out.println(nums[length-1]);
		
		// sort and Array
		
				Arrays.sort(nums);
		
		
		//print all values in array
		
		//we know the number of iterations so we use for loop
		
		for(int i=0; i<length; i++) {
			
			System.out.println(nums[i]);
			
					}
		
		//To get reverse values
		
		for(int i = length-1; i>=0; i--) {
			System.out.println(nums[i]);
		}
		
			
		
		
		
		
		
		

	}

}
