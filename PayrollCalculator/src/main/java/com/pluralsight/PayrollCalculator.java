package com.pluralsight;
import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Your name: ");
        String name = input.nextLine();
        System.out.print("Worked hours: ");
        double hours = input.nextDouble();
        System.out.print("Please enter your pay rate: ");
        float payRate = input.nextFloat();
        System.out.println("Employee Name: " + name + ", Pay Rate: " + payRate * hours );





    }
}
