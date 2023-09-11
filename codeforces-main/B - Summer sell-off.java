package com.mycompany.mavenproject4;

import java.util.*;

public class Mavenproject4 {
    
  
    public static void main(String[] args) {
       Scanner in =new Scanner(System.in);
       int num=in.nextInt();
       int day=in.nextInt();
       long sum=0;
       int []arr=new int[num];
       for (int i = 0; i < num; i++) {
          int j=in.nextInt();
          int k=in.nextInt();
          sum+=Math.min(j, k);
          if(k>j){
              arr[i]=Math.min(2*j, k)-Math.min(j, k);
          }
       }
        Arrays.sort(arr);
        int[] arrDesc = Arrays.stream(arr).boxed()
        .sorted(Collections.reverseOrder())
        .mapToInt(Integer::intValue)
        .toArray();
        for (int i = 0; i < day; i++) {
            if(i>day){
                break;
            }else
            sum+=arrDesc[i];
        }
        System.out.println(sum);
    }
}
