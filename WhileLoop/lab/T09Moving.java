package WhileLoop.lab;

import java.util.Scanner;

public class T09Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int weight = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        int cube = weight * length * height;
        int totalNumBoxes = 0;
        String boxes = scanner.nextLine();


        while (!boxes.equals("Done")) {
            int numBoxes = Integer.parseInt(boxes);
            totalNumBoxes += numBoxes;

            if (totalNumBoxes >= cube) {
                System.out.printf("No more free space! You need %d Cubic meters more.", totalNumBoxes - cube);
                break;
            }

            boxes = scanner.nextLine();
        }
        if (boxes.equals("Done")) {
            System.out.printf("%d Cubic meters left.", cube - totalNumBoxes);
        }

    }
}
