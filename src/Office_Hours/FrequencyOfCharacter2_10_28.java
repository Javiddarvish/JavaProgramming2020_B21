package Office_Hours;

public class FrequencyOfCharacter2_10_28 {
    public static void main(String[] args) {

        String str = "abababababa";
        String ch = "a";   //  we can use char too 'a'

        int count = 0;

        while (str.contains(ch)) {   // if you add "" it will change to String
            str = str .replaceFirst(ch," ");
            count++;    // it will count the a,a
        }
        System.out.println(count);










    }
}
