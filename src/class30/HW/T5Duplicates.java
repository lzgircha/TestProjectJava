package class30.HW;

import java.util.LinkedList;
import java.util.List;

public class T5Duplicates {
    //Create a collection of integers in which you can keep duplicates.
    //Write a logic to find sum of all integers
    public static void main(String[] args) {
        List<Integer> intList= new LinkedList<>();
        intList.add(5);
        intList.add(15);
        intList.add(5);
        intList.add(4);
        intList.add(15);
        intList.add(20);

        int sum= 0;
        for (Integer number: intList){
            sum+= number;
        }
        System.out.println("Sum of all integers= "+sum);
    }
}
// outcome: Sum of all integers= 64
