package Methods;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
       //int ans= sum2();
       // System.out.println(ans);
        sum2();
        greet();
    }

    static void greet(){
        System.out.println("Konnichiwa!!");
    }

    //using void as return type cause this func doesnt return anything it prints sum
    static void sum(){
        Scanner in = new Scanner(System.in);
        int num1, num2, sum;
        System.out.print("Enter No 1: ");
        num1 = in.nextInt();
        System.out.print("Enter No 2: ");
        num2 = in.nextInt();
        sum = num1+num2;
        System.out.println("The sum is: "+ sum);

    }
    //using int as return type
    static int sum2(){
        Scanner in = new Scanner(System.in);
        int num1, num2, sum;
        System.out.print("Enter No 1: ");
        num1 = in.nextInt();
        System.out.print("Enter No 2: ");
        num2 = in.nextInt();
        sum = num1+num2;
        return sum;
    }
}
