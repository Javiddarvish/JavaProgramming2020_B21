package day22_JavaRecap;

import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {

        String sentence = "My name is Javid";

        String name1 = sentence.substring(11, sentence.length());
        System.out.println(name1);

        String name2 = sentence.substring(11);
        System.out.println(name2);

        String str1 = "Monday is cool, it's a a fun day";
        //             0123456
        String day1 = str1.substring(0, 6);
        System.out.println(day1);

        String day2 = str1.substring(0, str1.indexOf("is")); // in " " inside of the space we can but the end or last word
        System.out.println(day2);

        String s1 = "www.amazon.com";
        String domain = s1.substring(s1.lastIndexOf(".")+1);  // if you don't want to see the (.) add +1 after first )
        System.out.println(domain);

        String name = s1.substring(s1.indexOf(".")+1,s1.lastIndexOf("."));  // amazon
        System.out.println(name);

       name = name.substring(0,1).toUpperCase() + name.substring(1);  // Amazon
        System.out.println(name);

        System.out.println("------------------------------------------------");

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        // c Y B Er TeK=>  c y b er tek =>  cybertek
        String firstName = scan.nextLine().toLowerCase().replace(" ", "");

        System.out.println("Enter your last name: ");
        // sCH o o L ==>   sch o o l ==>  school
        String lastName = scan.nextLine().toLowerCase().replace(" ", "");

        scan.close();

        firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);  //"Cybertek"
        lastName = lastName.substring(0,1).toUpperCase()+ lastName.substring(1);

        String fullName = firstName+" "+lastName;

        System.out.println("Full Name = " + fullName);









    }
}
