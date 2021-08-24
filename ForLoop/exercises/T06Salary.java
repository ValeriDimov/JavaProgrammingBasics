package ForLoop.exercises;

import java.util.Scanner;

public class T06Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numTabs = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());
        int fine = 0;

        for (int i = 1; i <= numTabs && salary > fine; i++) {

            String tabName = scanner.nextLine();

            switch (tabName) {
                case "Facebook":
                    fine += 150;
                    break;
                case "Instagram":
                    fine += 100;
                    break;
                case "Reddit":
                    fine += 50;
                    break;
            }
            if (salary <= fine) {
                System.out.println("You have lost your salary.");
            }

        }
        if (salary > fine){
            System.out.println(salary - fine);
        }

    }
}
