package com.mycompany.mavenproject1;

import java.util.*;

public class Mavenproject1 {
    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x=in.nextInt();
        int []arr=new int[x];
        for (int i = 0; i < x; i++) {
            arr[i]=in.nextInt();
        }
        Set<Integer>set=new TreeSet<>();
        for (int i = 0; i < x; i++) {
            set.add(arr[i]);
        }
        Object[]arr1=set.toArray();
        int []sort=new int[x];
        for (int i = 0; i < x; i++) {
            sort[i]=(int) arr1[i];
        }
        int b=10000;
        int e=10000;
        for (int i = 0; i < x; i++) {
            if(arr[i]!=sort[i]){
                if(b==10000)
                    b=i;
                else
                    e=i;
            }
        }
        int corect=1;
        for (int i = b; i < e; i++) {
            if(arr[i]<arr[i+1]){
                corect=0;
                break;
            }
        }
        if(corect==1){
            System.out.println("yes");
            if(b==10000&&e==10000){
                System.out.println("1 1");
            }else
                System.out.println((b+1)+" "+(e+1));
        }else
            System.out.println("no");
    }
} 