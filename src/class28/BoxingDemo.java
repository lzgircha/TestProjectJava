package class28;

public class BoxingDemo {
    public static void main(String[] args) {
        Integer integer=new Integer (10);
        int number=integer;//its auto unboxing
        int number2=integer.intValue();//unboxing doing manually

        double d=12.3;
        Double wrapperD=new Double(d);//boxing
        Double wrapperP=d;//autoBoxing

        Float f=12.4f;
    }
}
