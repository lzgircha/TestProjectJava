package class20.HW;

public class T1Shape {
    //1. Write program: Shape class has a constructor that takes the radius and has a subclass as  circle class.
    // In circle class create a method to calculate the area of circle. Test your code
    static double radius;
    static class Circle extends T1Shape {
        public double calculateArea() {
            return Math.PI * radius * radius;
        }
    }
    public static void main(String[] args) {
        Circle c=new Circle();
        c.radius= 5.3;
        c.calculateArea();
        System.out.println("The area of the circle with radius "+c.radius+" is "+c.calculateArea());
    }
}
