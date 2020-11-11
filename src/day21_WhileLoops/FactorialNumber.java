package day21_WhileLoops;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);    // We can use Scanner too
        System.out.println("Enter a number: ");
        int num = scan.nextInt();     // int num = 3;      We can use this one too

        int result = 1;
        // 3: 3 * 2 * 1
        // 4: 4 * 3 * 2 * 1
        // 5: 5 * 4 * 3 * 2 * 1

        for (int i = num; i >= 1; i--){
            result *= i;
        }
        System.out.println("result = "+result);









    }
}
/*
  2.  Write a program that can return the factorial number of any given number
            Ex:
                input: 5
                output: 120  ( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
 */