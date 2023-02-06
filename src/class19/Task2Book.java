package class19;

public class Task2Book {
    //6) Write Book class that will have instance variables and 2 Constructors.
    // While creating an object make sure: Instance variables are being initialized
    //Both Constructors are being executed

    String author;
    String title;
    int year;

    Task2Book(String author, String title){
        this.author=author;
        this.title=title;
    }
    Task2Book(String author, String title, int year){
        this(author, title);
        this.year=year;
}
void info(){
    System.out.println("Author: "+author+", Title: "+title+", published: "+year);
}

    public static void main(String[] args) {
        Task2Book book=new Task2Book("Judy Kerolus","Java principles",2023);
        book.info();
    }

}
