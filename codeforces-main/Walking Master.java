package com.mycompany.mavenproject1;

import java.util.*;

public class Mavenproject1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        for (int i = 0; i < n; i++) {
            int x=in.nextInt();
            int y=in.nextInt();
            int a=in.nextInt();
            int b=in.nextInt();
            int ans=0;
            if(y>b)
                ans=-1;
            else{
                ans=b-y;
                x+=ans;
                if(x<a)
                    ans=-1;
                else{
                    ans+=x-a;
                }
            }
            System.out.println(ans);
        }
    }
}     