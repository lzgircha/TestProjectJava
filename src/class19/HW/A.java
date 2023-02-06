package class19.HW;

public class A {
    //Write program for multilevel inheritance where class C inherits from class B and Class B inherits from Class A.
    public A() {
        System.out.println("info from class A");
    }
}

class B extends A {
    public B() {
        System.out.println("info from class B");
    }
}

class C extends B {
    public C() {
        System.out.println("info from class C");
    }

    public static void main(String[] args) {
        A a = new A();
        System.out.println(a);
        B b = new B();
        System.out.println(b);
        C c=new C();
        System.out.println(c);
    }
}


