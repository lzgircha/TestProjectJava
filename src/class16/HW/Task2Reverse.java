package class16.HW;

public class Task2Reverse {
    //2) Create a method that will take a String as a parameter and returns reversed String.
    // Method should be available to all classes within your project and accessible by class name.
    //return type=> String
    //name=> revStr
    //parameter=>String

    public String revStr(String input){

        return new StringBuilder(input).reverse().toString();
    }

    public static void main(String[] args) {
        Task2Reverse task2=new Task2Reverse();//instance of the class
        System.out.println(task2.revStr("Monday"));
// if we have static in both
    }
    }

