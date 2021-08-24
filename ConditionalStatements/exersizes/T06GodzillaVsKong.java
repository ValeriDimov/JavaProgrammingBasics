package ConditionalStatements.exersizes;

import java.util.Scanner;

public class T06GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int numStatists = Integer.parseInt(scanner.nextLine());
        double clothesPricePerStatist = Double.parseDouble(scanner.nextLine());
        double allClothesPrice = numStatists * clothesPricePerStatist;
        double decorPrice = budget * 0.1;
        double discount = allClothesPrice - (allClothesPrice * 0.1);//При повече от 150 статиста

        //•	Ако  парите за декора и дрехите са повече от бюджета:
        //o	"Not enough money!"
        //o	"Wingard needs {парите недостигащи за филма} leva more."
        //•	Ако парите за декора и дрехите са по малко или равни на бюджета:
        //o	"Action!"
        //o	"Wingard starts filming with {останалите пари} leva left."
        //Резултатът трябва да е форматиран до втория знак след десетичната запетая.
        double notEnough1 = Math.abs(budget - (decorPrice + discount));
        double notEnough2 = Math.abs(budget - (decorPrice + allClothesPrice));

        if ((numStatists > 150) && (budget < (decorPrice + discount))) {
            System.out.printf("Not enough money!\nWingard needs %.2f leva more.", notEnough1);
        }else if ((numStatists > 150) && (budget >= (decorPrice + discount))) {
            System.out.printf("Action!\nWingard starts filming with %.2f leva left.", notEnough1);
        }

        if ((numStatists <= 150) && (budget < (decorPrice + allClothesPrice))) {
            System.out.printf("Not enough money!\nWingard needs %.2f leva more.", notEnough2);
        }else if ((numStatists <= 150) && (budget >= (decorPrice + allClothesPrice))) {
            System.out.printf("Action!\nWingard starts filming with %.2f leva left.", notEnough2);
        }
    }
}
