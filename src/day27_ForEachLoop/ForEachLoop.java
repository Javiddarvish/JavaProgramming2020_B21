package day27_ForEachLoop;

public class ForEachLoop {
    public static void main(String[] args) {

      String[] names = {"JD7","Javid","Darvish","Mohammad"};

        for (int i = 0; i <= names.length-1;i++){
            System.out.println(names[i]);
        }
        System.out.println("------------------------------------------------");

        for ( String each : names ){
            System.out.println(each);
        }
        System.out.println("------------------------------------------------");

        int[] nubmers = {1,2,3,4,5,6,7,8,9,10,11,12};

        int countEvens = 0;
        int countOdds = 0;

        for (int each : nubmers){
            if (each%2 == 0){
                countEvens++;
            }else{
                countOdds++;
            }
        }
        System.out.println(countEvens);
        System.out.println(countOdds);

        System.out.println("----------------------------------------------------");

        int[] scores = {10,2,3,4,25,100,-10,-2,1100,30,40};
        int max = scores[0];
        int min = scores[0];

        for (int each : scores){
            if (each > max){
                max = each;
            }
            if (each < min){
                min = each;
            }
        }
        System.out.println(max);
        System.out.println(min);









    }}
