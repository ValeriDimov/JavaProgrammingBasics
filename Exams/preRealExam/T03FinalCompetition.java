package Exams.preRealExam;

import java.util.Scanner;

public class T03FinalCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dancersCount = Integer.parseInt(scanner.nextLine());
        double points = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String place = scanner.nextLine();

        double revenue = dancersCount * points;
        double finRevenue = 0.0;
        double totalProfit = 0.0;
        double charityMoney = 0.0;
        double profitPerDancer = 0.0;

        switch (place){
            case "Bulgaria":
                if (season.equals("summer")) {
                    finRevenue = revenue;
                    totalProfit = finRevenue - (finRevenue * 0.05);
                } else if (season.equals("winter")) {
                    finRevenue = revenue;
                    totalProfit = finRevenue - (finRevenue * 0.08);
                }
                break;
            case "Abroad":
                if (season.equals("summer")) {
                    finRevenue = revenue + (revenue * 0.5);
                    totalProfit = finRevenue - (finRevenue * 0.10);
                } else  if (season.equals("winter")) {
                    finRevenue = revenue + (revenue * 0.5);
                    totalProfit = finRevenue - (finRevenue * 0.15);
                }
                break;
        }
        charityMoney = totalProfit * 0.75;
        profitPerDancer = (totalProfit * 0.25) / dancersCount;

        System.out.printf("Charity - %.2f%n", charityMoney);
        System.out.printf("Money per dancer - %.2f", profitPerDancer);

    }
}
