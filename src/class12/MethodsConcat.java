package class12;

public class MethodsConcat {
    public static void main(String[] args) {
        String firstName="Akhter";
        String lastName="Lava";
        String fullName=firstName+" "+lastName;// most widely used
        System.out.println(fullName);

        System.out.println(firstName+" "+lastName);

        System.out.println(firstName.concat(" "+lastName));//3rd way to do it, combine
    }
}
