package Office_Hours;

import java.util.Arrays;

public class SingleDimensionalArray11_11_20 {
    public static void main(String[] args) {

        int [] score = new int[5];

        score[2] = 10;
        score[1] = 20;
        score[0] = 50;
        score[3] = 30;
        score[4] = 40;

        System.out.println(Arrays.toString(score));

       // one by one
        System.out.println(score[2]);
        System.out.println(score[3]);
        System.out.println(score[4]);
        System.out.println(score[1]);

        System.out.println("======================================");

        //                     i < 5
        for (int i = 0; i < score.length; i++){     // for (int i = 0; i < 5; i++) we can do this way too
            System.out.println(score[i]);
        }
        System.out.println("=======================================");


        for (int each : score){
            System.out.println(each);
        }












    }}
