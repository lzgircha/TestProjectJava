package class8;

public class NestedLoops2 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <5 ; j++) {
                if(j==1||j==2){//skipping 1 and 2, instead of printing 5 stars it will be 3 stars
                    continue;
                }
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
