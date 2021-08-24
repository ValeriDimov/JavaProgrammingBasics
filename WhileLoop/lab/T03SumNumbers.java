package WhileLoop.lab;

import java.util.Scanner;

public class T03SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int inputNum = 0;
        int sum = 0;

        while (sum < firstNum) {

            inputNum = Integer.parseInt(scanner.nextLine());
            sum += inputNum;

        }
        System.out.println(sum);
    }
}
