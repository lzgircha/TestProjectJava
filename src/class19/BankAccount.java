package class19;

import java.sql.SQLOutput;

public class BankAccount {//parent class/super class/base class
    long accountNumber;
    double money;

    void deposit() {
        System.out.println("Deposit method from Bank Account class");
    }
}

class Checking extends BankAccount {//subclass/child class/derived class

    double interest;

    void transfer() {
        System.out.println("Transfer method from Checking class");
    }

}
class Savings extends BankAccount{

    double profit;
    void takeProfit(){
        System.out.println("Profit method from Savings class");
    }
}
//multilevel
class SuperSavings extends Savings{
    void superSaving(){
        System.out.println("Super saving methods from SuperSavings class");
    }
}