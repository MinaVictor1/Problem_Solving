package com.mycompany.mavenproject1;

import java.util.*;

public class Mavenproject1 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x=in.nextInt();
        x++;
        int y=in.nextInt();
        int []arr=new int[x];
        arr[0]=0;
        for (int i = 1; i < x; i++) {
            arr[i]=in.nextInt();
            arr[i]+=arr[i-1];
        }
        System.out.println(Arrays.toString(arr));
        int small=90000000;
        int index=1;
        for (int i = y; i < x; i++) {
            if((arr[i]-arr[i-y])<small){
                index=i;
                small=arr[i]-arr[i-y];
            }
        }
        System.out.println(index);
    }
} 