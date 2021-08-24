package Exams.march2019;

import java.util.Scanner;

public class T06BasketballTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String tournamentName = scanner.nextLine();
        int numberWins = 0;
        int numberLoses = 0;
        int totalMatches = 0;

        while (!tournamentName.equals("End of tournaments")) {
            int numberMatches = Integer.parseInt(scanner.nextLine());

            for (int i = 1; i <= numberMatches; i++) {
                int teamDesiScore = Integer.parseInt(scanner.nextLine());
                int otherTeamScore = Integer.parseInt(scanner.nextLine());
                int differenceInScore = teamDesiScore - otherTeamScore;
                totalMatches++;

                if (teamDesiScore > otherTeamScore) {
                    numberWins++;
                    System.out.printf("Game %d of tournament %s: win with %d points.%n", i, tournamentName, differenceInScore);
                } else {
                    numberLoses++;
                    System.out.printf("Game %d of tournament %s: lost with %d points.%n", i, tournamentName, Math.abs(differenceInScore));
                }
            }

        tournamentName = scanner.nextLine();
        }
        System.out.printf("%.2f%% matches win%n", 1.0 * numberWins / totalMatches * 100);
        System.out.printf("%.2f%% matches lost", 1.0 * numberLoses / totalMatches * 100);
    }
}
