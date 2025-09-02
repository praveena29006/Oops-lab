import java.util.Scanner;

// Abstract class
abstract class Shape {
    int a, b;

    // Constructor
    Shape(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // Abstract method
    abstract void printArea();
}

// Rectangle class
class Rectangle extends Shape {
    Rectangle(int length, int breadth) {
        super(length, breadth);
    }

    void printArea() {
        System.out.println("Area of Rectangle: " + a * b);
    }
}

// Triangle class
class Triangle extends Shape {
    Triangle(int base, int height) {
        super(base, height);
    }

    void printArea() {
        System.out.println("Area of Triangle: " + 0.5 * a * b);
    }
}

// Circle class
class Circle extends Shape {
    Circle(int radius) {
        super(radius, 0);
    }

    void printArea() {
        System.out.println("Area of Circle: " + 3.14 * a * a);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a shape:");
        System.out.println("1. Rectangle");
        System.out.println("2. Triangle");
        System.out.println("3. Circle");
        int choice = scanner.nextInt();

        Shape shape = null;

        switch (choice) {
            case 1:
                System.out.print("Enter length: ");
                int length = scanner.nextInt();
                System.out.print("Enter breadth: ");
                int breadth = scanner.nextInt();
                shape = new Rectangle(length, breadth);
                break;
            case 2:
                System.out.print("Enter base: ");
                int base = scanner.nextInt();
                System.out.print("Enter height: ");
                int height = scanner.nextInt();
                shape = new Triangle(base, height);
                break;
            case 3:
                System.out.print("Enter radius: ");
                int radius = scanner.nextInt();
                shape = new Circle(radius);
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        shape.printArea();

        scanner.close();
    }
}
