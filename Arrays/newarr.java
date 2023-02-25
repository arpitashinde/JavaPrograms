package Arrayprograms;

import java.util.Arrays;
import java.util.Scanner;

public class newarr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //array for primitives
        int[] rollno = {1,2,3,4,5};
        System.out.println(Arrays.toString(rollno));
//
    //array for objects:
        String[] str = new String[3];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
