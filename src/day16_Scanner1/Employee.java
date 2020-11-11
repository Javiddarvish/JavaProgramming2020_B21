package day16_Scanner1;

import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name");
        String name = input.next();

        System.out.println("enter your last name");
        String lastname = input.next();

        System.out.println("are you employed? true or false");
        boolean isEmployed = input.nextBoolean();

        double salary = 0;

        if (isEmployed){
            System.out.println("What is your salary");
            salary = input.nextDouble();
        }
        System.out.println("Full name: "+name+" "+lastname);
        System.out.println("Employed: "+isEmployed);
        System.out.println("Salary: "+salary);









    }
}
