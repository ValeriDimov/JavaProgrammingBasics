package ConditionalStatementsAdvanced.lab;

import java.util.Scanner;

public class T13SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String feedback = scanner.nextLine();
        int nights = days - 1;
        double price = 0.0;
//	"room for one person" – 18.00 лв. за нощувка
//	"apartment" – 25.00 лв. за нощувка
//	"president apartment" – 35.00 лв. за нощувка

        switch (roomType) {
            case "room for one person":
                price = nights * 18.0;
                break;
            case "apartment":
                if (days < 10) {
                    price = nights * 25.0 - ((nights * 25.0) * 0.3);
                } else if (days <= 15) {
                    price = nights * 25.0 - ((nights * 25.0) * 0.35);
                } else {
                    price = nights * 25.0 - ((nights * 25.0) * 0.5);
                }
                break;
            case "president apartment":
                if (days < 10) {
                    price = nights * 35.0 - ((nights * 35.0) * 0.1);
                } else if (days <= 15) {
                    price = nights * 35.0 - ((nights * 35.0) * 0.15);
                } else {
                    price = nights * 35.0 - ((nights * 35.0) * 0.2);
                }
                break;
        }
        if (feedback.equals("positive")){
            price += (price * 0.25);
        }else if (feedback.equals("negative")){
            price -= (price * 0.1);
        }
        System.out.printf("%.2f", price);
    }
}
