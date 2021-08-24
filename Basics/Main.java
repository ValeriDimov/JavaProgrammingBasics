package Basics;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        double salesVolume = Double.parseDouble(scanner.nextLine());
        double premium = 0.0;

        switch (town) {
            case "Sofia":
                if (salesVolume >= 0 && salesVolume <= 500) {
                    premium = 0.05;
                } else if (salesVolume > 500 && salesVolume <= 1000) {
                    premium = 0.07;
                } else if (salesVolume > 1000 && salesVolume <= 10000) {
                    premium = 0.08;
                } else if (salesVolume > 10000) {
                    premium = 0.12;
                }
                break;
            case "Varna":
                if (salesVolume >= 0 && salesVolume <= 500) {
                    premium = 0.045;
                } else if (salesVolume > 500 && salesVolume <= 1000) {
                    premium = 0.075;
                } else if (salesVolume > 1000 && salesVolume <= 10000) {
                    premium = 0.10;
                } else if (salesVolume > 10000) {
                    premium = 0.13;
                }
                break;
            case "Plovdiv":
                if (salesVolume >= 0 && salesVolume <= 500) {
                    premium = 0.055;
                } else if (salesVolume > 500 && salesVolume <= 1000) {
                    premium = 0.08;
                } else if (salesVolume > 1000 && salesVolume <= 10000) {
                    premium = 0.12;
                } else if (salesVolume > 10000) {
                    premium = 0.145;
                }
                break;

        }
        //  if (town.equals("Sofia") || town.equals("Varna") || town.equals("Plovdiv")) {
        //      if (salesVolume >= 0) {
        //          System.out.printf("%.2f", premium * salesVolume);
        //    } else {
        //      System.out.println("error");
        //}
        // } else {
        //    System.out.println("error");
        //}

        if ((!"Sofia".equals(town) && !"Varna".equals(town) && !"Plovdiv".equals(town)) || (salesVolume < 0)) {
            System.out.println("error");
        } else {
            System.out.printf("%.2f", premium * salesVolume);
        }
    }
}

