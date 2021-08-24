package ForLoop.exercises;

import java.util.Scanner;

public class T02HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;
        int result = 0;
        int sumNumbers = 0;

        for (int i = 1; i <= n; i++) {
            int numbers = Integer.parseInt(scanner.nextLine());
            sumNumbers += numbers;
            if (numbers > maxNum) {
                maxNum = numbers;
            }
        }
        if (sumNumbers - maxNum == maxNum) {
            System.out.printf("Yes%nSum = %d", sumNumbers - maxNum);
        } else {
            System.out.printf("No%nDiff = %d", Math.abs(maxNum - Math.abs(maxNum - sumNumbers)));
        }
    }
}
