package WhileLoop.exercises;

import java.util.Scanner;

public class T04Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int additionalSteps = 0;
        int totalSteps = 0;
        int target = 10000;
        //int additionalSteps = 0;


        while (totalSteps < target) {

            if (input.equals("Going home")) {
                input = scanner.nextLine();
                additionalSteps = Integer.parseInt(input);
               totalSteps += additionalSteps;
               if (totalSteps >= target) {
                   System.out.printf("Goal reached! Good job!\n%d steps over the goal!", totalSteps - target);
               } else {
                   System.out.printf("%d more steps to reach goal.", target - totalSteps);
               }
                break;
            }
            int steps = Integer.parseInt(input);
            totalSteps += steps;
            if (totalSteps >= target) {
                System.out.printf("Goal reached! Good job!\n%d steps over the goal!", totalSteps - target);
                break;
            }
            input = scanner.nextLine();
        }

    }
}
