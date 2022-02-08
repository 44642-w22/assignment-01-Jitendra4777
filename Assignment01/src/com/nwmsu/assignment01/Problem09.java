package com.nwmsu.assignment01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Problem09 {

	public static ArrayList<Integer> pro9(Queue qu){
        ArrayList<Integer> a1=new ArrayList<>();
        ArrayList<Integer> a2=new ArrayList<>();
        ArrayList<Integer> a3=new ArrayList<>();
        qu.forEach(i -> {
            if(((int) i)%2==0){
                a2.add((int) i);
            }
            else
                a1.add((int)i);
        });
        
        while(true){
            if(!a2.isEmpty()){
                a3.add(a2.get(0));
                a2.remove(0);
                                           
            }
            else
            {}            
            if(!a1.isEmpty()){
                a3.add(a1.get(0));
                a1.remove(0);
            }
            else{}
            if(a2.isEmpty() && a1.isEmpty()){break;}
        }
        return a3;
        
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
       
        System.out.println(pro9(qu));
    }
}
