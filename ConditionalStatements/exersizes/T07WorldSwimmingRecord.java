package ConditionalStatements.exersizes;

import java.util.Scanner;

public class T07WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double currentRecord = Double.parseDouble(scanner.nextLine());
        double distanceInMetres = Double.parseDouble(scanner.nextLine());
        double timePerMetre = Double.parseDouble(scanner.nextLine());
        double delayInSecPer15Metres = 12.5;

        double initialFullTime = timePerMetre * distanceInMetres;
        double countDelays = Math.floor(distanceInMetres / 15);
        double pureFullTime = initialFullTime + (countDelays * delayInSecPer15Metres);
        //•	Ако Иван е подобрил Световния рекорд (времето му е по-малко от рекорда) отпечатваме:
        //o	"Yes, he succeeded! The new world record is {времето на Иван} seconds."
        //•	Ако НЕ е подобрил рекорда (времето му е по-голямо или равно на рекорда) отпечатваме:
        //o	"No, he failed! He was {недостигащите секунди} seconds slower."
        //Резултатът трябва да се форматира до втория знак след десетичната запетая.
        if (pureFullTime < currentRecord) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", pureFullTime);
        } else {
            double slower = pureFullTime - currentRecord;
            System.out.printf("No, he failed! He was %.2f seconds slower.", slower);
        }
    }
}
