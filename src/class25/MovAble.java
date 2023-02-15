package class25;

//interfaces describes what the class/object can do

public interface MovAble {
    void move();
}
interface OwnAble{
    void own();
}
class Car implements MovAble, OwnAble{
    @Override
    public void move() {
        System.out.println("I can move");
    }

    @Override
    public void own() {
        System.out.println("You can own me");
    }
}
class Dog implements MovAble, OwnAble{
    @Override
    public void move() {
        System.out.println("I can move");

    }
    @Override
    public void own() {
        System.out.println("I can be owned");
    }
}