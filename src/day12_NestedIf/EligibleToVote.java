package day12_NestedIf;

public class EligibleToVote {
    public static void main(String[] args) {

       String citizen = "USA";
        int  age = 17;

        if (citizen == "USA"){

            if (age >= 18){
                System.out.println("You are eligible to vote");
            }else{
                System.out.println("You mustbe at least 18 years old to vote");
            }

        }else{
            System.out.println("You must be US Citizen in order to vote");
        }














    }
}
