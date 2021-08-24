package WhileLoop.lab;

import java.util.Scanner;

public class T05AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0.0;
        String deposit = scanner.nextLine();

        while (!deposit.equals("NoMoreMoney")) {
            double money = Double.parseDouble(deposit);
            if (money < 0) {
                System.out.println("Invalid operation!");
                break;
            }

            System.out.printf("Increase: %.2f%n", money);
            sum += money;
            deposit = scanner.nextLine();
        }
        System.out.printf("Total: %.2f", sum);
    }
}
