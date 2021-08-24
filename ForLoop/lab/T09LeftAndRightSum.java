package ForLoop.lab;

import java.util.Scanner;

public class T09LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int sumN1 = 0;
        int sumN2 = 0;

        for (int i = 1; i <= n1; i++) {
            int numsFromN1 = Integer.parseInt(scanner.nextLine());
            sumN1 += numsFromN1;
        }
        for (int i = 1; i <= n1; i++) {
            int numsFromN2 = Integer.parseInt(scanner.nextLine());
            sumN2 += numsFromN2;
        }

        if (sumN1 == sumN2) {
            System.out.printf("Yes, sum = %d", sumN2);
        } else {
            System.out.printf("No, diff = %d", Math.abs(sumN1 - sumN2));
        }
    }
}