package com.mycompany.mavenproject1;
//import java.util.Arrays;

import java.util.Scanner;


public class Mavenproject1 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x=in.nextInt();
        int []arr=new int[x];
        int count=0;//2
        int bank=0;
        for(int i=0;i<x;i++){
            arr[i]=in.nextInt();
        }
        for(int i=0;i<x;i++){//
          if(arr[i]>-1){
              bank+=arr[i];
          }else if(arr[i]==-1){
              if(bank>0){
                  bank--;
              }else if(bank==0){
                  count++;
              }
          }
        }
        System.out.println(count);
    } 
}