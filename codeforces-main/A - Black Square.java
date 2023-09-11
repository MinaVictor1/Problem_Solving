package com.mycompany.mavenproject2;

import java.util.*;

public class Mavenproject2 {
   public static void main(String[] args) {
     Scanner in =new Scanner(System.in);
     int count=0;// 1  3 6 8 9 13
     int []arr=new int[4];
       for (int i = 0; i < 4; i++) {
           arr[i]=in.nextInt();
       }
       String s=in.next();
       char[] arr1 =s.toCharArray();
       for (int i = 0; i < arr1.length; i++) {
           switch (arr1[i]) {
               case '1' -> count+=arr[0];
               case '2' -> count+=arr[1];
               case '3' -> count+=arr[2];
               case '4' -> count+=arr[3];
           }
       }
       System.out.println(count);
   }
}