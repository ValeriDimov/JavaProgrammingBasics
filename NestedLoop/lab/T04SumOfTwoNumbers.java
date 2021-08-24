package NestedLoop.lab;

import java.util.Scanner;

public class T04SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNum = Integer.parseInt(scanner.nextLine());
        int endNum = Integer.parseInt(scanner.nextLine());
        int magicNum = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        boolean flag = false;
        int result = 0;

        for (int i = startNum; i <= endNum; i++) {
            for (int j = startNum; j <= endNum; j++) {
                result = i + j;
                counter++;
                if (result == magicNum) {
                    System.out.printf("Combination N:%d (%d + %d = %d)%n", counter, i, j, result);
                    flag = true;
                    break;
                }
            }
            if (flag) {
                break;
            }
        }
        if (!flag) {
            System.out.printf("%d combinations - neither equals %d%n", counter, magicNum);
        }
    }
}

