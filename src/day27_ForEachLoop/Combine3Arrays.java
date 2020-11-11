package day27_ForEachLoop;

import java.util.Arrays;

public class Combine3Arrays {
    public static void main(String[] args) {

        String[] group1 = {"JD7","Javid","Darvish","Mohammad"};
        String[] group2 = {"JD8","Javid1","Darvish2","Mohammad2"};
        String[] group3 = {"JD10","Javid3","Darvish3","Mohammad3"};

        String[] groups = new String[group1.length + group2.length + group3.length];
        int i = 0;

        for (String each : group1){
            groups[i++] = each;
        }
        for (String each : group2) {
            groups[i++] = each;

        }
        for (String each : group3) {
            groups[i++] = each;
        }

        System.out.println(Arrays.toString(groups));







    }}
