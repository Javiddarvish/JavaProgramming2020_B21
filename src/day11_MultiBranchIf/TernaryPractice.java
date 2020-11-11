package day11_MultiBranchIf;

public class TernaryPractice {
    public static void main(String[] args) {

    int n = 100;
    String result1 = "";

    if (n%2 == 0){
        result1 = "Even";
    }else {
        result1 = "Odd";
    }
        System.out.println(result1);

        System.out.println("==============================");

        String result2 = (n%2 == 0)? "Even" : "Even";

        System.out.println(result2);

        System.out.println("================================");


        int age = 25;
        String citizen = "USA";

        String eligibleToVote = ( age >= 18 && citizen == "USA")? "Eligible to Vote":"Not eligible to vote";
        System.out.println(eligibleToVote);

        System.out.println("========================================");

        int personAge = 18;
        String buyAlcohol = ( personAge >= 21)? "Eligible to buy Alcohol":"Not eligible to buy Alcohol";
        System.out.println(buyAlcohol);

        System.out.println("==============================================");

        int number = 100;
        String s1 = "";

        if (number > 0) {
            s1 = "Positive";
        } else if ( number < 0){
                s1 = "Negative";
            }else{
            s1 = " zero";
        }
        System.out.println(s1);


        String s2 = (number > 0)? "Positive":(number < 0)? "Negative" : "zero";
        System.out.println(s2);











    }}
