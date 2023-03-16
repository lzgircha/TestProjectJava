package project1;

import java.util.Arrays;

public class Task10 {
    //10)Write a java program to find the second largest number in the array?
    public static void main(String[] args) {
        int array[]= {5,4,9,73,-63,27,19,-3,55};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("The second highest number in the array is: "+ array[array.length-2]);
    }
}
