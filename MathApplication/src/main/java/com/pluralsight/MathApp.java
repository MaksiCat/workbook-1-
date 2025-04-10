public class MathApp {
    public static void main(String[] args) {
       // Question 1
        int bobSalary = 10000;
        int garySalary = 5000;
        int highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The highest salary is " + highestSalary);
        // Question 2
        int carPrice = 20000;
        int truckPrice = 40000;
        int smallestPrice = Math.min(carPrice, truckPrice);
        System.out.println("Smallest price is " + smallestPrice);
        // Question 3
        double radios = 7.25;
        double area = Math.PI * Math.pow(radios, 2);
        System.out.println("The area of the circle is " + area);
        // Question 4
        double number = 5.0;
        double squareRoot = Math.sqrt(number);
        System.out.println("The ansver is " + squareRoot);
        // Question 5
        int x1 = 5;
        int y1 = 10;
        int x2 = 85;
        int y2 = 50;
        double distance = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
        System.out.println(x1 -x2);
        System.out.println(y1 - y2);
        System.out.println(distance);
    }
}