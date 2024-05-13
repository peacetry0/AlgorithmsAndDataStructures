package basicAlgorithms.yasinHoca;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//15- Kullanıcının istediği büyüklükte bir diziyi 0-100 arasında rastgele oluşturulmuş sayılarla doldurup bu sayıların standart sapmasını hesaplayınız
public class Question15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();

        double[] array = generateRandomArray(size);

        System.out.println("Generated array: " + Arrays.toString(array));

        double stdDev = calculateStandardDeviation(array);

        System.out.println("Standard deviation: " + stdDev);
    }

    public static double[] generateRandomArray(int size) {
        Random random = new Random();
        double[] array = new double[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(101);

        }
        return array;
    }

    public static double calculateStandardDeviation(double[] array) {
        double mean = calculateMean(array);
        double sumSquaredDiffs = 0;

        for (double num : array) {
            sumSquaredDiffs += Math.pow(num - mean, 2);
        }

        double variance = sumSquaredDiffs / (array.length - 1);

        double stdDev = Math.sqrt(variance);
        return stdDev;
    }

    public static double calculateMean(double[] array) {

        double sum = 0;

        for (double num : array) {
            sum += num;
        }

        return sum / array.length;
    }
}

