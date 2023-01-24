package class8.HW;
import java.util.Scanner;
import java.util.SortedMap;

public class HomeWork4 {
    public static void main(String[] args) {
        //Write a program to ask a user to enter 5 items they want to buy and the price of that item.
        // Every time user enters money accumulate the amount and tell the user how much total that they should pay.
        // If user give more money program should return a change.
        // Whenever a user done with payments program should say "Thank you for shopping!"
        Scanner scanner=new Scanner(System.in);
        double totalPrice=0;
        for (int i = 0; i < 3; i++) {

            System.out.println("Please enter the item and it's price");
            String itemName = scanner.next();
            double itemPrice = scanner.nextDouble();
            totalPrice=totalPrice+itemPrice;
            System.out.println("This is the total amount you have to pay "+totalPrice);
        }
        System.out.println("please pay for the items");
        double amountPaid = scanner.nextDouble();

        if(amountPaid>totalPrice){
            double change=amountPaid-totalPrice;
            System.out.println("Hey here is your change "+ change);
        }else if (amountPaid<totalPrice){
            System.out.println("You can't buy all the items");
        }
        System.out.println("Thank you for shopping!");
    }
}
