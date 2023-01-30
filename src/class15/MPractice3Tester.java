package class15;

public class MPractice3Tester {
    public static void main(String[] args) {
        //create the object of the class that has the method objectname.methodnae

        MPractice3 mPractice3=new MPractice3();
        int[] array={10,20,30};
        System.out.println(mPractice3.arraySum(array));

        //ANOTHER WAY CREATING ARRAY
        System.out.println(mPractice3.arraySum(new int[]{80,20,30}));
    }
}
