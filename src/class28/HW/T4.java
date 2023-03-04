package class28.HW;

import java.util.ArrayList;

public class T4 {
    //4)Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.
    public static void main(String[] args) {
        ArrayList<String>drinks=new ArrayList<>();
        drinks.add("Lemonade");
        drinks.add("Pepsi");
        drinks.add("Beer");
        drinks.add("Milk");
        drinks.add("Gatorade");

        for (int i = 0; i < drinks.size(); i++) {
            String drink= drinks.get(i);
            if(drink.contains("a")|| drinks.contains("e")){
                drinks.set(i,"water");
            }
        }
        System.out.println(drinks);
    }
}
