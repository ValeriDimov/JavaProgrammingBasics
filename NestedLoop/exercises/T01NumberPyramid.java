package NestedLoop.exercises;

import java.util.Scanner;

public class T01NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        boolean flag = false;

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                counter++;
                System.out.print(counter + " ");
                if (counter == n) {
                    flag = true;
                    break;
                }

            }
            System.out.println();
            if (flag) {
                break;
            }
        }

    }
}
