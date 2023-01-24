package class12;

public class StringDemo2MethodsUpperLowerCase {
    public static void main(String[] args) {
// only converts the upper case letters to lower case
        String str="JAVA is fun";
        String newStr=str.toLowerCase();
        System.out.println(newStr);

// converting lower case to upper case letters
        String str2="i love java";
        String upperCaseLetter=str2.toUpperCase();
        System.out.println(upperCaseLetter);
    }
}
