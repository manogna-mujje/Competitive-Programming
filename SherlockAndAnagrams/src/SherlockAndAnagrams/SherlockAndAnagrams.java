package SherlockAndAnagrams;

import java.io.*;
import java.util.*;

public class SherlockAndAnagrams {

	    // Complete the sherlockAndAnagrams function below.
	    static int sherlockAndAnagrams(String s) {
	        int count = 0;
	        HashMap<String, Integer> h = new HashMap<String, Integer>();
	        for(int i=0; i<s.length(); i++){
	            for(int j=i+1; j<=s.length(); j++){
	                String given = s.substring(i, j);
	                char tempArray[] = given.toCharArray(); 
	                Arrays.sort(tempArray); 
	                String sortedGiven = new String(tempArray);
	                h.put(sortedGiven, h.getOrDefault(sortedGiven, 0)+1);
	            }
	        }
	        for(int value: h.values()){
	            int sum = 0;
	            while (value > 1){
	                sum = sum + value-1;
	                value--;
	            }
	            count = count + sum;
	        }
	        return count;
	    }

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        int q = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int qItr = 0; qItr < q; qItr++) {
	            String s = scanner.nextLine();

	            int result = sherlockAndAnagrams(s);

	            bufferedWriter.write(String.valueOf(result));
	            bufferedWriter.newLine();
	        }

	        bufferedWriter.close();

	        scanner.close();
	    }
	}

