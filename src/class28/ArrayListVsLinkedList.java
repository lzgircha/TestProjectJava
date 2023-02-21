package class28;

import java.util.ArrayList;

public class ArrayListVsLinkedList {
    public static void main(String[] args) {

        //LinkedList =>45 ms
        //ArrayList =>69410 ms
        long startTime = System.currentTimeMillis();
        ArrayList<String> data = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            data.add(0, "Test Data");
        }


    long endTime = System.currentTimeMillis();
    System.out.println(endTime-startTime);
}
}
