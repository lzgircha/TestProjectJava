package class21;

public class Calculator {//---------------------OVERLOADING----------------------------
    void add(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    void add(int num1, int num2, int num3) {// you can change parameters in multiple ways: add another parameter
        System.out.println(num1 + num2 + num3);
    }
    void add(int num1, double num2) {// you can change parameters in multiple ways:changing data type (instead of int->double)
        System.out.println(num1 + num2);
    }
    void add(double num2, int num1) {// you can change parameters in multiple ways: change sequence
        System.out.println(num1 + num2);
    }
}
