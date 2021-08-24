package ConditionalStatementsAdvanced.exersizes;

import java.util.Scanner;

public class T03NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowers = scanner.nextLine();
        int numberFlowers = Integer.parseInt(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());
        double finalPrice = 0.0;

        switch (flowers) {
            case "Roses":
                if (numberFlowers > 80) {
                    finalPrice = (numberFlowers * 5) - (numberFlowers * 5 * 0.1);
                } else
                    finalPrice = (numberFlowers * 5);
                break;
            case "Dahlias":
                if (numberFlowers > 90) {
                    finalPrice = (numberFlowers * 3.8) - (numberFlowers * 3.8 * 0.15);
                } else
                    finalPrice = (numberFlowers * 3.8);
                break;
            case "Tulips":
                if (numberFlowers > 80) {
                    finalPrice = (numberFlowers * 2.8) - (numberFlowers * 2.8 * 0.15);
                } else
                    finalPrice = (numberFlowers * 2.8);
                break;
            case "Narcissus":
                if (numberFlowers < 120) {
                    finalPrice = (numberFlowers * 3) + (numberFlowers * 3 * 0.15);
                } else
                    finalPrice = (numberFlowers * 3);
                break;
            case "Gladiolus":
                if (numberFlowers < 80) {
                    finalPrice = (numberFlowers * 2.5) + (numberFlowers * 2.5 * 0.2);
                } else
                    finalPrice = (numberFlowers * 2.5);
                break;
        }
        if (budget >= finalPrice) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", numberFlowers, flowers, budget - finalPrice);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.",finalPrice - budget);
        }
    }
}
