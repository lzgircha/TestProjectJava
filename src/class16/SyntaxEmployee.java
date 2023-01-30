package class16;

public class SyntaxEmployee {
    //Create a Class called SyntaxEmployee:
    //Create three  variables  empID , salary and set the CEO to “Sumair”
    //Create two objects of the class SyntaxEmployee
    //Set the value of eID, salary for each of the objects
    //Print out the eID , salary and  CEO for each of the objects
    int empID;
    int salary;
    static String CEO="Sumair";//is going to be same we create this one as static

    public static void main(String[] args) {

SyntaxEmployee emp1=new SyntaxEmployee();
        emp1.empID = 81527;
        emp1.salary = 90000;

        SyntaxEmployee emp2=new SyntaxEmployee();
        emp2.empID = 65643;
        emp2.salary = 105000;


        System.out.println(emp1.empID);
        System.out.println(emp1.salary);
        System.out.println(emp1.CEO);
    }
}