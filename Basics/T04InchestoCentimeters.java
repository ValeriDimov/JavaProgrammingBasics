package Basics;

import java.util.Scanner;

public class T04InchestoCentimeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double inches = Double.parseDouble(scanner.nextLine());
        double cents = 2.54;
        double result = inches * cents;

        System.out.println(result);
    }
}
