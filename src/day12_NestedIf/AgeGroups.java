package day12_NestedIf;

public class AgeGroups {
    public static void main(String[] args) {

    int age = 35;
    String ageGroups = "";

    if (age >= 1 && age <=2){ // it becomes false when age is >= 3
        ageGroups = "infant";
    }else if (age >=3 && age <= 5){  // we can use (age <= 5)
        ageGroups = "Toddler";
    }else if (age >= 6 && age <= 9){ // age <= 9 , becomes false when age is >= 6
        ageGroups = "Kid";
    }else if (age >= 13 && age <= 17){  //age <= 17 , becomes false when age is >= 13
        ageGroups = "Pre-Teen";
    }else if (age >= 18 && age <= 20){  //age <= 20 , becomes false when age is >= 18
        ageGroups = "Young Adult";
    }else if (age >= 21 && age <= 39){  //age <= 39, becomes false when age is >= 21
        ageGroups = "Adult";
    }else if (age >= 40 && age <= 49){  //age <= 49 , becomes false when age is >= 40
        ageGroups = "Young Middle-Aged Adult";
    }else if (age >= 50 && age <= 54){  //age <= 54 , becomes false when age is >= 50
        ageGroups = "Middle-Aged Adult";
    }else if (age >= 55 && age <= 64) {  //age <= 64 , becomes false when age is >= 55
        ageGroups = "Very Young Senior Citizen";
    }else if (age >= 65 && age <= 74) {  //age <= 74 , becomes false when age is >= 65
        ageGroups = "Young Senior Citizen";
    }else if (age >= 75 && age <= 84) {  //age <= 84 , becomes false when age is >= 75
        ageGroups = "Senior Citizen";
    }else{
        ageGroups = "Old Senior Citizen";
    }
        System.out.println(ageGroups);













    }
}
/*
2. write a program that can define the age groups of a person
                 age groups are:
                        infant (< 1 year)
                        Toddler (3 - 5),
                        Kid (6 - 9),
                        Pre-Teen (10 - 12),
                        Teenager (13 - 17),
                        Young Adult (18 - 20),
                        Adult (21 - 39),
                        Young Middle-Aged Adult (40 - 49),
                        Middle-Aged Adult (50 - 54),
                        Very Young Senior Citizen (55 - 64),
                        Young Senior Citizen (65 - 74),
                        Senior Citizen (75 - 84),
                        Old Senior Citizen (85+)
 */