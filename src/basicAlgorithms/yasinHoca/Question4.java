package basicAlgorithms.yasinHoca;

import java.util.Scanner;

// İkinci dereceden ax2 + bx + c = 0 denkleminin diskriminant çözümünü yapınız? Kullanıcıdan a,b ve c değerlerini alarak deltayı hesaplayınız?
public class Question4 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the b : ");
        double b = scanner.nextDouble();

        System.out.print("Enter the c: ");
        double c = scanner.nextDouble();

        double delta = b * b - 4 * a * c;

        System.out.println("The Value of Delta : " + delta);
    }
}
