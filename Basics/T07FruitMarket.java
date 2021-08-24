package Basics;

import java.util.Scanner;

public class T07FruitMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Вход
//1.	Цена на ягодите в лева – реално число в интервала [0.00 … 10000.00]
//2.	Количеството бананите в килограми – реално число в интервала [0.00 … 10000.00]
//3.	Количеството портокалите в килограми – реално число в интервала [0.00 … 10000.00]
//4.	Количеството малините в килограми – реално число в интервала [0.00 … 10000.00]
//5.	Количеството ягодите в килограми – реално число в интервала [0.00 … 10000.00]

        double berriesPrisePerKilo = Double.parseDouble(scanner.nextLine());
        double bananasKilos = Double.parseDouble(scanner.nextLine());
        double orangesKilos = Double.parseDouble(scanner.nextLine());
        double redBerriesKilos = Double.parseDouble(scanner.nextLine());
        double berriesKilos = Double.parseDouble(scanner.nextLine());
        //Калкулация
//•	цената на малините е с 50% по-ниска от тази на ягодите;
//•	цената на портокалите е с 40% по-ниска от цената на малините;
//•	цената на бананите е с 80% по-ниска от цената на малините.
        //•	парите, които са необходими на Мария.

//Цена на малините за килограм: 24 лв.
//Цена на портокалите за килограм: 24 – (0.4 * 24) = 14.4 лв.
//Цена на бананите за килограм: 24 – (0.8 * 24) = 4.8 лв.
//Сума за малините: 6.5 * 24 = 156 лв.
//Сума за портокалите: 3.3 * 14.4 = 47.52 лв.
//Сума за бананите: 4.8* 10 = 48 лв.
//Сума за ягодите: 1.7* 48 = 81.6 лв.
//Обща сума: 156 + 47.52 + 48 + 81.6 = 333.12 лв

        double redBerriesPrisePerKilo = berriesPrisePerKilo * 0.50;
        double orangePrisePerKilo = redBerriesPrisePerKilo - (redBerriesPrisePerKilo * 0.40);
        double bananasPrisePerKilo = redBerriesPrisePerKilo - (redBerriesPrisePerKilo * 0.80);
        double sumRedBerries = redBerriesPrisePerKilo * redBerriesKilos;
        double sumOranges = orangePrisePerKilo * orangesKilos;
        double sumBananas = bananasPrisePerKilo * bananasKilos;
        double sumBerries = berriesPrisePerKilo * berriesKilos;
        double totalSum = sumRedBerries + sumOranges + sumBananas + sumBerries;
        //Принтиране
        System.out.printf("%.2f", totalSum);
    }
}
