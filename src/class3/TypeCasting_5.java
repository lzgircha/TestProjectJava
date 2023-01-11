package class3;

public class TypeCasting_5 {
    public static void main(String[] args) {
        long number=125;
        byte shorterNumber=(byte)number;
        float f=10.5f;
        int num=(int)f;
        System.out.println(shorterNumber);
        System.out.println(num);

        /*
        byte
        short
        long
        float
        double
         */
        float eggs=12.5f;
        int wholePart=(int)eggs;//if you are focusing on the whole number only, so we are using type casting/conversion from one data type to another
        System.out.println(wholePart);
    }
}
