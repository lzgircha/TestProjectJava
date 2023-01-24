package class9;

public class ArraysDemo1 {
    public static void main(String[] args) {
        String[] names = {"Slava", "Safi", "Jason", "Nabi", "Anees"};//o,1,2,3,4,5
        System.out.println(names.length);
//write a loop to print all the names from array
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
