package com.mycompany.mavenproject1;

import java.util.*;

public class Mavenproject1 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x=in.nextInt();
        int []y=new int[x];
        for (int i = 0; i < x; i++) {
            y[i]=in.nextInt();
        }
        Arrays.sort(y);
        for (int i = 0; i < x; i++) {
            System.out.print(y[i]+" ");
        }
    } 
}