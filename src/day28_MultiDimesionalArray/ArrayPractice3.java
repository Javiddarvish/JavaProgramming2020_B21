package day28_MultiDimesionalArray;

public class ArrayPractice3 {
    public static void main(String[] args) {

        double[] salary = {100000.2, 150000.1, 1300000.4};
        double sum = 0;

        double max = salary[0];
        double min = salary[0];


        for (double each : salary){
            sum += each;
            if (each > max){
                max = each;
            }
            if (each < min){
                min = each;
            }
        }
        System.out.println("Total: "+ +sum);
        System.out.println("Average Salary of employees: "+ (sum/salary.length));
        System.out.println("min = " + min);
        System.out.println("max = "+ max);









    }}
