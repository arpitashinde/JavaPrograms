package com.arps;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        System.out.print("enter your name");
       String s = in.next();
        System.out.println("Nice to meet you" + " " + s);
        for (int i=0;i<=10;i+=2){
            System.out.println(i);
        }
    }
}
