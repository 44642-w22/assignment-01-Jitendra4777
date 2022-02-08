package com.nwmsu.assignment01;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem03 {

	public static int pro3(ArrayList<Integer> A){        
        if(A.isEmpty())
        {
        	return Integer.MIN_VALUE;
        	}
        else
        {
        int a=A.get(0);
        for(int k : A)
        {
        	
            if(k>a)
            {
            	a=k;
            	}
            
            
        }
        return a;
        }
        
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> a1=new ArrayList<>();
        System.out.println("Enter the no.of Elements");
        int a=sc.nextInt(); 
        System.out.println("Enter the elements");              
        for(int i=0;i<a;i++){  
           
            a1.add(sc.nextInt());
        }        
        
        System.out.println(pro3(a1));
        
    }
}
