package day21_WhileLoops;

import java.util.Scanner;

public class StringPractice1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine(); // "Java"


        int lastIndex = word.length() - 1;
        char f = word.charAt(0);
        char l = word.charAt(lastIndex);

        System.out.println("" + f + l);   // type just empty ("" String ) it will give you comcatinion. without "" it will give number

        String r1 = "Batch" + 2 + 1;
//                 "Batch 2" +1

        System.out.println(r1);


        System.out.println("---------------------------------------------------------");

        while(true) {


            System.out.println("Enter the buildingNumber: ");
            String buildingNumber = scan.next();

            scan.nextLine();  // it works only for enter

            System.out.println("Enter Street address: ");
            String address = scan.nextLine();

            System.out.println("Enter Apartment Number: ");
            String aptNum = scan.next();

            scan.nextLine(); // empty enter

            System.out.println("Enter the City: ");
            String city = scan.nextLine();

            System.out.println("Enter the State");
            String state = scan.nextLine();

            System.out.println("Enter the Zipcode");
            int zip = scan.nextInt();


            String fullAddress = buildingNumber + " " + address + ", Apt# " + aptNum + ", " + city + "\n" + state + ", " + zip;
            System.out.println(fullAddress);

            System.out.println("would you like to continue? Yes, no");
            String answer = scan.next().toLowerCase();

            if (answer.equalsIgnoreCase("no"));
            System.out.println("Thanks");
            break;
        }

        // String building Number ( next() )
        // String street ( nextLine() )
        // String ApartmentNumber;
        // String city ( nextLine) )
        // String state ( nextLine) )
        // Int zipcode ( nextInt) )


    }
}
