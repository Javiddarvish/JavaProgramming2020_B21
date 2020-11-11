package day13_SwitchStatement;

public class SwitchStatement_Practice3 {
    public static void main(String[] args) {

        String browser = "chrome";
        String selectedBrowser = "";



        switch (browser) {  // chrome

            case "chrome":
                selectedBrowser = "CHROME BROWSER";
                break;

            case "firefox":
                selectedBrowser = "FIREFOX BROWSER";


            case "opera":
                selectedBrowser = "OPERA BROWSER";
                break;

            case "safari":
                selectedBrowser = "SAFARI BROWSER";
                break;

            case " edge":
                selectedBrowser = "EDGE BROWSER";
                break;

            case "ie":
                selectedBrowser = "IE BROWSER";
                break;

            default:
                selectedBrowser = " INVALID BROWSER";


        }
        System.out.println(selectedBrowser);


    }
}
