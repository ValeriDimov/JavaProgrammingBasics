package Basics;

import java.util.Scanner;

public class T07ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
//•	"The architect {името на архитекта} will need
// {необходими часове} hours to complete {брой на проектите} project/s."
        int numberHoursPerProject = 3 * count;

        System.out.printf("The architect %s will need %s hours to complete %s project/s.", name, numberHoursPerProject, count);

    }
}
