package NestedLoop.exercises;

import java.util.Scanner;

public class T03SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int primeNums = 0;
        int NonPrimeNums = 0;
        while (!input.equals("stop")) {
            int number = Integer.parseInt(input);
            boolean isPrime = true;

            if (number < 0) {
                System.out.println("Number is negative.");
                input = scanner.nextLine();
                continue;
            }

            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    NonPrimeNums += number;
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primeNums += number;


            }

            input = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d%n", primeNums);
        System.out.printf("Sum of all non prime numbers is: %d", NonPrimeNums);

    }
}
