package com.mycompany.mavenproject1;


//import java.util.Arrays;

import java.util.*;

public class Mavenproject1 {
    
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       int x=in.nextInt();
       int y=in.nextInt();
       String[][] arr = new String[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                arr[i][j]=in.next();
            }
        }
        int count=0;
         for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if("C".equals(arr[i][j])||"M".equals(arr[i][j])||"Y".equals(arr[i][j]))
                    count++;
            }
         }
         if(count>0)
             System.out.println("#Color");
         else
             System.out.println("#Black&White");
    }
} 