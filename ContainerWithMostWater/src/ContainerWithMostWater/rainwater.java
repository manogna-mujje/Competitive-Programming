package ContainerWithMostWater;

public class rainwater {

	public static void main(String[] args) {
		int [] height = {1,8,6,2,5,4,8,3,7};
		System.out.println(maxArea(height));
	}
	
	public static int maxArea(int[] height) {
		int n = height.length;
		int lo = 0;
		int hi = n-1;
		int max = 0;
		while(lo < hi) {
			max = Math.max(max, Math.min(height[lo], height[hi]) * (hi-lo));
			if(height[lo] <= height[hi]) {
				lo++;
			} else {
				hi--;
			}
		}
		return max;
	}

}
