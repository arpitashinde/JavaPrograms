package com.arps;

import java.util.Scanner;

public class Greater {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if (a>b){
            if (a>c){
                System.out.println("A is greater");
            }
        } else if (b>c) {
            System.out.println("B is greater");
        }else{
            System.out.println("C is greater");
        }
    }
}
