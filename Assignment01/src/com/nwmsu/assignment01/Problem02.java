package com.nwmsu.assignment01;

import java.util.LinkedList;
import java.util.Scanner;

public class Problem02 {

	  public static LinkedList<LinkedList<Integer>> pro2(LinkedList<Integer> l1,int a1){
	        LinkedList<LinkedList<Integer>> l2=new LinkedList<>();
	            for(int i=0;i<l1.size()-1;i++){
	                LinkedList<Integer> l3=new LinkedList<>();
	                if(l1.get(i)+l1.get(i+1)==a1){
	                    l3.add(l1.get(i));
	                    l3.add(l1.get(i+1));
	                
	                }
	                else{}
	                if(l3.isEmpty()==false){l2.add(l3);};
	                
	            }
	        return l2;
	    
	    }
	    public static void main(String[] args) {
	        
	        LinkedList<Integer> l1=new LinkedList<>();
	        Scanner sc=new Scanner(System.in);
	        System.out.print("Enter the value of k");
	        int k=sc.nextInt();
	        System.out.println("Enter the no.of Elements");
	        int a=sc.nextInt(); 
	        System.out.println("Enter the elements");             
	        for(int i=0;i<a;i++){  
	            
	            l1.add(sc.nextInt());
	        }        
	        
	      
	        System.out.println(pro2(l1,k));
	        
	    }
}
