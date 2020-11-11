package day09_IfStatement;

import org.omg.PortableInterceptor.ServerRequestInfo;

import java.util.SplittableRandom;

public class EligibleToVote2 {
    public static void main(String[] args) {

       String name = "Javid";
        boolean isUSCitizen = true;
        int age = 25;
        boolean hasCriminalBackground = true;

        boolean isEligible = isUSCitizen == true && age >= 18 && hasCriminalBackground == false;
                //      true == true &&29 >= 18  && false == false
                //      true && true && true
        System.out.println(name+" is Eligible to vote: "+isEligible);

        System.out.println("==============================================");


        String name2 = "John";
        String c1 = "Canada";
        String c2 = "USA";

        boolean eligible = c1 =="USA" || c2 == "USA";
            //      "Canada" == "USA" || USA == USA
            //            False || true
        System.out.println(name2+" is eligible to vote: "+eligible);










    }}
