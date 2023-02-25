package com.arps;

import java.util.Objects;
import java.util.Scanner;

public class Calci {
    public static void main(String[] args) {
        System.out.println("Select an Operation to Perform:+,-,/,*");
        Scanner in = new Scanner(System.in);
        String c = in.next();
        System.out.println("Enter 1st no");
        int a = in.nextInt();
        System.out.println("Enter 2nd no");
        int b = in.nextInt();

        if(c.equals("+")){
            System.out.println(a+b);
        } else if (c.equals("-")) {
            System.out.println(a-b);
        }else if(c.equals("*")){
            System.out.println(a*b);
        }else if(c.equals("/")){
            System.out.println(a/b);
        } else {
            System.out.println("Please enter valid input");
        }
    }
}
