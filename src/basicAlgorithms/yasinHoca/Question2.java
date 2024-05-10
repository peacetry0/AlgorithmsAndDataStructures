package basicAlgorithms.yasinHoca;
//2- Kullanıcıdan iki sayı alarak bunların toplamını ve ortalamasını ekrana yazan programı yazınız?

import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in) ;

        System.out.println("Please enter two number : ");

        int numberOne = scanner.nextInt() ;
        int numberTwo = scanner.nextInt();

        System.out.println("First Number : " + numberOne   +
                           "Second Number : " + numberTwo);


        int total = numberOne + numberTwo ;

        System.out.println("Total : " +total);

        double average = (double) (numberOne + numberTwo) / 2 ;

        System.out.println("Average  : " + average);







    }
}
