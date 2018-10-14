import java.io.*;
import java.util.*;


public class HackerrankInAString {
	// Complete the hackerrankInString function below.
    static String hackerrankInString(String s) {
        String str = "hackerrank";
        int j=0;
        for(int i=0; i<s.length(); i++){
            if((j<str.length()) && s.charAt(i) == str.charAt(j)){
                j++;
            }  
        }
        return ((j == str.length()) ? "YES" : "NO");

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            String result = hackerrankInString(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
