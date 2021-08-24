package Exams.preRealExam;

import java.util.Scanner;

public class T05HairSalon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double dailyBudget = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();

        double dailyRevenue = 0.0;
        boolean isBudgetAchieved = false;

        while (!input.equals("closed")) {
            String typeOfType = "";

            switch (input) {
                case "haircut":
                    typeOfType = scanner.nextLine();
                    if (typeOfType.equals("mens")) {
                        dailyRevenue += 15;
                    } else if (typeOfType.equals("ladies")) {
                        dailyRevenue += 20;
                    } else if (typeOfType.equals("kids")) {
                        dailyRevenue += 10;
                    }
                    break;
                case "color":
                    typeOfType = scanner.nextLine();
                    if (typeOfType.equals("touch up")) {
                        dailyRevenue += 20;
                    } else if (typeOfType.equals("full color")) {
                        dailyRevenue += 30;
                    }
                    break;
            }
            if (dailyRevenue >= dailyBudget) {
                isBudgetAchieved = true;
                break;
            }
            input = scanner.nextLine();
        }
        if (isBudgetAchieved) {
            System.out.println("You have reached your target for the day!");
            System.out.printf("Earned money: %.0flv.", dailyRevenue);
        } else {
            System.out.printf("Target not reached! You need %.0flv. more.%n", dailyBudget - dailyRevenue);
            System.out.printf("Earned money: %.0flv.", dailyRevenue);
        }

    }
}
