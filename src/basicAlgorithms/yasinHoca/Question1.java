package basicAlgorithms.yasinHoca;
//1- Kullanıcıdan ismini alarak "Merhaba isim" yazan programı yazınız?

import java.util.Scanner;

public class Question1 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;

        System.out.println("Please enter your name :");
        String name = scanner.nextLine() ;

        System.out.println("Name : " + name);
    }

}
