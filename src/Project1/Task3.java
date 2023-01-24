package Project1;

public class Task3 {
    // 3) Create a 2D array of integer values. Print the sum of all numbers.
    public static void main(String[] args) {

        int[][] numbers = {
                {23, 45, 76, 54},
                {2, 45, 91, 32},
                {12, 23, 14, 71}
        };
        int total = sum(numbers);
        System.out.println(total);
    }

    public static int sum(int[][] values) {
        int total = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                total += values[i][j];
            }
        }
        return total;
    }
}

