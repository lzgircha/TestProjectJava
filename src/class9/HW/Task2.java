package class9.HW;

public class Task2 {
    // 2) Create an array of names and store all names of your group.
    // Then print your name from that array. (use 2 different ways of creating an array).
    public static void main(String[] args) {
        String[] names = new String[7];
//1st way
        names[0] = "Alex";
        names[1] = "Chris";
        names[2] = "Olga";
        names[3] = "Larisa";
        names[4] = "Roza";
        names[5] = "Ljuda";
        names[6] = "Kiril";

        for (int i = 0; i < 1; i++) {
            System.out.println(names[3] + " ");

        }
        System.out.println(" ");
//2nd way
        String[] names1 = {"Alex", "Chris", "Olga", "Larisa", "Roza", "Ljuda", "Kiril"};
        System.out.println(names[3] + " ");
    }
}
