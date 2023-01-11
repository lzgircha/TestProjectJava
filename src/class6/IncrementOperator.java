package class6;

import java.util.SortedMap;

public class IncrementOperator {
    public static void main(String[] args) {

        int number=10;
        number=number+1;
        System.out.println(number);
        number+=1;
        System.out.println(number);
        number++; //also increments the number by 1
        System.out.println(number);

        int number2=10;
        number2--;//-- will decrement the number by one
        System.out.println(number2);
    }
}
