package class24;

public abstract class Phone {
    //create a phone class lets create abstract methods like displayPictures, unlockPhone, SendText
    //2 child classes IPhone Samsung Google and provide specific implementation
    //lets write code to achieve runtime polymorphism
abstract void unlockPhone();
abstract void SendText();
abstract void displayPictures();
}
class Iphone extends Phone{
    @Override
    void unlockPhone() {
        System.out.println("FaceID to unlock the Phone");
    }

    @Override
    void SendText() {
        System.out.println("Lets use the Imessage to send the text");
    }

    @Override
    void displayPictures() {
        System.out.println("Photos to browse the pictures");
    }
}

class Samsung extends Phone{

    @Override
    void unlockPhone() {
        System.out.println("Using finger print sensor or camera");
    }

    @Override
    void SendText() {
        System.out.println("Messages app o send the message");
    }

    @Override
    void displayPictures() {
        System.out.println("Gallery to browse the pictures");
    }
}