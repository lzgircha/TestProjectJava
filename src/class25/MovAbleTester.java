package class25;

public class MovAbleTester {
    public static void main(String[] args) {
       MovAble[] movAble = {new Dog(), new Car()};
        for (MovAble m : movAble) {
            m.move();
        }
    }}