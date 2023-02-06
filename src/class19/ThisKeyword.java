package class19;

public class ThisKeyword {
    int a,b;//instance variable

    //creating constructor
    ThisKeyword(int a,int b){//local variable
        this.a=a;
        this.b=b;
    }
    //creating method
    public void sum(int a,int b){
        System.out.println("Sum of the local variables = "+(a+b));
        System.out.println("Sum of the instance variables = "+(this.a+this.b));
    }

    public static void main(String[] args) {
        ThisKeyword obj=new ThisKeyword(10,20);
        //System.out.println(obj.a);
        obj.sum(100,200);
    }
}
