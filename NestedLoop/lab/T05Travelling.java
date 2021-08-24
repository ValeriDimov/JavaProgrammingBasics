package NestedLoop.lab;

import java.util.Scanner;

public class T05Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            double budget = Double.parseDouble(scanner.nextLine());
            double savings = Double.parseDouble(scanner.nextLine());
            double totalSavings = 0;

            while (totalSavings <= budget) {
                totalSavings += savings;
                if (totalSavings >= budget){
                    System.out.printf("Going to %s!%n", input);
                    break;
                }
                savings = Double.parseDouble(scanner.nextLine());
            }
            input = scanner.nextLine();
        }
    }
}
