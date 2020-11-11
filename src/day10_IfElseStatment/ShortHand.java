package day10_IfElseStatment;

public class ShortHand {
    public static void main(String[] args) {

        int a = 100;

        System.out.println(a); // 100

        System.out.println(++a); // 101


        a = 200;

        System.out.println(a); // 200

        System.out.println(++a); // 201


        a = 300;

        System.out.println(a); //300

        String name = "Daniel";
        System.out.println(name); //Daniel

        name = "John";
        System.out.println(name);

        System.out.println("================================================");

        // +=
        int A = 200;
        A += 100;   // both are the same and this one is easy way
           // A = A + 100;  // same
        System.out.println(A);


        String school ="Cybertek";
            school += " School";  // school = school + " School": same
        System.out.println(school);

            int savingAccount = 1000;
            savingAccount += 2000;
        System.out.println(savingAccount);
            savingAccount += 500;
        System.out.println(savingAccount);

        // -= :

        savingAccount -= 1000;
        System.out.println(savingAccount);
        savingAccount -= 500;
        System.out.println(savingAccount);


        //*=:

        double salary = 100000;
        salary *= 1.2;
        System.out.println(salary);

        int Y = 10;
        Y *= 10;
        System.out.println(Y);


        // /=:

        double tax = 100000;
        tax /= 2;
        System.out.println(tax);

        int B = 3000;
        //B /= 0; cant divide
        System.out.println(B);


        // %=:     if numerator cannot be evenly divisible by denominator

        /*
        in math :
        10/4 = 2.5
        remainder: 10 - 94 * 4)2 = 2

        in java :
                10 % 4==>2
         */

        int T = 100;
            T %= 10;
        System.out.println(T);

        double U = 35;
            U %= 9;
        System.out.println(U);





    }}
