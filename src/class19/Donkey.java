package class19;

public class Donkey {

    String name;
    int age;
    double weight;

    /*Donkey(){
        System.out.println("This is non argument constructor");
    }*/ //constructor without parameters

    Donkey(String donName, int donAge, double donWeight){
        name=donName;
        age=donAge;
        weight=donWeight;
    }

    void print(){
        System.out.println("Donkey's name is "+name+" age is "+age+" weight is "+weight);
    }
}
