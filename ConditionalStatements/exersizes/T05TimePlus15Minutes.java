package ConditionalStatements.exersizes;

import java.util.Scanner;

public class T05TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int newMunites = minutes + 15;
        int newHour = hour + 1;
        int minutesPlusZero = newMunites - 60;
        int hourEqualToZero = newHour - 24;

        if (minutes < 45) {
            System.out.printf("%d:%d", hour, newMunites);
        } else if (minutes >= 45 && minutes < 55 && hour != 23) {
            System.out.printf("%d:0%d", newHour, minutesPlusZero);
        } else if (minutes >= 55 && hour != 23) {
            System.out.printf("%d:%d", newHour, minutesPlusZero);
        } else if (minutes >= 55 && hour == 23) {
            System.out.printf("%d:%d", hourEqualToZero, minutesPlusZero);
        } else if (minutes >= 45 && minutes < 55 && hour == 23) {
            System.out.printf("%d:0%d", hourEqualToZero, minutesPlusZero);
        }
    }
}
