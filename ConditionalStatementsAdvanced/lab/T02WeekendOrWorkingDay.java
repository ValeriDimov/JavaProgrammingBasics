package ConditionalStatementsAdvanced.lab;

import java.util.Scanner;

public class T02WeekendOrWorkingDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameOfDay = scanner.nextLine();

        switch (nameOfDay){
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("Working day");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Error");
        }


    }
}
