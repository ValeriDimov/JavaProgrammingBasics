package Exams.july2020;

import java.util.Scanner;

public class T06BarcodeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstInput = Integer.parseInt(scanner.nextLine());
        int secondInput = Integer.parseInt(scanner.nextLine());

        String f1 = "" + firstInput;
        String f2 = "" + secondInput;

        int f1Num1 = 0;
        int f1Num2 = 0;
        int f1Num3 = 0;
        int f1Num4 = 0;
        int f2Num1 = 0;
        int f2Num2 = 0;
        int f2Num3 = 0;
        int f2Num4 = 0;

        for (int i = 0; i < f1.length(); i++) {
            f1Num1 = Integer.parseInt("" + f1.charAt(0));
            f1Num2 = Integer.parseInt("" + f1.charAt(1));
            f1Num3 = Integer.parseInt("" + f1.charAt(2));
            f1Num4 = Integer.parseInt("" + f1.charAt(3));
        }
        for (int i = 0; i < f2.length(); i++) {
            f2Num1 = Integer.parseInt("" + f2.charAt(0));
            f2Num2 = Integer.parseInt("" + f2.charAt(1));
            f2Num3 = Integer.parseInt("" + f2.charAt(2));
            f2Num4 = Integer.parseInt("" + f2.charAt(3));
        }

        for (int i = f1Num1; i <= f2Num1; i++) {
            for (int j = f1Num2; j <= f2Num2; j++) {
                for (int k = f1Num3; k <= f2Num3; k++) {
                    for (int l = f1Num4; l <= f2Num4; l++) {
                        if (i % 2 != 0 && j % 2 != 0 && k % 2 != 0 && l % 2 != 0) {
                            System.out.printf("%d%d%d%d ", i, j, k, l);
                        }
                    }
                }
            }
        }
    }
}
