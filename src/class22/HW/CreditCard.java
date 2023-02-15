package class22.HW;

public class CreditCard {
    //Create a class CreditCard and define variable balance and interest.
    // Create an instance method that will calculate interest based on the given balance.
    //Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
    //Call the method by creating an object of each of the three classes.


    double balance;
    double interest;

    //creating constructor
    public CreditCard(double balance, double interest) {
        this.balance = balance;
        this.interest = interest;
    }

    public void calculateInterest(){
        System.out.println("Interest "+(balance *interest)/100);
    }
}
class Visa extends CreditCard{
    public Visa(double balance, double interest) {
        super(balance, interest);
    }
    public void calculateInterest(){
        System.out.println("Interest "+((balance *interest)/100)+30);
    }
}
class AX extends CreditCard{
    public AX(double balance, double interest) {
        super(balance, interest);
    }
    public void calculateInterest(){
        System.out.println("Interest "+((balance *interest)/100) +50);
    }
}

class CreditCardTester{
    public static void main(String[] args) {
CreditCard creditCard=new CreditCard(6000,5.7);
creditCard.calculateInterest();
Visa visa=new Visa (400,6);
visa.calculateInterest();
AX ax=new AX(300,6.4);
ax.calculateInterest();
    }
}