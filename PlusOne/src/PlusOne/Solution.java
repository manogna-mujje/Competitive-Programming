package PlusOne;

public class Solution {

	public static int[] plusOne(int[] digits) {
        int n = digits.length, carry = 0;
        int sum;
        for(int i=n-1; i>=0; i--) {
        		if(i==n-1) {
        			if(digits[i]+1 > 9) {
        				digits[i] = 0;
        				carry = 1;
        			} else {
        				digits[i] = digits[i]+1;
        				carry = 0;
        			}
        		}
        		else {
        			if(digits[i]+carry > 9) {
        				digits[i] = 0;
        				carry = 1;
        			} else {
        				digits[i] = digits[i]+carry;
        				carry = 0;
        			}
        		}
        }
        int[] arr = new int [n+1];
        if(carry == 1) {
        
        		arr[0] = 1;
        		for(int i=1; i<n+1; i++) {
        			arr[i] = digits[i-1];
        		}
        }
        return (carry == 0) ? digits : arr;
    }
	public static void main(String[] args) {
		int [] array = {9, 9};
		int[] result = plusOne(array);
		for(int i =0; i< result.length; i++) {
			System.out.println(result[i]);
		}
	
	}

}
 