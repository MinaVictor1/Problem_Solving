package com.mycompany.mavenproject3;

import java.util.*;

public class Mavenproject3 {
public static void main (String[] args) {
    Scanner in=new Scanner(System.in);
    int x=in.nextInt();
    int []arr=new int[x];
    int count=0;
    for (int i = 0; i < x; i++) {
        arr[i]=in.nextInt();
    }
    Arrays.sort(arr);
    for (int i = 1; i < x-1; i++) {
        if(arr[i]>arr[0]&&arr[i]<arr[x-1])
            count++;
        }
        System.out.println(count);
    }
} 