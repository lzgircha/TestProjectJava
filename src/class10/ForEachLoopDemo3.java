package class10;

import java.util.Arrays;

/*
              Limitations ofForeachLoop
 */
public class ForEachLoopDemo3 {
    public static void main(String[] args) {

        int[] arr = {10, 13, 20, 25, 45, 50};
        // we can't  update the elements in for each loo because we do not have access to the index
        for (int x : arr) {
            if (x % 2 != 0) {
                x = 0;
            }
        }//Below code prints all the elements from an array without a loop
        System.out.println(Arrays.toString(arr));
    }
}

