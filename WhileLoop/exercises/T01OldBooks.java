package WhileLoop.exercises;

import java.util.Scanner;

public class T01OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String bookName = scanner.nextLine();
        String searchBook = scanner.nextLine();
        int bookCount = 0;

        while (!searchBook.equals("No More Books")) {
            bookCount++;

            if (bookName.equals(searchBook)) {
                System.out.printf("You checked %d books and found it.", bookCount - 1);
                break;
            }

            searchBook = scanner.nextLine();
        }
        if (searchBook.equals("No More Books")) {
            System.out.printf("The book you search is not here!\nYou checked %d books.", bookCount);
        }
    }
}
