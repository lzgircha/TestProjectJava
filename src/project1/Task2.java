package project1;

import java.util.Scanner;
public class Task2 {
    //2)Using Scanner create an array of countries.
    // When an array is created, retrieve all values from it and
    // while retrieving those values print capital for each country. (use 2 different loops).
    public static void main(String[] args) {
        /*String[][]CountryCapital=new String[2][5];
        String[] countries= {"Latvia","Estonia","England","Sweden","India"},
        String[] capitals= {"Riga","Tallinn","London","Stockholm","New Delhi"},
        };*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of countries");
        int c = scanner.nextInt();
        String[] Country = new String[c];
        System.out.println("Enter each country");
        for (int i = 0; i < c; i++) {
            Country[i] = scanner.nextLine();
        }
        String[] capitals = new String[c];
        {
            int i = 0;
            while (i < c) {
                switch (Country[i]) {
                    case "Latvia":
                        capitals[i] = "Riga";
                        break;
                    case "Estonia":
                        capitals[i] = "Tallinn";
                        break;
                    case "England":
                        capitals[i] = "London";
                        break;
                    case "Sweden":
                        capitals[i] = "Stockholm";
                        break;
                    case "India":
                        capitals[i] = "New Delhi";
                        break;
                    default:
                        capitals[i] = "unknown";
                }
                i++;
            }
        }
        for (int i = 0; i < c; i++) {
            System.out.println("The capital of " + Country[i] + " is " + capitals[i]);
        }
    }

}
