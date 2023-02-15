package class25;

interface WashAble{
    void wash();// methods by default are public
}

class SmartWatch implements WashAble{
    @Override
    public void wash(){
        System.out.println("You can wash this smartphone without any issues");
    }
}
class Phone implements WashAble{

    public void wash(){
        System.out.println("I am IP65 Rated you can wash me");
    }
}

class Inverter implements WashAble{
   public void wash(){
        System.out.println("I am IP65 Rated you can wash me");
    }
}