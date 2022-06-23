package week1.day2;

import java.util.Arrays;
import java.util.Iterator;

public class FindSecondLargest {

	public static void main(String[] args) {


		int[] nums = {3,2,11,4,6,7};

		Arrays.sort(nums);

		int length = nums.length; 

		for(int i=0; i<length; i++) {

			System.out.println(nums[i]);

		}

		System.out.println(nums[nums.length-2]);

	}

}


