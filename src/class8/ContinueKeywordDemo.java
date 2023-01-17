package class8;

public class ContinueKeywordDemo {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            if(i%3==0){
                continue; //skip all the numbers that divides by 3
            }else{
                System.out.println(i);
            }
            System.out.println("Hello Java");//line will never be executed when i=3,6,9
        }
    }
}
