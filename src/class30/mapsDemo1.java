package class30;

import java.util.HashMap;
import java.util.Map;

public class mapsDemo1 {
    public static void main(String[] args) {
        Map<Integer,String> studentsMap=new HashMap<>();
        studentsMap.put(1,"Nazir");
        studentsMap.put(2,"Shah");
        studentsMap.put(3,"Tami");
        studentsMap.put(4,"Aisha");

        System.out.println(studentsMap);
        System.out.println(studentsMap.get(3));//you will need to pu object key not index, will get Tami
        System.out.println(studentsMap.size());//4
        System.out.println(studentsMap.containsKey(5));
        System.out.println(studentsMap.containsValue("Shah"));
        System.out.println(studentsMap.remove(1));
        System.out.println(studentsMap);
        System.out.println(studentsMap.remove(3,"Tami"));
        System.out.println(studentsMap);
        System.out.println(studentsMap.replace(3, "Aisha"));
        System.out.println(studentsMap);

    }
}
