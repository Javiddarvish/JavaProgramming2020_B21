package day26_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class reverseSentence {
    public static void main(String[] args) {
        // we can you scanner too

       // Scanner scan = new Scanner(System.in);
       // System.out.println("Enter your sentnece");
        // String sentence = scan.nextline();


        String sentence = "Today is Monday";  // Monday is Today

        String[] word = sentence.split(" ");

        System.out.println(Arrays.toString(word));


        for (int i =  word.length-1; i >= 0 ;i--){
            System.out.print(word[i] +" ");
        }






    }}
