package com.mycompany.mavenproject1;

import java.util.*;

public class Mavenproject1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        int n=in.nextInt();
        for (int i = 0; i < n; i++) {
            int x=Math.abs(in.nextInt());
            int y=Math.abs(in.nextInt());
            int res=0;
            if(x==y){
                res=x*2;
            }else{
                int min=Math.min(x, y);
                int max=Math.max(x, y);
                res=min*2;
                int diff=max-min;
                res++;
                diff--;
                res+=(diff*2);
            }
            System.out.println(res);
        }
    }
}