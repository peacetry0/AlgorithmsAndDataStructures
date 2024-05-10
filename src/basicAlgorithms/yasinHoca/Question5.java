package basicAlgorithms.yasinHoca;

import java.util.Scanner;

//5- Vize notunun %40'ını, Final notunun %60'ını alarak ortalama notu hesaplayan, ortalama 50 den büyükse "Geçti", küçükse "Kaldı" yazan programı yazınız?
public class Question5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the visa note: ");
        double visaNote = scanner.nextDouble();

        System.out.print("Enter the final note: ");
        double finalNote = scanner.nextDouble();


        double average = (visaNote * 0.4) + (finalNote * 0.6);


        if (average >= 50) {
            System.out.println("Average: " + average + ", Passing the lesson");
        } else {
            System.out.println("Average: " + average + ", Failed the lesson ");
        }
    }

}
