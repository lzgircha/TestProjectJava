package class4;

import java.util.Scanner;

public class TemperatureConvertScanner {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("What is your city?");
        String city= input.nextLine();
        System.out.println("My city name is "+ city);
        System.out.println("Enter city temperature in F");
        int temperature=input.nextInt();
        double c=((temperature-32)*0.5556);
        System.out.println("The temperature in "+city+" is "+c+" C");

    }
}
