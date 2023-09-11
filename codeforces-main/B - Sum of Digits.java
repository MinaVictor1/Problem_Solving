package com.mycompany.mavenproject4;

import java.util.*;

public class Mavenproject4 {

    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
        String str=in.next();
        int count=0;
        int num;
        while(str.length()>1){
            num=0;
            for (int i = 0; i < str.length(); i++) {
                num+=str.charAt(i)-'0';
            }
            str=num+"";
            count++;
        }
        System.out.println(count);
    }
}
