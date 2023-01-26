package Class14;

import java.util.Scanner;
public class MethodDemo2 {

    //defining a method
    void printHello(){
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
    }

    void printHelloManyTimes(int times){

        for (int i = 0; i < times; i++) {
            System.out.println("Hello world");

        }
    }

    void printManyTimes(int time,String word){
        for (int i = 0; i < time; i++) {
            System.out.println(word);

        }
    }
}
