package ConditionalStatementsAdvanced.exersizes;

import java.util.Scanner;

public class T02SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int degrees = Integer.parseInt(scanner.nextLine());
        String dayPart = scanner.nextLine();
        String outfit = "";
        String shoes = "";
        String result = "";

        switch (dayPart) {
            case "Morning":
                if (degrees >= 10 && degrees <= 18) {
                    outfit = "Sweatshirt";
                    shoes = "Sneakers";
                    result = String.format("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
                } else if (degrees <= 24) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    result = String.format("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
                } else {
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                    result = String.format("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
                }
                break;
            case "Afternoon":
                if (degrees >= 10 && degrees <= 18) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    result = String.format("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
                } else if (degrees <= 24) {
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                    result = String.format("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
                } else {
                    outfit = "Swim Suit";
                    shoes = "Barefoot";
                    result = String.format("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
                }
                break;
            case "Evening":
                if (degrees >= 10 && degrees <= 18) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    result = String.format("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
                } else if (degrees <= 24) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    result = String.format("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
                } else {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    result = String.format("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
                }
                break;
        }
        System.out.println(result);
    }
}
