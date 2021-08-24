package ForLoop.lab;

import java.util.Scanner;

public class T11CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double washMachinePrice = Double.parseDouble(scanner.nextLine());
        double singleToysPrice = Double.parseDouble(scanner.nextLine());
        int toysCount = 0;
        double money = 0;
        double sumMoney = 0;
        double brothersMoney = 0;
        double totalMoney = 0;

        for (int i = 1; i <= age; i++) {

            if (i % 2 != 0) {
                toysCount++;
            } else {
                money += 10;
                sumMoney = sumMoney + money;
                brothersMoney += 1;
            }
        }
        totalMoney = (sumMoney - brothersMoney) + (toysCount * singleToysPrice);
        if (totalMoney >= washMachinePrice){
            System.out.printf("Yes! %.2f", totalMoney - washMachinePrice);

        }else {
            System.out.printf("No! %.2f", washMachinePrice - totalMoney);
        }
    }
}
