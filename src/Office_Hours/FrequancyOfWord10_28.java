package Office_Hours;

public class FrequancyOfWord10_28 {
    public static void main(String[] args) {

        String sentence = " Cat Cat CatCat Cat Cat";
        String word = "Cat";

        int count = 0;

        while (sentence.contains(word)){
           sentence = sentence.replaceFirst(word,"");
            count++;
        }

        System.out.println(count);












    }
}
