package com.mycompany.mavenproject3;

import java.util.*;

public class Mavenproject3 {
public static void main (String[] args) {
        Scanner in=new Scanner(System.in);
        int x=in.nextInt();
        int y=in.nextInt();
        int a=-1;
        int length = (int) (Math.log10(y) + 1);
        if(length>x)
            System.out.println(a);
        else{
            System.out.print(y);
            for (int i = 1; i < length; i++) {
                x-=1;
            }
            for (int i = 0; i < x-1; i++) {
                System.out.print("0");
            }
        }
    }
} 