package class5;
import java.util.Scanner;
 public class SwitchCaseOperators4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        char gender='F';
        switch (gender){
            //you can also use lower case letter
            case'F':
                System.out.println("Female");
                break;
            case'M':
                System.out.println("Male");
                break;
            default:
                System.out.println("non specified");

        }
    }
}
