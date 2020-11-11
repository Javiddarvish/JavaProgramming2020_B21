package Office_Hours;

public class RemoveDublicates10_28 {
    public static void main(String[] args) {


        String str = "abab";  // "ab"

        String nonDup = "";

        for (int i = 0; i < str.length(); i++) {
            //  str.charAt(i);
            if (!nonDup.contains("" + str.charAt(i))) {
                nonDup += str.charAt(i);
            }
        }

        System.out.println(nonDup);


    }
}
