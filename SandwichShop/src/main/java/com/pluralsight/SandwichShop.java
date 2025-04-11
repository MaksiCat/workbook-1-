package com.pluralsight;
import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double basePrice = 0.0;
        double loadedCost = 0.0;

        // Step 1: Prompt for sandwich size
        System.out.println("Welcome to Sandwich Shop!");
        System.out.println("Please select the size of the sandwich:");
        System.out.println("1: Regular ($5.45)");
        System.out.println("2: Large ($8.95)");
        System.out.print("Enter your choice (1 or 2): ");
        int sizeChoice = scanner.nextInt();

        if (sizeChoice == 1) {
            basePrice = 5.45;
            loadedCost = 1.00;
        } else if (sizeChoice == 2) {
            basePrice = 8.95;
            loadedCost = 1.75;
        } else {
            System.out.println("Invalid choice. Exiting application.");
            return;
        }

        // Step 2: Prompt if the sandwich should be loaded
        scanner.nextLine(); // consume the leftover newline
        System.out.print("Would you like your sandwich loaded? (yes/no): ");
        String loadedChoice = scanner.nextLine().trim().toLowerCase();

        boolean isLoaded = loadedChoice.equals("yes");

        // Step 3: Prompt for age
        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();

        double discount = 0.0;
        if (age <= 17) {
            discount = 0.10; // 10% discount
        } else if (age >= 65) {
            discount = 0.20; // 20% discount
        }

        // Step 4: Calculate final price
        double totalPrice = basePrice;

        if (isLoaded) {
            totalPrice += loadedCost;
        }

        double finalPrice = totalPrice - (totalPrice * discount);

        // Step 5: Display the result
        System.out.printf("The cost of your sandwich is: $%.2f%n", finalPrice);

        scanner.close();
    }
}
