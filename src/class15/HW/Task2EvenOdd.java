package class15.HW;

public class Task2EvenOdd {
    //2) Create a method that will take a number and prints whether the number is even or odd.

    boolean Even(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        Task2EvenOdd teo =new Task2EvenOdd();
        System.out.println(teo.Even(54));
    }
}
