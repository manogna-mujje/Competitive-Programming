package ReverseString;

public class ReverseString {

	public static void main(String[] args) {
		char[] word = {'h', 'e', 'l', 'l', 'o'};
//		reverseString(0, word);
		reverseStringTwoPointer(0, 4, word);
		for(int i = 0; i<word.length; i++) {
			System.out.println(word[i]);
		}
		return;
	}

	private static void reverseString(int k, char[] word) {
		int n= word.length;
		if(k == n) {
			return;
		}
		char key = word[k];
		int position = n-1-k;
		reverseString(k+1, word);
		word[position] = key;
	}
	
	private static void reverseStringTwoPointer(int start, int end, char[] word) {
		if(start >= end) {
			return;
		}
		
		char temp = word[end];
		word[end] = word[start];
		word[start] = temp;
		
		reverseStringTwoPointer(start+1, end-1, word);
	}
	
	
}
