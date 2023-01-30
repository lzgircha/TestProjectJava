package class15;

public class MPractice {
    //create method which returns true or false and take the int numbers as a parameter if number is
    //even it returns true otherwise it returns false
    boolean even(int num){
        boolean flag;
    if(num%2==0){
        flag=true;
    }else{
        flag=false;
    }
return flag;
}


//other way
    boolean even1(int num){

        if(num%2==0){
            return true;
        }else{
            return false;
        }

    }

//other way

boolean even2(int num){
    return num%2==0;
}}
