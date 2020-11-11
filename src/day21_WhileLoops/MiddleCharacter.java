package day21_WhileLoops;

public class MiddleCharacter {
    public static void main(String[] args) {

       String word = "apples"; //1
       //

        if (word.length()% 2 != 0) {

            // first req
            if (word.length() >= 3) {
                System.out.println(word.charAt(word.length() / 2));
            } else{
                System.out.println(word + word + word);
            }

        }else{
            // "java" --> 1,2   // "apples" --> pl --> 2, 3

            if (word.length() >= 4){
                int m = word.length()/2;
                System.out.println(word.charAt(m-1)+""+word.charAt(m));
            }

        }





    }
}
