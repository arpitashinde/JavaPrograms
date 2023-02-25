package com.arps;

import java.util.Scanner;

public class Tempc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature in Celcius: ");
        float tempc = input.nextFloat();
        float tempf = (tempc * 9/5) +32;
        System.out.println("Temperature in Farhenite is: "+ tempf);
    }
}
