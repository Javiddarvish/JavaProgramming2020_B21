package day16_Scanner1;

import java.util.Scanner;

public class AllOfYourPersonalInfo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int points = 0;


        System.out.println("How many people do you live with");
        byte liveWithNumber = input.nextByte();

        if (liveWithNumber > 0 && liveWithNumber <= 12) {

            if (liveWithNumber <= 12) {
                points += 2;

            } else if (liveWithNumber > 2 && liveWithNumber < 7) {
                points += 3;
            }

        } else {
            System.out.println("not a valid number of people");
        }


    }
}
