package basicAlgorithms.yasinHoca;

import java.util.Scanner;


//18- Kullanıcıdan alınan 4 basamaklı bir sayıyı yazı ile yazınız? Kullanıcı 3215 girmiş olsun "üç bin iki yüz on beş" ekrana yazılsın.
public class Question18 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a 4-digit number: ");

        int number = scanner.nextInt();

        String numberInWords = convertNumberToWords(number);


        System.out.println(numberInWords);
    }


    public static String convertNumberToWords(int number) {

        String[] ones = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] teens = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tens = {"", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        String[] thousands = {"", "one thousand", "two thousand", "three thousand", "four thousand", "five thousand", "six thousand", "seven thousand", "eight thousand", "nine thousand"};

        int thousand = number / 1000;
        int hundred = (number / 100) % 10;
        int ten = (number / 10) % 10;
        int one = number % 10;

        String words = "";

        if (thousand > 0) {
            words += thousands[thousand] + " ";
        }
        if (hundred > 0) {
            words += ones[hundred] + " hundred ";
        }
        if (ten > 1) {
            words += tens[ten] + " ";
            if (one > 0) {
                words += ones[one];
            }
        } else if (ten == 1) {
            words += teens[one];
        } else if (ten == 0 && one > 0) {
            words += ones[one];
        }

        return words.trim();
    }

}



