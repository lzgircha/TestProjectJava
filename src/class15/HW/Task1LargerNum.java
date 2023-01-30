package class15.HW;

public class Task1LargerNum {
    //1) Create a method that will take 2 parameters as a numbers and prints which number is larger.

    int largerNumber (int num1, int num2){
        if (num1 > num2) {
            return num1;
        }else{
            return num2;
    }
}

    public static void main(String[] args) {
        Task1LargerNum largerNum=new Task1LargerNum();
        System.out.println(largerNum.largerNumber(54,62));
    }
}
