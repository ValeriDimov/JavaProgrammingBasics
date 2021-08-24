package ConditionalStatementsAdvanced.lab;

import java.util.Scanner;

public class T07WorkingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        String weekDay = scanner.nextLine();

        if (!weekDay.equals("Sunday")) {
            if (hour >= 10 && hour <= 18) {
                System.out.println("open");
            } else {
                System.out.println("closed");
            }
        } else {
            System.out.println("closed");
        }
    }
}
