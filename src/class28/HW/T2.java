package class28.HW;

import java.util.ArrayList;

public class T2 {
    //2)Create an arraylist of cars and retrieve all the values using 3 different ways.
    public static void main(String[] args) {

        ArrayList<String>cars=new ArrayList<>();
        cars.add("Nissan");
        cars.add("Mazda");
        cars.add("BMW");
        cars.add("Toyota");
        cars.add("Tesla");
        cars.add("Honda");

        System.out.println(cars);

        System.out.println("________________");
        for (String str:cars){
        System.out.println(cars);
        }
        System.out.println("_________________");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars);
        }
    }
}
