package class4;

public class YearsWorked {
    public static void main(String[] args) {
        int YearsWorked = 7;
        int salary = 110000;
        if (YearsWorked > 5) {
            {
                System.out.println("eligible for bonus");
            }
            if (salary > 50000) {
                System.out.println("Bonus = 5000");
            } else {
                System.out.println("Bonus =3000");
            }
        } else {
            System.out.println("not eligible for bonus");
        }
    }

}