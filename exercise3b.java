import java.io.*;

// Base class for shapes
abstract class Shape implements Serializable {
    // Static field representing the default color of the shape
    public static String DEFAULT_COLOR = "black";

    // Field for the color of the shape
    protected String color;

    // Constructor for the Shape class
    public Shape() {
        this.color = DEFAULT_COLOR;
    }

    // Method for calculating the area of the shape
    public abstract double calculateArea();

    // Method for calculating the perimeter of the shape
    public abstract double calculatePerimeter();

    // Getter method for the color of the shape
    public String getColor() {
        return this.color;
    }

    // Setter method for the color of the shape
    public void setColor(String color) {
        this.color = color;
    }
}

// Derived class for triangles
class Triangle extends Shape {
    // Fields for the side lengths of the triangle
    private double side1;
    private double side2;
    private double side3;

    // Constructor for the Triangle class
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Overridden method for calculating the area of the triangle
    @Override
    public double calculateArea() {
        // Use Heron's formula to calculate the area
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    // Overridden method for calculating the perimeter of the triangle
    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}

// Derived class for rectangles
class Rectangle extends Shape {
    // Fields for the length and width of the rectangle
    private double length;
    private double width;

    // Constructor for the Rectangle class
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Overridden method for calculating the area of the rectangle
    @Override
    public double calculateArea() {
        return length * width;
    }

    // Overridden method for calculating the perimeter of the rectangle
    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

// Derived class for circles
class CircleShape extends Shape implements Serializable {
    // Field for the radius of the circle
    private double radius;

    // Constructor for the Circle class
    public CircleShape(double radius) {
        this.radius = radius;
    }

    // Overridden method for calculating the area of the circle
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Overridden method for calculating the perimeter of the circle
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}


// Derived class for circles
class Square extends Shape implements Serializable {
    // Field for the radius of the circle
    private double side;

    // Constructor for the Circle class
    public Square(double side) {
        this.side = side;
    }

    // Overridden method for calculating the area of the circle
    @Override
    public double calculateArea() {
        return side * side;
    }

    // Overridden method for calculating the perimeter of the circle
    @Override
    public double calculatePerimeter() {
        return side * 4;
    }
}

class TestQ3 {
    public static void main(String[] args) {
        Shape shape = new CircleShape(100);

        try {
            FileOutputStream fileOut =
                    new FileOutputStream("./serfile");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(shape);
            out.close();
            fileOut.close();

        } catch (IOException i) {
            i.printStackTrace();
        }

        Shape e = null;
        try {
            FileInputStream fileIn = new FileInputStream("./serfile");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            e = (CircleShape) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            System.out.println("Employee class not found");
            c.printStackTrace();
        }


        System.out.println(e.calculateArea());

    }
}