package day14_Switch_Recap;

public class Army {
    public static void main(String[] args) {

        String citizen = "USA";
        boolean isResident = true;
        boolean isAlien = false;

        int age = 35;

       if (citizen == "USA" || isResident || isAlien){
           System.out.println("Welcome to US");
       }else {
           System.err.println("You must be between 17 to 34 years old");
       }

















    }
}
/*
    2. What are the qualifications to join the Army?
            You must be a U.S. citizen or a resident alien.
            Be between the ages of 17-34. ...
            Have a high school diploma.
            Have no more than two dependents.

 */