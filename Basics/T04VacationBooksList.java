package Basics;

import java.util.Scanner;

public class T04VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Вход
//1.	Брой страници в текущата книга – цяло число в интервала [1…1000];
//2.	Страници, които може да прочита за 1 час – цяло число в интервала [1…1000];
//3.	Броя на дните, за които трябва да прочете книгата – цяло число в интервала [1…1000];

        int pages = Integer.parseInt(scanner.nextLine());
        int pagePerHour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        //Калкулация
//1. изчисляваме общото време за четене на книгата: 212 / 20 = 10 часа
//2. получения резултат делим на броя дни, за да получим необходимите часове на ден: 10 часа / 2 дни = 5 часа на ден

        int timePerBook = pages / pagePerHour;
        int hoursPerDay = timePerBook / days;
        //Принтиране
        System.out.println(hoursPerDay);
    }
}
