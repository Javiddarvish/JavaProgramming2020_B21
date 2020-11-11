package day13_SwitchStatement;

public class DayInMonth {
    public static void main(String[] args) {


       int year = 2020;
       int month = 3; // 1 ~ 12

        boolean has28Or29Days = month == 2;
        boolean had30Days = month == 4 || month == 6 || month == 9 || month == 11;
        // boolean has31Days = !had30Days    // !has28Or29Days; we can use this one too.

       String result = "";

        if (month > 0 && month < 12){

            if (month == 2){
                if (year%4 == 0){
                    result = "29 days";
                }else{
                    result = "28 days";

                }

            }else if (had30Days){
                result = "30 days";
            }else{
                result = " 31 days";

            }

        }else { // if the month is invalid
            result = "Invalid Number";
        }


        System.out.println(result);















    }}
