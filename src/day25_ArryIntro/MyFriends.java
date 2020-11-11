package day25_ArryIntro;

import java.util.Scanner;

public class MyFriends {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How may friends?");
        int number = scan.nextInt();

        String[] firsName = new String[number];
        String[] lastName = new String[number];

        for (int i = 0; i < number;i++){
            System.out.println("Enter first name: ");
           String f = scan.next();
           firsName[i] = f;

            System.out.println("Enter last name");
            String l = scan.next();
            lastName[i] = l;
        }

        for (int i = 0; i < number;i++){
            System.out.println(firsName[i]+" "+lastName[i]);
        }

















    }}
