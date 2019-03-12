package BinarySearch;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearch ob = new BinarySearch(); 
        int arr[] = { 2, 3, 4, 10, 40 }; 
        int x = 10; 
        int result = ob.binarySearch(arr, x); 
        if (result == -1) 
            System.out.println("Element not present"); 
        else
            System.out.println("Element found at "
                               + "index " + result); 
	}

	private int binarySearch(int[] arr, int x) {
		
		int n = arr.length;
		int l = 0, h=n-1;
		
		int res = recursiveSearch(arr, l, h, x);
		int result = iterativeSearch(arr, l, h, x);
		
		
		return res;
	}

	private int iterativeSearch(int[] arr, int l, int h, int x) {
		while(l<=h) {
			int m = l+(h-l)/2;
			if(arr[m] == x) {
				return m;
			} else if(arr[m] > x) {
				h = m-1;
			} else if(arr[m] < x) {
				l = m+1;
			}
		}
		return -1;	
		
	}

	private int recursiveSearch(int[] arr, int l, int h, int x) {
		
		if(l<=h) {
			int m = (l+h)/2;
			if(arr[m] == x) {
				return m;
			} else if(arr[m] > x) {
				return recursiveSearch(arr, l, m-1, x);
			} else if(arr[m] < x) {
				return recursiveSearch(arr, m+1, h, x);
			}
		}
		
		return -1;
	}

}
