package ConditionalStatements;

import java.util.Scanner;

public class T03EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Вход
        int numInput = Integer.parseInt(scanner.nextLine());

        //променливи, калкулация, условия и принтиране
        if (numInput % 2 == 0){
            System.out.println("even");
        } else{
            System.out.println("odd");
        }
    }
}
