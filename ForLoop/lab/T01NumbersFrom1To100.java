package ForLoop.lab;

import java.util.Scanner;

public class T01NumbersFrom1To100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 1;
        for (int i = 1; i <= 100; i++) {
            System.out.println(num);
            num++;
        }
    }
}
