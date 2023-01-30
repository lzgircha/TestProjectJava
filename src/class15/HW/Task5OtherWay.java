package class15.HW;

public class Task5OtherWay {
    boolean isPrime(int number) {
        boolean flag = true;
        if (number > 1) {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    flag = false;
                    break;
                }
            }
        } else {
            flag = false;
        }
        return flag;
    }

    public static void main(String[] args) {
        Task5OtherWay task5 = new Task5OtherWay();
        System.out.println(task5.isPrime(13));
    }
}
