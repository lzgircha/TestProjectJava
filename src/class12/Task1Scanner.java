package class12;

import java.util.Scanner;

public class Task1Scanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter your user name");
        String userName=scanner.next();
        System.out.println("Please enter your password");
        String userPassword=scanner.next();
        System.out.println("Please enter your password again");
        String confirmPassword=scanner.next();
        if(userName.isEmpty()||userPassword.isEmpty()){
            System.out.println("Username or Password cannot be empty");
        }else if (userPassword.length()<8){
            System.out.println("Password is too short");
        }else if (userPassword.contains(userName)){
            System.out.println("Password cannot contain username");
        } else if (!userPassword.equals(confirmPassword)) {
            System.out.println("Passwords do not match");
        }else{
            System.out.println("Your username and password has been created");
            scanner.close();
        }
    }
}
