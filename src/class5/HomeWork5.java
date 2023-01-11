package class5;

import java.util.Scanner;
public class HomeWork5 {
    // 6) Write a program to find the largest number among three numbers using nested if provided by a user
    // (numbers must be distinct)
    public static void main(String[] args) {
        int number1, number2, number3;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter 3 numbers ");
        number1=scanner.nextInt();
        number2=scanner.nextInt();
        number3=scanner.nextInt();

        if(number1>number2){
            if(number1>number3){
                System.out.println("number1 is the largest "+number1);
            }
        }
        if(number2>number1){
            if(number2>number3){
                System.out.println("number 2 is the largest "+number2);
            }
        }
        if(number3>number1){
            if(number3>number2){
                System.out.println("number3 is the largest "+number3);
            }
        }scanner.close();
    }
}
