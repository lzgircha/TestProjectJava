package class19;

public class ConstructorChain {
    ConstructorChain(){
        System.out.println("I am non argument constructor");
    }

    ConstructorChain(String str){
        this();//calling constructor with no parameters, must be always the first line if you want to use it!
        System.out.println(str);
    }

    ConstructorChain(int number){
        this("Hello");
        System.out.println("This is constructor with int parameter");
    }

    public static void main(String[] args) {
        ConstructorChain obj=new ConstructorChain(10);
        System.out.println("-------End of the code------");
    }
}
