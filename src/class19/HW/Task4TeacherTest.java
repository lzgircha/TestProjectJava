package class19.HW;

public class Task4TeacherTest {
    public static void main(String[] args) {
        Task4Teacher teacher = new Task4Teacher();
        teacher.teacherId = 292365;
        teacher.name = "Siri";
        teacher.whatGrade = 5;

        teacher.teach();
        //teacher.followCurriculum();//cant's access it is private:The private members can be accessed only in its own class
        teacher.giveHW();
        teacher.patient();
        System.out.println("Teacher Id is: "+teacher.teacherId);

        System.out.println("-------Info about Chemistry teacher object--------");

        ChemistryTeacher teacher1 = new ChemistryTeacher();
        teacher1.teachChemistry();
        teacher1.test = "Chemistry test";
        System.out.println(teacher1.test);
    }
}
