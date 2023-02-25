package com.arps;

import java.util.Scanner;

public class Or {
    // Java code to illustrate
// logical OR operator
        public static void main(String[] args)
        {
            // initializing variables
            Scanner input = new Scanner(System.in) ;
            System.out.println("Enter the password: ");
            String pw = input.nextLine();
            String a = "Arps";
            String b = "arps";


            if (pw.equals(a) || pw.equals(b))
                System.out.println("Correct");
            else
                System.out.println("chukla...");
        }
    }
