package ForLoop.lab;

import java.util.Scanner;

public class T08NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int resultMax = Integer.MIN_VALUE;
        int resultMin = Integer.MAX_VALUE;

        for (int i = 1; i <= n; i++) {
            int numbers = Integer.parseInt(scanner.nextLine());

            if (numbers > resultMax) {
                resultMax = numbers;
            }
            if (numbers < resultMin) {
                resultMin = numbers;
            }
        }
        System.out.printf("Max number: %d%n", resultMax);
        System.out.printf("Min number: %d", resultMin);
    }
}
