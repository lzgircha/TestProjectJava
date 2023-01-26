package class13;

public class ReplaceAllMethod {
    public static void main(String[] args) {
        String str="aksndGFFTYUboqu3he380fy7cgidbcq08y3()I&%$@#";
        //replaces patters, not exact value, generic thing
        System.out.println(str.replaceAll("[A-Z]", "#"));
        System.out.println(str.replaceAll("[a-g]", "!"));
        System.out.println(str.replaceAll("[A-Za-z]", "!"));
        System.out.println(str.replaceAll("[A-Za-z0-9]", "!"));
        // ^ ----do not replace.....---->will replace special characters
        System.out.println(str.replaceAll("[^A-Za-z0-9]", "!"));
        System.out.println(str.replaceAll("[A-Za-z0-9]", ""));
    }
}
