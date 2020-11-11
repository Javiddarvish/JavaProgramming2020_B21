package day26_Arrays;

public class MinimumNumberInArray {
    public static void main(String[] args) {

        int[]  numbers = {100,200,300,400,500};
        int min = numbers[0];

        for (int i = 0; i < numbers.length;i++){
            if (numbers[i] < min){
                min = numbers[i];
            }
        }

        System.out.println(min);






    }}
