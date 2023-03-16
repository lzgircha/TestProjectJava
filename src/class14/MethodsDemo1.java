package class14;

import java.util.Arrays;

public class MethodsDemo1 {
    public static void main(String[] args) {
        //using enhanced for loop
       int sum=0;
        int[]array1={10,20,30,45,50};
        for (int number:array1) {
            sum+=number;

        }
        System.out.println(sum);
        System.out.println(Arrays.toString(array1));

        int[]array2={10,10,10,20,30};
        int sum2=0;
        for (int number:array2){
            sum2+=number;
        }
        System.out.println(sum2);
    }
}
