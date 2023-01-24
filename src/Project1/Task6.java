package Project1;

public class Task6 {
    //6)Write a program to swap 2 numbers without a temporary variable?
    public static void main(String[] args) {
        int x = 20;
        int y= 4;

        x= x*y;
        y= x/y;
        x= x/y;
        System.out.println("After swapping:" + " x= "+ x + ", y = " + y);
    }
}
// Outcome: After swapping: x= 4, y = 20
