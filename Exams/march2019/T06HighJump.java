package Exams.march2019;

import java.util.Scanner;

public class T06HighJump {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int target = Integer.parseInt(scanner.nextLine());
        int position = target - 30;
        int countJumps = 0;
        boolean flag = false;

        for (int i = position; i <= target; i += 5) {
            int jumps = Integer.parseInt(scanner.nextLine());
            countJumps++;

            if (jumps <= i) {
                for (int j = 1; j < 3; j++) {
                    jumps = Integer.parseInt(scanner.nextLine());
                    countJumps++;

                    if (jumps > i) {
                        break;
                    } else if (j == 2) {
                        flag = true;
                    }
                }
            }
            if (flag) {
                System.out.printf("Tihomir failed at %dcm after %d jumps.", i, countJumps);
                break;
            }
        }
        if (!flag) {
            System.out.printf("Tihomir succeeded, he jumped over %dcm after %d jumps.", target, countJumps);
        }
    }
}
