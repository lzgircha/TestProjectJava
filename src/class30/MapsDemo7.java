package class30;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapsDemo7 {
    public static void main(String[] args) {
        Map<Integer,String> studentsMap=new HashMap<>();

        studentsMap.put(1,"Nazir");
        studentsMap.put(2,"Shah");
        studentsMap.put(3,"Tami");
        studentsMap.put(4,"Aisha");
        studentsMap.put(5,"Dana");
        studentsMap.put(6,"Lia");
        studentsMap.put(7,"Mia");

        Set<Map.Entry<Integer, String>>entrySet=studentsMap.entrySet();
        for(Map.Entry<Integer,String>entry:entrySet){
            System.out.println(entry.getValue()+" "+entry.getKey());
        }
        entrySet.removeIf(x->x.getKey()>2 &&x.getValue().contains("i"));
        System.out.println(studentsMap);
    }
}
