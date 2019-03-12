package DisappearedNumbers;

import java.util.ArrayList;
import java.util.List;

public class DisNums {

	public static void main(String[] args) {
		int[] arr = {1,1};
		System.out.println(findDisNums(arr));
	}

	private static List<Integer> findDisNums(int[] nums) {
		List<Integer> li = new ArrayList<Integer>();
		int n = nums.length;
		for(int i=0; i<n; i++) {
			int index = Math.abs(nums[i]) - 1;
			if(nums[index] > 0) {
				nums[index] = -nums[index];
			}
		}
		
		for(int i=0; i<n; i++) {
			if(nums[i] > 0) {
				li.add(i+1);
			}
		}
		return li;
	}

}
