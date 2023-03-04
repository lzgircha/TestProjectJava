package class28.HW;

import java.util.ArrayList;

public class T1 {
    //1) Create an ArrayList that will store 5 names into it.
    //Find out whether the given ArrayList is empty or not?
    //Check whether the specific name is present in an ArrayList or not?
    //Find the size of your arrayList and print all values from that
    public static void main(String[] args) {
        ArrayList<String>names=new ArrayList<>(5);
        names.add("Olga");
        names.add("Siam");
        names.add("Roza");
        names.add("Tom");
        names.add("Victor");

        boolean name=names.isEmpty();
        if (name)
            System.out.println("THe array list is empty");
        else System.out.println("The array list is not empty");

        if (names.contains("Roza"))
            System.out.println("Roza is present in array list");
        else System.out.println("Roza is not in the array list");

        int size=names.size();
        System.out.println("Size of the array list is "+ size);
        for(String name1:names)
        System.out.print(name1+" ");
    }
}
