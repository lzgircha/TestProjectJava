package class13;

public class StringVsStringBuilder {
    public static void main(String[] args) {
        java.lang.StringBuilder str= new java.lang.StringBuilder();
        for (int i = 0; i < 1000; i++) {
            str.append(i);
        }
    }
}
