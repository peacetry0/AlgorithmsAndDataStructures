package basicAlgorithms.yasinHoca;

import java.util.Scanner;

//- Kullanıcının istediği kadar sayıyı, kullanıcıdan alarak bir diziye aktaran, bu sayıların toplamını ve ortalamasını bulan programını yazınız?
public class Question14 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many numbers will you enter?");
        int count = scanner.nextInt();

        int[] numbers = new int[count];

        System.out.println("Please enter the numbers:");
        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        double average = (double) sum / count;

        System.out.println("Sum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);
    }
}
