package class5;

import java.util.Scanner;

public class HomeWork6 {
    public static void main(String[] args) {
// 7) Ask user to enter their country and capture it. Once values are captured print which language user speaks.

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your country");
        String language = scan.nextLine();

        switch (language.toLowerCase()) {
            case "usa":
                System.out.println("You speak English");
                break;
            case "russia":
                System.out.println("You speak Russian");
                break;
            case "china":
                System.out.println("You spek Chinese");
                break;
            case "india":
                System.out.println("You speak Hindi");
                break;
            case"estonia":
                System.out.println("You speak Estonian");
                break;
            default:
                System.out.println("Other languages");
        }scan.close();
    }

}

