package com.mycompany.mavenproject1;

//import java.util.Arrays;

import java.util.*;

public class Mavenproject1 {
    
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int x=in.nextInt();
        int []arr=new int[x];
        for (int i = 0; i < x; i++) {
            arr[i]=in.nextInt();
        }
        int result=1;
        for (int i = 0; i < x; i++) {//0
           int after=0;
           int before=0;
            if(i!=x-1)
                for (int j = i; j < x-1; j++) {//0
                if(arr[j]>=arr[j+1])
                    after++;
                else
                    break;
            }
            if(i!=0)
                for (int j = i; j > 0; j--) {
                    if(arr[j]>=arr[j-1])
                        before++;
                    else
                        break;
                }
            if((after+before)>=result)
                result=after+before+1;
        }
        System.out.println(result);
    }
} 