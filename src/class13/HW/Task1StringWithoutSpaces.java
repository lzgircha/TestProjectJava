package class13.HW;

public class Task1StringWithoutSpaces {
    //1) Create a String that will hold a sentence. Write a program to get a new String without any spaces.
    public static void main(String[] args) {

        String str="Batch 15 is Great!";
        String newStr=str.replaceAll(" ","");
        System.out.println(newStr);
    }
}
