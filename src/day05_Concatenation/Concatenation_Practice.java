package day05_Concatenation;

public class Concatenation_Practice {

    public static void main(String[] args) {

        int houseNumber = 5789;
        String streetName = "Winston Ct";
        String cityName = "Alexandria";
        String state = "Virginia";
        int zipCode = 22311;

        String fullAddress = houseNumber+" "+streetName+"\n"+cityName+" "+state+", "+zipCode;
        // by adding \n you can suprate the text.

        System.out.println(fullAddress);

        System.out.println("======================================================");

        String brand= "Toyota";
        String model = "Camry";
        int year = 2013;
        int mileage = 120000;
        double price = 10000;
        String color = "white";

        //2013 Toyota Camry, 120,000 miles, White color, $10,000

        String carInfo = year+" "+brand+" "+model+", "+mileage+" miles,  "+color+", $"+price;

        System.out.println(carInfo);









    }
}
