package WhileLoop.lab;

import java.util.Scanner;

public class T02Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String pass = scanner.nextLine();
        String passTry = "";
        while (!passTry.equals(pass)) {

            passTry = scanner.nextLine();
        }
        System.out.printf("Welcome %s!", username);
    }
}
