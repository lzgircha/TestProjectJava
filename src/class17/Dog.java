package class17;

public class Dog {
    String name;
    String breed;
    String color;
    int age;
    double weight;

    //constructors, help build the objects, can have same the same as a class name

    Dog(String dogName,String dogBreed,String dogColor,int dogAge,double dogWeight){
        name=dogName;
        breed=dogBreed;
        color=dogColor;
        age=dogAge;
        weight=dogWeight;
    }
    void printInfo(){
        System.out.println("Name "+name+" Breed "+breed+" color "+color+" age "+age+" weight "+weight);
    }
}
