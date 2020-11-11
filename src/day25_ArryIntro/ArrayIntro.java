package day25_ArryIntro;

public class ArrayIntro {
    public static void main(String[] args) {

        // String name = "Cybertek", "Javid";

      /*  String name1 = "Javid";
        String name2 = "Azad"
        String name3 = "Azad"
        String name4 = "Azad"
        String name5 = "Azad"
       */

        String[] name = {"Javid", "Azad", "Muhtar", "Inna"};
        //index number:     0        1        2        3


        // retrieve data from array:
            // Both works
        System.out.println( name [2]);

        String str1 = name[0];
        System.out.println(str1);


        int [] score = {80, 85, 90, 70, 75, 78};
        // index num:   0    1   2   3   4   5

        /*
        System.out.println(name[0]+" : "+score[2]);
        System.out.println(name[1]+" : "+score[3]);
        System.out.println(name[2]+" : "+score[0]);
        System.out.println(name[3]+" : "+score[1]);
       */

        for (int i = 0; i < name.length;i++){  // i = 0,1,2,3,4
            System.out.println(name[i]+" : "+score[i]);
        }







    }}
