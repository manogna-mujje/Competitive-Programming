package Colony;

public class Colony {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,0,0,0,0,1,0,0};
        int days = 1;
        array = cellCompete(array, days);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
	}

	private static int[] cellCompete(int[] array, int days) {
		int n = array.length;
		int [] newArray = new int[n];
		while(days > 0) {
			for(int i=0; i<n; i++) {
				if(i == 0) {
					if (array[i+1] == 0) 
						newArray[i] = 0 ;
					else 
						newArray[i] = 1;
				} else if(i == n-1) {
					if(array[i-1] == 0)
						newArray[i] = 0;
					else 
						newArray[i] = 1;
				} else {
					if(array[i-1] == array[i+1]) {
						newArray[i] = 0;
					} else {
						newArray[i] = 1;
					}
				}
			}
			for(int i=0; i<n; i++) {
				array[i] = newArray[i];
			}
			days--;
		}
		return newArray;
	}

}
