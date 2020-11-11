package day22_JavaRecap;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int min = 100;

        for (int i =1; i <= 5; i++){
            System.out.println("Enter the number: ");
            int n = scan.nextInt();

            if (n < min){
                min = n;
            }
        }
        System.out.println(min);














    }
}
