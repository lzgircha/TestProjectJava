package class30;

import java.util.LinkedHashSet;
import java.util.Set;

public class EntryDemo {
    public static void main(String[] args) {
        Set<Entry> entrySet=new LinkedHashSet<>();
        entrySet.add(new Entry(1,"Nazir"));
        entrySet.add(new Entry(2,"Shah"));
        entrySet.add(new Entry(3,"Tami"));
        entrySet.add(new Entry(4,"Aisha"));
        entrySet.add(new Entry(5,"Dana"));
        entrySet.add(new Entry(6,"Lia"));
        entrySet.add(new Entry(7,"Mia"));
        // remove those objects for which value of the key is greater than 2
        // and value contains the letter i
        entrySet.removeIf(x->x.getKey()>2 &&x.getValue().contains("i"));
        System.out.println(entrySet);
    }
}
