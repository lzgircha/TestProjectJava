package class21;

public class SuperAnimal {

        String name;
        String color="Black";

    }

    class Cat extends SuperAnimal{
        String color="white";
        int age=10;
        double weight;

        void printColor(){
            String color="Blue";
            System.out.println(color);//blue
            System.out.println(this.color);//white
            System.out.println(super.color);//black
        }
    }
    class AnimalTester{
        public static void main(String[] args) {

            Cat cat=new Cat();
            cat.printColor();
        }
    }


