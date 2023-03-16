package class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExcelIssues {
    public static void main(String[] args) throws FileNotFoundException {
        String path="Files/Book1.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        System.out.println(path);
    }
}
