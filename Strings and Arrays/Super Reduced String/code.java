import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String super_reduced_string(String s){
        // Complete this function
        if(s.length() == 1){
            return s;
        }
        int j = 0;
        String str = "";
        for (int i = 0; i < s.length(); i++){
            if ((s.charAt(j) != s.charAt(i)) || i==(s.length()-1)) {
                if((i-j)%2 != 0) {
                    str+=s.charAt(j);
                }
                j = i;
            }
        }
        
        if (str == "") {
            return "Empty String";
        } else {
            return str;
        }
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = super_reduced_string("aabcccd");
        System.out.println(result);
    }
}
