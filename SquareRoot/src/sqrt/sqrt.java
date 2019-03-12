package sqrt;

public class sqrt {
	public static int mySqrt(int n) {
        int[] range = new int[2];
        for(int i=0; i<=n/2; i++) {
        		int nums = 1+(i*2);
        		range[0] = i*i;
        		range[1] = (i+1)*(i+1)-1;
        		if(n >= range[0] && n <= range[1]) {
        			return i;
        		}
        }
        return -1;
        
    }
	public static void main(String[] args) {
		System.out.println(mySqrt(121));
	}

}
