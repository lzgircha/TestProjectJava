package class32;

import utils.ExcelReader;

public class ExceptionsDemo2 {
    public static void main(String[] args) {

        
        try {

            ExcelReader.read();
        } catch (Exception e) {
            try {
                System.out.println(e);
            } catch (Exception exception) {
            }
        }

    }}