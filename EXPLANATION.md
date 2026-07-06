# Explanation of Java Concepts Used

## Objective

This program demonstrates two important Object-Oriented Programming (OOP) concepts:

1. **Method Overloading**
2. **Method Overriding**

---

# 1. Method Overloading

Method overloading means defining multiple methods with the **same name** but **different parameter lists** within the same class.

Example:

```java
class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}
```

The compiler decides which method to call based on the number of arguments.

Examples:

```java
calc.add(10, 20);
calc.add(10, 20, 30);
```

---

# 2. Class

A class is a blueprint for creating objects.

Example:

```java
class Calculator
class Vehicle
class Car
```

---

# 3. Objects

Objects are instances of classes.

Example:

```java
Calculator calc = new Calculator();
Vehicle vehicle = new Vehicle();
Car car = new Car();
```

Each object can access the methods of its class.

---

# 4. Inheritance

Inheritance allows one class to inherit the properties and methods of another class.

Example:

```java
class Car extends Vehicle
```

Here, `Car` inherits from the `Vehicle` class.

---

# 5. Method Overriding

Method overriding occurs when a subclass provides its own implementation of a method already defined in the superclass.

Superclass:

```java
void startEngine() {
    System.out.println("Vehicle engine is starting...");
}
```

Subclass:

```java
@Override
void startEngine() {
    System.out.println("Car engine starts with a push button.");
}
```

The `@Override` annotation indicates that the subclass method overrides the superclass method.

---

# 6. Scanner Class

The `Scanner` class is used to read user input.

```java
Scanner sc = new Scanner(System.in);
```

Method used:

```java
nextInt()
```

This reads integer values from the keyboard.

---

# 7. Output Statements

The program uses:

```java
System.out.println();
```

to display the results.

---

# 8. Closing the Scanner

```java
sc.close();
```

This releases system resources after input is complete.

---

# Program Flow

1. Create the `Calculator` class with overloaded `add()` methods.
2. Read integer inputs from the user.
3. Call the appropriate `add()` method based on the number of arguments.
4. Create the `Vehicle` class with the `startEngine()` method.
5. Create the `Car` class that overrides `startEngine()`.
6. Create `Vehicle` and `Car` objects.
7. Call the `startEngine()` method for both objects.
8. Display the outputs.
9. Close the `Scanner`.

---

# Difference Between Method Overloading and Method Overriding

| Method Overloading | Method Overriding |
|--------------------|-------------------|
| Same method name with different parameters | Same method name and same parameters |
| Occurs within the same class | Occurs between superclass and subclass |
| Achieves compile-time polymorphism | Achieves runtime polymorphism |
| No inheritance required | Requires inheritance |

---

# Java Concepts Covered

- Classes
- Objects
- Methods
- Method Overloading
- Method Overriding
- Inheritance
- Polymorphism
- Scanner Class
- User Input
- Output Statements
- `@Override` Annotation
- Resource Management (`sc.close()`)
