package class30.HW;

import class30.Entry;

import java.util.Map;
import java.util.TreeMap;

public class T2PersonTest {
    public static void main(String[] args) {
        //Create a Person class with following private fields: name, lastName, age, salary.
        //Variables should be initialized through constructor.
        //Inside the class also create a method to print user details.
        //In Test Class create a Map that will store key in ascending order.
        // In that map store personId and a Person Object. Print each object details.
            Map<Integer,T2Person> person= new TreeMap<>();
            person.put(5432, new T2Person("Lia","Black", 41, 135000));
            person.put(7632, new T2Person("John","String",43, 110000));
            person.put(9832, new T2Person("Vasja","Lakhmi", 33, 96000));
            person.put(5467, new T2Person("Rita","Vilnus",37, 150000));

for (var print:person.entrySet()){
    System.out.println("PersonID: "+ print.getKey() + " ");
    print.getValue().printUserDetails();
}

}}
/* outcome
PersonID: 5432
Name: Lia, Last Name: Black, Age: 41, Salary: 135000
PersonID: 5467
Name: Rita, Last Name: Vilnus, Age: 37, Salary: 150000
PersonID: 7632
Name: John, Last Name: String, Age: 43, Salary: 110000
PersonID: 9832
Name: Vasja, Last Name: Lakhmi, Age: 33, Salary: 96000
 */
