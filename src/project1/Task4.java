package project1;

public class Task4 {
    //4) Create a 2D array or integer type where you will store odd and even numbers.
    // Develop a program which will identify/print the even numbers only.
    public static void main(String[] args) {
        int[][] num = {{2, 54, 52},
                {83, 20, 21},
                {1, 3, 6,}
        };
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                if (num[i][j] % 2 == 0) {
                    System.out.println(num[i][j]);
                }
            }
        }
    }
}

