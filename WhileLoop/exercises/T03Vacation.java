package WhileLoop.exercises;

import java.util.Scanner;

public class T03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double neededMoney = Double.parseDouble(scanner.nextLine());
        double herMoney = Double.parseDouble(scanner.nextLine());
        int days = 0;
        int daySpending = 0;
        String action = scanner.nextLine();
        double moneyMovement = Double.parseDouble(scanner.nextLine());
        double totalAccount = herMoney;

        while (totalAccount < neededMoney) {
            days++;

            switch (action) {
                case "spend":
                    if ((totalAccount - moneyMovement) <0) {
                        totalAccount = 0.0;
                    } else {
                        totalAccount -= moneyMovement;
                    }

                    daySpending++;
                    break;
                case "save":
                    totalAccount += moneyMovement;
                    daySpending = 0;
                    break;
            }

            if (daySpending == 5) {
                System.out.println("You can't save the money.");
                System.out.printf("%d", days);
                break;
            }

            if (totalAccount >= neededMoney){
                break;
            }
            action = scanner.nextLine();
            moneyMovement = Double.parseDouble(scanner.nextLine());
        }
        if (totalAccount >= neededMoney) {
            System.out.printf("You saved the money for %d days.", days);
        }

    }
}
