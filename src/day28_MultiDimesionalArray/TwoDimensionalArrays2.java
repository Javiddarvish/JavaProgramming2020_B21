package day28_MultiDimesionalArray;

public class TwoDimensionalArrays2 {
    public static void main(String[] args) {

        int[][] arr2D = {  {1,2,3,4}, {5,600} , {7,8,9}, {10,11,12},  {13,14,15, 16, 17}  };
        //                      0         1         2         3                 4
        int max = arr2D[0][0];
        int min = arr2D[0][0];

        for (int[] each1DArrays : arr2D){
           for (int eachElement : each1DArrays){

               if (eachElement > max)
                   max = eachElement;
                                          //   { } not mendetory
                   if (eachElement < min)
                       min = eachElement;

           }
        }

        System.out.println("min = " + min);
        System.out.println("max = " + max);






    }}
