package Office_Hours;

public class ArrayPractice_11_11_20 {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int[] arr2 = {10, 11, 12, 13, 14, 15, 1};

        for (int j = 0; j <= arr1.length - 1; j++) {


            int element = arr1[j];
            for (int i = 0; i <= arr2.length - 1; i++) {
                if (element == arr2[i]) {
                    System.out.println(element);
                    break;
                }
            }
            }
        System.out.println("========================================");

        for (int element : arr1) {

            for (int each : arr2) {
                if (each == element) {
                    System.out.println(element);
                }
            }
        }



    }
}
