package class16;

public class Person {
    private double bankBalance=1250000;
    String address="Street 123";//defoult, you can access withing the package
    public String name="Jon Snow";

    private void printPhonePassword(){
        System.out.println("password");
    }
    void printSSN(){
        System.out.println("21323349");
    }
   public void printTikTokAccount(){
       System.out.println("user123");
    }
    public static void main(String[] args) {
        Person person=new Person();
        System.out.println(person.bankBalance);
        System.out.println(person.address);
        System.out.println(person.name);
        person.printTikTokAccount();
        person.printSSN();
        person.printPhonePassword();
    }
}
