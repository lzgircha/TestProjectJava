package class9;

public class ArraysDemo4 {
    public static void main(String[] args) {
        char[]letter={'A','B','c','d','e','F'};
        letter[0]='a';//we can update the variables, the letter on the place'0'
        for (int i = 0; i < letter.length; i++) {
            System.out.println(letter[i]);

        }
    }
}
