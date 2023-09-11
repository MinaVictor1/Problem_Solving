package com.mycompany.mavenproject2;
import java.util.*;

public class Mavenproject2 {

   public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       int x=in.nextInt();
       int y=in.nextInt();
       int count=0;
       if(x>y)
           System.out.println("0");
       while(x<=y){
           x*=3;
           y*=2;
           count++;
       }
       System.out.println(count);
      }  
}