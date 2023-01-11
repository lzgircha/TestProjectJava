package class5;
import java.util.Scanner;
//1) Prompt the user to enter person height in inches. Person should be classified as one of the following:
// short(under 60 inch), medium (between60-72 inch), tall(over72 inch)
public class HomeWork {
    public static void main(String[] args) {
        Scanner hight=new Scanner (System.in);
            System.out.println("Please enter person height in inches");
        double number=hight.nextDouble();
        if(number<60){
            System.out.println("short");
        }else if(number>60&&number<72){
            System.out.println("medium");
        }else if(number>72){
            System.out.println("tall");
        }
        hight.close();
    }
}
