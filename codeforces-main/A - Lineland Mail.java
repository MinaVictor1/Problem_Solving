package com.mycompany.mavenproject3;

//import java.util.*;

import java.util.Scanner;


public class Mavenproject3 {
public static void main (String[] args) {
    Scanner in=new Scanner(System.in);
    int z=in.nextInt();
    int[]arr=new int[z];
    int[]arr2=new int[z*2];
    for (int i = 0; i < z; i++) {
        arr[i]=in.nextInt();
    }    
    int spa=-1;
    for (int i = 0; i < arr.length; i++) {
        int short_path=0;
        int long_path=0;
        if(i==0){
            short_path=arr[1]-arr[0];
            long_path=arr[z-1]-arr[0];
            spa++;
            arr2[spa]=short_path;
            spa++;
            arr2[spa]=long_path;
        }else if(i==(z-1)){
            short_path=arr[z-1]-arr[z-2];
            long_path=arr[z-1]-arr[0];
            spa++;
            arr2[spa]=short_path;
            spa++;
            arr2[spa]=long_path;
        }else{
            short_path=Math.min((arr[i]-arr[i-1]), (arr[i+1]-arr[i]));
            long_path=Math.max(arr[z-1]-arr[i], arr[i]-arr[0]);
            spa++;
            arr2[spa]=short_path;
            spa++;
            arr2[spa]=long_path;
        }
    }
    for (int i = 0; i < arr2.length; i=i+2) {
        System.out.println(arr2[i]+" "+arr2[i+1]);
    }
  }
} 