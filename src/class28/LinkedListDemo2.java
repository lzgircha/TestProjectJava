package class28;

import java.util.LinkedList;

public class LinkedListDemo2 {
    public static void main(String[] args) {

        LinkedList<String>subjects=new LinkedList<>();
        subjects.add("SDLC");
        subjects.add("ManualTesting");
        subjects.add("Jira");
        subjects.add("Git");
        subjects.add("JAVA");

        LinkedList<String>futureSubjects=new LinkedList<>();
        futureSubjects.add("Selenium");
        futureSubjects.add("Testing");
        futureSubjects.add("Cucumber");
        futureSubjects.add("SQL");
        futureSubjects.add("APIs");
        futureSubjects.add("Jenkins");

        LinkedList<String> allSubjects=new LinkedList<>();
        allSubjects.addAll(subjects);
        allSubjects.addAll(futureSubjects);
        System.out.println(allSubjects);

        LinkedList<String> subjectsILike=new LinkedList<>();
        subjectsILike.add("Java");
        subjectsILike.add("SDLC");
        subjectsILike.add("SQL");

        allSubjects.removeAll(subjectsILike);
        System.out.println(allSubjects);
    }
}
