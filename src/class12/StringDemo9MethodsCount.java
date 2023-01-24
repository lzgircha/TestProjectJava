package class12;

public class StringDemo9MethodsCount {
    public static void main(String[] args) {

        String str="jjhvhgvkuy 536676585 ^$*";
        int counter=0;

        for (int i = 0; i < str.length(); i++) {

            if(Character.isAlphabetic(str.charAt(i))){
                counter++;
            }
        }
        System.out.println("Total Alphabetic is in STR "+counter);

    }
}
