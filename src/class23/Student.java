package class23;
// //Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
//    //Define common behavior within parent class and override some of the methods in child classes
//    //Define some methods specific to child classes
//    //Write example of achieving run time polymorphism

public class Student {
    public void studyHard() {
        System.out.println("Students study hard");
    }

    public void doHW() {
        System.out.println("Students do home work");
    }
}

class SyntaxStudent extends Student {
    @Override
    public void studyHard() {
        System.out.println("Students from Syntax study extra hard");
    }

    @Override
    public void doHW() {
        System.out.println("Students  from Syntax do home work every day");
    }
    public void loveJava(){
        System.out.println("Syntax students love Java");
    }
}

class CollegeStudent extends Student {
    @Override
    public void studyHard() {
        System.out.println("College student study somewhat hard");
    }

    @Override
    public void doHW() {
        System.out.println("College students do home work once a week");
    }
    public void loveParty(){
        System.out.println("College students love party");
    }
}

class SchoolStudent extends Student {
    @Override
    public void studyHard() {
        System.out.println("School do not study hard");
    }

    @Override
    public void doHW() {
        System.out.println("School student do not have home work");
    }
    public void loveHome(){
        System.out.println("School students like to stay at home");
    }
}
