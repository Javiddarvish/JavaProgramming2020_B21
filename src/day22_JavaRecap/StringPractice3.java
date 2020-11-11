package day22_JavaRecap;

public class StringPractice3 {
    public static void main(String[] args) {

        String sentence = "Capital of Canada is Washington";

       String country =  sentence.replace("Canada","United States");
        System.out.println(country);


        String s = "Cybertek School is in Bostan, Cybertek Campus is in McLean";

        s = s.replaceFirst("Cybertek","MIT");
        System.out.println(s);


        String r = "cava is cool programming language, I like to learn cava at cybertek school";

        r = r.replace("ca","Ja");
        System.out.println(r);


        String p = "I like Java and Java Java Java Java Java Java";

        p =  p.replace("Java","C#").replace("like C#","like Java");
        System.out.println(p);

        System.out.println("------------------------------------------------------------------------");

        String str = "                 ";

        System.out.println(str.length());
        str = str.trim();

        System.out.println(str.length());

        String str2 = "                 Cybertek         School      ";

        System.out.println(str2);

        System.out.println("------------------------------------------------------------------------");

        String s2 = "I like to learn Java";

        System.out.println("Contains c#: "+ s2.toLowerCase().contains("java"));

        System.out.println(s2.equals("java"));
        System.out.println(s2.equalsIgnoreCase("java"));

        System.out.println("================================================");
//         contains , equal , equalignoreCase , is empty
        String s3 = "Cybertek School is the best";

        System.out.println(s3.contains("cybertek"));
        System.out.println(s3.toLowerCase().contains("cybertek"));

        System.out.println(s3.equals("cybertek"));
        System.out.println(s3.equalsIgnoreCase("cybertek"));


        System.out.println("Java".isEmpty());
        System.out.println("".isEmpty());

        System.out.println("------------------------------------------------");
       // StartsWith  ,  endsWith

        String URL = "www.amazon.com";

        boolean isValid = URL.startsWith("www") && (URL.endsWith(".com") || URL .endsWith(".edu") || URL.endsWith(".gov"));

        if (isValid){
            System.out.println("URL is valid");
        }else{
            System.out.println("Invalid");
        }

        String email = "Java_Master@java.com";

        boolean validEmail = email.endsWith("gmail.com") || email.endsWith("yahoo.com")
                || email.endsWith("hotmai.com");

        if (isValid){
            System.out.println("valid Email");
        }else{
            System.out.println("Invalid Email");
        }












    }
}
