package com.mycompany.mavenproject2;

import java.util.*;

import java.util.Scanner;


public class Mavenproject2 {
   public static void main(String[] args) {
       Scanner in =new Scanner(System.in);
       int x=in.nextInt();
       int []arr=new int[x];
       int count=0;//0
       int count1=0;//6
       int count2=0;//0
       for (int i = 0; i < x; i++) {
           arr[i]=in.nextInt();
       }
       Arrays.sort(arr);
       for (int i = 0; i < x; i++) {
           count1+=arr[i];
       }
       for (int i = x-1; i >= 0; i--) {
           if(count2<=count1){
               count++;
               count1-=arr[i];
               count2+=arr[i];
           }
           else
               break;
       }
       System.out.println(count);
   }
}