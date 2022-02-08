package com.nwmsu.assignment01;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Problem06 {

	 public static ArrayList<Integer> pro6(Stack s1){
	        ArrayList<Integer> a1=new ArrayList<>();
	        int k=s1.size();
	        
	        while(!s1.empty()){
	            if(s1.size()>(k/2)){
	                a1.add((int)s1.pop());
	                
	            }
	            else{
	                a1.add((int)(s1.firstElement()));
	                s1.remove(0);
	              
	                
	            }            
	        }
	        return a1;
	    }
	    public static void main(String[] args) {
	        Stack st=new Stack();
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter the no.of Elements");
	        int a=sc.nextInt(); 
	        System.out.println("Enter the elements");               
	        for(int i=0;i<a;i++){  
	          
	            st.push(sc.nextInt());
	        }                
	        System.out.println(pro6(st));
	    }
}
