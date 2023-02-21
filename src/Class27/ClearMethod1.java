package Class27;

import java.util.ArrayList;

public class ClearMethod1 {
    public static void main(String[] args) {

        ArrayList<String> names=new ArrayList<>();

        names.add("Nelson");
        names.add("Sam");
        names.add("Diana");
        names.add("Zahra");
        names.add("Daria");
        names.add("Saba");
        System.out.println (names);
        names.clear();//remove all the elements
        System.out.println(names);
    }
}
