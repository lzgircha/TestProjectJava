package class9.HW;

import java.sql.SQLOutput;

public class Task1 {
    //1) Create an array of chars and store grades into it: A,B,C,D,E,F.
    //   Then print a grade B (use 2 different ways of creating an array).
    public static void main(String[] args) {
// 1st way
    char[] grades=new char[6];
    grades[0]='A';
    grades[1]='B';
    grades[2]='C';
    grades[3]='D';
    grades[4]='E';
    grades[5]='F';
        for (int i = 0; i < grades.length; i++) {
            System.out.print(grades[i]+" ");
        }
        System.out.println(" ");
//2nd way
        char []grades1={'A','B','C','D','E','F'};
        for (int j = 0; j < grades1.length; j++) {
            System.out.print(grades1[j]+" ");
        }
}
}
