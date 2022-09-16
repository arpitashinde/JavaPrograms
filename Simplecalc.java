package com.arps;

import java.util.Objects;
import java.util.Scanner;

public class Simplecalc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("select operation: +,-,*,/");
        String c = in.next();
        //System.out.println(in.next());

        if(Objects.equals(c, "+")){
            System.out.println(a+b);
        } else if (Objects.equals(c, "-")) {
            System.out.println(a-b);
        }else if(Objects.equals(c, "*")){
            System.out.println(a*b);
        }else if(Objects.equals(c, "/")){
            System.out.println(a/b);
        } else {
            System.out.println("Please enter valid input");
        }


}
}
