package WhileLoop.exercises;

import java.util.Scanner;

public class T02ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int badScores = Integer.parseInt(scanner.nextLine());
        String nameOfTask = scanner.nextLine();
        int score = Integer.parseInt(scanner.nextLine());
        double avgScore = 0.0;
        int countTasks = 0;
        String lastTask = "";
        int countBadScore = 0;

        while (countBadScore != badScores) {
            countTasks++;
            avgScore += score;
            lastTask = nameOfTask;

            if (score <= 4) {
                countBadScore++;

            }
            if (countBadScore == badScores) {
                break;
            }
            nameOfTask = scanner.nextLine();
            if (nameOfTask.equals("Enough")) {
                break;
            }
            score = Integer.parseInt(scanner.nextLine());

        }
        if (nameOfTask.equals("Enough")){
            System.out.printf("Average score: %.2f\nNumber of problems: %d\nLast problem: %s", avgScore / countTasks, countTasks, lastTask);

        }else {
            System.out.printf("You need a break, %d poor grades.", countBadScore);
        }

    }

}


