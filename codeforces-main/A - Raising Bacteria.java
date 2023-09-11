package com.mycompany.mavenproject1;
//import java.util.Arrays;

import java.util.Scanner;


public class Mavenproject1 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x=in.nextInt();
        int count=0;
        while(x!=0){
            if(x%2==0){
                x/=2;
            }
            else{
                count++;
                x/=2;
            }
        }
        System.out.println(count);
    } 
}