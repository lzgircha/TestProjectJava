package class16.HW;

public class Task1 {
    //1) Create a method that will accept an array as parameters and will return a sum of all elements from that array.
    // Method should be visibly only within same package and accessible by the creating an instance of the class
    // (do not use static per requirement, if you use static no need to create object).

    //   return type=int
    //  name=> sumArrayElements
    //  parameters=>int[]arr
    int sumArrayElements(int[]array){

        int sum=0;
        for(int num:array){
            sum+=num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[]arr= {34,23,74,13,91,1};
        Task1 task1=new Task1();
        System.out.println(task1.sumArrayElements(arr));
    }
}
