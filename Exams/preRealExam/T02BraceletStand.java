package Exams.preRealExam;

import java.util.Scanner;

public class T02BraceletStand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pocketMoney = Double.parseDouble(scanner.nextLine());
        double salesRevenuePerDay = Double.parseDouble(scanner.nextLine());
        double totalPeriodCosts = Double.parseDouble(scanner.nextLine());
        double giftPrice = Double.parseDouble(scanner.nextLine());

        double totalPocketMoney = pocketMoney * 5;
        double totalSalesRevenue = salesRevenuePerDay * 5;
        double totalSavings = totalPocketMoney + totalSalesRevenue;

        double result = totalSavings - totalPeriodCosts;

        if (result >= giftPrice) {
            System.out.printf("Profit: %.2f BGN, the gift has been purchased.", result);
        } else {
            System.out.printf("Insufficient money: %.2f BGN.", giftPrice - result);
        }
    }
}
