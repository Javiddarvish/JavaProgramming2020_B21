package day06_ArithmeticOperatiors;

public class Currenncies {
    public static void main(String[] args) {


        int dollar = 15000;

        double lira = dollar / 0.13;
        double euro = 1000 / 1.16;
        double rubles = dollar * 78.22;
        double JYP = dollar/0.09;
        double som = dollar * 80;

       double AZN = dollar * 1.7;
       double AFG = dollar * 76.9;



        String result = dollar+"$ equal to ";

        System.out.println(result+lira+" lira");
        System.out.println(result+euro+" Euro");
        System.out.println(result+rubles+" Rubles");
        System.out.println(result+JYP+"JYP");
        System.out.println(result+som+"Som");
        System.out.println(result + AZN+"AZN");
        System.out.println(result+ AFG+"AFG");



    }
}
