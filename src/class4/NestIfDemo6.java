package class4;

public class NestIfDemo6 {
    public static void main(String[] args) {
        int money = 100;
        String day = "Sunday";
        Boolean mood = true;

        if (money > 700) {

            if (mood) {
                if (day=="Sunday"){
                System.out.println("Let's go shopping");
            }
        }
        }else {
            System.out.println("Let's first save some money first");
    }
}
}
