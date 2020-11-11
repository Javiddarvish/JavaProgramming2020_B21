package Office_Hours;

public class FrequencyOfCharacter {

    public static void main(String[] args) {


       String str = "aaaabbbbbccccddddaaaa";

       char ch = 'a';
       int count = 0;

       for (int i = 0; i < str.length();i++){
           char eachChar = str.charAt(i);
           if (eachChar == ch){
               count++;
           }

       }
        System.out.println(count);














    }}
