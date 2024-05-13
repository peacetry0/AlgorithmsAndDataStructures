package basicAlgorithms.yasinHoca;

import java.util.Scanner;

//8- n'den m'ye kadar olan sayılardan 7'ye tam bölünenleri bulunuz?
//
// n başlangıç ve m bitiş sayısı kullanıcıdan alınacaktır.
public class Question8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;

        System.out.println("Please enter begin number");
        int beginNumber = scanner.nextInt() ;

        System.out.println("Please enter finish number ");
        int finishNumber = scanner.nextInt() ;

        System.out.println("Begin number : " + beginNumber +
                            "\nFinish Number : " + finishNumber);

        for (int i = beginNumber ; i<=finishNumber ; i++){

             if (i % 7 == 0 ){
                 System.out.println("Numbers divisible By 7 : " + i );
             }
        }

    }
}
