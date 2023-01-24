package Project1;

public class Task9 {
    //9)Maximum and minimum number in the array?
    public static void main(String[] args) {
        int [] num = {34,100,62,23,1,960,24,12};
        int max = num[0];

        for (int i = 1; i < num.length; i++) {
            if(num[i]> max){
                max =num[i];
            }
        }
        System.out.println("Maximum number in array is "+max);

        int min= num[0];
        for (int i = 1; i < num.length; i++) {
            if(num[i]<min){
                min=num[i];
            }
        }
        System.out.println("Minimum number in array is "+min);
    }
}
