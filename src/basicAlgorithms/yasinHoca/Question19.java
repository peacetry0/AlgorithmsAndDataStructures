package basicAlgorithms.yasinHoca;


  //19- Tersten yazıldığında da aynı değeri olan sayılara Palindrom sayılar denir.
  // Örnek olarak "1991" veya "34543" sayıları tersten yazılsa bile aynı değerde olurlar.
  // 1000 - 100000 sayıları arasındaki palindromları bulan programı yazınız?
public class Question19 {

    public static void main(String[] args) {

        int start = 1000;
        int end = 100000;

        for (int i = start; i < end; i++) {
            if (isPalindrome(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return originalNumber == reversedNumber;
    }
    }

