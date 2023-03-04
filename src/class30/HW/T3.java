package class30.HW;

import class30.Entry;

import java.util.HashMap;
import java.util.Map;

public class T3 {
    //Create a Map that will store Employee name and salary.
    // Write a logic to retrieve an employee who gets the highest salary.
    // Output should be in the below format
    //John Smith=$100000
    public static void main(String[] args) {
        Map<String, Integer> earnings= new HashMap<>();
        earnings.put("Mike Reggie",78000);
        earnings.put("Lisa Spring", 120000);
        earnings.put("Lio Wu", 96000);
        earnings.put("Bill Smith", 150000);

        String employeeName=" ";
        int highSalary=0;
        for (var a:earnings.entrySet()){
            if(a.getValue()> highSalary){
                employeeName = a.getKey();
                highSalary= a.getValue();

            }
        }
        System.out.println(employeeName+"= $"+ highSalary);

    }
}
// outcome: Bill Smith= $150000
