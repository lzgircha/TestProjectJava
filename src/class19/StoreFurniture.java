package class19;

public class StoreFurniture {
    public static void main(String[] args) {
        Furniture table=new Furniture("Table",100.50,"white");
        table.print();

        Furniture chair=new Furniture("Chair",50.0,"brown");
        chair.print();
    }
}
