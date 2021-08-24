package Basics;

import java.util.Scanner;

public class T08FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Вход
//1.	Дължина в см – цяло число в интервала [10 … 500]
//2.	Широчина в см – цяло число в интервала [10 … 300]
//3.	Височина в см – цяло число в интервала [10… 200]
//4.	Процент  – реално число в интервала [0.000 … 100.000]

        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        double percentage = Double.parseDouble(scanner.nextLine());
        //Калкулация
        double tankVolume = length * width * height;
        double totalLitres = tankVolume * 0.001;
        double realLitres = totalLitres - (totalLitres * (percentage * 0.01));
        //Принтиране
//	литрите вода, които ще  събира аквариума.
        System.out.printf("%.2f", realLitres);
    }
}
