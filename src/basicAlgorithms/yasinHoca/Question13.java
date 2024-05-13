package basicAlgorithms.yasinHoca;

import java.util.Scanner;

//13- Kullanıcıdan 10 adet sayı alan ve tek ve çift sayıların adetini, toplamını ve ortalamalarını bulan programını yazınız?
public class Question13 {

    public static void main(String[] args) {

        final int NUMBERS_COUNT = 10;
        int evenCount = 0;
        int oddCount = 0;
        int evenSum = 0;
        int oddSum = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter 10 numbers:");

        for (int i = 0; i < NUMBERS_COUNT; i++) {

             int number = scanner.nextInt();

              if (number % 2 == 0) {
                evenCount++;
                evenSum += number;
            } else {
                oddCount++;
                oddSum += number;
            }
        }

        double evenAverage = (double) evenSum / evenCount;
        double oddAverage = (double) oddSum / oddCount;

        System.out.println("Even numbers:");
        System.out.println("Count: " + evenCount);
        System.out.println("Sum: " + evenSum);
        System.out.println("Average: " + evenAverage);

        System.out.println("\nOdd numbers:");
        System.out.println("Count: " + oddCount);
        System.out.println("Sum: " + oddSum);
        System.out.println("Average: " + oddAverage);
    }

    }
