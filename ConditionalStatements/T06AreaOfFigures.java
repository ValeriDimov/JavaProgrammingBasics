package ConditionalStatements;

import java.util.Scanner;

public class T06AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String figureType = scanner.nextLine();

        if (figureType.equals("square")){
            double sizeOne = Double.parseDouble(scanner.nextLine());
            double resultSizeOne = sizeOne * sizeOne;
            System.out.printf("%.3f", resultSizeOne);
        } else if (figureType.equals("rectangle")){
            double sizeOne = Double.parseDouble(scanner.nextLine());
            double sizeTwo = Double.parseDouble(scanner.nextLine());
            double resultSizeTwo = sizeOne * sizeTwo;
            System.out.printf("%.3f", resultSizeTwo);
        } else if (figureType.equals("circle")){
            double r = Double.parseDouble(scanner.nextLine());
            double resultSizeR = Math.PI * (r * r);
            System.out.printf("%.3f", resultSizeR);
        } if (figureType.equals("triangle")){
            double sizeOne = Double.parseDouble(scanner.nextLine());
            double sizeTwo = Double.parseDouble(scanner.nextLine());
            double resultSizeTwo = (sizeOne * sizeTwo) / 2;
            System.out.printf("%.3f", resultSizeTwo);
        }
    }
}
