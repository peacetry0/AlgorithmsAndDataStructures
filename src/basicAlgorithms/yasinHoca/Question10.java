package basicAlgorithms.yasinHoca;

import java.util.Scanner;

//10- Kullanıcıdan ismini ve soyismini alarak içerisinde kaç adet sesli kaç adet sessiz harf olduğunu bulan programı yazınız
public class Question10 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name:");
        String name = scanner.nextLine().toLowerCase();

        System.out.println("Please enter your surname:");
        String surname = scanner.nextLine().toLowerCase();

        int vowelCountName = countVowels(name);
        int consonantCountName = name.length() - vowelCountName;

        int vowelCountSurname = countVowels(surname);
        int consonantCountSurname = surname.length() - vowelCountSurname;

        System.out.println("Name: " + name);
        System.out.println("Number of vowels in the name: " + vowelCountName);
        System.out.println("Number of consonants in the name: " + consonantCountName);

        System.out.println("Surname: " + surname);
        System.out.println("Number of vowels in the surname: " + vowelCountSurname);
        System.out.println("Number of consonants in the surname: " + consonantCountSurname);
    }


    public static int countVowels(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }
}
