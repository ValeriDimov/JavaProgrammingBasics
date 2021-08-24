package Basics;

import java.util.Scanner;

public class T01USDToBGN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double dollars = Double.parseDouble(scanner.nextLine());
        double resultInBGN = dollars * 1.79549;

        System.out.println(resultInBGN);
    }
}
