package class8;

public class RecapDemo1 {
    public static void main(String[] args) {
        //10 8 6 4 2

        // for loops
        for (int i = 10; i >= 2; i-=2) {
            System.out.print(i+" ");
        }
        System.out.println("**********************");
        // while loops
        int number=10;
        while(number>=2){
            System.out.print(number+" ");
            number-=2;// same as number=number-2
        }
        System.out.println("**********************");
        //do while loop
        int num=10;
        do {
            System.out.println(num);
            num = num - 2;// same as num-=2
        }while (num>=2);
    }
}
