package day10_IfElseStatment;

public class IfElseStatement {
    public static void main(String[] args) {

        int number = 101;
        boolean isEven = number%2 == 0;

        if (isEven){ // for even number
            System.out.println(number+" is even");
        }
        if(!isEven){
            System.out.println(number+" is odd");
        }

        System.out.println("=========================================");


        if (isEven){
            System.out.println(number+" is even");
        }else{
            System.out.println(number+" is odd");
        }
        System.out.println("========================================");

        int score = 100;

        if (score >= 60){
            System.out.println("Pass the exam");
        }else{
            System.out.println("failed the exam");
        }












    }
}
