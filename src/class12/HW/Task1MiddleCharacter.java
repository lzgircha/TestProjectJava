package class12.HW;

public class Task1MiddleCharacter {
    public static void main(String[] args) {
        //1) Create a String and if the String is not empty perform the following:
        //if the String has an odd number of characters and has 3 or more characters, print the character in the middle of the String.
        //For Example String str=hello =>l
        String str = "Example";
        boolean isEmpty=str.isEmpty() ;
        System.out.println(isEmpty);
        for (int i = 0; i < str.length(); i++) {
            if (str.length() >= 3) ;

        } System.out.println(str.length());
        System.out.println(str.charAt(3));
    }
}

