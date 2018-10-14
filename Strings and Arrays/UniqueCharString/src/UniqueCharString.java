import java.util.Hashtable;
public class UniqueCharString {
	boolean isUniqueChars(String str) {
		int len = str.length(), value = 1;
		Hashtable h = new Hashtable();
		for(int i = 0; i < len ; i++) {
			if(!h.containsKey(str.charAt(i))) {
				h.put(str.charAt(i), value);
			} else {
				h.replace(str.charAt(i), value+1);
			}
		}
		for(int i = 0; i < len ; i++) {
			if ((int)h.get(str.charAt(i)) > 1) {
				return false;
			}
		}
		return true;
	}
	public static void main(String [] args) {
		UniqueCharString u = new UniqueCharString();
		System.out.println(u.isUniqueChars("yy"));
	}
}
