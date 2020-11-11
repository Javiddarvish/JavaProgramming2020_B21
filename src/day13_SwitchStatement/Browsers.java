package day13_SwitchStatement;

public class Browsers {
    public static void main(String[] args) {

        String browserName = "Chrome";

        boolean valid = browserName == "Chrome" || browserName == "Firefox" || browserName == "opera" || browserName ==
                "Safari" || browserName == "edge" || browserName == "ie";

        String selectedBrowser = " ";

        if (valid) {

            if (browserName == "Chorme") {
                selectedBrowser = "CHROME BROWSER";
            } else if (browserName == "Firefox") {
                selectedBrowser = "FIREFOX BROWSER";
            } else if (browserName == "Opera") {
                selectedBrowser = "OPERA BROWSER";
            } else if (browserName == "Safari") {
                selectedBrowser = "SAFARI BROWSER";
            } else if (browserName == "Edge") {
                System.out.println("EDGE BROWSER IS SELECTED");
                selectedBrowser = "EDGE BROWSER";
            } else {
                selectedBrowser = "IE BROWSER";
            }


        } else {
            System.out.println("No such a Browser");
        }

        System.out.println(browserName);


    }
}
/*
 2. write a program that can display the selected browser
                1. declear a String variable called browserName
                2. Assume that the valid browsers are: chrome, firefox, opera, safari, edge, ie
                3. if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser Name
 */