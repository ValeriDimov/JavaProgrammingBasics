package Basics;

import java.util.Scanner;

public class T05BirthdayParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Вход
//•	Торта  – цената ѝ е 20% от наема на залата
//•	Напитки – цената им е 45% по-малко от тази на тортата
//•	Аниматор – цената му е 1/3 от цената за наема на залата
        //Ще се чете -Наем за залата – цяло число в интервала [100..10000]

        double rent = Double.parseDouble(scanner.nextLine());
        //Калкулация
//наем за залата: 2250
//цена за тортата: 2250 * 20% = 450
//цена за напитки: 450 – 45% = 247.5
//цена за аниматор: 1 / 3 от 2250 = 750
//необходима сума: 2250 + 450 + 247.5 +750 = 3697.5
        double cake = rent * 20 / 100;
        double drinks = cake * ((100 - 45) * 0.01);
        double animator = rent / 3;
        double totalPay = rent + cake + drinks + animator;
        //Принтиране
        System.out.println(totalPay);
    }
}
