package project2;

public class Car {
    //Create a Class Car that would have the following fields: carPrice and color and method calculateSalePrice()
    // which should be returning a price of the car.
    //Create 2 sub classes: Sedan and Truck.
    // The Truck class has a field as weight and has its own implementation of calculateSalePrice()
    // method in which returned price is calculated as following: if weight>2000 then returned price
    // car should include 10% discount, otherwise 20% discount.
    //The Sedan class has field as length and also does it is own implementation of calculateSalePrice():
    // if length of sedan is >20 feet then returned car price should include 5% discount, otherwise 10% discount
    double carPrice= 35000.00;
    String color;

    void calculateSalePrice() {
        System.out.println("Price of the car is " + carPrice);
    }

    static class Sedan extends Car {
        double length;
        public Sedan(double length) {
            this.length = length;
        }
        @Override
        void calculateSalePrice() {

            if (length > 20) {
                System.out.println("Price of the sedan is " + (carPrice - carPrice * 0.05)+"$");
            } else {
                System.out.println("Price of the sedan is " + (carPrice - carPrice * 0.10)+"$");
            }
        }
    }

    static class Truck extends Car {
        double weight;

        public Truck(double weight) {
            this.weight = weight;
        }
        @Override
        void calculateSalePrice() {
            if (weight > 2000) {
                System.out.println("Price of the truck is " + (carPrice - carPrice * 0.10)+"$");
            } else {
                System.out.println("Price of the truck is " + (carPrice - carPrice * 0.20)+"$");
            }
        }
    }
    public static void main(String[] args) {
        Sedan s = new Sedan(75);
        s.calculateSalePrice();
        Truck t = new Truck(1764);
        t.calculateSalePrice();
    }
}