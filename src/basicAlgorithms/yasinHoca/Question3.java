package basicAlgorithms.yasinHoca;


import java.util.Scanner;

//3- Kullanıcıdan alınan 3 sayının en büyüğünü bulan programı yazınız?
public class Question3 {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in) ;

        int numberOne = scanner.nextInt() ;
        int numberTwo = scanner.nextInt() ;
        int numberThree = scanner.nextInt() ;


        System.out.println("First Number : " + numberOne
                          + "Second Number : " + numberTwo
                          +"Third Number : "  + numberThree);

        if (numberOne>numberTwo && numberOne>numberThree){
            System.out.println("The Biggest Number:"  + numberOne);
        } else if (numberTwo>numberOne && numberTwo>numberThree) {
            System.out.println("The Biggest Number : " + numberTwo);
        } else if (numberThree>numberOne &&numberThree>numberTwo) {
            System.out.println("The Biggest Number : " + numberThree);
        }else{
            System.out.println(
                    "Some of the given numbers are equal to each other");
        }

    }
}
