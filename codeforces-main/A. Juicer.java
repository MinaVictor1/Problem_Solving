package com.mycompany.mavenproject3;

//import java.util.*;

import java.util.Scanner;


public class Mavenproject3 { 
public static void main (String[] args) {
    Scanner in=new Scanner(System.in);
    int x=in.nextInt();
    int y=in.nextInt();
    int z=in.nextInt();
    int []arr=new int[x];
    for (int i = 0; i < x; i++) {
        arr[i]=in.nextInt();
    }
    int waste=0;
    int count=0;
    for (int i = 0; i < x; i++) {
        if(arr[i]>y){}
        else{
            waste+=arr[i];
            if(waste>z){
               count++;
               waste=0;
                }   
            }   
        }
    System.out.println(count);
    }
} 