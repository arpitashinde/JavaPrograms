package com.arps;

public class Loops {
    public static void main(String[] args) {
        /*
--------> while loop - used when you don't know how many times the loop is going to run

            Syntax for ----- While loop -----
            initialization;
            while(condition){
                //body
                incrementation
                }
  */
        int count = 0;
        while(count !=5){
            System.out.println(count);
            count++;
        }
 /*
-------->for loop - used when you know how many times the loop is gonna run
            Syntax for ------ for loop -------
            for(initialisation;condition;increment/decrement){
                    //body...
 */

        for(count=0; count != 20;count+=2){
            System.out.println(count);
        }
    /*
    ---------> Do while loop
    Syntax for ------ do while loop ------

    initialize;
    do{
        //body
        }while(condition);
     */

        int num = 1;
        do{
            System.out.println("hey there");
            num++;
        }while(num!=11);
    }

}
