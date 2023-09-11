package com.mycompany.mavenproject3;

import java.util.*;

public class Mavenproject3 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int x =in.nextInt();
        int [] arr=new int[x];
        int count=1;
        int l=0;
        int r=arr.length-1;
        int s=0;
        int d=0;
        for (int i = 0; i < x; i++) {
            arr[i]=in.nextInt();
        }
        while (r>=l) {            
            if(count%2!=0){
                if(arr[l]>arr[r]){
                    s+=arr[l];
                    l++;
                }else{
                    s+=arr[r];
                    r--;
                }
                count++;
            }else{
                if(arr[l]>arr[r]){
                    d+=arr[l];
                    l++;
                }else{
                    d+=arr[r];
                    r--;
                }
                count++;
            }
        }
        System.out.println(s+" "+d);
    }
}
