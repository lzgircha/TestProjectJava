package class13;

public class SplitMethod {
    public static void main(String[] args) {
        String str="I like java. I write a lot of code daily. I am from batch 15";
        String[] strArr=str.split("[.?!]");
        System.out.println(strArr.length);
        System.out.println(strArr[1].trim());
        //whenever we are working with arrays we use the length and whenever we are working with String we use the length()
        //trim() will remove space in front of the sentence in console
    }
}
