package com.arps;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your salary:");
        int sal = input.nextInt();
        //int sal = 20000;
        if (sal>10000){
            System.out.println("No bonus");
        } else if (sal<10000){
            System.out.println("You'll get Bonus");
        }else{
            System.out.println("none");
        }
    }
}
