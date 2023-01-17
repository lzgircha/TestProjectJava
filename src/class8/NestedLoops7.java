package class8;

public class NestedLoops7 {
    public static void main(String[] args) {
        /* 0 1 2 3 4 5
        0 2 4 6 8 10
        0 3 6 9 12 15
         */
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <= 5; j++) {
                System.out.print(j + j * i + " ");
            }
            System.out.println();
        }
        System.out.println("**********************");//second way

        for (int p = 1; p <=3; p++) {
            for (int l = 0; l <= 5; l++) {
                System.out.print(l * p + " ");
            }
            System.out.println();
        }

    }
}