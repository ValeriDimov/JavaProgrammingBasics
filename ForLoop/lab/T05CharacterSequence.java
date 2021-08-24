package ForLoop.lab;

import java.util.Scanner;

public class T05CharacterSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        char symbol = ' ';
        for (int i = 0; i < input.length(); i++) {
            symbol = input.charAt(i);
            System.out.println(symbol);
        }
    }
}
