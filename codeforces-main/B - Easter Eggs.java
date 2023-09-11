package com.mycompany.mavenproject4;

import java.util.*;

public class Mavenproject4 {
  
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int x=in.nextInt();
        StringBuilder str=new StringBuilder();
        String st="ROYGBIV";
        String c1="G";
        String c2="GB";
        String c3="GBI";
        String c4="GBIV";
        str.append(st);
        x-=7;
        while (x>0) {            
            if(x==1){
                str.append(c1);
                break;
            }
            else if(x==2){
                str.append(c2);
                break;
            }
            else if(x==3){
                str.append(c3);
                break;
            }
            else
                str.append(c4);
            x-=4;
        }
        System.out.println(str);
    }
}
