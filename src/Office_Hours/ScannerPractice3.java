package Office_Hours;

import java.util.Scanner;

public class ScannerPractice3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Gender: ");
        String Gender = scan.next();
        System.out.println("Gender: "+Gender);

        System.out.println("Enter the age: ");
        int age = scan.nextInt();
        System.out.println("Age: "+age);

        scan.nextLine();

        System.out.println("what is Full Name");
        String name = scan.nextLine();
        System.out.println("Full Name: "+name);

        System.out.println("What is zip");
        int zip = scan.nextInt();
        System.out.println("Zip: "+zip);

        System.out.println("What country");
        String country = scan.next();
        System.out.println("Country: "+country);

        System.out.println("what is your salary");
        double salary = scan.nextDouble();
        System.out.println("Salary: "+salary );

        scan.nextLine();

        System.out.println("Company");
        String company = scan.nextLine();
        System.out.println("Company: "+company);

        System.out.println("Address");
        String address = scan.nextLine();
        System.out.println("Address: "+address);
    }
}
