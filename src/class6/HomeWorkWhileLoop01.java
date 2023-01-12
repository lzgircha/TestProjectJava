package class6;

public class HomeWorkWhileLoop01 {
    public static void main(String[] args) {
        // write a loop to print numbers from 1 to 100
        // write a loop to print odd numbers from 1 to 15
        // write a loop to print these number 5,10,15,20,25,30.... 50
        int num=1;
        while (num<=100){
            System.out.print(num+" ");
            num++;
        }
        System.out.println("*******************************");
        int num1=1;
        while(num1<=15){
            System.out.print(num1+" ");
            num1+=2;
        }
        System.out.println("*******************************");

        int num2=5;
        while (num2<=50){
            System.out.print(num2+" ");
            num2+=5;
        }
    }
}
