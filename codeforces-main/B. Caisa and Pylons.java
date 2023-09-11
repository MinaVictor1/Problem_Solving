package com.mycompany.mavenproject4;

import java.util.*;

public class Mavenproject4 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        n+=1;
        int []arr=new int[n];
        arr[0]=0;
        for (int i = 1; i < n; i++) {
            arr[i]=in.nextInt();
        }
        int energy=0;  
        int dollar=0;
        for (int i = 0; i < n-1; i++) {
            if(energy<0)
                energy=0;
            if(arr[i]<arr[i+1]){
                if((arr[i+1]-arr[i])>energy){
                    dollar+=((arr[i+1]-arr[i])-energy);
                    energy-=arr[i+1]-arr[i];
                }
                else{
                    energy-=(arr[i+1]-arr[i]);
                }       
            }else{
                energy+=arr[i]-arr[i+1];
            }
        }
        System.out.println(dollar);
    }
}
