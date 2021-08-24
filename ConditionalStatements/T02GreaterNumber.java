package ConditionalStatements;

import java.util.Scanner;

public class T02GreaterNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // вход
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        // калкулация, условия, принтиране
        if (firstNum > secondNum){
            System.out.println(firstNum);
        } else{
            System.out.println(secondNum);
        }
    }
}
