package class19;

import class19.HW.Task4Teacher;

public class JavaTeacher extends Task4Teacher {
    void code(){
        System.out.println("Java teacher teaches how to code");
    }

    public static void main(String[] args) {
        JavaTeacher java=new JavaTeacher();
        java.name="Asel";
        java.teacherId=12546;

        //java.whatGrade(); private
        java.teach();
        java.code();
        java.patient();

    }
}
