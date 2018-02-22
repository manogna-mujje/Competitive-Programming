
public class reverse {
	public int reverseNum(int num){
		if (num == 0) 
			return num;
		long result = 0;
		while(num != 0) {
			result = (result*10) + num%10;
			num = num/10;
		}
		return ((result <Integer.MIN_VALUE || result >Integer.MAX_VALUE) ? 0 : (int)result);
				
	}
	public static void main(String [] args) {
		reverse r = new reverse();
		int num = -104;
		int result = r.reverseNum(num);
		System.out.println(result);
	}
}
