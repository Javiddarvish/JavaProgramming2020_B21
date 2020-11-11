package Office_Hours;

public class ArrayPractice2_11_11_20 {
    public static void main(String[] args) {

        //character Matching

       String[] word = {"JD7j","Javid","DarvishD","Mohammad","Biden","Trump"};

       int count = 0;

       for (String each : word){
           char firstChar = each.toLowerCase().charAt(0);
           char lastChar = each.toLowerCase().charAt(each.length()-1);

           if (firstChar == lastChar){
               count++;
           }
       }
        System.out.println(count);






    }}
