package class30;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapsDemo6 {
    public static void main(String[] args) {
        Map<Integer,String> studentsMap=new HashMap<>();

        studentsMap.put(1,"Nazir");
        studentsMap.put(2,"Shah");
        studentsMap.put(3,"Tami");
        studentsMap.put(4,"Aisha");
        studentsMap.put(5,"Dana");
        studentsMap.put(6,"Lia");
        studentsMap.put(7,"Mia");

        Collection<String> values=studentsMap.values();
        System.out.println(values);
        //remove all value which contain the letter i

        values.removeIf(x->x.contains("i"));
        System.out.println(studentsMap);
    }
}
