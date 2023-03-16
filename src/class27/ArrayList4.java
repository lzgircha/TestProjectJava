package class27;

import java.util.ArrayList;

public class ArrayList4 {
    public static void main(String[] args) {

        ArrayList<Boolean> booleans=new ArrayList<>();
        booleans.add(false);
        booleans.add(false);
        booleans.add(true);
        booleans.add(false);
        booleans.add(true);

        System.out.println(booleans.get(4));
        System.out.println(booleans.get(0));
        System.out.println(booleans.size());//5
        System.out.println("______For loop_________");
        for (int i = 0; i < booleans.size(); i++) {
            System.out.println(booleans.get(i));
        }
        System.out.println("______while loop_______");
        int i=0;
        while(i<booleans.size()){
            System.out.println(booleans.get(i));
            i++;
        }
    }
}
