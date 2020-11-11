package day05_Concatenation;

public class EmployeeInfo_Concatenation {
    public static void main(String[] args) {

        String firstName = "Javid";    //"" for the texts
        String lastName = "Darvish";
        String fullName = firstName+" "+lastName;   // +" "+ space
        char gender = 'M';    // '' for single characters
        int age = 21;
        String companyName = "Bank Of America";
        String jobTittle = "SDET";
        double salary = 120000;
        boolean isFULLTime = true;
        boolean isMarried = false;

        System.out.println("Employee's full name is: "+fullName);
        System.out.println(fullName +"'s gender is:"+gender);
        System.out.println(fullName+"'s age is: "+age+" years old");
        System.out.println(fullName+"'s works at: "+companyName);
        System.out.println(fullName+"'s job tittle: is "+jobTittle);
        System.out.println(fullName+"'s salary is: $"+salary);
        System.out.println(fullName+" is full time employee: "+isFULLTime);
        System.out.println(fullName+" is married: "+isMarried);




    }


}

/*
 output:
                        Employee' full name is: John Daniel
                        John Daniel' gender is: M
                        John Daniel' age is: 35 years old
                        John Daniel works at: CapitalOne
                        John Daniel' Job title is: SDET
                        John Daniel' salary is 120000.5 $
                        John Daniel is full time employee: true
                        John Daniel is married: false

 */