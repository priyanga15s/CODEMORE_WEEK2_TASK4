import java.util.Scanner;

// Calculator Class (Method Overloading)
class Calculator {

    // Add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

// Base Class
class Vehicle {

    void startEngine() {
        System.out.println("Vehicle engine is starting...");
    }
}

// Derived Class
class Car extends Vehicle {

    @Override
    void startEngine() {
        System.out.println("Car engine starts with a push button.");
    }
}

// Main Class
public class CalculatorVehicleDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Calculator calc = new Calculator();

        // Input for adding two numbers
        System.out.print("Enter first integer: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = sc.nextInt();

        System.out.println("Sum of two numbers: " + calc.add(num1, num2));

        // Input for adding three numbers
        System.out.print("\nEnter third integer: ");
        int num3 = sc.nextInt();

        System.out.println("Sum of three numbers: " + calc.add(num1, num2, num3));

        // Method Overriding
        Vehicle vehicle = new Vehicle();
        Car car = new Car();

        System.out.println("\nMethod Overriding Demonstration:");
        vehicle.startEngine();
        car.startEngine();

        sc.close();
    }
}