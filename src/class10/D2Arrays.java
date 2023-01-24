package class10;

import java.util.Arrays;

public class D2Arrays {
    public static void main(String[] args) {
        // 2D array which can hold 3 one D arrays, each of size 3
        String[][] thomsonTrain=new String[3][3];
        String[] cabin0={"Adam","Zafar","Sam"};
        String[] cabin1={"Nabi","Saud","Anees"};
        String[] cabin2={"Safi","Abeer","Zahra"};

        thomsonTrain[0]=cabin0;
        thomsonTrain[1]=cabin1;
        thomsonTrain[2]=cabin2;

        System.out.println(thomsonTrain[1][2]);
        // we are looking for the person that seats in cabin# 1, seat# 2, the outcome will be Anees
        System.out.println(Arrays.toString(thomsonTrain[0]));//this way you will get all the people in cabin 0
    }
}
