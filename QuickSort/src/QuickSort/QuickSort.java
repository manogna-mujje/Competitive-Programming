package QuickSort;

public class QuickSort {

	
	static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10, 7, 8, 9, 1, 5}; 
        int n = arr.length; 
  
        QuickSort ob = new QuickSort(); 
        ob.sort(arr, 0, n-1); 
  
        System.out.println("sorted array"); 
        printArray(arr); 
	}

	private void sort(int[] arr, int low, int high) {
		if(low < high) {
			int pi = partition(arr, low, high);
			sort(arr, low, pi-1);
			sort(arr, pi+1, high);
		}
		
	}

	private int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = low;
		for(int j=low; j<high; j++) {
			if(arr[j] <= pivot) {
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
				i++;
			}
		}
		arr[high] = arr[i];
		arr[i] = pivot;
		return i;
	}
	
	

}
