package day03_Variables;

/* declare variables:
        DataType name = Data;
 */
public class CalculateSquare {

    public static void main(String[] args) {

        // side: 10
        int side = 100; // to make is reusable

        int area = side * side; // another info that we gained by using side
                // to  make it reusable

      int preimeter = side * 4; // another info that we gained by using side

        System.out.println(" Area of Square is: ");
        System.out.println(area);
        System.out.println("Preimeter of Squarer ");
        System.out.println(preimeter);

    }

}
