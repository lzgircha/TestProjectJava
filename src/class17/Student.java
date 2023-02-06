package class17;

public class Student {

    String id;
    String name;
    int age;
    double weight;
    //creating constructor
    Student (String studentId, String studentName,int studentAge, double studentWeight){
        id=studentId;
        name=studentName;
        age=studentAge;
        weight=studentWeight;
        }
    void printInfo(){
        System.out.println("StudentID "+id+", student name "+name+", student age "+age+", student weight "+weight);
    }}
