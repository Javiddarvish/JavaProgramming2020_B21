package day18_String;

import java.util.Scanner;

public class StringPractice2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an Apple product name");
        String product = scan.nextLine(); // mAC book
        product = product.replace(" ", "").toLowerCase();

        switch (product) {
            case "macbook":
                System.out.println("Which model MacBook would you like");
                String model = scan.nextLine();
                if (model.equalsIgnoreCase("air")) {
                    System.out.println("MacBook Air is $2400");
                } else if (model.equalsIgnoreCase("pro")) {
                    System.out.println("MacBook pro is $2500");
                } else {
                    System.out.println("Invalid Model for MacBook");
                }
                break;


            case "iphone":
                System.out.println("Which model Iphone would you like");
                String model2 = scan.nextLine().toLowerCase();
                if (model2.equals("12")) {
                    System.out.println("Iphone 12 is $1000");
                } else if (model2.equals("11")) {
                    System.out.println("Iphone 11 is $900");
                } else if (model2.equals("10")) {
                    System.out.println("Iphone 10 is $600");
                } else {
                    System.out.println("Invalid Iphone");
                }
                break;


            case "ipad":
                System.out.println("Which model Ipad would you like");
                String model3 = scan.nextLine().toLowerCase();

                switch (model3) {

                    case "air":
                        System.out.println("ipad air is $400");
                        break;

                    case "mini":
                        System.out.println("ipad mini is $300");
                        break;

                    case "pro":
                        System.out.println("ipad air is $200");
                        break;

                    default:
                        System.err.println("Invalid model for iPad");
                }

            default:
                System.err.println("Invalid Product name");
        }



    }
}
/*
    MacBook:
        air: 2400
        pro: 2500
    Iphone:
        12: 1000
        11: 900
        10: 800
        8: 700
    Ipad:
        air: 500
        mini: 400
        pro: 300
 */