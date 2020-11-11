package day06_ArithmeticOperatiors;

public class GallonToLiters {
    public static void main(String[] args) {

        double gallon = 55;
        double liters = gallon * 3.78541;

        System.out.println(gallon+" Gallons equal to "+ liters+" L. ");

        boolean exceeded300Liters = liters > 300;
        System.out.println(gallon + " gallons exceeds 300 liters: "+exceeded300Liters );





    }
}

// hint: 1 gallon = 3.78541 liters