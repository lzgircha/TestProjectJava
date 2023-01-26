package class12;

public class MethodsEmpty {
    public static void main(String[] args) {

        String str="  ";
        boolean isEmpty=str.isEmpty();
        System.out.println(isEmpty); //count empty spaces

        System.out.println(str.isBlank());//does not care about spaces
    }
}
