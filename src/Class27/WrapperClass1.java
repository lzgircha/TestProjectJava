package Class27;

public class WrapperClass1 {
    public static void main(String[] args) {


    String name = "Zafar";
    String name2 = "Zafsbhd";
    String name3 = "Zarib";


    String[] names = {"Loura", "Rita", "Bill"};
    displayNames(names);
    display2(name, name2,name3);
}
 public static void displayNames(String[] names) {
     //write code here to print all of the names from array to console

     for (String name : names) {
         System.out.println(name);
     }
 }
 public static void display2(String name, String name2, String name3){
     System.out.println(name);
     System.out.println(name2);
     System.out.println(name3);
 }

}
