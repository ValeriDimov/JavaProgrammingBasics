package ConditionalStatementsAdvanced.exersizes;

import java.util.Scanner;

public class T01Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String filmType = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        int result = rows * columns;
        double revenue = 0.0;

        switch (filmType){
            case "Premiere":
                revenue = result * 12.0;
                break;
            case "Normal":
                revenue = result * 7.5;
                break;
            case "Discount":
                revenue = result * 5.0;
                break;
        }
        System.out.printf("%.2f leva", revenue);
    }
}
