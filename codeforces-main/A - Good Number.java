package com.mycompany.mavenproject3;

import java.util.*;

public class Mavenproject3 {
public static void main (String[] args) {
        Scanner in =new Scanner(System.in);
       int x=in.nextInt();
       int k=in.nextInt();
       int count1=0;
       for (int i = 0; i < x; i++) {
           String str=in.next();
           HashSet<Integer> map = new HashSet<>();
           int count=0;
           for (int j = 0; j < str.length(); j++) {
               int z=Character.getNumericValue(str.charAt(j));
               map.add(z);
           }
           for (int j = 0; j <=k; j++) {
               if(map.contains(j))
                   count++;
           }
           if(count==k+1)
               count1++;
       }
       System.out.println(count1);
    }
} 
