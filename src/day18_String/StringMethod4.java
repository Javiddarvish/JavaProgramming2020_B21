package day18_String;

public class StringMethod4 {
    public static void main(String[] args) {

        String str = "Hello Everyone";
        System.out.println(str.isEmpty());

        String str2 = "";
        System.out.println(str2.isEmpty());


        // contains
        String sentence = "I like to learn Java";
        System.out.println(sentence.contains("C#"));  // false
        System.out.println(sentence.contains("Java")); // true


        String webAddress = "www.amazon.com";
        boolean validAddress = webAddress.startsWith("www") && webAddress.endsWith(".com");
        System.out.println(validAddress);
















    }
}
