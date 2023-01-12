package class7;

public class ForLoop {
    public static void main(String[] args) {
        for(int i=0;i<10; i++){
            //(initialize; condition; increment OR decrement
            System.out.println(i);


            System.out.println("***************");
            //prints number 0 to 9
            int number=0;
            while(number<10){
                System.out.println(number);
                number++;
            }
            //using a for loop print odd numbers from 1 to 20
//When you know exactly how many times you want to loop through a block of code, use the for loop instead of a while loop.
            //When we do not know how many times we need to repeat a block of code we should be going with while loop most
            // of the time it happens when the user input is involved
        }
        for (int num=1;num<=20; num++){
            if(num%2!=0){
            System.out.println(num);
        }

    }
}}
