package Class27;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        //inside (<>) angle brackets/diamond operator we specify the data type we are storing
        //we have created an array of strings
        ArrayList<String> names=new ArrayList<>();
        //we are using add method to add elements to this arrayList
        names.add("Nelson");
        names.add("Sam");
        names.add("Diana");
        names.add("Zahra");
        names.add("Daria");
        names.add("Saba");
        System.out.println (names);
    }
}
