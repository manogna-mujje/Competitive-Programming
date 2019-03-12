package MedianArray;

public class MedianArray {

	public static void main(String[] args) {
		int [] nums1 = {1, 2};
		int [] nums2 = {3, 4};
		int k = findMedian(nums1, nums2);
		System.out.println(k);
	}

	private static int findMedian(int[] nums1, int[] nums2) {
		int n1 = nums1.length;
		int n2 = nums2.length;
		boolean isEven = (n1+n2)%2 == 0 ? true : false;
		int medIndex = (n1+n2)/2;
		int i=0, j=0, k=-1, last=0;
		
		while(k<medIndex && i<n1 && j<n2) {
			k++;
			if(nums1[i]<=nums2[j]) {
				last = nums1[i];
				i++;
			} else {
				last = nums2[j];
				j++;
			}
		}
		
		
		while(k<medIndex && j < n2) {
			k++;
			last = nums2[j];
			j++;
		}
		while (k<medIndex && i < n1) {
			k++;
			last = nums1[i];
			i++;
		}
	
		
		if(isEven) {
			int next;
			if(i<n1 && j<n2) {
				next = Math.min(nums1[i], nums2[j]);
			}
			return (next+last)/2;
		}
		return last;
	}

}
