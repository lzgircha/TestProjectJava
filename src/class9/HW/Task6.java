package class9.HW;

public class Task6 {
//6) Create an array of countries.
// While retrieving all values from an array print capital for each country choose any five countries.
public static void main(String[] args) {
    String[][]CountryCapital=new String[2][5];
    String[] countries= {"England","Sweden","Latvia","Estonia","France"};
    String[] capitals={"London","Stockholm","Riga","Tallinn","Paris"};

    CountryCapital[0]=countries;
    CountryCapital[1]=capitals;

    System.out.println(CountryCapital[0][0]+", capital is "+CountryCapital[1][0]);
    System.out.println(CountryCapital[0][1]+", capital is "+CountryCapital[1][1]);
    System.out.println(CountryCapital[0][2]+", capital is "+CountryCapital[1][2]);
    System.out.println(CountryCapital[0][3]+", capital is "+CountryCapital[1][3]);
    System.out.println(CountryCapital[0][4]+", capital is "+CountryCapital[1][4]);

}
}
