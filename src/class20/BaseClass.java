package class20;

public class BaseClass {

    String name="John";

    void hello(){
        System.out.println("Hello method from BaseClass");
    }
}

class Child extends BaseClass{
    String name="Jane";

    void callMe(){
        System.out.println(name);//Jane
        System.out.println(super.name);//John, add super if you want tto refer to parent name
    }

    void hello(){
        System.out.println("Hello method from child class");
    }
    void callingParentMethod(){
        hello();//from child class
        super.hello();//from parent class
    }
}
