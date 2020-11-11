package day23_NastedLoop;

public class CatDog {
    public static void main(String[] args) {

        String sentence = "dog dog Dog Dog cat CAT cAt CAt";

        String temp = sentence.toLowerCase(); // after this all sentence will be in lower Case.

        int countDog = 0;
        while (temp.contains("dog")){
            temp = temp.replaceFirst("dog","");
            countDog++;
        }

        System.out.println("Number of dogs: "+countDog);

        int countCat = 0;
        // word = "cat";  we can call word to instade of cat
        while(temp.contains("cat")){
            temp = temp.replaceFirst("cat","");
            countCat++;
        }
        System.out.println("Number of cats: "+countCat);

        System.out.println(countCat == countDog); // true or false









    }}
