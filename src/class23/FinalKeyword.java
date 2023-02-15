package class23;

public class FinalKeyword {
    final double gravity=9.8;
    final double PI=3.14;
    final double LightSpeed=299792458;

    final void tryChangingGravity(){
      //  gravity=1.6; //gravity on the moon
        //we get an error because ths variable is marked finale
    }
}
class Child extends FinalKeyword{
   // void tryChangingGravity(){//can not override the method that were marked "final"

    }
