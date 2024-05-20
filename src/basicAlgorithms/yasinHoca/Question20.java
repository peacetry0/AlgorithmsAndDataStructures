package basicAlgorithms.yasinHoca;


import java.util.Scanner;

//20-Kullanıcıdan alınan bir cümlede kaç adet kelime olduğunu ve kaç adet harf olduğunu bulan programı yazınız?
public class Question20 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a sentence: ");
        String sentence = scanner.nextLine();

        int wordCount = countWords(sentence);
        int letterCount = countLetters(sentence);

        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of letters: " + letterCount);
    }


    public static int countWords(String sentence) {


        String[] words = sentence.trim().split("\\s+");

        return words.length;
    }

    //Harf
    public static int countLetters(String sentence) {

        int letterCount = 0;

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);


            if (Character.isLetter(ch)) {
                letterCount++;
            }
        }

        return letterCount;
    }

    }

