package class12;

public class Task1 {
    public static void main(String[] args) {
        //Store username, password and confirm password from a user and check following requirements:
        //
        //Username and Password cannot be  empty, if so→ message=”Username and Password cannot be empty”.
        //Password should be minimum 8 characters, if less → message=”Password is too short”.
        //Password cannot contain username if so, → message=”Password cannot contain username”.
        //Password should match confirmed password, if not  → message=“Passwords do not match”.
        //
        //Only after all requirements met → message “Your username and password has been created”

        String username="JavaTask";
        String password="22January!";
        String confirmPassword="22January";
// #1
        boolean isEmpty=username.isEmpty();
        boolean isEmpty1=password.isEmpty();
        System.out.println(isEmpty);
        System.out.println(isEmpty);
// #2
        int count= username.length();
        int count1=password.length();
        if (count<8);
        System.out.println("Password is too short");
        if (count1<8);
        System.out.println("Password is too short");
    }
}
