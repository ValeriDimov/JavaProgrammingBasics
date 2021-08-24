package Exams.preRealExam;

import java.util.Scanner;

public class T06SumAndProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        boolean flag = false;


        for (int a = 1; a <= 9; a++) {
            for (int b = 9; b >= a; b--) {
                for (int c = 0; c <= 9; c++) {
                    for (int d = 9; d >= c; d--) {

                        if ((a + b + c + d) == (a * b * c * d) && n % 10 == 5) {
                            flag = true;
                            System.out.printf("%d%d%d%d%n", a, b, c, d);
                            break;
                        } else if ((a * b * c * d) / (a + b + c + d) == 3 && n % 3 == 0) {
                            flag = true;
                            System.out.printf("%d%d%d%d%n", d, c, b, a);
                            break;
                        }

                    }
                    if (flag) {
                        break;
                    }
                }
                if (flag) {
                    break;
                }
            }
            if (flag) {
                break;
            }
        }
        if (!flag) {
            System.out.println("Nothing found");

        }
    }
}
