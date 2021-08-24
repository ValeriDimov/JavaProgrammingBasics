package ConditionalStatements.exersizes;

import java.util.Scanner;

public class T02BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        double bonusPoints = 0.0;


        //•	Ако числото е до 100 включително, бонус точките са 5.
        //•	Ако числото е по-голямо от 100, бонус точките са 20% от числото.
        //•	Ако числото е по-голямо от 1000, бонус точките са 10% от числото.

        //•	Допълнителни бонус точки (начисляват се отделно от предходните):
        //o	За четно число  + 1 т.
        //o	За число, което завършва на 5  + 2 т.

        if (number <= 100) {
            bonusPoints += 5;

        } else if (number <= 1000) {
            bonusPoints += number * 0.2;

        } else {
            bonusPoints += number * 0.1;
        }

        int numIsOdd = number % 2;
        int numEndsWithFive = number % 10;

        if (numIsOdd == 0) {
            bonusPoints += 1;
            System.out.printf("%.1f \n", bonusPoints);
            System.out.println(bonusPoints + number);

        } else if (numEndsWithFive == 5) {
            bonusPoints += 2;
            System.out.printf("%.1f \n", bonusPoints);
            System.out.println(bonusPoints + number);
        } else {
            System.out.printf("%.1f \n", bonusPoints);
            System.out.println(bonusPoints + number);
        }
    }
}
