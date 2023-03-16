package class32;

public class ExceptionsDemo1 {
    public static void main(String[] args) {

        System.out.println("Line1");
        System.out.println("Line2");
        System.out.println("Line3");
        System.out.println("Line4");
        System.out.println("Line5");
        System.out.println("Line6");
        try {
            System.out.println(10 / 0);
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Line7");
        System.out.println("Line8");
        System.out.println("Line9");
        System.out.println("Line10");
    }
}
