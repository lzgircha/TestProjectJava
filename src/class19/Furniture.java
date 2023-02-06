package class19;

public class Furniture {
    String type;
    String color;
    double price;
//if we add void (return type)it becomes method void Furniture(){}
    Furniture(String type,double price,String color){
        this.type=type;
        this.price=price;
        this.color=color;
    }
    void print(){
        System.out.println(type+" price is "+price+" and color is "+color);

    }
}
