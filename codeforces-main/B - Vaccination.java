package com.mycompany.mavenproject4;

import java.util.*;
 
public class Mavenproject4 {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        int q=in.nextInt();
        for (int i = 0; i < q; i++) {
            int n=in.nextInt();
            int k=in.nextInt();
            int d=in.nextInt();
            int w=in.nextInt();
            Queue<Integer>que=new LinkedList<Integer>();
            for (int j = 0; j < n; j++) {
                que.add(in.nextInt());
            }
            int first=que.poll() + w;
            int count=1;
            int vac=k-1;
            int fin=first+d;
            for (int j = 0; j < n-1; j++) {//0 1
                if(que.peek()<=fin){
                    if(vac!=0){
                        vac--;
                        que.remove();
                    }else{
                        first=que.poll()+w;
                        vac=k-1;
                        fin=first+d;
                        count++;
                    }
                }else{
                    first=que.poll()+w;
                    vac=k-1;
                    fin=first+d;
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}     