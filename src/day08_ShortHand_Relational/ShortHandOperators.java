package day08_ShortHand_Relational;

public class ShortHandOperators {
    public static void main(String[] args) {

        int a = 10;
        System.out.println(a); // 10

            a = 30;
        System.out.println(a); // it will call the new one 30

    String schoolName = "Cybertek";
           schoolName = "MIT";

        System.out.println(schoolName); // the new one will run (MIT)

        int x = 100;  // 100 - 62 = 38
            x -= 62;
        System.out.println(x);

        double salary = 100000; // 0.28
               salary -= salary * 0.28;
        System.out.println(salary);   // 100,000 - 28,000 = 72,000


        int x2 = 999999;
            x2 -= 25;
        System.out.println(x2);


        double balance = 2000;
                balance -= 450;

        System.out.println(balance);

        balance -= 1000;
        System.out.println(balance);


        String name = "Cybertek";
                name = "School";
        System.out.println(name);


        double totalTax = 100000;
               totalTax *= 0.28; // totalTax = 100000 * 0.28
        System.out.println(totalTax);


        int bonus = 5000;
            bonus *= 2+1; // bonus = 5000 * 3
        System.out.println(bonus);


        int y3 = 10;
        y3 /= 5;
        System.out.println(y3);


        int house = 500000;
        int month = 240;

        double monthlyPayment = house;
        monthlyPayment /= 240;   // monthlyPayment = 50000/240
        System.out.println(monthlyPayment);


        // 100 / 3;  ===> 99.33333 ==> remainder: 1
        int a2 = 100;
            a2 %= 3;  // a2 = 100 % 3;
        System.out.println(a2);


        int a3 = 2000;
            a3 %= 2;  // a3 = 2000 % 3






    }}
