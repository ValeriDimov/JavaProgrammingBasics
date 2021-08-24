package Exams.preRealExam;

import java.util.Scanner;

public class T01CatDiet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fatsPercents = Integer.parseInt(scanner.nextLine());
        int proteinsPercents = Integer.parseInt(scanner.nextLine());
        int hydratesPercents = Integer.parseInt(scanner.nextLine());
        int caloriesCount = Integer.parseInt(scanner.nextLine());
        int waterPercents = Integer.parseInt(scanner.nextLine());

        double fatsInGrams = (1.0 * fatsPercents / 100) * caloriesCount / 9;
        double proteinsInGrams = (1.0 * proteinsPercents / 100) * caloriesCount / 4;
        double hydratesInGrams = (1.0 * hydratesPercents / 100) * caloriesCount / 4;

        double foodWeight = fatsInGrams + proteinsInGrams + hydratesInGrams;
        double caloriesPerGram = caloriesCount / foodWeight;
        double waterPerGram = caloriesPerGram * waterPercents / 100;
        double resultWaterExclude = caloriesPerGram - waterPerGram;

        System.out.printf("%.4f", resultWaterExclude);
    }
}
