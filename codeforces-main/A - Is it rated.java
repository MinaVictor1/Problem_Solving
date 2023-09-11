package com.mycompany.mavenproject3;

import java.util.*;

public class Mavenproject3 {
public static void main (String[] args) {
        Scanner in=new Scanner(System.in);
        int x=in.nextInt();
        int []arr1=new int[x];
        int []arr2=new int[x];
        int count1=0;
        int count2=0;
        for (int i = 0; i < x; i++) {
            arr1[i]=in.nextInt();
            arr2[i]=in.nextInt();
        }
        for (int i = 0; i < x; i++) {
            if(arr1[i]!=arr2[i])
                count1++;
        }
        if(count1>0)
            System.out.println("rated");
        else{
            for (int i = 0; i < x-1; i++) {
                if(arr1[i]>=arr1[i+1]){}
                else{
                    count2++;
                }
            }
            if(count2>0)
                System.out.println("unrated");
            else
                System.out.println("maybe");
        }
    }
} 