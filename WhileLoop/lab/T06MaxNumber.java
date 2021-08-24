package WhileLoop.lab;

import java.util.Scanner;

public class T06MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int maxNum = Integer.MIN_VALUE;

        while (!input.equals("Stop")) {
            int num = Integer.parseInt(input);

            if (maxNum < num) {
                maxNum = num;
            }
            input = (scanner.nextLine());
        }
        System.out.println(maxNum);
    }
}
