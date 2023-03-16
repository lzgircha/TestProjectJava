package project1;

public class Task11 {
    //11)Write a program to print out duplicate elements from an Array of Strings?
    public static void main(String[] args) {
        String arr[] = {"milk", "eggs", "oranges", "apples", "cucumbers", "oranges"};
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Found Duplicate Element:" + arr[i]);
                    flag = true;
                }
            }
        }
        if (flag == false) {
            System.out.println("Duplicate Element Not Found");
        }
    }
}
