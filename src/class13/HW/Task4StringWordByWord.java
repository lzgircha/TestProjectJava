package class13.HW;

public class Task4StringWordByWord {
    public static void main(String[] args) {
        //4) How would you reverse a String word by word? for example
        //        // input=>This is sentence i want to reverse
        //        // output=>sihT si ecnetnes i tnaw ot esrever

        /* StringBuilder st=new StringBuilder("his is sentence i want to reverse");
        System.out.println(st.reverse());
        String str=st.toString();//converting aStringBuilder to String so that we can call methods from String*/

        String str="This is sentence i want to reverse";
        String [] arr=str.split(" ");//the output will be the array of strings

        for(String word:arr){
            //System.out.print(word);//printing words one by one
                for (int i = word.length()-1; i >=0; i--) {
                    System.out.print(word.charAt(i));
                }
                System.out.print(" ");
        }
        System.out.println("******************");

        // other way to code
        for(String word:arr){
            StringBuilder st=new StringBuilder(word);
            st.reverse();
            System.out.print(st);
            System.out.print(" ");
        }
        System.out.println("*******************");
        // another way to code, shorter way
        for(String word:arr){
            System.out.print(new StringBuilder(word).reverse()+" ");
        }
    }
}
