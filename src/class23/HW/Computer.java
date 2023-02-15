package class23.HW;

public class Computer {
    //Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
    //Define common behavior within and some fields in parent class and override some of the methods in child classes
    //Define some methods specific to child classes
    //Create objects of child classes and store them into array. Loop through each object and execute available methods.
int RAM;
int storage;
String OS;

    void playVideo(){
        System.out.println("Video is playing");
    }
    void browseInternet()
    {
        System.out.println("Browse the internet");
    }}
class Apple extends Computer{
    @Override
    void playVideo(){
        System.out.println("Playing the video on the  quick time player");
    }
    @Override
    void browseInternet()
    {
        System.out.println("Browse the internet using Safari");
    }

    void editVideo(){
        System.out.println("Editing on iMovies");
    }

}
class Lenovo extends Computer{
    @Override
    void playVideo(){
        System.out.println("Playing the video on the Windows media player");
    }
    @Override
    void browseInternet()
    {
        System.out.println("Browse the internet using Explorer");
    }

    void editVideo(){
        System.out.println("Editing on media player");
    }
}

class HP extends Computer{
    @Override
    void playVideo(){
        System.out.println("Playing the video on the  quick time player");
    }
    @Override
    void browseInternet()
    {
        System.out.println("Browse the internet using chrome");
    }

    void editVideo(){
        System.out.println("Editing on quick times");
    }
}
class Dell extends Computer{
    @Override
    void playVideo(){
        System.out.println("Playing the video on the VLC media player");
    }
    @Override
    void browseInternet()
    {
        System.out.println("Browse the internet using Firefox");
    }

    void editVideo(){
        System.out.println("Editing on Clip champ");
    }
}

