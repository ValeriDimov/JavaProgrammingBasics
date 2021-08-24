package ForLoop.lab;

import java.util.Scanner;

public class T07SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countNum = Integer.parseInt(scanner.nextLine());
        int result = 0;

        for (int i = 1; i <= countNum; i++) {

            int numbersToSum = Integer.parseInt(scanner.nextLine());
            result += numbersToSum;
        }
        System.out.println(result);
    }
}
