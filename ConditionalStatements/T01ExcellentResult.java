package ConditionalStatements;

import java.util.Scanner;

public class T01ExcellentResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // вход
        int appraisal = Integer.parseInt(scanner.nextLine());

        //калкулация и conditional statements
        if (appraisal >= 5){
            System.out.println("Excellent!");
        }
    }
}
