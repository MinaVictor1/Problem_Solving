package com.mycompany.mavenproject3;

import java.util.*;

import java.util.Scanner;


public class Mavenproject3 {
public static void main (String[] args) {
    Scanner in=new Scanner(System.in);
    String x=in.next();
    char [] arr=new char[x.length()];
    for (int i = 0; i < x.length(); i++) {
        arr[i]=x.charAt(i);
    }
    Arrays.sort(arr);
    System.out.println(" ");
    int y=arr.length/2;
    int z=0;
    char[] arr2=new char[x.length()];
    arr2[0]=arr[y];
    for (int i = 1; i < arr2.length; i++){
        if(i==arr2.length){
            arr2[i]=arr[z];
            break;
        }
        else{
            if(arr2[i-1]=='+'){
                y++;
                arr2[i]=arr[y];
            }else{
                arr2[i]=arr[z];
                z++;
            }
        }
    }
    for (int i = 0; i < arr2.length; i++) {
        System.out.print(arr2[i]);
    }
  }
} 