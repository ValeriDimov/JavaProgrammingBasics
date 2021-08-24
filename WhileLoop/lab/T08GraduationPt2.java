package WhileLoop.lab;

import java.util.Scanner;

public class T08GraduationPt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int semester = 0;
        int negativeScore = 0;
        double score = 0.0;
        double sumScore = 0.0;
        int finSemester = 0;

        while (semester < 12) {

            score = Double.parseDouble(scanner.nextLine());
            sumScore += score;
            if (score < 4) {
                negativeScore++;
            }
            semester++;
            finSemester = semester;
            if (negativeScore > 1) {
                semester--;
                System.out.printf("%s has been excluded at %d grade", name, semester);

                break;
            }
        }
        if (finSemester == 12) {
            System.out.printf("%s graduated. Average grade: %.2f", name, sumScore / 12);
        }
    }
}
