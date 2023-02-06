package class20.HW;

public class T2Employee {
    //2. Create an Employee class that will have variables and methods. Constructor that should initialize instance variables
    //Create 2 subclasses FullTime and PartTime Employees that should have own variables and methods.
    //Create a Tester Subclass from FullTime Employee and add some features and methods to the Tester Class.
    //Test your code!
    String name;
    String jobTitle;
    int employeeID;

    T2Employee(String name, String jobTitle, int employeeID) {

        this.name = name;
        this.jobTitle = jobTitle;
        this.employeeID = employeeID;
    }

    public void display() {
        System.out.println("Employee name: " + name + " Job Title: " + jobTitle + " Employee ID: " + employeeID);
    }
}

class FullTime extends T2Employee {
    int yearsWorked;

    FullTime(String name, String jobTitle, int employeeID, int yearsWorked) {
        super(name, jobTitle, employeeID);
        this.yearsWorked = yearsWorked;
    }

    void display1() {
        System.out.println("Name of the employee is " + name + ". Employee works as a " + jobTitle + " full time for " + yearsWorked + " years.");
    }

    public static void main(String[] args) {

        FullTime ft = new FullTime("Siri", "Dental Hygienist", 1245, 7);
        ft.display1();
        System.out.println(ft.name);
    }
}

class PartTime extends T2Employee {
    int yearsWorked;

    PartTime(String name, String jobTitle, int employeeID) {
        super(name, jobTitle, employeeID);
        this.yearsWorked = yearsWorked;
    }

    void display2() {
        System.out.println("Years worked at the current job being a part time: " + yearsWorked);
    }
}