package com.mycompany.mavenproject1;


//import java.util.Arrays;

import java.util.*;

public class Mavenproject1 {
    
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       int x=in.nextInt();
       HashSet<Object>set1=new HashSet<>();
       for (int i = 1; i <= x; i++) {
            set1.add(i);
       }
       int y=in.nextInt();
       HashSet<Object>set2=new HashSet<>();
        for (int i = 0; i < y; i++) {
            set2.add(in.nextInt());
        }
        int z=in.nextInt();
        for (int i = 0; i < z; i++) {
            set2.add(in.nextInt());
        }
       if(set1.size()==set2.size())
            System.out.println("I become the guy.");
       else
            System.out.println("Oh, my keyboard!");
    }
} 