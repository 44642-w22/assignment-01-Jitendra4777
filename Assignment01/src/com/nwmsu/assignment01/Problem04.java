package com.nwmsu.assignment01;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem04 {

	public static ArrayList<String> pro4(ArrayList<String> l1){
        ArrayList<String> a2=new ArrayList<>();
        
        
        int x=l1.size();
        while(a2.size()!=x){
            int k=0;
            int s=l1.get(0).length();
            for(String a:l1){
                if(a.length()<s){                                       
                    
                    s=a.length();
                    k=l1.indexOf(a);
                }               
                
            
            }
            
            a2.add(l1.get(k));
            l1.remove(k);        
            
           
            
            
            
            
        }
        
        return a2;
        
        
        
}
    public static void main(String[] args) {
        ArrayList<String> a1=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.of Elements");
        int a=sc.nextInt(); 
        System.out.println("Enter the elements");                   
        for(int i=0;i<a;i++){  
          
            a1.add(sc.next());
        }        
      
        System.out.println(pro4(a1));
        
    }
}
