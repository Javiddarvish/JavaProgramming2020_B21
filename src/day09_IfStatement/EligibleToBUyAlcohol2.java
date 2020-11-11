package day09_IfStatement;

public class EligibleToBUyAlcohol2 {
    public static void main(String[] args) {

        int age = 20;   //  if it is under age the second will be exsicuted.

        boolean eligible = age >= 21;
      //        false
        if(eligible){
            System.out.println("You are eligible to buy alcohol");
        }

      if(!eligible){
          System.out.println("Go buy your milk");
      }

        System.out.println("========================================");


      boolean isBreakTime = false;

      if(isBreakTime) {
          System.out.println("Time to take a break");
      }
      if(!isBreakTime){
          System.out.println("Let's continue the class");
      }











    }}
