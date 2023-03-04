package class28.HW;

import java.util.ArrayList;

public class T3 {
    //3)Create an arrayList of words. Remove every word that ends with “e”.
    public static void main(String[] args) {
        ArrayList<String>words=new ArrayList<>();
        words.add("Vehicle");
        words.add("House");
        words.add("Cat");
        words.add("Weather");
        words.add("Deals");
        words.add("Pencil");
        words.add("Window");
        words.add("Phone");
        words.removeIf(s -> s.endsWith("e"));
        System.out.println(words);
    }
}
