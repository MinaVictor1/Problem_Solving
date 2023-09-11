
package com.mycompany.mavenproject5;

import java.util.*;

public class Mavenproject5 {
    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x=in.nextInt();
        int top=x;//2
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        for (int i = 0; i < x; i++) {
            int q=in.nextInt();
            pq.add(q); //2 1 
            while (!pq.isEmpty()&&pq.peek()==top) {                
                System.out.print(pq.peek());
                System.out.print(" ");
                pq.poll();
                top--;
            }
            System.out.println("");
        }
    }
}
