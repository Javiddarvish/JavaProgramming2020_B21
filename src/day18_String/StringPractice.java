package day18_String;

public class StringPractice {
    public static void main(String[] args) {

        String s1 = "Cat";
        String s2 = "Cat";

        System.out.println(s1 == s2); // true

        String s3 = new String("Cat");

        System.out.println(s1 == s3); // false
        System.out.println(s2 == s3);

        String s4 = new String("Cat"); // false
        System.out.println(s3 == s4);


        // /.equals()
        System.out.println(s1.equals(s3)); // true
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s4)); // true

        String s5 = new String("cat");
        System.out.println(s4.equals(s5)); //false, equals method is case sensitive
        System.out.println(s4.equalsIgnoreCase(s5)); // ture,equalsIgnoreCase ignoring the (C,c) its giving you true.


        System.out.println("=============================================");

        String str = "cybertek";
                str = str.toUpperCase(); // "CYBERTEK"

        System.out.println(str);

            str = str.toLowerCase();  //"cybertek"

        System.out.println("========================================================");

        String name = "CybertekSchool";

        int n1 = name.length(); //14
                                // last index: 13
        System.out.println(n1);

        String name2 = "Javid";
//                      01234

        int n2 = name2.length(); // 5
                                // last index: 4
        int lastindex = name2.length()-1;
        System.out.println(n2);
        System.out.println(lastindex);

        System.out.println("=================================================");

        String a = "Cybertel School";

        char firstChar = a.charAt(0);
        char lastChar = a.charAt(a.length()-1);
                            // last index num of a

        System.out.println("First character "+firstChar);
        System.out.println("Last character "+lastChar);

        System.out.println("================================================");

        String b = "Today is Monday";

        char secondChar = b.charAt(1);
        char secondlastChar = b.charAt(b.length()-2);

        System.out.println("secondChar = "+ secondChar);
        System.out.println("secondLastChar = " + secondlastChar);



    }
}
