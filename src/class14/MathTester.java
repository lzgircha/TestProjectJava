package class14;

public class MathTester {
    public static void main(String[] args) {
        Math math=new Math();
        math.add(10,10);
        math.mul(10,2,3);

       // Scanner scanner=new Scanner(System.in);
       // int num=scanner.nextInt();

        int result=math.sub(100,50);
        System.out.println(result);
    }
}
