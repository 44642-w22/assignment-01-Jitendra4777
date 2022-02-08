package com.nwmsu.assignment01;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Problem01 {
	 public static LinkedList<Integer> pro1(LinkedList<Integer> l1){
	        LinkedList<Integer> l2=new LinkedList<>();        
	        for(int t:l1){
	            int ad=0;
	           
	            for(int k=1;k<t;k++){
	                if(t%k==0){
	                    ad=ad+k;
	                   
	                }
	            }
	            if(ad==t){
	                
	            l2.add(t);}
	        }
	        return l2;
	        
	    
	    }
	    public static void main(String[] args) {
	        
	        Scanner sc=new Scanner(System.in);
	        LinkedList<Integer> l1=new LinkedList<>();
	        System.out.println("Enter the no.of Elements");
	        int a=sc.nextInt(); 
	        System.out.println("Enter the elements");
	        for(int i=0;i<a;i++){  
	            
	        	l1.add(sc.nextInt());
	        }        
	       
	        
	        System.out.println(pro1(l1));
	        
	        
	    }
}
