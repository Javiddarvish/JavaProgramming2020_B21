package day20_WhileLoop;

public class StringReverse {
    public static void main(String[] args) {

        String str = "ABCD";
        //            0123
        String result = "";

        for (int i = str.length()-1; i >= 0; i--) {
            result += str.charAt(i);
        }

        System.out.println(result);









    }
}
