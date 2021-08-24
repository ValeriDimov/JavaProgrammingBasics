package WhileLoop.exercises;

import java.util.Scanner;

public class T06Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int weight = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int totalPieces = weight * length;
        int pieces = 0;

        String input = scanner.nextLine();

        while (!input.equals("STOP")) {
            pieces = Integer.parseInt(input);
            totalPieces -= pieces;

            if (totalPieces <= 0) {
                System.out.printf("No more cake left! You need %d pieces more.", Math.abs(totalPieces ));
                break;
            }
            input = scanner.nextLine();
        }
        if (input.equals("STOP")) {
            System.out.printf("%d pieces are left.", totalPieces);
        }

    }
}
