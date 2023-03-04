package class30;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class EntryDemo2 {
    //Create a map of countries with its capital that will store countries in alphabetical order.
    //Print all keys and values from a country map using for each loop and iterator.
    //Print all values from a country map using for each loop and iterator.
    public static void main(String[] args) {
        TreeMap <String,String>countries=new TreeMap();
        countries.put("Estonia","Tallinn");
        countries.put("Latvia","Riga");
        countries.put("USA","Washington DC");
        countries.put("England","London");
        countries.put("France","Paris");

        //Set<Map.Entry<String, String>> entrySet=countries.entrySet();--->>Set<Map.Entry<String, String>>--(replaced by)-->> var (only present in Java10)
        var entrySet=countries.entrySet();
        for(var entry:entrySet){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        System.out.println("------using iterator-----");

        var iterator=countries.entrySet().iterator();
        while (iterator.hasNext()){
            var entry=iterator.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        System.out.println("--Print all values from a country map using for each loop and iterator--");

        var values=countries.values();
        for(var value: values){
            System.out.println(value);
        }
        System.out.println("-----------------------");
        var iterator1=countries.values().iterator();
        while (iterator1.hasNext()){
            var value=iterator1.next();
            System.out.println(value);
        }
    }
}
