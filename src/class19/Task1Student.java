package class19;

public class Task1Student {
    //5) Write a Student class   that have instance variables name and address.
    // Create a constructor that will initialize those variables.
    // Print name & address of given  student using displayInfo method.
    String name;
    String address;

    Task1Student(String name, String address){
        this.name=name;
        this.address=address;

    }
    void displayInfo(){
        System.out.println("Student name: "+name+", address: "+address);
    }

    public static void main(String[] args) {
        Task1Student student=new Task1Student("Alex","123 Stree Name,State,Zipcode");
        student.displayInfo();
    }
}
