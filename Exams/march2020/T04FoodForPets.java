package Exams.march2020;

import java.util.Scanner;

public class T04FoodForPets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Брой дни – цяло число в диапазона [1…30]
        // Общо количество храна – реално число в диапазона [0.00…10000.00]

        int days = Integer.parseInt(scanner.nextLine());
        double quantityFood = Double.parseDouble(scanner.nextLine());
        double totalFood = 0.0;
        double eatenBiscuits = 0.0;
        double eatenBiscuits2 = 0.0;
        double totalBiscuits = 0.0;
        double finalQuantity = 0.0;
        int animalFood = 0;
        int totalDogFood = 0;
        int totalCatFood = 0;

        for (int i = 1; i <= days; i++) {
            int dogFood = Integer.parseInt(scanner.nextLine());
            int catFood = Integer.parseInt(scanner.nextLine());
            int n = 3;

            if (i == 3) {
                eatenBiscuits = (dogFood + catFood) * 0.1;
                totalBiscuits += eatenBiscuits;
            }
            if (i == n + 3) {
                eatenBiscuits2 = (dogFood + catFood) * 0.1;
                totalBiscuits += eatenBiscuits2;
            }

            totalDogFood += dogFood;
            totalCatFood += catFood;
            animalFood = totalDogFood + totalCatFood;
        }
        //"Total eaten biscuits: {количество изядени бисквитки}gr."
        // "{процент изядена храна}% of the food has been eaten."
        // "{процент изядена храна от кучето}% eaten from the dog."
        // "{процент изядена храна от котката}% eaten from the cat."
        System.out.printf("Total eaten biscuits: %.0fgr.%n", totalBiscuits);
        System.out.printf("%.2f%% of the food has been eaten.%n", animalFood / quantityFood * 100);
        System.out.printf("%.2f%% eaten from the dog.%n", 1.0 * totalDogFood / animalFood * 100);
        System.out.printf("%.2f%% eaten from the cat.", 1.0 * totalCatFood / animalFood * 100);
    }
}

