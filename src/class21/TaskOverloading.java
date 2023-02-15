package class21;

public class TaskOverloading {
    //Create 1 class with a static method that has 3 overloaded forms.
    // Then call each overloaded method with specific arguments and observe result.

    //-----static does not need object---------
    static void method(String str1){
        System.out.println("Method with one String");
    }
    static void method(String str1, String str2, String str3){
        System.out.println("Method with three Strings");
    }
    private void method(String str1, String str2, int num){
        System.out.println("Method with two Strings and one integer");
    }

    public static void main(String[] args) {
        method("java");
        method("I","love","Java");
        TaskOverloading to=new TaskOverloading();

        to.method("Roza", "is",3);
    }
}
