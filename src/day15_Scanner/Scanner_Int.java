package day15_Scanner;

import java.util.Scanner;

public class Scanner_Int {
    public static void main(String[] args) {


        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter number one:"); // message
        int numOne = scanner.nextInt();  // reading an int number


        System.out.println("enter number two:");
        int numTwo = scanner.nextInt();  // reading an int number

        System.out.println("enter num 3");
        int num3 = scanner.nextInt();

        System.out.println("Number one: "+numOne);
        System.out.println("Number two: "+numTwo);
        System.out.println("NUMBER THREE: "+num3);
        System.out.println("Sum "+(numOne+numTwo+num3));











    }}
