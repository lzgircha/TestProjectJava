package class11;

public class CatTester {
    public static void main(String[] args) {
        Cat cat1= new Cat();// creating an object from the Cat class
        cat1.name="Roza";
        cat1.breed="short hair";
        cat1.age=3;
        cat1.color="Black";
        cat1.attitude=false;
        cat1.eat();

        Cat cat2=new Cat();
        cat2.name="Sima";
        cat2.breed="Domestic";
        cat2.age=4;
        cat2.color="White";
        cat2.attitude=true;
        cat2.speak();

        System.out.println(cat2.breed);
        cat2.speak();
    }
}
