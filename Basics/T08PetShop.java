package Basics;

import java.util.Scanner;

public class T08PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dogsCount = Integer.parseInt(scanner.nextLine());
        int otherAnimalsCount = Integer.parseInt(scanner.nextLine());

        double dogsFoodPrice = 2.5;
        double othersAnimalsFoodPrice = 4;
        //"{крайната сума} lv."

        double result = dogsCount * dogsFoodPrice + otherAnimalsCount * othersAnimalsFoodPrice;
        System.out.println(result + " lv.");

    }
}
