package class30;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapsDemo5 {
    public static void main(String[] args) {
        Map<Integer,String> studentsMap=new HashMap<>();
        studentsMap.put(1,"Nazir");
        studentsMap.put(2,"Shah");
        studentsMap.put(3,"Tami");
        studentsMap.put(4,"Aisha");
        studentsMap.put(5,"Dana");
        studentsMap.put(6,"Lia");
        studentsMap.put(7,"Mia");

        //remove all the keys from above map if they are greater then 2

        Set<Integer>allNum=studentsMap.keySet();
        System.out.println(allNum);

        allNum.removeIf(x->x>2);// allNum.removeIf(x->x.intValue()>2)
        System.out.println(allNum);
        System.out.println(studentsMap);  //1="Nazir", 2="Shah"

    }
}
