package class15;

public class MPracticeTester {
    public static void main(String[] args) {
        MPractice mp = new MPractice();
        boolean even = mp.even(35);
        System.out.println(even);

        MPractice mp1 = new MPractice();
        boolean even1 = mp.even(100);
        System.out.println(even1);

        MPractice mp2 = new MPractice();
        boolean even2 = mp.even(12);
        System.out.println(even2);

        MPractice mp3 = new MPractice();
        boolean even3 = mp.even(20);
        System.out.println(even3);
    }
}
