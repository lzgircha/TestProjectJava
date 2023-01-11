package class3;

public class IfElse_9 {
    public static void main(String[] args) {
        char c='M';
        if (c=='M'){
            System.out.println("Male");
        }
        String name="Nat";
        //with none-primitive date types such as String we can not use == symbol
        if(name.equals("Sam")){
            System.out.println("Amazing Student");
        }
        if(!name.equals("Sam")){
            System.out.println("Super Amazing Student");}
    }
}
