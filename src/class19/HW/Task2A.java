package class19.HW;

public class Task2A {
    //Write program to inherit class A that has method printF which is static and call or reuse that method into class B
    static void printF() {
        System.out.println("----");
    }
        static class B extends Task2A{
    }

    public static void main(String[] args) {
        B b= new B();
        printF();//can be accessed if both parent method and child "extend" are static
        }
    }

