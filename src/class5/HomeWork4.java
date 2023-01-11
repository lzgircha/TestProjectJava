package class5;

public class HomeWork4 {
    public static void main(String[] args) {
        //5) Write a program to find largest of three double values using
        // if-else..if and logical operators provided by a user (numbers must be distinct)
        double num1=40.1;
        double num2=36.7;
        double num3=86.9;

        if(num1>num2&&num1>num3){
            System.out.println(num1+" is the largest number");
        }else if(num2>num1&&num2>num3) {
            System.out.println(num2 + " is the largest number");
        }else if(num3>num1&&num3>num2) {
            System.out.println(num3 + " is the largest number");
        }
    }
}
