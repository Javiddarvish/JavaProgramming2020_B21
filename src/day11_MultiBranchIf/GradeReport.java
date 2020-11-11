package day11_MultiBranchIf;

import java.awt.*;

public class GradeReport {
    public static void main(String[] args) {

      int score = 70; // 1 to 100

      // boolean fail = score < 60;  we can use this statement too

        String result = "";

        if (score < 60){
            result ="Failed";
        }else if(score >= 60 && score < 90){
         result = "Passed";
        }else{  // score >= 90
          result = "Passed with distiction";
        }
        System.out.println(result);







    }}
