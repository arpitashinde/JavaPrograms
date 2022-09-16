package com.arps;

import java.util.Scanner;

public class SwitchCases {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        switch (fruit){
            case "Mango":
                System.out.println("I dont like it");
                break;

            case "Apple":
                System.out.println("keeps dr away-----");
                break;
            default:
                System.out.println("Zop ja jaun");
        }

       // switch (fruit){
       //     case "Mango" -> System.out.println("Nahi aavdat tr");
        //    case "apple" -> System.out.println("Nahi aavdat tr");
        //     case "Mango" -> System.out.println("Nahi aavdat tr");
        //     }

        int num = in.nextInt();

        switch (num){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("weekday it is");
            case 6:
            case 7:
                System.out.println("yay its weekend ;D");
        }
    }
}
