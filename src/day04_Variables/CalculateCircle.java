package day04_Variables;

public class CalculateCircle {

    public static void main(String[] args) {
        // r: 7.5
    double r = 7.5;
    double pi = 3.14;

    double area = r * r * pi;
    double preimeter = 2 * r * pi;

        System.out.println(" Area of the circle is: ");
        System.out.println(area);

        System.out.println("preimeter of the circle is: ");
        System.out.println(preimeter);
    }
}




/*
 write a program that can calulate the area and permeter of the circle based on the given radius
        Hints: Area of circle = r * r * PI
              Perimeter of circle = 2 * r * PI
 */