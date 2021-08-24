package ConditionalStatementsAdvanced.exersizes;

import java.util.Scanner;

public class T07HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int numberNights = Integer.parseInt(scanner.nextLine());
        double priceStudio = 0.0;
        double priceApartment = 0.0;

        switch (month) {
            case "May":
            case "October":
                if (numberNights <= 7) {
                    priceStudio = numberNights * 50;
                    priceApartment = numberNights * 65;
                } else if (numberNights <= 14) {
                    priceStudio = numberNights * 50 * 0.95;
                    priceApartment = numberNights * 65;
                } else {
                    priceStudio = numberNights * 50 * 0.70;
                    priceApartment = numberNights * 65 * 0.90;
                }
                break;
            case "June":
            case "September":
                if (numberNights <= 14) {
                    priceStudio = numberNights * 75.20;
                    priceApartment = numberNights * 68.70;
                } else {
                    priceStudio = numberNights * 75.2 * 0.80;
                    priceApartment = numberNights * 68.7 * 0.90;
                }
                break;
            case "July":
            case "August":
                if (numberNights <= 14) {
                    priceStudio = numberNights * 76;
                    priceApartment = numberNights * 77;
                } else {
                    priceStudio = numberNights * 76;
                    priceApartment = numberNights * 77 * 0.90;
                }
                break;
        }
        System.out.printf("Apartment: %.2f lv.\nStudio: %.2f lv.", priceApartment, priceStudio);
    }
}
