package Office_Hours;

import java.util.Scanner;

public class ScannerPractice2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the price");
        double price = scan.nextDouble();
        System.out.println("Price: " + price);

        System.out.println("Enter the name of the item: ");
        String item = scan.next();
        System.out.println("Item: " + item);

        scan.nextLine(); // EnterEnter
        // we need this extra nextLine whenever we are using nextLine() method after other Scanner.

        System.out.println("Enter your full name: ");
        String fullName = scan.nextLine();
        System.out.println("Full Name: "+fullName);

        scan.close();
    }
}
