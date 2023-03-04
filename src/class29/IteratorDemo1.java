package class29;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo1 {
    public static void main(String[] args) {
        ArrayList<Double>numbers=new ArrayList<>();
        numbers.add(10.3);
        numbers.add(22.3);
        numbers.add(20.5);
        numbers.add(10.1);
        numbers.add(18.0);
        numbers.add(40.8);
           /* for(Double number:numbers){ this will cause some problems because you're manipulating the array size,
           will have to use Iterators or Lambda expression
                if (number>11){
                numbers.remove(number); }*/
        System.out.println("------Lambda expression---------");
        numbers.removeIf(number -> number > 11);//Lambda expression
        System.out.println(numbers);

        System.out.println("---------Iterator---------------");
        Iterator<Double> iterator=numbers.iterator();
        System.out.println(iterator.hasNext());
        while(iterator.hasNext()){
            double number=iterator.next();
            if(number>11){
                iterator.remove();
            }
            System.out.println(numbers);
        }
    }
}
