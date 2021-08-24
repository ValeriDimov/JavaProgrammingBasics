package ForLoop.exercises;

import java.util.Scanner;

public class T04Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int countNumbers1 = 0;
        int countNumbers2 = 0;
        int countNumbers3 = 0;
        int countNumbers4 = 0;
        int countNumbers5 = 0;
        double result1 = 0.0;
        double result2 = 0.0;
        double result3 = 0.0;
        double result4 = 0.0;
        double result5 = 0.0;
        char percent = '%';
        double sumCount = 0.0;

        for (int i = 1; i <= n; i++) {

            int number = Integer.parseInt(scanner.nextLine());

            if (number < 200) {
                int count1 = 1;
                countNumbers1 += count1;

            } else if (number < 400) {
                int count2 = 1;
                countNumbers2 += count2;
            } else if (number < 600) {
                int count3 = 1;
                countNumbers3 += count3;
            } else if (number < 800) {
                int count4 = 1;
                countNumbers4 += count4;
            } else {
                int count5 = 1;
                countNumbers5 += count5;
            }
        }
        sumCount = countNumbers1 + countNumbers2 + countNumbers3 + countNumbers4 + countNumbers5;

        result1 = (1.0 * countNumbers1 / sumCount * 100);
        result2 = (1.0 * countNumbers2 / sumCount * 100);
        result3 = (1.0 * countNumbers3 / sumCount * 100);
        result4 = (1.0 * countNumbers4 / sumCount * 100);
        result5 = (1.0 * countNumbers5 / sumCount * 100);

        System.out.printf("%.2f%c%n", result1, percent);
        System.out.printf("%.2f%c%n", result2, percent);
        System.out.printf("%.2f%c%n", result3, percent);
        System.out.printf("%.2f%c%n", result4, percent);
        System.out.printf("%.2f%c%n", result5, percent);

    }
}
