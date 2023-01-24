package class12;

public class StringDemo7MethodsStartsWith {
    public static void main(String[] args) {

        String str="I love Java";
        boolean startsWith=str.startsWith("I love");//we will get false if we start with "i"
        System.out.println(startsWith);

        System.out.println(str.endsWith("java"));

        // Method chaining is when multiple methods are called on the same line
        // only those methods can be chained which written in String
        System.out.println(str.toLowerCase().startsWith("i"));

        System.out.println(str.contains("Java"));

    }
}
