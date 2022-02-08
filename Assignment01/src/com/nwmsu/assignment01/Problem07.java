package com.nwmsu.assignment01;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Problem07 {

	  public static int pro7(Queue qu){
	        String s=new String();
	        while(!qu.isEmpty()){
	            s=s+String.valueOf(qu.remove());
	            }
	        
	        return Integer.parseInt(s, 2);
	    }
	    public static void main(String[] args) {
	        Queue qu=new LinkedList<>();
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter the no.of Elements");
	        int a=sc.nextInt(); 
	        System.out.println("Enter the elements");            
	        for(int i=0;i<a;i++){  
	            
	            qu.add(sc.nextInt());
	        }        
	       
	        
	        System.out.println(pro7(qu));
	        
}
}
