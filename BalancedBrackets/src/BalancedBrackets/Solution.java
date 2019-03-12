package BalancedBrackets;

import java.util.Scanner;
import java.util.Stack;

public class Solution {

	public static boolean isBalanced(String expression) {
        Stack<Character> s = new Stack<Character>();
        for(int i=0; i<expression.length(); i++){
        		char c = expression.charAt(i);
        		switch(c) 
        		{
        			case '{':
        				s.push('}');
        				break;
        			case '(':
        				s.push(')');
        				break;
        			case '[':
        				s.push(']');
        				break;
        			default:
        				if(s.isEmpty() || c != s.peek()) {
        					return false;
        				}
        				s.pop();
        		}
        }
		return true;
        		
      }
  
    public static void main(String[] args) {
        System.out.println(isBalanced("{()}[]"));
    }

}
