package com.arps;

import java.util.Scanner;

public class Evenodd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();

        if (num%2==0){
            System.out.println("Number is even");
        } else{
            System.out.println("Number is odd");
        }

    }
}
