package class14;

public class MethodTester2 {
    public static void main(String[] args) {
        //creating an object of the class
        MethodDemo2 md= new MethodDemo2();
        md.printHello();// calling a method

        System.out.println("************");

        md.printHelloManyTimes(10);

        System.out.println("************");

        md.printManyTimes(5,"I love Java");
    }
}
