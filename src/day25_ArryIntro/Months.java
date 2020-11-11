package day25_ArryIntro;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September",
       //                   0           1           2       3        4      5       6         7         8
        "October", "November", "December"};
        // 9            10          11
        System.out.println("Enter the number");
        int num = scan.nextInt(); //1

        System.out.println(month[num-1]);













    }}
