package class29.HW;

import java.util.HashSet;
import java.util.Set;

public class T2 {
    public static void main(String[] args) {
        // Create a Set collection that will hold Objects of Student Type.
        // In this set we do not care about the insertion order.
        // Each student object should have name and studentID. Display name of each student.

        // HashSet<Student> students=new HashSet<>();
        Set<Student> students1=new HashSet<>();//this way is better because we can achieve polymorphism
        students1.add(new Student("Natasha", 7264747));
        students1.add(new Student("Olga", 725244447));
        students1.add(new Student("Rita", 726411117));
        students1.add(new Student("Sasha", 726000543));

        //display the name of each student
        for(Student student: students1){
            System.out.println(student.getName());
        }
    }
}
class Student {
    private String name;
    private int studentID;

    public Student(String name, int studentID) {
        this.name = name;
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public int getStudentID() {
        return studentID;
    }
}

