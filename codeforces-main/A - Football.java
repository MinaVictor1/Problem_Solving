package com.mycompany.mavenproject1;


//import java.util.Arrays;

import java.util.*;

public class Mavenproject1 {
    
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       int x=in.nextInt();
       String []arr=new String[x];
       int []arr1=new int[x];
        for (int i = 0; i < x; i++) {
            arr[i]=in.next();
        }
        for (int i = 0; i < x; i++) {
            arr1[i]=1;
        }
        for (int i = 0; i < x-1; i++) {
            for (int j = i+1; j < x; j++) {
                if(arr[i].equals(arr[j]))
                    arr1[i]++;
            }
        }
         int max=0;
         for (int i = 0; i < x; i++) {
             if (arr1[i]>arr1[max]) {
                 max=i;
             }
        }
         System.out.println(arr[max]);
    }
} 