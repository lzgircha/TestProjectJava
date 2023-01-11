package class5;
import java.util.Scanner;
public class HomeWork2 {
    public static void main(String[] args) {
        //3) Write a program that will read three inputs of scores (quiz, midterm, and final scores)
        // and determine the grade based on the following rules:if the average score >=90 → grade=A,
        //if the average score >= 70 and <90 → grade=B, if the average score>=50 and <70 → grade=C
        //if the average score<50 → grade=F
        int number1, number2, number3;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter quiz score, midterm score and final score ");
        number1=scanner.nextInt();
        number2=scanner.nextInt();
        number3=scanner.nextInt();
        if ((number1+number2+number3)/3>=90){
            System.out.println("Grade is A");
        }else if((number1+number2+number3)/3>=70&&(number1+number2+number3)/3<90){
            System.out.println("Grade is B");
        }else if ((number1+number2+number3)/3>=50&&(number1+number2+number3)/3<70){
            System.out.println("Grade is C");
        }else if ((number1+number2+number3)/3<50){
            System.out.println("Grade is F");
    }scanner.close();
}}
