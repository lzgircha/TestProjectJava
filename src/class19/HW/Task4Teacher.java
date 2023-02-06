package class19.HW;

public class Task4Teacher {
    //Write a Java program called Teacher.
    // Identify features and 4 behaviour of that Class.
    // Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher
    // that would have it their own features and behaviour. Test all 4 classes
    public String name;
    public int teacherId;
    public int whatGrade;

    public void teach(){
        System.out.println("like to teach");
    }
   protected void patient(){
        System.out.println("Teachers are patient");
    }
    private void followCurriculum(){
        System.out.println("Teachers are follow curriculum");
    }
    void giveHW(){
        System.out.println("Teachers give a lot of home work");
    }

}
class MathTeacher extends Task4Teacher{
    String subject;
    void teachMath(){
        System.out.println("Teaches to solve math problems");
    }

}
class ChemistryTeacher extends Task4Teacher{
    String test;
    void teachChemistry(){
        System.out.println("Teaches to combine chemical elements");
    }
}
class PianoTeacher extends Task4Teacher{
    String voice;
    void teachPiano(){
        System.out.println("teaches to play piano");
    }
}