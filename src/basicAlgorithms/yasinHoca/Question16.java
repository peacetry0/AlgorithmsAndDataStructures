package basicAlgorithms.yasinHoca;

import java.util.Random;


//16- 3X3 rastgele sayılardan oluşan 2 matris oluşturun.Bu matrislerin, toplamını hesaplayınız.
public class Question16 {

    public static void main(String[] args) {

        Random random = new Random();

        int[][] matrix = new int[3][3];
        int[][] matrix2 = new int[3][3];
        int[][] totalMatrix = new int[3][3];


        System.out.println("Matrix 1 :");

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                matrix[i][j] = random.nextInt(10) + 1; // 1 ile 10 arasında
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }


        System.out.println("Matrix 2:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = random.nextInt(10) + 1;
                System.out.print(matrix2[i][j] + " ");
            }

            System.out.println();
        }


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                totalMatrix[i][j] = matrix[i][j] + matrix2[i][j];
            }
        }


        System.out.println("Total Matrix :");

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.print(totalMatrix[i][j] + " ");

            }
            System.out.println();
        }
    }


}
