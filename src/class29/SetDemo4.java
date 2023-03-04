package class29;

import java.util.TreeSet;
//it is remove duplicate and sorts the data  in increasing order
public class SetDemo4 {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(50);
        numbers.add(40);
        numbers.add(100);
        numbers.add(20);
        numbers.add(50);
        System.out.println(numbers);
    }
}
