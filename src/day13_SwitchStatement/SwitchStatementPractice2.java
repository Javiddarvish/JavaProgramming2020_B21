package day13_SwitchStatement;

public class SwitchStatementPractice2 {
    public static void main(String[] args) {


        int n = 5;
        String day = "";


        switch (n){

            case 1:
                day = "Monday";
                break;  // break is case breaker

            case 2:
                day = "Tuesday";
                break;

            case 3:
                day = "Wednesday";
                break;

            case 4:
                day = "Thursday";
                break;

            case 5:
                day = "Friday";
                break;

            case 6:
                day = "Saturday";
                break;

            case 7:
                day = "Sunday";
                break;

            default:
                day = "Invalid Day";
                // for the last block we don't need to give break statement
        }

        System.out.println(day);








    }}
