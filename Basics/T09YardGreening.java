package Basics;

import java.util.Scanner;

public class T09YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double metres = Double.parseDouble(scanner.nextLine());

        double price = 7.61;
        double finalPrice = metres * price;
        double discount = finalPrice * 0.18;
        double finalPriceAfterDiscount = finalPrice - discount;

        //"The final price is: {крайна цена на услугата} lv."
        //"The discount is: {отстъпка} lv."

        System.out.println("The final price is: " + finalPriceAfterDiscount + " lv.");
        System.out.println("The discount is: " + discount + " lv.");
    }
}
