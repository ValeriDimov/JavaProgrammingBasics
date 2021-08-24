package Exams.march2020;

import java.util.Scanner;

public class T01ChangeBureau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bitcoin = Integer.parseInt(scanner.nextLine());
        double chinese = Double.parseDouble(scanner.nextLine());
        double fee = Double.parseDouble(scanner.nextLine());

        double bitcoinRate = 1.0 * bitcoin * 1168;
        double chineseRate = chinese * 0.15 * 1.76;
        double feePercentage = fee * 0.01;
        double euro = 0.0;
        double euroRate = 1.95;

        euro = (bitcoinRate + chineseRate) - ((bitcoinRate + chineseRate) * feePercentage);
        System.out.printf("%.2f", euro / euroRate);

    }
}
