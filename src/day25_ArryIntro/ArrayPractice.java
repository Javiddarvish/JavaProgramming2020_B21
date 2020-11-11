package day25_ArryIntro;

public class ArrayPractice {
    public static void main(String[] args) {

        String[] students = new String[5];  // maximum index num: 0, 1, 2, 3, 4
        students[0] = "Muhtar";
        students[1] = "Javid";
        students[2] = "JD7";
        students[3] = "Darvish";
        students[4] = "Mohammad";

        /*  we can use this one too

        System.out.println(students[0]);
        System.out.println(students[1]);
        System.out.println(students[2]);
        System.out.println(students[3]);
        System.out.println(students[4]);
     // System.out.println(students[0]);   // array's size is fixed
        */

        // Muhtar, Javid, JD7, Darvish, Mohammad

        for (int i = 0; i < students.length;i++){
            System.out.println(students[i]);
        }









    }}
