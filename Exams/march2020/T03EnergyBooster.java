package Exams.march2020;

import java.util.Scanner;

public class T03EnergyBooster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String sizePack = scanner.nextLine();
        int countPacks = Integer.parseInt(scanner.nextLine());

        double price = 0.0;
        double totalPrice = 0.0;
        double discount = 0.0;

        switch (fruit) {
            case "Watermelon":
                if (sizePack.equals("small")) {
                    price = countPacks * 2 * 56;
                } else {
                    price = countPacks * 5 * 28.7;
                }
                break;
            case "Mango":
                if (sizePack.equals("small")) {
                    price = countPacks * 2 * 36.66;
                } else {
                    price = countPacks * 5 * 19.6;
                }
                break;
            case "Pineapple":
                if (sizePack.equals("small")) {
                    price = countPacks * 2 * 42.1;
                } else {
                    price = countPacks * 5 * 24.8;
                }
                break;
            case "Raspberry":
                if (sizePack.equals("small")) {
                    price = countPacks * 2 * 20;
                } else {
                    price = countPacks * 5 * 15.2;
                }
                break;
        }
        if (price < 400) {
            totalPrice = price;
        } else if (price <= 1000) {
            totalPrice = price - price * 0.15;
        } else {
            totalPrice = price - price * 0.5;
        }
        System.out.printf("%.2f lv.", totalPrice);
    }
}
