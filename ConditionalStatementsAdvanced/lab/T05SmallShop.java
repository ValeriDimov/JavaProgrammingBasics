package ConditionalStatementsAdvanced.lab;

import java.util.Scanner;

public class T05SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        if (city.equals("Sofia")) {
            if (product.equals("coffee")) {
                System.out.println(quantity * 0.5);
            } else if (product.equals("water")) {
                System.out.println(quantity * 0.80);
            } else if (product.equals("beer")) {
                System.out.println(quantity * 1.2);
            } else if (product.equals("sweets")) {
                System.out.println(quantity * 1.45);
            } else if (product.equals("peanuts")) {
                System.out.println(quantity * 1.6);
            }

        } else if (city.equals("Plovdiv")) {
            if (product.equals("coffee")) {
                System.out.println(quantity * 0.4);
            } else if (product.equals("water")) {
                System.out.println(quantity * 0.70);
            } else if (product.equals("beer")) {
                System.out.println(quantity * 1.15);
            } else if (product.equals("sweets")) {
                System.out.println(quantity * 1.3);
            } else if (product.equals("peanuts")) {
                System.out.println(quantity * 1.5);
            }
        } else if (city.equals("Varna")) {
            if (product.equals("coffee")) {
                System.out.println(quantity * 0.45);
            } else if (product.equals("water")) {
                System.out.println(quantity * 0.70);
            } else if (product.equals("beer")) {
                System.out.println(quantity * 1.1);
            } else if (product.equals("sweets")) {
                System.out.println(quantity * 1.35);
            } else if (product.equals("peanuts")) {
                System.out.println(quantity * 1.55);
            }
        }
    }
}
