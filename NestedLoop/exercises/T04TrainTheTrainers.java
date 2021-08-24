package NestedLoop.exercises;

import java.util.Scanner;

public class T04TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int refers = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        double finalAssessment = 0.0;
        int counter = 0;

        while (!input.equals("Finish")) {
            String presentationName = input;
            double averageAssessment = 0.0;

            for (int i = 1; i <= refers; i++) {
                double assessment = Double.parseDouble(scanner.nextLine());
                averageAssessment += assessment;
                counter++;

            }
            System.out.printf("%s - %.2f.%n", presentationName, averageAssessment / refers);
            finalAssessment +=averageAssessment;
            input = scanner.nextLine();

        }
        System.out.printf("Student's final assessment is %.2f.", finalAssessment / counter);
    }

}

