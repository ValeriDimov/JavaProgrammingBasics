package WhileLoop.exercises;

import java.util.Scanner;

public class T05Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = Double.parseDouble(scanner.nextLine());
        double cents = money * 100;
        double numCoins = 0;
        double restMoney = 0;

        double twoLevs = 0;
        double oneLev = 0;
        double fiftyCents = 0;
        double twentyCents = 0;
        double tenCents = 0;
        double fiveCents = 0;
        double twoCents = 0;
        double oneCents = 0;

        while (restMoney == 0) {
            restMoney = cents;
            if (restMoney >= 200) {
                twoLevs = Math.floor(restMoney / 200);
                restMoney = restMoney % 200;
            }
            if (restMoney >= 100) {
                oneLev = Math.floor(restMoney / 100);
                restMoney = restMoney % 100;
            }
            if (restMoney >= 50) {
                fiftyCents = Math.floor(restMoney / 50);
                restMoney = restMoney % 50;
            }
            if (restMoney >= 40) {
                twentyCents = Math.floor(restMoney / 20);
                restMoney = restMoney % 20;
            }
            if (restMoney >= 20) {
                twentyCents = Math.floor(restMoney / 20);
                restMoney = restMoney % 20;
            }
            if (restMoney >= 10) {
                tenCents = Math.floor(restMoney / 10);
                restMoney = restMoney % 10;
            }
            if (restMoney >= 5) {
                fiveCents = Math.floor(restMoney / 5);
                restMoney = restMoney % 5;
            }
            if (restMoney >= 4) {
                twoCents = Math.floor(restMoney / 2);
                restMoney = money % 4;
            }
            if (restMoney >= 2) {
                twoCents = Math.floor(restMoney / 2);
                restMoney = restMoney % 2;
            }
            if (restMoney >= 1) {
                oneCents = Math.floor(restMoney);
                restMoney = 0;
            }
            break;
        }
        numCoins = twoLevs + oneLev + fiftyCents + twentyCents + tenCents + fiveCents + twoCents + oneCents;

        System.out.printf("%.0f", numCoins);
    }
}

