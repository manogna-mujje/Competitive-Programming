import java.util.*;

public class Solution {
    public static int numberNeeded(String first, String second) {
        int count = 0;
      HashMap<Character, Integer> h = new HashMap<Character, Integer>();
       for(int i=0; i< first.length(); i++){
           h.put(first.charAt(i), h.getOrDefault(first.charAt(i),0)+1);
       }
       for(int i=0; i< second.length(); i++){
           h.put(second.charAt(i), h.getOrDefault(second.charAt(i),0)-1);
       }
        
        for(char key: h.keySet()){
            count = count + Math.abs(h.get(key));
        }
        return count;
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
        in.close();
    }
}