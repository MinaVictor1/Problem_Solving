package com.mycompany.mavenproject4;

import java.util.*;

public class Mavenproject4 {
  
    public static void main(String[] args) {
       Scanner in =new Scanner(System.in);
       int x=in.nextInt();
       int y=in.nextInt();
       char ch=in.next().charAt(0);
       HashSet<Character>set=new HashSet<>();
       char[][]arr=new char[x][y];
        for (int i = 0; i < x; i++) {
            String str=in.next();
            for (int j = 0; j < y; j++) {
                arr[i][j]=str.charAt(j);
            }
        }
        for (int i = 0; i < x; i++) {//0
            for (int j = 0; j < y; j++) {//1
                if(arr[i][j]==ch){
                    try {
                        if(arr[i+1][j]!='.'&&arr[i+1][j]!=ch)
                            set.add(arr[i+1][j]);
                    } catch (Exception e) {
                    }
                    try {
                        if(arr[i-1][j]!='.'&&arr[i-1][j]!=ch)
                            set.add(arr[i-1][j]);
                    } catch (Exception e) {
                    }try {
                        if(arr[i][j+1]!='.'&&arr[i][j+1]!=ch)
                            set.add(arr[i][j+1]);
                    } catch (Exception e) {
                    }try {
                        if(arr[i][j-1]!='.'&&arr[i][j-1]!=ch)
                            set.add(arr[i][j-1]);
                    } catch (Exception e) {
                    }
                }
            }
        }
        System.out.println(set);
    }
}
