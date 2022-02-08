package com.nwmsu.assignment01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Problem08 {

	public static ArrayList<Integer> prob8(Queue qu){
		
		
        ArrayList<Integer> a1=new ArrayList<>();
        while(!qu.isEmpty()){
            a1.add((int) qu.remove());
        }
        int i=a1.size()-1;
        int t=0;
        ArrayList<Integer> a2=new ArrayList<>();
        while(a2.size()!=a1.size()){
            a2.add(a1.get(i));
            
            if(!a1.isEmpty()){
               a2.add(a1.get(t));
               
               t=t+1;
            }
            
            i=i-1;
        }
        return a2;
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
        
        System.out.println(prob8(qu));
    }
}
