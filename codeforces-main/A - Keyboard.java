package com.mycompany.mavenproject2;

import java.util.*;

import java.util.Scanner;


public class Mavenproject2 {
   public static void main(String[] args) {
       Scanner in =new Scanner(System.in);
       ArrayList<Character> arr=new ArrayList<>();
       arr.add('q');arr.add('w');arr.add('e');arr.add('r');arr.add('t');arr.add('y');arr.add('u');arr.add('i');arr.add('o');arr.add('p');arr.add('[');
       arr.add('a');arr.add('s');arr.add('d');arr.add('f');arr.add('g');arr.add('h');arr.add('j');arr.add('k');arr.add('l');arr.add(';');arr.add('z');
       arr.add('x');arr.add('c');arr.add('v');arr.add('b');arr.add('n');arr.add('m');arr.add(',');arr.add('.');arr.add('/');
       String cha=in.next();
       String str=in.next();
       if(cha.equals("R")){
           for (int i = 0; i < str.length(); i++) {
               System.out.print(arr.get(arr.indexOf(str.charAt(i))-1));
           }
       }else{
           for (int i = 0; i < str.length(); i++) {
               System.out.print(arr.get(arr.indexOf(str.charAt(i))+1));
           }
       }
   }
}