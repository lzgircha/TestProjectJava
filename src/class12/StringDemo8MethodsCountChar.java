package class12;

public class StringDemo8MethodsCountChar {
    public static void main(String[] args) {
        String str="Java is love";
        char character=str.charAt(2);
        System.out.println(character);

        for (int i = 0; i <str.length() ; i++) {
            System.out.print(str.charAt(i));
        }
        int counter=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='a'){
                counter++;
            }
            System.out.print(" ");
        }
        System.out.print(counter);
    }
}

