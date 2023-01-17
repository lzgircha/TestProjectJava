package class8;
import java.util.Scanner;
public class LoopWithString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the name");
        while(scanner.next().equalsIgnoreCase("Sha")){//the loop with continue as long as you are typing in name Sha
            System.out.println("Great student who always wants an example with String in loop");
        }
    }
}
