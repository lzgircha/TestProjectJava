package class8.HW;

public class HomeWork1 {
    public static void main(String[] args) {
        //Print numbers from 1 to 50 except those that are divisible by 3
        for (int i = 1; i <= 50; i++) {
            if(i%3==0){
                continue;//continue always comes with if
            }
            System.out.println(i);

        }
    }
}
