package day22_JavaRecap;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "AAAAAAABBBBBBBCCCCCCDDDDDEEEEFFF"; //  result should be "ABC"
        String result = "";  // ABCDEF

        for (int i = 0; i <= str.length()-1;i++){
            String eachCharacter = ""+str.charAt(i);

            if (result.contains(eachCharacter)){
                continue;
            }else{
                result += eachCharacter;
            }
   /*
            if(!result.contains(eachCharacter)){
                result += eachCharacter;
            }
             */

            //  result += (!result.contains(eachCharacter))? eachCharacter : "";

        }

        System.out.println("result: "+result);











    }
}
