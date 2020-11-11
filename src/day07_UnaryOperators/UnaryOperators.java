package day07_UnaryOperators;

public class UnaryOperators {
    public static void main(String[] args) {

        int a = -100;
        boolean isPositive = a > 0;
        boolean isNegative = a< 0;

        System.out.println(a+" is positive number: "+isPositive);
        System.out.println(a+" is negative number: "+isNegative);


        int b = -100 - 20; //-120
        System.out.println(b);

        int c = 10 - -20;
        System.out.println(c);

        int d = -10 * 4;
        System.out.println(d);

        int e = 10 * -4;
        System.out.println(e);

        int f = -10 * -4;
        System.out.println(f);
        System.out.println("============================================================");
                                //imdyitlly

        int x = 100;
        ++x; // increase the value by 1   100+1=101
        System.out.println(x);

        int y = 100;
        --y; //decrease the value by 1   100-1=99
        System.out.println(y);

        int z = 100;
        System.out.println(--z);

        int x2 = 100;
        System.out.println(++x2);

        System.out.println("==================================================");
                                // eventually
        int a2 = 100;
        System.out.println(a2++);
        System.out.println(a2);

        int b2 = 100;
        System.out.println(b2--);
        System.out.println(b2);





    }
}
