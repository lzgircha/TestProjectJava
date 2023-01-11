package class5;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.SortedMap;

public class ScannerDemo1 {
    public static void main (String []args){
        Scanner scan=new Scanner (System.in);
        /*
        scanner=> Name of the class
        scan is just a variable like we create primitive variables
        = => assignment operator
        System.in => tells the computer we want to read the data from keyboard
         */

        System.out.println("Please enter your age");
        int age= scan.nextInt();
        System.out.println("You are "+age+" years old");
        System.out.println("Please enter your weight");
        double weight=scan.nextDouble();
        System.out.println("Your weight is "+weight+" Kgs");
        System.out.println("Are you hungry?");
        boolean hungry=scan.nextBoolean();
        System.out.println("Hungry "+hungry);
        System.out.println("Please enter your gender");
        char gender=scan.next().charAt(0);
        // (0) the letter that will be printed (01234567....)
        System.out.println ("Your gender is "+gender);
        scan.close();//good practise to save memory on the computer, since it is very expensive resource
    }
}
