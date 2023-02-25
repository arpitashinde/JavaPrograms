package com.arps;

import java.util.Scanner;

public class temp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if (a > b) {
            if (a > c) {
                System.out.println("A is Greater");
            }
        } else if (b > c) {
            System.out.println("B is Greater");
        } else {
            System.out.println("C is Greater");
        }
    }
}



