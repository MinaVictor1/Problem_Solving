package com.mycompany.mavenproject1;

import java.util.*;
 
public class Mavenproject1 {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        for (int i = 0; i < n; i++) {
            int x=in.nextInt();
            String str=in.next();
            int []arr=new int[x];
            for (int j = 0; j < x; j++) {
                arr[j]=2;
            }
            int bol=1;
            for (int j = 0; j < x; j++) {
                if(bol==0)
                    bol=1;
                else
                    bol=0;
                for (int k = j; k < x; k++) {
                    if(arr[k]==2){
                        if(str.charAt(j)==str.charAt(k))
                        arr[k]=bol;
                    }
                }
            }
            int sure=0;
            for (int j = 0; j < x-1; j++) {
                if(arr[j]==arr[j+1])
                    sure=1;
            }
            if(sure==0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}     