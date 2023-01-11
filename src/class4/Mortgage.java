package class4;

public class Mortgage {
    public static void main(String[] args) {
        float rate = 3.7f;
        int price = 250000;
        if (rate > 4.5) {
            System.out.println("Will not buy house");
        }else{
            System.out.println("Will consider buying house");
        }
        if (price>200000){
            System.out.println("Will take a loan");
        }else{
            System.out.println("Will pay cash");
        }

    }
}
