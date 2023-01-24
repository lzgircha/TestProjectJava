package Project1;

import java.util.Arrays;
import java.util.Scanner;

public class Task2a {
    public static void main(String[] args) {


            Scanner sc=new Scanner(System.in);
            System.out.println("Enter 5 countries");
            String [] country=new String[4];
            String[] capital={"Riga","Tallinn","London","Stockholm","New Delhi"};

            for(int i=0;i<country.length;i++){
                country[i]=sc.nextLine();
            }
            for(int j=0;j<capital.length;j++) {

            }
            System.out.println(Arrays.toString(country)+Arrays.toString(capital));
        }}

