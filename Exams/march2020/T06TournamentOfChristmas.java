package Exams.march2020;

import java.util.Scanner;

public class T06TournamentOfChristmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numDays = Integer.parseInt(scanner.nextLine());
        int daysLoses = 0;
        int daysWins = 0;
        double totalCharityMoney = 0.0;
        double dailyCharityMoney = 0.0;

        for (int i = 1; i <= numDays; i++) {
            String games = scanner.nextLine();
            double tempMoney = 0.0;
            int countWins = 0;
            int countLoses = 0;

            while (!games.equals("Finish")) {
                String winOrLose = scanner.nextLine();
                if (winOrLose.equals("win")) {
                    tempMoney += 20;
                    countWins++;
                } else {
                    countLoses++;
                }
                games = scanner.nextLine();
            }
            if (countWins > countLoses) {
                dailyCharityMoney = tempMoney + tempMoney * 0.1;
            } else {
                dailyCharityMoney = tempMoney;
            }
            totalCharityMoney += dailyCharityMoney;
            if (countWins > countLoses) {
                daysWins++;
            } else {
                daysLoses++;
            }

        }
        if (daysWins > daysLoses) {
            totalCharityMoney += totalCharityMoney * 0.2;
            System.out.printf("You won the tournament! Total raised money: %.2f", totalCharityMoney);
        } else {
            System.out.printf("You lost the tournament! Total raised money: %.2f", totalCharityMoney);
        }
    }
}
