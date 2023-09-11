package com.mycompany.mavenproject3;

import java.util.*;

public class Mavenproject3 {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	char[][] arr = new char[4][4];
	for(int i=0;i<4;i++)
            arr[i] = in.next().toCharArray();
        int a;
        int b;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                a=0;
                b=0;
                if(arr[i][j]=='.') a++;
                else b++;
                if(arr[i][j+1]=='.') a++;
                else b++;
                if(arr[i+1][j]=='.') a++;
                else b++;
                if(arr[i+1][j+1]=='.') a++;
                else b++;
                
                if(a>2||b>2){
                    System.out.println("YES");
                    return;
                }
            }
        }
        System.out.println("NO");
    }
}
