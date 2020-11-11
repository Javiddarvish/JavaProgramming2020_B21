package day17_String;

import java.util.Scanner;

public class TravelTask {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double cost = 0;

        System.out.println("Do you have a valid passport");
        String validPassport = input.next();

        if (validPassport.equalsIgnoreCase("yes")) {
            cost = 1000;

            System.out.println("Which country do you want to go to");
            input.nextLine(); // accept the enter input
            String county = input.nextLine();

            System.out.println("How mant bags will you have");
            byte bags = input.nextByte();
            cost += (bags * 50);

            System.out.println("How many people are you traveling with");
            short numPeople = input.nextShort();

            if (numPeople >= 3) {
                cost -= 300;
            } else {
                cost -= (numPeople * 100);
            }

            System.out.println("Enter the name of people you will travel with");
           input.nextLine(); // its enter
            
            String namesOfPeople = input.nextLine();


        } else {
            System.out.println("you can't travel");
        }


    }
}
