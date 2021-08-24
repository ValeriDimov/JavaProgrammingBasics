package Exams.march2020;

import java.util.Scanner;

public class T02CatWalking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // На първия ред - минути разходка на ден - цяло число в интервала [1...50]
        // На втория ред - броят на разходките дневно - цяло число в интервала [1…10]
        // На третия ред - приетите от котката калории на ден – цяло число в интервала [100…4000]

        int minutes = Integer.parseInt(scanner.nextLine());
        int walksDaily = Integer.parseInt(scanner.nextLine());
        int caloriesDaily = Integer.parseInt(scanner.nextLine());

        int totalMinutesWalks = minutes * walksDaily;
        double burnedCalories = 1.0 * totalMinutesWalks * 5;
        double neededCalories = caloriesDaily * 0.5;

        if (burnedCalories >= neededCalories) {
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %.0f.", burnedCalories);
        }else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %.0f.", burnedCalories);
        }

    }
}
