package class13;

public class StringRecapCharAt {
    public static void main(String[] args) {
        //Print all of the letters from this String one by one
        String str = "Java is Great";
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
        //input is int to the chartA(), output is char
        //count how many times letter a has appeared in the above string
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') ;{
                count++;
        }
    }
        System.out.println("Letter 'a' appeared: "+ count + " times");

}}
