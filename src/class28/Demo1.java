package class28;

import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<String> words=new ArrayList<>();
        words.add("Cat");
        words.add("Java");
        words.add("Computer");
        words.add("Lava");
        //remove all the words that end with letter a
        /*for (String s:words){
            if(s.endsWith("a")){
                words.remove(s);
            }
        }*/
        //sometimes it will work other not
        for (int i=0; i< words.size(); i++){
            if(words.get(i).endsWith("a")){
                words.remove(i);
            }
        }
        System.out.println(words);
    }
}
