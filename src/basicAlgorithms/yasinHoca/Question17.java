package basicAlgorithms.yasinHoca;

import java.util.Random;
import java.util.Scanner;

//17- Kullanıcın girdiği mXn boyutta bir matris oluşturup bu matrisi rastgele sayılarla doldurunuz. Bu matrisin transpozesini oluşturunuz?
public class Question17 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Enter the number of rows (m): ");
        int m = scanner.nextInt();
        System.out.print("Enter the number of columns (n): ");
        int n = scanner.nextInt();

        int[][] matrix = new int[m][n];
        int[][] transpose = new int[n][m];

        System.out.println("Original Matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = rand.nextInt(10) + 1; // Random number between 1 and 10
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        System.out.println("Transpose Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
