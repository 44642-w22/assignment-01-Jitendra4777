package com.nwmsu.assignment01;

import java.util.Scanner;
import java.util.Stack;

public class Problem05 {

	 public static boolean pro5(String s1){
	      Stack<Character> stck = new Stack<>();
	      if(s1 == null || s1.length() == 0) {
	           return false;
	      } else {    
	        for(int i = 0; i < s1.length(); i++){
	            
	            switch (s1.charAt(i)) {
	                case '(':
	                case '{':
	                case '[':
	                    stck.push(s1.charAt(i));
	                    break;
	                case ')':
	                    if(!stck.isEmpty() && stck.peek() == '(') {
	                        stck.pop();
	                    }else {
	                        return false;
	                    }          break;
	                case ']':
	                    if(!stck.isEmpty() && stck.peek() == '[') {
	                        stck.pop();
	                    } else {
	                        return false;
	                    }     break;
	                case '}':
	                    if(!stck.isEmpty() && stck.peek() == '{') {
	                        stck.pop();
	                    } else {
	                        return false;
	                    }     break;
	                default:
	                    break;
	            }
	        }
	        
	            
	            return stck.isEmpty();
	    }
	 }

	        
	    
	    public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        System.out.print("Enter the String");
	        String a=sc.next();
	        System.out.println(pro5(a));
	    }
}
