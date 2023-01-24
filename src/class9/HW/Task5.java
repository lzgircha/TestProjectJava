package class9.HW;

public class Task5 {
//5) Create an array of size 5 on integers and calculate the sum of all elements in an array.
public static void main(String[] args) {
    int[] num=new int[5];
    num[0]=8;
    num[1]=19;
    num[2]=74;
    num[3]=20;
    num[4]=92;
    int sum=0;
    for (int i = 0; i < num.length; i++) {
        sum=sum+num[i];

    }
    System.out.println(sum);
}
}
