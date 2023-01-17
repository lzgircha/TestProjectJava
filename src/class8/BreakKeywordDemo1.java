package class8;

public class BreakKeywordDemo1 {
    public static void main(String[] args) {
        boolean summer=true;
        int temp=75;

        while (summer){
            if(temp<=100){
                System.out.println("I love summer "+temp);
            }else{
                System.out.println("It's very hot "+temp);
                break;
            }
            temp+=5;
        }
        System.out.println("******************************");
//same result without 'break'
        int temp1=75;

        while (temp1<=105){
            if(temp1<=100){
                System.out.println("I love summer "+temp1);
            }else{
                System.out.println("It's very hot "+temp1);
            }
            temp1+=5;
        }
    }
}
