package class12;

public class MethodsSubstring {
    public static void main(String[] args) {
        String str="Send it to support channel. More java";
        String newStr=str.substring(28);
        System.out.println(newStr);
        // we can also specify the starting point and ending point
        System.out.println(str.substring(0,27));
    }
}
