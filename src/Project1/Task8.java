package Project1;

public class Task8 {
    //8)Write a Java Program to print the first 10 numbers of Fibonacci series.
    public static void main(String[] args) {
        int num = 10, firstTerm = 0, secondTerm = 1;
        System.out.println("Fibonacci Series till " + num + " terms: ");

        for (int i = 0; i < num; i++) {
            System.out.print(firstTerm + ", ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;

        }

    }
}
