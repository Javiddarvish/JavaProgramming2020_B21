package day22_JavaRecap;

import java.util.Scanner;

public class divideTwoNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        scan.close(); // you can close it if you want

        int count = 0;

        while (a >= b){  // while is for repating
            a -= b;
            count++;
        }
        System.out.println(count+" with a remainder of "+a);















    }
}
/*
 4. write a program that can divide two numbers without using / & % operators and retuns the devision and remainder
            ex:
                input:  10
                        3
                0utput:
                        3 with a remainder of 1
                10 / 3 = 3.3333....
                10 - 3 = 7
                7 - 3 = 4
                4 - 3 = 1
                3 times subtraction, numerator at the end is 1
 */