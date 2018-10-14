/*
 * Without extra space
 */
public class checkPalindrome {
	public boolean isPalindrome(int x) {
		System.out.printf("Initial value of x: %d\n",x);
		if (x<0 || (x != 0 && x%10 == 0)) return false;
	    int rev = 0;
	    while (x>rev){
	    	System.out.printf("x: %d\n",x);
	    	System.out.printf("rev: %d\n",rev);
	    	rev = rev*10 + x%10;
	    	x = x/10;
	    	System.out.printf("Changed x: %d\n",x);
	    	System.out.printf("Changed rev: %d\n",rev);
	    }
	    System.out.println("Final x: " + x);
	    System.out.println("Final rev: " + rev);
	    return (x==rev || x==rev/10);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkPalindrome pal = new checkPalindrome(); 
		System.out.println(pal.isPalindrome(234565432));
	}

}
