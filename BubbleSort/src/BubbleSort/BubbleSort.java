package BubbleSort;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 64, 34, 25, 12, 22, 11, 90 }; 
        int n = arr.length; 
        bubbleSort(arr, n); 
        System.out.println("Sorted array: "); 
        printArray(arr, n);
	}

	// Logic Tip: {Last to First} element gets the right value after every loop
	 private static void bubbleSort(int[] arr, int n) {
		 
		for(int i=0; i< n-1; i++) {
			boolean swapped = false;
			for(int j=0; j<n-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swapped = true;
				}
			}
			
			if(swapped == false) {
				break;
			}
		}
		
	}

	static void printArray(int arr[], int size) 
	    { 
	        int i; 
	        for (i = 0; i < size; i++) 
	            System.out.print(arr[i] + " "); 
	        System.out.println(); 
	    } 
}
