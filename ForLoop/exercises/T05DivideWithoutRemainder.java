package ForLoop.exercises;

import java.util.Scanner;

public class T05DivideWithoutRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int countNumber1 = 0;
        int countNumber2 = 0;
        int countNumber3 = 0;

        double result1 = 0.0;
        double result2 = 0.0;
        double result3 = 0.0;

        char percent = '%';

        for (int i = 1; i <= n; i++) {

            int number = Integer.parseInt(scanner.nextLine());

            if (number % 2 == 0) {
                int count1 = 1;
                countNumber1 += count1;
            }
            if (number % 3 == 0) {
                int count2 = 1;
                countNumber2 += count2;
            }
            if (number % 4 == 0) {
                int count3 = 1;
                countNumber3 += count3;
            }
        }
        result1 = 1.0 * countNumber1 / n * 100;
        result2 = 1.0 * countNumber2 / n * 100;
        result3 = 1.0 * countNumber3 / n * 100;

        System.out.printf("%.2f%c%n", result1, percent);
        System.out.printf("%.2f%c%n", result2, percent);
        System.out.printf("%.2f%c", result3, percent);
    }
}
