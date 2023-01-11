package class5;
import java.util.Scanner;
public class HomeWork8 {
    public static void main(String[] args) {
        // 8) HomeWork: Using scanner class create calculator.
        // Allow user to enter 2 numbers and operator(+,-,*,/). Based on operator provide the result to user.
        Scanner scan=new Scanner(System.in);
        System.out.println("Please choose an operator +,-,*,or /");
        char operator= scan.next().charAt(0);
        System.out.println("Please enter the first number");
        double num1=scan.nextDouble();
        System.out.println("Please enter the second number");
        double num2=scan.nextDouble();

        switch(operator){
            case '+':
                double result=num1+num2;
                System.out.println(num1+" + "+num2+" = "+result);
                break;
            case'-':
                double result1=num1-num2;
                System.out.println(num1+" - "+num2+" = "+result1);
                break;
            case'*':
                double result2=num1*num2;
                System.out.println(num1+" * "+num2+" = "+result2);
                break;
            case'/':
                double result3=num1/num2;
                System.out.println(num1+" / "+num2+" = "+result3);
                break;
        }scan.close();


    }
}
