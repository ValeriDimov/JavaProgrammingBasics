package ConditionalStatements.exersizes;

import java.util.Scanner;

public class T03SpeedInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double speed = Double.parseDouble(scanner.nextLine());
        String slow = "slow";
        String average = "average";
        String fast = "fast";
        String ultraFast = "ultra fast";
        String extremelyFast = "extremely fast";

        //При скорост до 10 (включително) отпечатайте “slow”.
        // При скорост над 10 и до 50 отпечатайте “average”.
        // При скорост над 50 и до 150 отпечатайте “fast”.
        // При скорост над 150 и до 1000 отпечатайте “ultra fast”.
        // При по-висока скорост отпечатайте “extremely fast”.

        if (speed <= 10) {
            System.out.println(slow);
        } else if (speed <= 50) {
            System.out.println(average);
        } else if (speed <= 150) {
            System.out.println(fast);
        } else if (speed <= 1000) {
            System.out.println(ultraFast);
        } else {
            System.out.println(extremelyFast);
        }
    }
}