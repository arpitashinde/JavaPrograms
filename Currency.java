package com.arps;

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter rupees to convert into USD");
        int c = in.nextInt();
        int u = c*71;
        System.out.println("Rupees in USD: " + u);
    }
}
