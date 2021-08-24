package ConditionalStatementsAdvanced.lab;

import java.util.Scanner;

public class T11FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//(banana / apple / orange / grapefruit / kiwi / pineapple / grapes)

        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double price = 0.0;
        String message = "";

        switch (fruit) {
            case "banana":
                if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") ||
                        day.equals("Thursday") || day.equals("Friday")) {
                    price = 2.5;
                } else if (day.equals("Saturday") || day.equals("Sunday")) {
                    price = 2.7;
                }
                break;
            case "apple":
                if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") ||
                        day.equals("Thursday") || day.equals("Friday")) {
                    price = 1.2;
                } else if (day.equals("Saturday") || day.equals("Sunday")) {
                    price = 1.25;
                }
                break;
            case "orange":
                if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") ||
                        day.equals("Thursday") || day.equals("Friday")) {
                    price = 0.85;
                } else if (day.equals("Saturday") || day.equals("Sunday")) {
                    price = 0.9;
                }
                break;
            case "grapefruit":
                if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") ||
                        day.equals("Thursday") || day.equals("Friday")) {
                    price = 1.45;
                } else if (day.equals("Saturday") || day.equals("Sunday")) {
                    price = 1.6;
                    break;
                }
            case "kiwi":
                if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") ||
                        day.equals("Thursday") || day.equals("Friday")) {
                    price = 2.7;
                } else if (day.equals("Saturday") || day.equals("Sunday")) {
                    price = 3.0;
                }
                break;
            case "pineapple":
                if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") ||
                        day.equals("Thursday") || day.equals("Friday")) {
                    price = 5.5;
                } else if (day.equals("Saturday") || day.equals("Sunday")) {
                    price = 5.6;
                }
                break;
            case "grapes":
                if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") ||
                        day.equals("Thursday") || day.equals("Friday")) {
                    price = 3.85;
                } else if (day.equals("Saturday") || day.equals("Sunday")) {
                    price = 4.2;
                }
                break;
        }

        if (price != 0) {
            System.out.printf("%.2f", price * quantity);
        } else {
            System.out.println("error");
        }
    }
}
