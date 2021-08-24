package NestedLoop.lab;

import java.util.Scanner;

public class T03Combinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int counter = 0;

        for (int i = 0; i <= num; i++) {
            for (int j = 0; j <= num; j++) {
                for (int k = 0; k <= num ; k++) {
                    int result = i + j + k;
                    if (result == num) {
                        counter++;
                    }
                }
            }
        }
        System.out.println(counter);
    }
}
