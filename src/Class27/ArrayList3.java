package Class27;

import java.util.ArrayList;

public class ArrayList3 {
    public static void main(String[] args) {

        ArrayList<Character> characters= new ArrayList<>();
        characters.add('A');
        characters.add('Z');
        characters.add('C');
        characters.add('N');
        characters.add('E');
        characters.add('Q');

        for (Character c:characters){
            System.out.print(c+" ");
        }

    }
}
