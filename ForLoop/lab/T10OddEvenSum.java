package ForLoop.lab;

import java.util.Scanner;

public class T10OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int result1 = 0;
        int result2 = 0;

        for (int i = 1; i <= n; i++) {
            int numbers = Integer.parseInt(scanner.nextLine());
            if (i % 2 == 0) {
                result1 += numbers;
            } else {
                result2 += numbers;
            }

        }
        if (result1 == result2) {
            System.out.printf("Yes%nSum = %d", result1);
        } else {
            System.out.printf("No%nDiff = %d", Math.abs(result1 - result2));
        }
    }
}