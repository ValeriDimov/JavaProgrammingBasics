package Exams.april2019Second;

import java.util.Scanner;

public class T06EasterCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberCakes = Integer.parseInt(scanner.nextLine());
        int bestScore = 0;
        String bestChief = "";

        for (int i = 1; i <= numberCakes; i++) {
            String chiefNames = scanner.nextLine();
            int totalChiefScore = 0;

            String chiefScores = scanner.nextLine();
            while (!chiefScores.equals("Stop")) {

                int scores = Integer.parseInt(chiefScores);
                totalChiefScore += scores;

                chiefScores = scanner.nextLine();
            }
            System.out.printf("%s has %d points.%n", chiefNames, totalChiefScore);
            if (totalChiefScore > bestScore) {
                System.out.printf("%s is the new number 1!%n", chiefNames);
                bestChief = chiefNames;
                bestScore = totalChiefScore;
            }
        }
        System.out.printf("%s won competition with %d points!", bestChief, bestScore);
    }
}
