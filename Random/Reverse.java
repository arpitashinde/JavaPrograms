package com.arps;

public class Reverse {
    public static void main(String[] args) {
        int i = 34;
        int rev = 0;

        while(i>0){
            int rem = i%10;
            i /= 10;
            rev = rev* 10 +rem;

        }
        System.out.println(rev);
    }
}
