package class29;

import java.util.LinkedHashSet;
import java.util.TreeSet;
//removes the duplicate, prints out in the order the items were placed
public class SetDemo3 {
    public static void main(String[] args) {
        TreeSet<String> fruit = new TreeSet<>();
        fruit.add("Mango");
        fruit.add("Kiwi");
        fruit.add("Orange");
        fruit.add("Mango");
        System.out.println(fruit);

    }
}

