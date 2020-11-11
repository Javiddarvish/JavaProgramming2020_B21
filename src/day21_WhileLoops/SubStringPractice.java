package day21_WhileLoops;

public class SubStringPractice {
    public static void main(String[] args) {

    String email = "javid_darvish@BOfA.com";

    int indexOf_ = email.indexOf("_");
    int indexOfAt = email.lastIndexOf("@");

    String lastname = email.substring(0,email.indexOf("_"));

    String firstName = email.substring(indexOf_+1,indexOfAt);

    String domain = email.substring(indexOfAt+ 1, email.lastIndexOf("."));


        System.out.println(lastname);
        System.out.println(firstName);
        System.out.println(domain);




    }
}
