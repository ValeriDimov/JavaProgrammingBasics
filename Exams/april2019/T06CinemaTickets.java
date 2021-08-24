package Exams.april2019;

import java.util.Scanner;

public class T06CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movieNames = scanner.nextLine();
        int countStudentsTickets = 0;
        int countStandardsTickets = 0;
        int countKidsTickets = 0;
        int countAllMoviesTickets = 0;


        while (!movieNames.equals("Finish")) {
            int freeSeats = Integer.parseInt(scanner.nextLine());
            String seatType = scanner.nextLine();
            int countTickets = 0;
            while (!seatType.equals("End")) {
                countTickets++;

                switch (seatType) {
                    case "student":
                        countStudentsTickets++;
                        break;
                    case "standard":
                        countStandardsTickets++;
                        break;
                    case "kid":
                        countKidsTickets++;
                        break;
                }


                if (countTickets >= freeSeats) {
                    break;
                }

                seatType = scanner.nextLine();
            }
            System.out.printf("%s - %.2f%% full.%n", movieNames, 1.0 * countTickets / freeSeats * 100);
            countAllMoviesTickets += countTickets;

            movieNames = scanner.nextLine();
        }
        System.out.printf("Total tickets: %d%n", countAllMoviesTickets);
        System.out.printf("%.2f%% student tickets.%n", 1.0 * countStudentsTickets / countAllMoviesTickets * 100);
        System.out.printf("%.2f%% standard tickets.%n", 1.0 * countStandardsTickets / countAllMoviesTickets * 100);
        System.out.printf("%.2f%% kids tickets.%n", 1.0 * countKidsTickets / countAllMoviesTickets * 100);
    }
}
