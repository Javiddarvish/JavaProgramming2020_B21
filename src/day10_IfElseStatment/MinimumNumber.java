package day10_IfElseStatment;

public class MinimumNumber {
    public static void main(String[] args) {

        int n1 = 200;
        int n2 = 10000;
        int n3 = 300;

        boolean n3IsMin = n3 < n1 && n3 < n2;
        // if n3 is less than both n1 & n2, it means that n3 is the minimum
        boolean n2IsMin = n2 < n3 && n2 < n1;
                    // !n3IsMin && n2 < n1; // if n3 is not minimum number and n2 is less than n1
        boolean n1IsMin = n1 < n2 && n1 < n3;
                // !n3IsMin && !n2IsMin we can use these too.

        String a = " is minimum number";
        int min = 0;

        if (n3IsMin){
           // System.out.println(n3+a);
                min = n3;
        }

        if(n2IsMin){
            // System.out.println(n2+a);
            min = n2;
        }
        if (n1IsMin){
            // System.out.println(n1+a);
            min = n1;
        }

        System.out.println(min+a);










    }}


