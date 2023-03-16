package project2;

public interface Shape {
    //Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimiter.
    // Create 2 classes Circle & Square that implements functionality defined in the Shape Interface.
    // Test your code.
    void calculateArea();

    void calculatePerimeter();
}

class Circle implements Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        System.out.println("The area of the circle is " + 3.14 * radius * radius);
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("The perimeter of the circle is " + 2 * 3.14 * radius);
    }

}

class Square implements Shape {
    double side;

    Square(double side) {
        this.side = side;
    }

    @Override
    public void calculateArea() {
        System.out.println("The area of the square is " + 2 * side);
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("The perimeter of the square is " + 4 * side);
    }

    public static void main(String[] args) {
        Circle circle = new Circle(3.0);
        circle.calculatePerimeter();
        circle.calculateArea();
        System.out.println("-------------------------");
        Square square = new Square(2.3);
        square.calculatePerimeter();
        square.calculateArea();

        System.out.println("------using forced loop----------");
        Shape[] shapes = {new Circle(3.0), new Square(2.3)};
        for (Shape s : shapes) {
            s.calculatePerimeter();
            s.calculateArea();
        }
    }}