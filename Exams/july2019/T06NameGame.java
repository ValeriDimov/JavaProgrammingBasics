package Exams.july2019;

import java.util.Scanner;

public class T06NameGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String names = scanner.nextLine();
        int totalScore = Integer.MIN_VALUE;
        String personWithMaxScore = "";

        while (!names.equals("Stop")) {
            int individualScore = 0;
            for (int i = 0; i < names.length(); i++) {
                int numbers = Integer.parseInt(scanner.nextLine());
                int letterToNumber = names.charAt(i);

                if (numbers == letterToNumber) {
                    individualScore += 10;
                } else {
                    individualScore += 2;
                }

            }
            if (totalScore <= individualScore) {
                totalScore = individualScore;
                personWithMaxScore = names;
            }

            names = scanner.nextLine();
        }
        System.out.printf("The winner is %s with %d points!", personWithMaxScore, totalScore);
    }
}
