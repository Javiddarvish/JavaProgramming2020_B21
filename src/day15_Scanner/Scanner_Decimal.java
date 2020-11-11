package day15_Scanner;

import java.util.Scanner;

public class Scanner_Decimal {
    public static void main(String[] args) {

        Scanner decimal = new Scanner(System.in);
        System.out.println("enter a float number");
        float floatNumber = decimal.nextFloat();
        System.out.println("number is: " + floatNumber);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");

        System.out.println("Enter a double number");
        double doubleNumber = decimal.nextDouble();
        System.out.println("Number is: "+doubleNumber);

        System.out.println("=================================================");

        System.out.println(decimal.nextDouble() + decimal.nextDouble() ); // it will add inside the box
        System.out.println("good job");

    }
}
