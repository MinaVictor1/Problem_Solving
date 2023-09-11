package com.mycompany.mavenproject1;


//import java.util.Arrays;

import java.util.*;

public class Mavenproject1 {
    
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       long n=in.nextLong();
       long k=in.nextLong();
       long mid=n/2;
       long num;
       if(n%2==0){
           if(k<=mid)
               num=(k*2)-1;
            else
               num=(k-mid)*2;
       }else{
           mid+=1;
           if(k<=mid)
               num=(k*2)-1;
           else
               num=(k-mid)*2;
               
       }
        System.out.println(num);
    }
} 