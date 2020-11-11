package Office_Hours;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your score: ");

        int score =  scan.nextInt();
        scan.close();

        String grade = "";

        if(score >= 0 && score <= 100){
/*
            if(score >= 90 ){ // becomes false when score < 90
                grade = "Excellent";
            }else if(score>= 80 ){ // becomes false when score < 80
                grade  = "Great";
            }else if(score >= 70){ // becomes false when score < 70
                grade = "Good";
            }else if(score >= 60){ // becomes false when score < 60
                grade = "Passed";
            }else{
                grade = "Fail";
            }
*/
            grade = (score >= 90)? "Excellent" :(score>= 80 )? "Great" :(score >= 70)? "Good"
                    :(score >= 60)? "Passed" : "Fail";

        }else{
            grade = "Invalid";
        }

        System.out.println(grade);




    }}