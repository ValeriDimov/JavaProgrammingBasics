package ConditionalStatementsAdvanced.exersizes;

import java.util.Scanner;

public class T06OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOne = Integer.parseInt(scanner.nextLine());
        int numberTwo = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
//„+“, „-“, „*“, „/“, „%“
        String message = "";

        double result = 0.0;
        String evenOrOdd = "";

        switch (operator) {
            case "+":
                result = numberOne + numberTwo;
                if ((numberOne + numberTwo) % 2 == 0) {
                    evenOrOdd = "even";
                    message = String.format("%d + %d = %.0f ", numberOne, numberTwo, result) + "-" + String.format(" %s", evenOrOdd);

                } else {
                    evenOrOdd = "odd";
                    message = String.format("%d + %d = %.0f ", numberOne, numberTwo, result) + "-" + String.format(" %s", evenOrOdd);
                }
                break;
            case "-":
                result = numberOne - numberTwo;
                if ((numberOne - numberTwo) % 2 == 0) {
                    evenOrOdd = "even";
                    message = String.format("%d - %d = %.0f ", numberOne, numberTwo, result) + "-" + String.format(" %s", evenOrOdd);
                } else {
                    evenOrOdd = "odd";
                    message = String.format("%d - %d = %.0f ", numberOne, numberTwo, result) + "-" + String.format(" %s", evenOrOdd);
                }
                break;
            case "*":
                result = numberOne * numberTwo;
                if ((numberOne * numberTwo) % 2 == 0) {
                    evenOrOdd = "even";
                    message = String.format("%d * %d = %.0f ", numberOne, numberTwo, result) + "-" + String.format(" %s", evenOrOdd);
                } else {
                    evenOrOdd = "odd";
                    message = String.format("%d * %d = %.0f ", numberOne, numberTwo, result) + "-" + String.format(" %s", evenOrOdd);
                }
                break;
            case "/":
                result = 1.0 * numberOne / numberTwo;
                if (numberTwo == 0) {
                    message = String.format("Cannot divide %d by zero", numberOne);
                } else {
                    message = String.format("%d / %d = %.2f", numberOne, numberTwo, result);
                }
                break;
            case "%":
                result = 1.0 * numberOne % numberTwo;
                if (numberTwo == 0) {
                    message = String.format("Cannot divide %d by zero", numberOne);
                } else {
                    message = String.format("%d", numberOne) + " % " + String.format("%d = %.0f", numberTwo, result);
                }
                break;

        }
        System.out.println(message);
    }
}

