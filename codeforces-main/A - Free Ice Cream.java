package com.mycompany.mavenproject3;

//import java.util.*;

import java.util.Scanner;


public class Mavenproject3 { 
public static void main (String[] args) {
    Scanner in=new Scanner(System.in);
    int x=in.nextInt();
    long y=in.nextInt();
    int count=0;
    for (int i = 0; i < x; i++) {
        char q=in.next().charAt(0);
        long z=in.nextInt();
        if(q=='-'){
            if(y>=z)
                y-=z;
            else
                count++;
        }else{
            y+=z;
        }
    }
    System.out.println(y+" "+count);
  }
} 