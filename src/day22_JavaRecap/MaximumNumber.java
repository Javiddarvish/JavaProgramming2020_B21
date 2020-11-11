package day22_JavaRecap;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int max = -999999999;
// this codes are giving you the greater number than -9999999999

        for (int i =1; i <= 5; i++){
            System.out.println("Enter a number: ");
            int n = scan.nextInt();  // -1 , 3, 4, 5 ....

            if (n > max){
                max = n;
            }

        }
        System.out.println(max);




















    }
}
