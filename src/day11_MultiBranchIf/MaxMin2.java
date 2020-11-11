package day11_MultiBranchIf;

public class MaxMin2 {
    public static void main(String[] args) {

       int n1 = 10000;
       int n2 = 200;
       int n3 = 30;

       int max1 = 0;

       if (n1 > n2 && n1 > n3){  // if n1 is greater than both n2&n3
           max1 = n1;
       }else if( n2 > n1 && n2 > n3){   // if n2 is greater than both n1&n3
           max1 = 2;
       }else{
           max1 = 3;
       }
        System.out.println(max1);


       int max2 = (n1 > n2 && n1 > n3)? n1 :(n2 > n1 && n2 > n3)? n2 : n3;
        System.out.println(max2);

        System.out.println("===================================");

        int min1 = 0;

        if (n1<n2&&n1<n3){
            min1 = n1;
        }else if (n2 < n1 && n2 < n3){
            min1 = n2;
        }else{
            min1 = n3;
        }
        System.out.println(min1);


        int min2 = (n1<n2&&n1<n3)? n1 : (n2 < n1 && n2 < n3)? n2 : n3;
        System.out.println(min1);


        System.out.println("------------------------");





    }}
