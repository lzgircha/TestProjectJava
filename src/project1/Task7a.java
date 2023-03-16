package project1;

public class Task7a {
    public static void main(String[] args) {
         int given=4;
         boolean isPrime=true;

         if(given>1){

             for(int i=2; i<given; i++){
                 if(given%i==0){
                     isPrime=false;
                     break;
                 }
    }
}else{
             isPrime=false;
         }
        System.out.println("Given number "+given+" is Prime? "+isPrime);
    }}
