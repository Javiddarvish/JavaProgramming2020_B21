package day16_Scanner1;

import java.util.Scanner;

public class Scanner_NextLine {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

        System.out.println("Enter your Address");
        String address = input.nextLine();

        System.out.println("Address: "+address);

        System.out.println("=====================================================");


        System.out.println("Enter your age");
        int age = input.nextInt();

        input.nextLine(); // the purpose of this is to accept the enter key

        System.out.println("enter your full name");
        String fullname = input.nextLine();

        System.out.println("Name: "+fullname);
        System.out.println("Age: "+age);




    }}
