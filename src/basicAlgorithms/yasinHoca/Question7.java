package basicAlgorithms.yasinHoca;

import java.util.Scanner;

//7- 1'den n'e kadar olan sayılardan tek olanların toplamını bulunuz? n sayısı kullanıcıdan alınacaktır
public class Question7 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;

        System.out.println("Enter the Number");
        int n = scanner.nextInt() ;


         int total = 0 ;

        for (int i = 1 ; i < n ; i++){

            if ( i % 2 != 0 ){

                total += i ;
            }
        }
        System.out.println("Total : " + total );
    }
}
