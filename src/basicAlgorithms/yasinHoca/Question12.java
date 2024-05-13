package basicAlgorithms.yasinHoca;
 //12- 0 ile 1000 arasındaki Asal sayıları bulan programı yazınız?
public class Question12 {


     public static void main(String[] args) {
         int maxLimit = 1000;

         System.out.println("Prime numbers up to " + maxLimit + ":");

         for (int i = 2; i <= maxLimit; i++) {
             if (isPrime(i)) {
                 System.out.print(i + " ");
             }
         }
     }

     public static boolean isPrime(int number) {
         if (number <= 1) {
             return false;
         }
         for (int i = 2; i <= Math.sqrt(number); i++) {
             if (number % i == 0) {
                 return false;
             }
         }
         return true;
     }

}
