package day20_WhileLoop;

import java.util.Scanner;

public class BreakContinue {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i--){

         if (i < 1){
             break;
         }

            System.out.println("Hello Batch 21");
        }

        System.out.println("----------------------------------------");

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i == 0; ) {

            System.out.println("Enter two numbers: ");
            int n1 = scan.nextInt();
            int n2 = scan.nextInt();
            System.out.println("Sum is : " + (n1 * n2));

            System.out.println("Would you like to continue? Yes, No");
            String answer = scan.next();

            if (answer.equalsIgnoreCase("No")){
                System.out.println("Thank you for using out calculator");
                break;
            }
        }





        /*
        1. ask user to enter two numbers and then print the sum of those two numbers
        2. ask the user, would you like to continue ? yes , no
            if answer is yes --> repeat
            if answer is no -->
         */











    }
}
