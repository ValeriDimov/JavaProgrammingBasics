package Exams.july2019;

import java.util.Scanner;

public class T06TheMostPowerfulWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String words = scanner.nextLine();
        double mostPowerfulWord = Double.NEGATIVE_INFINITY;
        int wordsScore = 0;
        int values = 0;
        double totalWordsScore = 0.0;
        String wordToShow = "";
        int initialValue = 0;

        while (!words.equals("End of words")) {
            for (int i = 0; i < words.length(); i++) {
                initialValue = words.charAt(0);
                values = words.charAt(i);
                wordsScore += values;
            }

            switch (initialValue) {
                //'a', 'e', 'i', 'o', 'u', 'y'
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'y':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                case 'Y':
                    totalWordsScore = wordsScore * words.length();
                    break;
                default:
                    totalWordsScore = Math.floor(1.0 * wordsScore / words.length());
                    break;
            }
            if (mostPowerfulWord < totalWordsScore) {
                mostPowerfulWord = totalWordsScore;
                wordToShow = words;
            }
            wordsScore = 0;
            words = scanner.nextLine();
        }
        System.out.printf("The most powerful word is %s - %.0f", wordToShow, mostPowerfulWord);
    }
}
