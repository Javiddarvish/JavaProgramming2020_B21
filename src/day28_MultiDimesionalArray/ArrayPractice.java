package day28_MultiDimesionalArray;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {


        String [][] scrumTeam = { {"Lily","Lana","Igor"}, {"Lily11","Lana22","Igor33"},{"Javid"},{"Darvish"}};
        //                                  0                       1                 2         3

        System.out.println(Arrays.deepToString(scrumTeam));

        for(int i=0; i <= scrumTeam.length-1; i++){ //i: index of 1D arrays

            System.out.println(  Arrays.toString(scrumTeam[i])  );  // prints the each group in scrum team

            for(int j= 0; j <= scrumTeam[i].length-1;  j++ ){ // j: index of elements
                System.out.println( scrumTeam[i][j] );
            }

        }

        System.out.println("==============================================");

        for(String[]   eachGroup : scrumTeam ){ // eachGroup: represents each 1D array in scrumTeam

            System.out.println( Arrays.toString(eachGroup)  );

            for(String eachName : eachGroup){
                System.out.println(eachName);
            }

        }









    }}
