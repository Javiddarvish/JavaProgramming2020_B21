package day25_ArryIntro;

public class UniqueCharacters {
    public static void main(String[] args) {

        String str = "abcabababeb";

        String result = "";    //"ce"

        char ch = str.charAt(1);  //'a'
        int count = 0; // 1+1+1

        for (int i = 0; i < str.length();i++ ){  // i represents the index num of str
           char eachChar = str.charAt(i);       // each characters of the str
           if (eachChar == ch){
               count++;
           }
        }// count the frequency of ch

        System.out.println(count);












    }}
