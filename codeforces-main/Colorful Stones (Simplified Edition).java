package com.mycompany.mavenproject1;

import java.util.*;

public class Mavenproject4 {
    
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String str1=in.next();
        String str2=in.next();
        int count=0;
        for (int i = 0; i < str2.length(); i++) { //0
            if(str1.charAt(count)==str2.charAt(i)){
                count++;
            }
        }
        System.out.println(count+1);
    }
}