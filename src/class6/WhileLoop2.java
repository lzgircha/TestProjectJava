package class6;

public class WhileLoop2 {
    public static void main(String[] args) {

        int number=2;
        while (number<5){
            System.out.println(number);
            number++;
        }
        System.out.println("****************");
        int number2=0;
        while(number2<10){
            System.out.println(number2);
            number2+=2;
        }
        System.out.println("****************");
        //write a loop to print numbers from1 to 100
        //write a loop to print odd numbers from 1 to 15
        //write a loop to print these number 5,10,15,20,25,30......50
        int number3=1;
        while(number3<101) {
            System.out.println(number3);
            number3++;
        }
        System.out.println("****************");
        int number4=1;
        while(number4<=15) {
            System.out.println(number4);
            number4+=2;
        }
        System.out.println("****************");
        int number5=5;
        while(number5<=50) {
            System.out.println(number5);
            number5 += 5;
        }
        System.out.println("**************");
        int number1=1;
        int sum=0;
        while (number1<=10){
            sum=sum+number1;
            number1++;

        }
        System.out.println(sum); //print out is outside of the loop, so it will only print the outcome when it becomes false
    }
}
