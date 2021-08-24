package ConditionalStatements.exersizes;

import java.util.Scanner;

public class T01SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstSprinter = Integer.parseInt(scanner.nextLine());
        int secondSprinter = Integer.parseInt(scanner.nextLine());
        int thirdSprinter = Integer.parseInt(scanner.nextLine());

        int totalSeconds = firstSprinter + secondSprinter + thirdSprinter;
        int minutes = totalSeconds / 60;
        int secOutOfMins = totalSeconds % 60;

        if (secOutOfMins < 10) {
            System.out.printf(minutes + ":0" + secOutOfMins);
        }else {
            System.out.printf(minutes + ":" + secOutOfMins);
        }
    }
}
