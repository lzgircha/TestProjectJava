package class27;

public class WrapperClass2 {
    public static void main(String[] args) {
        String name="Nima";
        String[]names={"Hiral","Nima","Laura","Nat"};
        //create a method which can search a name from this group, return true if name is present in array
        System.out.println(contains(name,names));
    }
    public static boolean contains(String nameToBeSearched,String[]names){
        for (String name:names){
            if(nameToBeSearched.equals(name)){
                return true;
            }
        }
        return false;
        }
    }

