package ForLoop.exercises;

import java.util.Scanner;

public class T03OddOrEvenPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n = Integer.parseInt(scanner.nextLine());

        double evenSumNumbers = 0;
        double oddSumNumbers = 0;
        double maxEvenNum = Integer.MIN_VALUE;
        double maxOddNum = Integer.MIN_VALUE;
        double minEvenNum = Integer.MAX_VALUE;
        double minOddNum = Integer.MAX_VALUE;


        for (int i = 1; i <= n; i++) {

            double numbers = Double.parseDouble(scanner.nextLine());

            if (i % 2 != 0) {
                if (numbers > maxOddNum) {
                    maxOddNum = numbers;
                }
                if (numbers < minOddNum) {
                    minOddNum = numbers;
                }
            } else {
                if (numbers > maxEvenNum) {
                    maxEvenNum = numbers;
                }
                if (numbers < minEvenNum) {
                    minEvenNum = numbers;
                }
            }
            if (i % 2 != 0) {
                oddSumNumbers += numbers;
            } else {
                evenSumNumbers += numbers;
            }

        }

        if (n == 0) {
            System.out.printf("OddSum=0.00,%n");
            System.out.printf("OddMin=No,%n");
            System.out.printf("OddMax=No,%n");
            System.out.printf("EvenSum=0.00,%n");
            System.out.printf("EvenMin=No,%n");
            System.out.print("EvenMax=No");
        } else if (n == 1) {
            System.out.printf("OddSum=%.2f,%n", oddSumNumbers);
            System.out.printf("OddMin=%.2f,%n", minOddNum);
            System.out.printf("OddMax=%.2f,%n", maxOddNum);
            System.out.printf("EvenSum=%.2f,%n", evenSumNumbers);
            System.out.printf("EvenMin=No,%n");
            System.out.print("EvenMax=No");
        } else {
            System.out.printf("OddSum=%.2f,%n", oddSumNumbers);
            System.out.printf("OddMin=%.2f,%n", minOddNum);
            System.out.printf("OddMax=%.2f,%n", maxOddNum);
            System.out.printf("EvenSum=%.2f,%n", evenSumNumbers);
            System.out.printf("EvenMin=%.2f,%n", minEvenNum);
            System.out.printf("EvenMax=%.2f", maxEvenNum);
        }
    }
}
