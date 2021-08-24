package ConditionalStatements.exersizes;

import java.util.Scanner;

public class T08Scholarship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double income = Double.parseDouble(scanner.nextLine());
        double avgApp = Double.parseDouble(scanner.nextLine());
        double minSalary = Double.parseDouble(scanner.nextLine());
        double socStepAmount = minSalary * 0.35;
        double excellenceStepAmount = avgApp * 25;

        if ((income <= minSalary) && (avgApp >= 4.5) && (socStepAmount > excellenceStepAmount)) {
            System.out.printf("You get a Social scholarship %.0f BGN", socStepAmount);

        } else if ((income < minSalary) && (avgApp >= 5.5) && (socStepAmount > excellenceStepAmount)) {
            System.out.printf("You get a Social scholarship %.0f BGN", socStepAmount);

        } else if ((avgApp >= 5.5) && (socStepAmount <= excellenceStepAmount)) {
            System.out.printf("You get a scholarship for excellent results %.0f BGN", excellenceStepAmount);

        } else if ((avgApp >= 5.5) && (socStepAmount > excellenceStepAmount)) {
            System.out.printf("You get a Social scholarship %.0f BGN", socStepAmount);

        } else if ((income <= minSalary) && (avgApp >= 4.5)) {
            System.out.printf("You get a Social scholarship %.0f BGN", socStepAmount);

        } else {
            System.out.println("You cannot get a scholarship!");
        }
    }
}


