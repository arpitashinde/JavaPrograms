package Arrayprograms;
import java.util.Arrays;
import java.util.Scanner;

public class New {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         /*
    syntax of array:
    data type[] variable_name = new datatype [size]
     */
        int[] rnos = new int[5];
        System.out.println(rnos[3]);

        /*
        datatype[] variable_name = {data}
         */

        String[] arr = {"aaron","adam","atlas"};
        System.out.println(arr[2]);


        String[] str = new String[5];
        for (int i=0; i< arr.length;i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
    }


}
