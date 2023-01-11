package class6;

import java.util.Scanner;

public class HWOperatorClass {
    public static void main(String[] args) {
        //Write a program to find largest of three double values using if-else..if and logical operators provided by a user (numbers must be distinct)
// 1st way
        int num = 30;
        int num2 = 70;
        int num3 = 90;
        if (num > num2 && num > num3) {
            System.out.println(num + " is the largest number");
        } else if (num2 > num && num2 > num3) {
            System.out.println(num2 + " is the largest number");
        } else if (num3 > num && num3 > num2) {
            System.out.println(num3 + " is largest number");
        }
//second way with scanner
        Scanner scanner = new Scanner(System.in);
        Double number1, number2, number3;
        System.out.println("Please Enter three numbers");
        number1 = scanner.nextDouble();
        number2 = scanner.nextDouble();
        number3 = scanner.nextDouble();

        if (number1 > number2 && number1 > number3) {
            System.out.println("The largest number is " + number1);
        } else if (number2 > number3 && number2 > number1) {
            System.out.println("The largest number is " + number2);
        } else if (number3 > number2 && number3 > number1) {
            System.out.println("Largest number is " + number3);
        }
        scanner.close();
    }
}
