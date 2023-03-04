package class30;

import java.util.HashMap;

public class MapsDemo2 {
    public static void main(String[] args) {
        HashMap<String,Double> groceries= new HashMap<>();
        groceries.put("Eggs",10.6);
        groceries.put("Milk",3.3);
        groceries.put("Bread",5.24);
        groceries.put("Rice",6.00);
        groceries.put("Meat",7.43);
        groceries.put("Eggs",8.99);//removes the first inserted data, keeps the last one
        groceries.put(null,null);
        System.out.println(groceries);

        HashMap<String,Double>makeup=new HashMap<>();
        makeup.put("Lipstick",50.0);
        makeup.put("Foundation",40.0);
        makeup.put("Mascara",70.0);
        makeup.put("Eyeliner",12.0);
        makeup.put("Blush-on",13.50);

        HashMap<String,Double>groceriesTotal=new HashMap<>();
        groceriesTotal.putAll(groceries);
        groceriesTotal.putAll(makeup);
        System.out.println(groceriesTotal);

    }
}
