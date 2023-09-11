package com.mycompany.mavenproject3;

//import java.util.*;

import java.util.Scanner;


public class Mavenproject3 { 
public static void main (String[] args) {
    Scanner in=new Scanner(System.in);
    int x=in.nextInt();
    int y=in.nextInt();
    int z=Math.max(x, y);
    float count=0;
    for (int i = z; i <= 6; i++) {
        count++;
    }
    //System.out.println(count);
    float ans=count/6;
    if(ans==0)
        System.out.println("0/1");
    else if(ans==1)
        System.out.println("1/1");
    else{
        if(count==2)
            System.out.println("1/3");
        else if(count==3)
            System.out.println("1/2");
        else if(count==1)
            System.out.println("1/6");
        else if(count==4)
            System.out.println("2/3");
        else
            System.out.println("5/6");
    }
  }
} 