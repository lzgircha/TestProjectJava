package class19;

public class BankAccountTest {
    public static void main(String[] args) {

        BankAccount test = new BankAccount();
        test.accountNumber = 92337394959458l;
        test.money = 1000;
        test.deposit();

        System.out.println(test.accountNumber);
        System.out.println(test.money);

        System.out.println("----Creating an Object Checking Account----");
        Checking check = new Checking();
        //features from parent
        check.accountNumber = 38336;
        check.money = 780;
        //features from itself
        check.interest = 0;

        check.deposit();
        check.transfer();

        System.out.println("-----Creating an Object Savings Account----");
        Savings save=new Savings();
        save.accountNumber=298364478l;
        save.money=7654;
        save.profit=100;

        save.deposit();
        save.takeProfit();

        System.out.println("-----Creating Supersaving Account----");
        SuperSavings save1=new SuperSavings();
        save.accountNumber=9237324l;
        save.money=2653;
        save.profit=230;

        save.deposit();
        save.takeProfit();
        //save.superSaving();
    }
}

