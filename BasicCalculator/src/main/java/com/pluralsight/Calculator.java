package com.pluralsight;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the first number: ");
    double firstNumber = scanner.nextDouble();
    System.out.println("Enter the second number:  ");
    double secondNumber = scanner.nextDouble();
    double result = firstNumber * secondNumber;
    System.out.println(result);

    }
}
