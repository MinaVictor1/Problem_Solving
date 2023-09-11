
package com.mycompany.mavenproject5;

import java.util.*;
 
public class Mavenproject5 {
    
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int size=in.nextInt();
        long []arr=new long[size];
        for (int i = 0; i < size; i++) {
            arr[i]=in.nextInt();
        }
        Arrays.sort(arr);
        boolean fact=false;
        for (int i = size-1; i >=2 ; i--) {
            if(arr[i]<arr[i-1]+arr[i-2]){
                fact=true;
                break;
            }
        }
        if (fact==true)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
} 
