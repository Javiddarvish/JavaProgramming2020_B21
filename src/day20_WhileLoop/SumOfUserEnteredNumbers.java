package day20_WhileLoop;

import java.util.Scanner;

public class SumOfUserEnteredNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int times = scan.nextInt();      // how many numbers user wants to enter
        int result = 0;         //  to contain the sum of each user entered number

        for (int i = 1; i <= times; i++) {
            System.out.println("Enter a number: ");
            result += scan.nextInt();       // each user input will be added to result
        }
        System.out.println("Result = " + result);  // if we outside of the parantsis it will add all.



        /* we can use this one too

        System.out.println("Enter a number");
        int n1 = scan.nextInt();

        System.out.println("Enter a number");
        int n2 = scan.nextInt();

        System.out.println("Enter a number");
        int n3 = scan.nextInt();

        System.out.println("Enter a number");
        int n4 = scan.nextInt();

        System.out.println("Enter a number");
        int n5 = scan.nextInt();

      int result = n1 + n2 + n3 + n4 + n5 ;
        System.out.println("Sum: "+result);
*/

    }
}
