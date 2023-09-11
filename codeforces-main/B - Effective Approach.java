package com.mycompany.mavenproject1;

//import java.util.Arrays;

import java.util.*;

public class Mavenproject1 {
    
    public static void main(String[] args) {
       Scanner in =new Scanner(System.in);
        int x=in.nextInt();//2
        int []arr1=new int[100005];//[1,2]
        long count1 = 0;
        long count2 = 0;
        for (int i = 0; i < x; i++) {
            int y=in.nextInt();
            arr1[y]=i+1;//[0,1,2]
        }
        int z=in.nextInt();
        for (int i = 0; i < z; i++) {
            int h=in.nextInt();
            count1+=arr1[h];
            count2+=(x-arr1[h]+1);
        }
        System.out.println(count1+" "+count2);
    }
} 