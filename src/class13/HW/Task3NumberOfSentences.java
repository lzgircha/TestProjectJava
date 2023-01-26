package class13.HW;

public class Task3NumberOfSentences {
    public static void main(String[] args) {
        //3) You have a String a=”Is it saturday? Is it raining?
        // Do we have a Java Class today?” How would you find out how many sentences are in that String?

         String str="Is it Saturday? Is it raining? Do we have a Java Class today?";
         String[]arr=str.split("[?]");
        System.out.println(arr.length);
        System.out.println(arr[2]);//will print second sentence
                 //you can split based on anything:any character, space, special character!

        //We also can do in one line: the best approach
        System.out.println(str.split("[?]").length);

        }
    }

