package day10_IfElseStatment;

public class Logical {
    public static void main(String[] args) {

        // logical operators: || , && , !


        // ||: returns false if all expressions are false.

        boolean r1 = 10 < 9 || 20 != 20;
        //          false  ||  false
        System.out.println(r1);


        boolean r2 = " Javid" == "Good Guy" || "Javid" != "bad boy";
            //              false           ||  true
        System.out.println(r2);


        boolean r3 = 'a' != 'A' || 'B' == 'B';
        //              true    || true
        System.out.println(r3);



        // &&:  returns true only if all expressions are true

        boolean r4 = 200 > 100 && 200 < 300; // true
            //          true  &&   true
        System.out.println(r4);


        boolean r5 = 500 > 300 && 200 < 100; // false
        //              true    && false
        System.out.println(r5);


        boolean r6 = 1000 > 1200 && 500 < 100;
        //              false     && false
        System.out.println(r6);




        // !: returns the opposite of the boolean

        System.out.println(!true); // false
        System.out.println(!false); // true







    }}
