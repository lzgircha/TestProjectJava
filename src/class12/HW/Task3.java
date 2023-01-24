package class12.HW;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /*3) Write a program that reads two people's first
        names and if they are expecting boy or girl?
        Based on the input suggests a name for a baby:
        Example Output:
        Mom’s first name? Mary
        Dad’s first name? Daniel
        Boy or Girl? boy
        Suggested baby name: DANRY

        Example Output:
        Mom’s first name? Mary
        Dad’s first name? Daniel
        Boy or Girl? girl
        Suggested baby name: MAIEL*/

        Scanner src = new Scanner(System.in);
        System.out.println("Mom's first name?");
        String name = src.nextLine();
        Scanner src1 = new Scanner(System.in);
        System.out.println("Dad's first name?");
        String name1 = src.nextLine();

        Scanner src2 = new Scanner(System.in);
        System.out.println("Boy or Girl?");
        String gender = src.nextLine();
        String babyname;

        if (gender.equalsIgnoreCase("girl")) {
            babyname = (name.substring(0, 2) + name1.substring(3, 6));

            System.out.println("suggested baby name is: " + babyname);
        } else {
            babyname = (name1.substring(0, 3) + name.substring(2, 4));
            System.out.println("Suggested baby name is : " + babyname);
        }

    }
}