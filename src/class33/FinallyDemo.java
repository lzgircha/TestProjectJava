package class33;

public class FinallyDemo {
    public static void main(String[] args) {
        System.out.println("1");

        try{
            System.out.println("2");
            //System.out.println(10/0);
            String name=null;
            name.length();
            System.out.println("3");
        }catch (ArithmeticException ae){
            System.out.println("4");
            System.out.println(10/0);
            System.out.println("5");
        }
        finally {
            System.out.println("Will always be executed");
            //The finally block in java is used to put important codes such as clean up code e.g. closing the file or closing the connection.
            // The finally block executes whether exception rise or not and whether exception handled or not.
            // A finally contains all the crucial statements regardless of the exception occurs or not.
        }
        System.out.println("6");
    }
}
