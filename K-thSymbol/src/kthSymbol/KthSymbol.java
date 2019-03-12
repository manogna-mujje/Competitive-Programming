package kthSymbol;

public class KthSymbol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 4;
		int k = 7;
		System.out.println(kthGrammar(N,k));
	}

	private static int kthGrammar(int N, int K) {
		if(N==1 && K==1) 
			return 0;
		int prevk = K%2 == 0 ? K/2 : (K+1)/2;
		int prevVal = kthGrammar(N-1, prevk);
		if(prevVal == 0)
			return (K%2 == 0) ? 1 : 0;
		else 
			return (K%2 == 0) ? 0 : 1;
	}

}
