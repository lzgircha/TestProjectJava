package Class27;

import java.util.ArrayList;

public class ArrayList5 {
    public static void main(String[] args) {
        ArrayList<String>names=new ArrayList<>();
        names.add("Fizzy");//adding names to the array
        names.add("Savo");
        names.add("Sam");
        names.add("Urwa");
        names.add("Tarik");
        names.add("Abeera");

        System.out.println(names.contains("Daria"));//false
        System.out.println(names); //all 6 names will be printed
        names.remove("Sam");
        System.out.println(names); //will remove Sam from the list and names will shift to the left automatically
        names.set(3,"Olga");
        System.out.println(names);//index 3 will be replaced with Olga
        System.out.println(names.indexOf("Savo"));
    }
}
