package day23_NastedLoop;

public class NestedLoopIntro {
    public static void main(String[] args) {

 /*
        for(int i = 1; i <= 10; i++){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i = 1; i <= 10; i++){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i = 1; i <= 10; i++){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i = 1; i <= 10; i++){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i = 1; i <= 10; i++){
            System.out.print(i+" ");
        }
        System.out.println();
     */


        /*
           when do we need nested?
            only if we need to repeat a loop

    1 2 3 4 5 6 7 8 9 10
    1 2 3 4 5 6 7 8 9 10
    1 2 3 4 5 6 7 8 9 10
    1 2 3 4 5 6 7 8 9 10
    1 2 3 4 5 6 7 8 9 10

         */
        // this is the easy way
        for (int j = 1; j <= 5; j++){

            for (int i = 1; i <= 10; i++){
                System.out.print(i+" ");
            }
            System.out.println();
        }

        System.out.println("-----------------------------------------");

        for (int j = 1; j <= 7; j++) {

            for (int a = 1; a <= 10; a++) {
                System.out.print("*");
            }
            System.out.println();
        }
        /*
         *******
         *******
         *******
         *******
         *******
         *******
         *******
         *******
         *******
         *******
        */










    }}
