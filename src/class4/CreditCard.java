package class4;

public class CreditCard {
    public static void main(String[] args) {
        boolean card = true;
        int balance = 540;
        if (card) {
            {
                System.out.println("What is the balance on the card?");
            }
            if (balance > 1000) {
                System.out.println("Pay off immediately");
            } else {
                System.out.println("You can spend more");
            }
        }else{
        System.out.println("Would you like to apply for a new credit card?");
    }
}}

