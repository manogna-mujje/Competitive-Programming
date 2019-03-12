package MissingNumber;

import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
		int[] arr = {3, 0, 2};
		int x = missingNumber(arr);
		System.out.println(x);
	}
	
	private static int missingNumber(int[] nums) {
		int sum =0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
        }
        int l = nums.length;
        return l*(l+1)/2 - sum; 
	}

}
