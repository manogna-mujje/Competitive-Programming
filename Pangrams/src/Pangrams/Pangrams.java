package Pangrams;
import java.io.*;
import java.util.*;
	
public class Pangrams {
	    // Complete the pangrams function below.
	    static String pangrams(String s) {
	        int [] arr = new int[26];
	        // HashMap<Character> h = new HashMap<Character> ();
	        for(int i=0; i<s.length(); i++){
	            if((s.charAt(i)>=65) && (s.charAt(i) <= 90)){
	                arr[s.charAt(i)+32-97] = 1;
	            } else if((s.charAt(i)>=97) && (s.charAt(i) <= 122)) {
	                arr[s.charAt(i)-97] = 1;
	            }
	        }
	        for(int i =0; i< 26; i++){
	            if(arr[i] == 0){
	                return "not pangram";
	            }
	        }
	        return "pangram";
	    }

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        String s = scanner.nextLine();

	        String result = pangrams(s);

	        bufferedWriter.write(result);
	        bufferedWriter.newLine();

	        bufferedWriter.close();

	        scanner.close();
	    }
	}

