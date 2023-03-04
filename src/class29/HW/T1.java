package class29.HW;

import java.util.LinkedHashSet;

public class T1 {
    public static void main(String[] args) {
        //Create a Set of cities in which you want to make sure that insertion order is maintained.
        // Then remove any city that starts with “A”;
        LinkedHashSet<String> cities=new LinkedHashSet<>();
        cities.add("Tartu");
        cities.add("Narva");
        cities.add("Tallinn");
        cities.add("Kohtla Jarve");
        cities.add(("Antsla"));
        cities.add("Parnu");

        cities.removeIf(x->x.startsWith ("A"));
        System.out.println(cities);

    }
}
