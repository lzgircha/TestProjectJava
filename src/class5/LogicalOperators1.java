package class5;

public class LogicalOperators1 {
    public static void main(String[] args) {
        boolean boughtCho=true;
        boolean boughtFlowers=true;
        if(boughtCho||boughtFlowers) {
            System.out.println("I am happy");
        }else{
            System.out.println("I am sad");
        }
        boolean wifi=true;
        boolean fiveG=true;

        if(wifi||fiveG) {
            System.out.println("You are good for browsing internet");
        }else{
            System.out.println("Either connect to wifi or to 5G");
        }
    }
}
