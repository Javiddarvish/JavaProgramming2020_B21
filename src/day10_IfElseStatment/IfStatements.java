package day10_IfElseStatment;

public class IfStatements {
    public static void main(String[] args) {


        int score = 45;

        if (score >= 60){
            System.out.println("congrats");
        }
        if (score < 60){
            System.out.println("Keep trying");
        }


        if (score >= 60){
            System.out.println("Congrats");
        }else{
            System.out.println("Keep crying");
        }

        System.out.println("=========================================");

        int angle1 = 80;
        int angle2 = 75;
        int angle3 = 65;
        int angle4 = 75;

        boolean isValidRectangle = angle1 == 90 && angle2 == 90 && angle3 == 90 && angle4 == 90;
        // if each of the angles are equal to 90, then it's valid

       if (isValidRectangle){
           System.out.println("It is valid rectangle");
       }else{
           System.out.println("It is not valid rectangle");
       }

        System.out.println("========================================");
       // assume that a & b are diffrent numbers
       int a = 200;
       int b = 3000;
       int max = 0;

    // what is the maximum number
        if (a > b){
            max = 0;
        }else{
            max = b;
        }
        
        System.out.println("Maximum number is "+max);


        







    }}
