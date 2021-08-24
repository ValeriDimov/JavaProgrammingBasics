package Basics;

import java.util.Scanner;

public class T03DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Вход
        double depositedSum = Double.parseDouble(scanner.nextLine());
        double period = Double.parseDouble(scanner.nextLine());
        double interest = Double.parseDouble(scanner.nextLine());

        //Калкулация
//сума = депозирана сума  + срок на депозита * ((депозирана сума * годишен лихвен процент ) / 12)
        //1. изчисляваме натрупаната лихва: 200 * 5.7% = 11.4лв.
        //2. изчисляваме лихвата за 1 месец: 11.4лв./12 месеца = 0.95лв
        //3. общата сума е 200лв депозит + (3 (срок на депозита) * 0.95 лв)

          double interestSum = depositedSum * interest;
          double interestSumMonthly = (interestSum / 12) / 100;
          double totalResult = depositedSum + period * interestSumMonthly;

        //Принтиране

        System.out.println(totalResult);
    }
}
