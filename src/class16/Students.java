package class16;

public class Students {
    //Create a Class called Students
    //Create three  variables  Name , ID  and  numberOfStudents
    //Create three objects of the Students Class
    //Set the value for  studentName , studentID and increment  the numberOfStudents for each object
    //Print out  total number of students

    String name;
    String ID;
    static int numberOfStudents;

    public static void main(String[] args) {


        Students st1=new Students();
        st1.name="Mjdy";
        st1.ID="82hw";
        st1.numberOfStudents++;

        Students st2=new Students();
        st2.name="Nvjsdvk";
        st2.ID="80998";
        st1.numberOfStudents++;

        Students st3=new Students();
        st3.name="Mvsakslk";
        st3.ID="22222";
        st1.numberOfStudents++;
        System.out.println(Students.numberOfStudents);
    }
}
