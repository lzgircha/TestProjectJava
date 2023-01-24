package class12;

import java.util.Scanner;

public class carTester {
    public static void main(String[] args) {
       //1st we need create object of the class
        Car bmw=new Car();
        bmw.make="BMW";
        bmw.model="i7";
        bmw.year=2023;
        bmw.color="Grey";
        bmw.applyBrakes();
        bmw.moveForward();

        Car audi=new Car();
        audi.model="E-tron";
        audi.make="Audi";
        audi.year=2022;
        audi.color="black";
        audi.moveForward();
}}
