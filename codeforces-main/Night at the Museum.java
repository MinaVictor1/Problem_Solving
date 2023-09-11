package com.mycompany.mavenproject1;

import java.util.*;

public class Mavenproject4 {
    
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String x=in.next();
        int count=0;
        int begin=0;
        for (int i = 0; i < x.length(); i++) {
            int index=x.charAt(i)-97;
            int move=Math.abs(index-begin);
            if(move <= 13)
                count+=move;
            else
                count+=26-move;
            begin=index;
        } 
        System.out.println(count);
    }
}