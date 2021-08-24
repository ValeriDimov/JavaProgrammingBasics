package Exams.may2019;

import java.util.Scanner;

public class T06VetParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dayCount = Integer.parseInt(scanner.nextLine());
        int hoursPerDay = Integer.parseInt(scanner.nextLine());
        double totalFee = 0.0;
        double feeEvenDayOddHour = 2.5;
        double feeOddDayEvenHour = 1.25;
        double feeOtherCases = 1.0;
        double dailyFee = 0.0;

        for (int day = 1; day <= dayCount; day++) {
            for (int hour = 1; hour <= hoursPerDay; hour++) {
                if (day % 2 == 0 && hour % 2 != 0) {
                    dailyFee += feeEvenDayOddHour;

                } else if (day % 2 != 0 && hour % 2 == 0) {
                    dailyFee += feeOddDayEvenHour;

                } else {
                    dailyFee += feeOtherCases;
                }
            }
        totalFee += dailyFee;
            System.out.printf("Day: %d - %.2f leva%n", day, dailyFee);
            dailyFee = 0.0;
        }
        System.out.printf("Total: %.2f leva", totalFee);
    }
}
