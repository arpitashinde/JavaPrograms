package Methods;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.next();
        String ans = msg(name);
        System.out.println(ans);
    }

    static String msg(String name){
        String greet = "hello " + name;
        return greet;

    }
}
