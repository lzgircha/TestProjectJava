package class9.HW;

public class Task3 {
//3) Create an array of words: Java, Saturday, day, coding, is.
// Print the following sentence using elements of array: “Saturday is Java coding Day”.
public static void main(String[] args) {
    //1st way
    String[] words= {"Saturday","is","Java","coding","day"};

    for (int i = 0; i < words.length; i++) {
        System.out.print(words[i]+" ");

    }
    System.out.println(" ");
    //2nd way
    String[] words1= {"Java", "Saturday", "day","coding","is"};
    for (int j = 0; j < 1; j++) {
        System.out.println(words1[1]+" "+words1[4]+" "+words1[0]+" "+words1[3]+" "+words1[2]);

    }
}
}
