package class10;

import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedMap;

public class scannerAndArrays {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter 5 values");
        int []numbers=new int[5];
      /*  numbers[0]=40; Below code manually store numbers in the array
          numbers[1]=50;
          numbers[2]=60;
          numbers[3]=70;
          numbers[4]=80; */

       /* numbers[0]= scanner.nextInt();     Below code take the numbers from user and store them in the array,
        numbers[1]= scanner.nextInt();       its good, but a lot of code
        numbers[2]= scanner.nextInt();
        numbers[3]= scanner.nextInt();
        numbers[4]= scanner.nextInt();*/

        // Below code uses a normal for loop to ask the use for numbers and store them in the array
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]= scanner.nextInt();
        }

        System.out.println(Arrays.toString(numbers));
    }
}
