package com.mycompany.mavenproject2;

import java.util.*;

import java.util.Scanner;


public class Mavenproject2 {
   public static void main(String[] args) {
       Scanner in =new Scanner(System.in);
       int x=in.nextInt();
       String []arr=new String[x];
       int count=0;
       for (int i = 0; i < x; i++) {
           arr[i]=in.next();
       }
       for (int i = 0; i < x; i++) {
           if("Tetrahedron".equals(arr[i]))
               count+=4;
           else if("Cube".equals(arr[i]))
               count+=6;
           else if("Octahedron".equals(arr[i]))
               count+=8;
           else if("Dodecahedron".equals(arr[i]))
               count+=12;
           else
               count+=20;
       }
       System.out.println(count);
   }
}