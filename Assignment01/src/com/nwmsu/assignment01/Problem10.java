package com.nwmsu.assignment01;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Problem10 {

	public static String pro10(Deque qu,int[] arr){
        char ch = 0;
        
        boolean bol=false;
        for(int i:arr){
            
            if(i==1){
                ch=(char) qu.pop();
                
                bol=true;              
               }
            else if(i==0){ 
                if(bol){                
                 qu.addFirst(ch);
                
                 bol=false;                 
                }
                              
            }
            else{}
        }  
        String S=new String();
        while(!qu.isEmpty()){
            S=S+String.valueOf(qu.poll());
        }
        return S;
        
}
    public static void main(String[] args) {
        Deque qu = new LinkedList<>();
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.of Elements");
        int a=sc.nextInt(); 
        System.out.println("Enter the elements");                
        for(int i=0;i<a;i++){  
          
            qu.add(sc.next().charAt(0));
        }  
        
        System.out.print("Enter the operation");
        int r=sc.nextInt();
        int[] ar=new int[r];
        for(int i=0;i<r;i++){  
            ar[i]=sc.nextInt();
        }  
               System.out.println(pro10(qu,ar));
    }
}
