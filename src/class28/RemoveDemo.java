package class28;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveDemo {
    public static void main(String[] args) {
        ArrayList<String> words=new ArrayList<>();
        words.add("Cat");
        words.add("Java");
        words.add("Computer");
        words.add("Lava");

        //do not need to specify the type Java will know automatically, you can face some difficulties, it will not work in Java8 and 9, you at least need java 10
        var name="ksdkdbjhb";
        var c='s';
        var f=12.5;

        //use when you what to reduce in size. It works from Java 6 to java 19
        /*
        Iterator<String>iterator=words.iterator();
        while (iterator.hasNext()){
        String s=iterator.next();
        if(s.endsWith("a")){
        iterator.remove();
         */
//this does not work in Java7
        words.removeIf(s -> s.endsWith("a"));
        System.out.println(words);
    }
}
