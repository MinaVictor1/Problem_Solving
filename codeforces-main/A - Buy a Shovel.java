package com.mycompany.mavenproject1;

import java.util.*;

public class Mavenproject1 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k=in.nextInt();
        int x=k;
        int r=in.nextInt();
        int count=1;
        while((k-r)%10!=0&&k%10!=0){
            k+=x;
            count++;
        }
        System.out.println(count);
    } 
}