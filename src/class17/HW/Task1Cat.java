package class17.HW;

public class Task1Cat {
    //1) Write a java class that will have a constructor: one with parameters and second without any parameters.
    // Create a separate Test class where you will execute both of the constructors 1 by 1.

    //constructor without any parameters
    String name;
    String breed;
    int age;
    Task1Cat(){
    }

    void printInfo() {
        System.out.print("");
    }

    //constructor with parameters

    String name1;
    String breed1;
    int age1;

    Task1Cat(String catName, String catBreed, int catAge) {
        this.name1 = catName;
        this.breed1 = catBreed;
        this.age1 = catAge;
    }
    void printInfo1(){
        System.out.print(name1+ " name "+breed1+" breed "+age1+ age);
    }
}
