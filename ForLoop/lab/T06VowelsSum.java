package ForLoop.lab;

import java.util.Scanner;

public class T06VowelsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int result = 0;

        for (int i = 0; i < input.length(); i++) {
            char word = input.charAt(i);

            switch (word) {
                case 'a':
                    result += 1;
                    break;
                case 'e':
                    result += 2;
                    break;
                case 'i':
                    result += 3;
                    break;
                case 'o':
                    result += 4;
                    break;
                case 'u':
                    result += 5;
                    break;
            }

        }
        System.out.println(result);

    }
}
