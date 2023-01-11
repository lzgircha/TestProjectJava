package class3;

public class VariablesDemo_3 {
    public static void main(String[] args) {
        int age=10;//reassigning data
        age=20;
        System.out.println(age);
        int number=10;
        age=number;//I am saying to Java replace the value of age with the value of number variable
        System.out.println(number);
        age= age+20;
        System.out.println(age);

    }
}
