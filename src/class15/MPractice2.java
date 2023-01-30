package class15;

public class MPractice2 {
    //create a method that takes aString
    //call the method reverseStr
    String reverseStr(String input){
        String newStr="";
        for (int i=input.length()-1; i>=0; i--){
            newStr+=input.charAt(i);
    }
        return newStr;
    }

//another way
    String reverseStr1(String input){
    return new StringBuilder(input).reverse().toString();
}

//another way
    String reverseStr2(String input){
        StringBuilder stringBuilder=new StringBuilder(input);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }}