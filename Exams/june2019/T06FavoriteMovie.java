package Exams.june2019;

import java.util.Scanner;

public class T06FavoriteMovie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movieName = scanner.nextLine();
        int countMovies = 0;
        boolean flag = false;
        int maxLetterSum = Integer.MIN_VALUE;
        String bestMovie = "";

        while (!movieName.equals("STOP")) {
            int letterSum = 0;
            countMovies++;
            for (int i = 0; i < movieName.length(); i++) {
                int letterNum = movieName.charAt(i);

                if (letterNum < 65) {
                    letterSum += letterNum;

                } else if (letterNum < 91) {
                    letterSum += letterNum - movieName.length();

                } else {
                    letterSum += letterNum - movieName.length() * 2;
                }
            }

            if (countMovies >= 7) {
                flag = true;
                System.out.println("The limit is reached.");
                break;
            }
            if (maxLetterSum < letterSum) {
                bestMovie = movieName;
                maxLetterSum = letterSum;
            }
            movieName = scanner.nextLine();
        }

        System.out.printf("The best movie for you is %s with %d ASCII sum.", bestMovie, maxLetterSum);
    }
}
