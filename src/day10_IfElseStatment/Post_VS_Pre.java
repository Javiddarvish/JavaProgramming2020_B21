package day10_IfElseStatment;

public class Post_VS_Pre {
    public static void main(String[] args) {

       // pre:
       double x =7; // if it is double is will be 7.0 (point)

        System.out.println(++x); // 8.0
        System.out.println(x); // 8.0

        System.out.println(--x); // 7.0
        System.out.println(x); // 7.0

        System.out.println("===================================");

        // post:        first passes the current value, next change the value by 1

        double y = 7; // 8.0

        System.out.println(y++); // 7.0
        System.out.println(y); // 8.0

        System.out.println(y--); // 8.0
        System.out.println(y); // 7.0









    }}
