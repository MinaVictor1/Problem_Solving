package com.mycompany.mavenproject4;

import java.util.*;

public class Mavenproject4 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x=in.nextInt();
        int y=in.nextInt();
        int count=0;
        int []arr=new int[x+1];
        for (int i = 1; i <= x; i++) {
            arr[i]=in.nextInt();
            count+=arr[i];
        }
        for (int i = 1; i < y && i<= x-y; i++) {
            if(arr[y+i]+arr[y-i]==1){
                count--;
            }
        }
        System.out.println(count);
    }
}
