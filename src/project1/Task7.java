package project1;

import java.util.Scanner;
public class Task7 {
    //7)Write a java program to check whether a given number is prime or not?
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number to check if it is truly prime number or not: ");
        int number= scan.nextInt();
        if (isPrime(number)){
            System.out.println(number + " is prime number");
        }else{
            System.out.println(number + " is a non-prime number");
        }
    }
    static boolean isPrime(int num)
    {
        if(num<=1) {
            return false;
        }
        for (int i = 2; i < +num/2; i++) {
            if (num % i == 0);
            return false;
        }
        return true;

        }
        }



