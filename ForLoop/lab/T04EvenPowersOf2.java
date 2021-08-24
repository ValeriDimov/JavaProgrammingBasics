package ForLoop.lab;

import java.util.Scanner;

public class T04EvenPowersOf2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double step = 2.0;
        for (int i = 0; i <= n; i += 2) {

            System.out.printf("%.0f%n", Math.pow(step,i));

        }
    }
}
