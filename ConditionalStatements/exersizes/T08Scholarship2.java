package ConditionalStatements.exersizes;

import java.util.Scanner;

public class T08Scholarship2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double income = Double.parseDouble(scanner.nextLine());
        double averageScore = Double.parseDouble(scanner.nextLine());
        double minSalary = Double.parseDouble(scanner.nextLine());

        double socialScholarship = 0.0;
        double excellenceScholarship = 0.0;
        String scholarship = "";

        if (income < minSalary && averageScore > 4.5) {

            socialScholarship = Math.floor(minSalary * 0.35);
        } else if (averageScore >= 5.5) {

            excellenceScholarship = Math.floor(averageScore * 25);
        }
        if ((income < minSalary && averageScore > 4.5) && (averageScore >= 5.5)) {
            if (excellenceScholarship >= socialScholarship) {
                scholarship = String.format("You get a scholarship for excellent results %f BGN", excellenceScholarship);
                System.out.println(scholarship);
            } else {
                scholarship = String.format("You get a Social scholarship %.0f BGN", socialScholarship);
                System.out.println(scholarship);
            }
        } else if (income < minSalary && averageScore > 4.5) {
            scholarship = String.format("You get a Social scholarship %.0f BGN", socialScholarship);
            System.out.println(scholarship);
        } else if (averageScore >= 5.5) {
            scholarship = String.format("You get a scholarship for excellent results %.0f BGN", excellenceScholarship);
            System.out.println(scholarship);
        } else {
            scholarship = "You cannot get a scholarship!";
            System.out.println(scholarship);
        }
    }
}
