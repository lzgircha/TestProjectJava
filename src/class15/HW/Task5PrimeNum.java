package class15.HW;

public class Task5PrimeNum {
    //5) Write a method to return whether given number is prime or not?
    //return type =>boolean
    //name=> isPrime
    //parameter=>int number
    boolean isPrime (int num){
        if (num<=1) return false;
        for (int i = 2; i < num/2; i++) {
            if (num % i ==0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Task5PrimeNum prime = new Task5PrimeNum();
        System.out.println(prime.isPrime(63));

    }
}
