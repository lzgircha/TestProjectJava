package class30.HW;

import java.util.LinkedHashSet;
import java.util.Set;

public class T4Order {
    //Create the collection that will store single uniques Objects of a String type in which order is preserved.
    //Write a logic to concatenate all string from the collection.
    public static void main(String[] args) {

        Set<String> str= new LinkedHashSet<>();
        str.add("It");
        str.add("is");
        str.add("time");
        str.add("to");
        str.add("walk");
        str.add("the");
        str.add("dog");

        for (String s : str) {
            System.out.print(s + " ");
        }
    }
}
//outcome: It is time to walk the dog