package basicAlgorithms.yasinHoca;

import java.util.Scanner;

//9- Kullanıcıdan ismini alıp ekrana tersten yazan programı yazınız?
public class Question9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;

        System.out.println("Please enter your name");
        String name = scanner.nextLine() ;

         String reversedName = "" ;

        for (int i = name.length() - 1; i >= 0; i--) {
            reversedName += name.charAt(i);
        }

        System.out.println("Name : " + name +
                           "\nReversed Name  :" + reversedName);

    }
}
