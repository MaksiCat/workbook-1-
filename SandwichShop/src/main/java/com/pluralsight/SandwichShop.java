package com.pluralsight;
import java.util.Scanner;
public class SandwichShop {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double basePrice = 0.0;
    System.out.println("Welcome! Please select the size of the sandwich: ");
    System.out.println("1: Regular size $5.45");
    System.out.println("2: Large size: $8.95");
    System.out.println("Select your choice (1 or 2): ");

    int sizeChoice = scanner.nextInt();
    if (sizeChoice == 1) {
        basePrice = 5.45;
    }
    else if (sizeChoice == 2) {
        basePrice = 8.95;}
    System.out.println("Please enter your age: ");
    int age = scanner.nextInt();
    double discount = 0.0;
    if (age <= 17) {
        discount = 0.10;
    }
    else if (age >= 65) {
        discount = 0.20;
    }
    double finalPrice = basePrice - (basePrice * discount);
    System.out.printf("The cost is: $%.2f%n", finalPrice);
    scanner.close();
    }
}
