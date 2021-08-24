package NestedLoop.exercises;

import java.util.Scanner;

public class T02EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int counter = firstNum;

        for (int i = firstNum; i <= secondNum; i++) {
            String digits = "" + i;
            int odd = 0;
            int even = 0;
            for (int j = 0; j < digits.length(); j++) {
                int singleDigit = Integer.parseInt("" + digits.charAt(j));
                if (j % 2 == 0) {
                    odd += singleDigit;
                } else {
                    even += singleDigit;
                }
            }
            if (odd == even) {
                System.out.print(counter + " ");
            }
            counter++;
        }

    }
}
