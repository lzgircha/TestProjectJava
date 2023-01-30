package class15.HW;

public class Task4Language {
    //4)Create a method that will say Hello in different language based on the country that will passed when method is executed
    String country = "";
     // return type=>String/void
    //name=>sayHello
    //parameter=>String countryName
    String sayHello(String countryName) {
        switch (countryName) {
            case "Estonia":
                return "Tere";// break is not needed when we use the return keyword
            case "Latvia":
                return "Labdean";
            case "France":
                return "Salut";
            case "Russia":
                return "Privet";
            default:
                return "Country not supported";
        }
    }
    public static void main(String[] args) {
        Task4Language sayHello = new Task4Language();
        System.out.println(sayHello.sayHello("Estonia"));

    }
}
