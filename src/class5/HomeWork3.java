package class5;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        //4) Write a program for user to enter his/hers birth month. Based on the month define the season.
        //Example: if user is born in June, July or August → season =”Summer”.
        //At the end of the program we should see output as “You were born __”.
        Scanner scan = new Scanner(System.in);
        System.out.println("PLease enter you birth month");
        String month = scan.nextLine();
        if (month.equals("June") || month.equals("July") || month.equals("August")) {
            System.out.println("You were born in Summer");
        } else if (month.equals("September") || month.equals("October") || month.equals("November")) {
            System.out.println("You were born in Fall");
        } else if (month.equals("December") || month.equals("January") || month.equals("February")) {
            System.out.println("You were born in Winter");
        } else if (month.equals("March") || month.equals("April") || month.equals("May")) {
            System.out.println("You were born in Spring");
        }scan.close();


    }
}
