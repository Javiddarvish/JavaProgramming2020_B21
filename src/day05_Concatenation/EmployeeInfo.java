package day05_Concatenation;

public class EmployeeInfo {

    public static void main(String[] args) {

    String firstName = "Javid";    //"" for the texts
    String lastName = "Darvish";
    String fullName = firstName+" "+lastName;   // +" "+ space
    char gender = 'M';    // '' for single characters
    int age = 35;
    String companyName = "CapitalOne";
    String jobTittle = "SDET";
    double salary = 120000;
    boolean isFULLTime = true;
    boolean isMarried = false;


        System.out.print("Employee' full name is: ");
        System.out.println(fullName);

        System.out.print(fullName);
        System.out.print("' gender is: ");
        System.out.println(gender);

        System.out.print(fullName);
        System.out.print("' age is: ");
        System.out.print(age);
        System.out.println(" years old");

        System.out.print(fullName);
        System.out.print("' works at: ");
        System.out.println(companyName);

        System.out.print(fullName);
        System.out.print("' Job title is: ");
        System.out.println(jobTittle);

        System.out.print(fullName);
        System.out.print("' salary is: $ ");
        System.out.println(salary);

        System.out.print(fullName);
        System.out.print("' is full time employee: ");
        System.out.println(isFULLTime);

        System.out.print(fullName);
        System.out.print("' is married: ");
        System.out.println(isMarried);







    }
}

/*
                declare the following variables:
                    firstName, lastName, gender, age, companyName, jobTitle, isFullTime, isMarried, salary
            write a program that can display the full info of the employee
                    ex:
                             firstName = John
                             lastName = Daniel
                             gender = M
                             age = 35
                             companyName = CapitalOne
                             jobTitle = SDET
                             isFullTime = true
                             isMarried = false
                             salary = 120000.50

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