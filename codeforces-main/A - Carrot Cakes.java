package com.mycompany.mavenproject3;

//import java.util.*;

import java.util.Scanner;


public class Mavenproject3 { 
public static void main (String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int t=in.nextInt();
    int t1=t;
    int k=in.nextInt();
    int k1=k;
    int d=in.nextInt();
    while (n>k1) {
        t1+=t;
        k1+=k;
    }
    int t2=d+t;
    if(t1>t2)
        System.out.println("YES");
    else
        System.out.println("NO");
  }
} 