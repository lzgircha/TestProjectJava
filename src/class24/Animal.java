package class24;

// Abstraction is a process of hiding the implementation details and showing only functionality to the user.
// Another way, it shows only essential things to the user and hides the internal details

public abstract class Animal {

   abstract void speak();

    abstract void eat();

}
class cat extends Animal{
    @Override
    void speak(){
        System.out.println("Cat say Meawwwww");
    }
    @Override
    void eat(){
        System.out.println("Cats eat fish");
    }
}
class dog extends Animal{
    @Override
    void speak(){
        System.out.println("Dog say woooof");
    }
    @Override
    void eat(){
        System.out.println("Dogs like bones to eat");
}}