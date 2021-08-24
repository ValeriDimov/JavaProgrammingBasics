package ConditionalStatements;

import java.util.Scanner;

public class T07ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vacationPrice = Double.parseDouble(scanner.nextLine());
        int countPuzzles = Integer.parseInt(scanner.nextLine());
        int countDaws = Integer.parseInt(scanner.nextLine());
        int countBears = Integer.parseInt(scanner.nextLine());
        int countMinions = Integer.parseInt(scanner.nextLine());
        int countTrucks = Integer.parseInt(scanner.nextLine());

        double puzzlePrice = 2.6;
        double dawsPrice = 3.0;
        double bearsPrice = 4.1;
        double minionsPrice = 8.2;
        double trucksPrice = 2;

        double sumToys = countPuzzles * puzzlePrice + countDaws * dawsPrice +
               countBears * bearsPrice + countMinions * minionsPrice + countTrucks * trucksPrice;
        int countToys = countPuzzles + countDaws + countBears + countMinions + countTrucks;
        double discountSumToys = sumToys - (sumToys * 0.25);
        double rent = 0.1;
        double finSumWithDiscount = discountSumToys - (discountSumToys * rent);
        double finSumWithoutDiscount = sumToys - (sumToys * rent);

        if (countToys >= 50){
            if (vacationPrice <= finSumWithDiscount){
                System.out.printf("Yes! %.2f lv left.", finSumWithDiscount - vacationPrice);
            } else{
                System.out.printf("Not enough money! %.2f lv needed.", vacationPrice - finSumWithDiscount);
            }
        } else{
            if (vacationPrice <= finSumWithoutDiscount){
                System.out.printf("Yes! %.2f lv left.", finSumWithoutDiscount - vacationPrice);
            } else{
                System.out.printf("Not enough money! %.2f lv needed.", vacationPrice - finSumWithoutDiscount);
            }
        }

       }
}
