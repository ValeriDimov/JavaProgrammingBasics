package Exams.preRealExam;

import java.util.Scanner;

public class T04Exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int studentsCount = Integer.parseInt(scanner.nextLine());
        double sumScores = 0.0;
        int countTwoToThree = 0;
        int countThreeToFour = 0;
        int countFourToFive = 0;
        int countFiveToSix = 0;

        for (int i = 1; i <= studentsCount; i++) {
            double score = Double.parseDouble(scanner.nextLine());
            sumScores += score;

            if (score < 3) {
                countTwoToThree++;
            } else if (score < 4) {
                countThreeToFour++;
            } else if (score < 5) {
                countFourToFive++;
            } else {
                countFiveToSix++;
            }
        }
        System.out.printf("Top students: %.2f%%%n", 1.0 * countFiveToSix / studentsCount * 100);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", 1.0 * countFourToFive / studentsCount * 100);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", 1.0 * countThreeToFour / studentsCount * 100);
        System.out.printf("Fail: %.2f%%%n", 1.0 * countTwoToThree / studentsCount * 100);
        System.out.printf("Average: %.2f", sumScores / studentsCount);
    }
}
