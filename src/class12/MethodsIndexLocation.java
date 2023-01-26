package class12;

public class MethodsIndexLocation {
    public static void main(String[] args) {
        String str="Java is not pain";
        //can tell us the location of the character
        System.out.println(str.indexOf("J"));
        System.out.println(str.indexOf("a"));
        System.out.println(str.indexOf("not"));
        //we can use loop as well

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i)+" has the index "+i);

        }
    }
}
