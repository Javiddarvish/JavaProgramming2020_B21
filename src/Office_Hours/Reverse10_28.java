package Office_Hours;

import java.util.Scanner;

public class Reverse10_28 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();

         // String name = "Cybertek";  without scanner
        //             01234567

        scan.close();

        String result = "";  // rebyc

        /*
        result += name.charAt(name.length()-1);
        result += name.charAt(6);
        result += name.charAt(5);
        result += name.charAt(4);
        result += name.charAt(3);
        result += name.charAt(2);
        result += name.charAt(1);
        result += name.charAt(0);
*/
        for (int i = name.length()-1; i >= 0; i--){
            result += name.charAt(i);
        }

        System.out.println(result);

















    }
}
