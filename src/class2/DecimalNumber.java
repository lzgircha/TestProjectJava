package class2;

public class DecimalNumber {
    public static void main(String[] args) {
        float myNumberBox=10.5f;
        System.out.println(myNumberBox);
        System.out.println("***********************");

        float f = 75.0f;
        double d = 75.0;
        int i = 75;

        if( f == d ) {
            if( f == i ) {
                System.out.println("f, d and i are equal");
            } else {
                System.out.println("f, d are equal but i is not equal");
            }

        } else {
            System.out.println("f and d are not equal");
        }
       /* System.out.println("**********************");

        int a = 7 * 3 + 6 / 2 - 5;
        int b = 21 - 8 + a % 3 * 11;

        if(a < b) {
            System.out.println("A is less than B");
        }

        if(a == b) {

            System.out.println("A is equal to B");
        }

        if(a > b) {
            System.out.println("A is greater than B");
        }
        System.out.println("********************************");*/
        boolean a, b, c;
        a = b = c = true;

        if( !a || ( b && c ) ) {
            System.out.println("If executed");
        } else {
            System.out.println("else executed");
        }

    }
}

