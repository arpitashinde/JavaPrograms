package com.arps;

import java.util.Scanner;

// type casting implicit and explicit
public class Typecasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num = input.nextFloat(); //implicit type casting
        System.out.println(num);

        int a = (int) 67.87f; //explicit typecasting
        System.out.println(a);

    }
}
