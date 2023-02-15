package class23;

public class StudentTest {
    public static void main(String[] args) {
        Student[]kids={new SyntaxStudent(), new CollegeStudent(), new SchoolStudent()};
        for (Student kid:kids){
            kid.studyHard();
            kid.doHW();
        }
    }
}
