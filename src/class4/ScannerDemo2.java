package class4;

import java.util.Scanner;
import java.util.SortedMap;

public class ScannerDemo2 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your age");
        int age=input.nextInt();
        System.out.println("You are "+age+" years old");


        System.out.println("Are you ready for Holidays?");
        Boolean ready=input.nextBoolean();
        System.out.println("we are ready for holidays " +ready);
    }
}
